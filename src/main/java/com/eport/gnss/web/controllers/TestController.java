package com.eport.gnss.web.controllers;

import com.eport.gnss.web.aoplog.SystemLog;
import com.eport.gnss.web.aoplog.SystemLogAspect;
import com.eport.gnss.web.model.db.po.GbUserInfo;
import com.eport.gnss.web.service.systemManage.UserInfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by lan on 2016/7/15.
 */
@Controller
public class TestController  {

    @Resource
    private UserInfoService userInfoService;

    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);

    @RequestMapping("/home/login")
    public ModelAndView toPage(String userName, String userPwd){
        ModelAndView mav =new ModelAndView();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, userPwd);
        token.setRememberMe(false);
        Subject currentUser = SecurityUtils.getSubject();
        try {
            currentUser.login(token);
        }
        catch (UnknownAccountException unknownAccountException){

        }
        if (currentUser.isAuthenticated()){
            System.out.println("login");
            mav.setViewName("manage/index");
        }
        else{
            mav.setViewName( "home/error");
        }
return mav;
    }

    @RequestMapping("/home/indexPage")
    public String toHomePage(){

        logger.debug("home/index");
        return "home/index";
    }

    @SystemLog(logName = "正常的update ")
    //正常的update
    @RequestMapping("/home/update")
    public Object doUpdate(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/error");
        GbUserInfo info = new GbUserInfo();
        info.setStatus("1");
        info.setUserName("test1");
        int count = 0;
        try{
            count = this.userInfoService.saveByPk(info);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            mav.addObject("res",false);

            request.setAttribute("res",e.getMessage());
        }

        if(count>0){
            mav.addObject("res",true);
        }
        else{
            mav.addObject("res",false);
        }
        return mav;
    }

    @SystemLog(logName = "测试事物回滚")
    //测试事物回滚的update
    @RequestMapping("/home/update1")
    public Object doUpdate1(HttpServletRequest request){

        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/error");
        GbUserInfo info = new GbUserInfo();
        info.setStatus("1");
        info.setUserName("test2");
        int count = 0;
        try{
            count = this.userInfoService.saveByPk1(info);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            mav.addObject("res",false);
            request.setAttribute("res",e.getMessage());
        }

        if(count>0){
            mav.addObject("res",true);
        }
        else{
            mav.addObject("res",false);
        }
        return mav;
    }
}

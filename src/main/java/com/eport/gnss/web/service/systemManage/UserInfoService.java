package com.eport.gnss.web.service.systemManage;

import java.util.List;

import com.eport.gnss.web.model.db.po.GbUserInfo;
import com.eport.gnss.web.model.db.po.GbUserInfoExample;

/**
 * 
 * @author lan
 *
 */
public interface UserInfoService {

    int countByExample(GbUserInfoExample example);

    void loadByPk(GbUserInfo record);

    GbUserInfo loadByPk(int id);

    GbUserInfo loadByUserName(String username);

    int saveByPk(GbUserInfo record);

    int saveByPk1(GbUserInfo record);

    int deleteByPk(GbUserInfo record);

    int deleteByPk(int id);

    List<GbUserInfo> queryList(GbUserInfoExample example);

//    List<GbUserInfo> queryPageList(GbUserInfoExample example, PageBounds pageBounds);

    int updateSelectiveByPk(GbUserInfo record);

    int updateSelectiveByExample(GbUserInfo record, GbUserInfoExample example);

}

package com.eport.gnss.web.realm;

import java.util.List;
import javax.annotation.Resource;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.eport.gnss.web.model.db.po.GbUserInfo;
import com.eport.gnss.web.service.systemManage.UserInfoService;

/**
 * 
 * @author lan
 *
 */
public class UserRealm extends AuthorizingRealm {

        @Resource
        private UserInfoService userInfoService;

//        @Resource
//        private RoleAuthMapService roleAuthMapService;

        @Override
        protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
                String currentUsername = (String) super.getAvailablePrincipal(principals);
                SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();

//                UserSession userSession = UserSession.getUserSession();
//                if (null != userSession && userSession.getPermissionList().size() > 0) {
//                        simpleAuthorInfo.addStringPermissions(userSession.getPermissionList());
//                } else {
                        // ===旧的查数据库====
//                        GbUserInfo user = userInfoService.loadByUserName(currentUsername);
//                        if (user.getUserType() != null && "SUPERADMIN".equals(user.getUserType().toUpperCase())) {
//                                simpleAuthorInfo.addStringPermission("manage");
//                                simpleAuthorInfo.addStringPermission("home");
//                        } else {
//                                if (user.getRoleId() != null && !user.getRoleId().isEmpty()) {
//                                        GbRoleAuthMapExample example = new GbRoleAuthMapExample();
//                                        example.or().andRoleIdEqualTo(user.getRoleId());
//                                        List<GbRoleAuthMap> list = roleAuthMapService.queryList(example);
//                                        if (list != null && !list.isEmpty()) {
//                                                for (int i = 0; i < list.size(); i++) {
//                                                        simpleAuthorInfo.addStringPermission(list.get(i).getPermission());
//                                                }
//                                        }
//                                }
//                        }
                        // ------------------------

//                }

                return simpleAuthorInfo;
        }

        @Override
        protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {

                UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
                GbUserInfo user = userInfoService.loadByUserName(token.getUsername());

                if (user == null) {
                        return null; // null,抛出UnknownAccountException异常
                }
                if (user.getUserState().equals("0") || !user.getStatus().equals("1"))// 用户状态不正常
                {
                        throw new DisabledAccountException();
                }
                if (!String.valueOf(token.getPassword()).equals(user.getUserPwd())) {
                        return null; // 密码错误
                }
                AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUserName(), user.getUserPwd(), this.getName());
                return authcInfo;
        }

}
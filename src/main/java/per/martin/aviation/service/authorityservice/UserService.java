package per.martin.aviation.service.authorityservice;

import per.martin.aviation.entity.TUser;

import java.util.Set;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 17:13
 * @since JDK1.8
 */
public interface UserService {
    /**
     * 创建账户
     * @param user
     * @return
     */
    TUser createUser(TUser user);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    void changePassword(Integer userId, String newPassword);

    /**
     * 添加用户-角色关系
     * @param userId
     * @param roleIds
     */
    void correlationRoles(Integer userId, Integer roleIds);

    /**
     * 移除用户-角色关系
     * @param userId
     * @param roleIds
     */
    void uncorrelationRoles(Integer userId, Integer roleIds);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    TUser findByUsername(String username);

    /**
     * 根据用户名查找其角色
     * @param username
     * @return
     */
    Set<String> findRoles(String username);

    /**
     * 根据用户名查找其权限
     * @param username
     * @return
     */
    Set<String> findPermissions(String username);
}

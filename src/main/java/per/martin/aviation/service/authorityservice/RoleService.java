package per.martin.aviation.service.authorityservice;

import per.martin.aviation.entity.TRole;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 17:10
 * @since JDK1.8
 */
public interface RoleService {

    /**
     * 创建角色
     * @param role
     * @return
     */
    TRole createRole(TRole role);

    /***
     * 删除角色
     * @param roleId
     */
    void deleteRole(Integer roleId);


    /**
     * 添加角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    void correlationPermissions(Integer roleId, Integer permissionIds);

    /**
     * 移除角色-权限之间关系
     * @param roleId
     * @param permissionIds
     */
    void uncorrelationPermissions(Integer roleId, Integer permissionIds);

}

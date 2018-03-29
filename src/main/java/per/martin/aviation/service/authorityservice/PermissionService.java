package per.martin.aviation.service.authorityservice;

import per.martin.aviation.entity.TPermission;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 17:08
 * @since JDK1.8
 */
public interface PermissionService {

    TPermission createPermission(TPermission permission);

    void deletePermission(Integer permissionId);
}

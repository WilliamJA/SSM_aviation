package per.martin.aviation.service.authorityservice;

import per.martin.aviation.entity.TRole;
import per.martin.aviation.vo.UserRoleRes;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 12:10
 * @since JDK1.8
 */
public interface UserManageService {

    List<UserRoleRes> getUserRoleResList();

    List<TRole> getAllRole();

}

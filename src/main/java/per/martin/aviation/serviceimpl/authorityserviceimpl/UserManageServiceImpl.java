package per.martin.aviation.serviceimpl.authorityserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.entity.TRole;
import per.martin.aviation.entity.TUser;
import per.martin.aviation.mapper.authoritymapper.TRoleMapper;
import per.martin.aviation.mapper.authoritymapper.TUserMapper;
import per.martin.aviation.service.authorityservice.UserManageService;
import per.martin.aviation.vo.UserRoleRes;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/16 12:12
 * @since JDK1.8
 */
@Service
public class UserManageServiceImpl implements UserManageService {
    private TUserMapper tUserMapper;
    private TRoleMapper tRoleMapper;

    @Autowired
    public UserManageServiceImpl(TUserMapper tUserMapper,
                                 TRoleMapper tRoleMapper) {
        this.tUserMapper = tUserMapper;
        this.tRoleMapper = tRoleMapper;
    }

    public List<UserRoleRes> getUserRoleResList() {
        return tUserMapper.selectUserRole();
    }

    public List<TRole> getAllRole() {
        return tRoleMapper.selectAll();
    }
}

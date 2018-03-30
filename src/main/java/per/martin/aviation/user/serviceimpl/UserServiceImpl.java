package per.martin.aviation.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.user.dao.SysUserMapper;
import per.martin.aviation.user.service.UserService;



/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/26 19:38
 * @since JDK1.8
 */
@Service
public class UserServiceImpl implements UserService {

    private SysUserMapper userMapper;

    @Autowired
    public UserServiceImpl(SysUserMapper userMapper) {
        this.userMapper = userMapper;
    }

}

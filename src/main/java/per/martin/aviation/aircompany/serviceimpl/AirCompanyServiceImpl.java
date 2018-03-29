package per.martin.aviation.aircompany.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.aircompany.dao.AirCompanyMapper;
import per.martin.aviation.aircompany.entity.AirCompany;
import per.martin.aviation.aircompany.service.AirCompanyService;
import per.martin.aviation.airport.serviceimpl.AirportServiceImpl;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 16:53
 * @since JDK1.8
 */
@Service
public class AirCompanyServiceImpl implements AirCompanyService {
    private AirCompanyMapper airCompanyMapper;

    @Autowired
    public AirCompanyServiceImpl(AirCompanyMapper airCompanyMapper) {
        this.airCompanyMapper = airCompanyMapper;
    }

    public void addAirCompany(AirCompany airCompany) {
        airCompanyMapper.insert(airCompany);
    }

    public void delAirCompanyById(Integer id) {
        airCompanyMapper.deleteByPrimaryKey(id);

    }

    public List<AirCompany> getAll() {
        return airCompanyMapper.selectAll();
    }

    public void modifyById(Integer id, AirCompany company) {
        company.setAirCompanyId(id);
        airCompanyMapper.updateByPrimaryKey(company);
    }
}

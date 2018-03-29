package per.martin.aviation.aircraft.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.martin.aviation.aircraft.dao.AircraftTypeMapper;
import per.martin.aviation.aircraft.entity.AircraftType;
import per.martin.aviation.aircraft.service.AircraftTypeService;

import java.util.List;

/**
 * 机型服务实现
 * @author martin
 * @version v1.0
 * createDate  2018/3/21 19:45
 * @since JDK1.8
 */
@Service
public class AircraftTypeServiceImpl implements AircraftTypeService {

    private AircraftTypeMapper aircraftTypeMapper;

    @Autowired
    public AircraftTypeServiceImpl(AircraftTypeMapper aircraftTypeMapper) {
        this.aircraftTypeMapper = aircraftTypeMapper;
    }

    public void addAircraftType(AircraftType aircraftType) {
        aircraftTypeMapper.insert(aircraftType);
    }

    public List<AircraftType> getAllAircraftType() {
        return aircraftTypeMapper.selectAll();
    }

    public void delAircraftTypeById(Integer id) {
        aircraftTypeMapper.deleteByPrimaryKey(id);
    }
}

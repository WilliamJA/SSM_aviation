package per.martin.aviation.aircraft.service;


import per.martin.aviation.aircraft.entity.AircraftType;

import java.util.List;

/**
 * 机型service
 * @author martin
 * @version v1.0
 * createDate  2018/3/21 19:37
 * @since JDK1.8
 */
public interface AircraftTypeService {
    /**
     * 添加一个机型
     * @param aircraftType
     */
    void addAircraftType(AircraftType aircraftType);

    /**
     * 获取所有机型
     * @return
     */
    List<AircraftType> getAllAircraftType();

    /**
     * 根据id删除机型
     * @param id
     */
    void delAircraftTypeById(Integer id);


}

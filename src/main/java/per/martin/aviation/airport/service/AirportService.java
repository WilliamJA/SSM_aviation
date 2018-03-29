package per.martin.aviation.airport.service;

import per.martin.aviation.airport.entity.Airport;
import per.martin.aviation.airport.vo.AirChartVo;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 9:34
 * @since JDK1.8
 */
public interface AirportService {

    /**
     * 添加机场信息
     * @param airport
     */
    void addAirport(Airport airport);

    /**
     * 根据机场代码查询航图
     */
    List<AirChartVo> getAirChartByCode(String code) throws Exception;

}

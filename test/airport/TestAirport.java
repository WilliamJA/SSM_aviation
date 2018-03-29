package airport;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.martin.aviation.airport.dao.AirportMapper;
import per.martin.aviation.airport.entity.Airport;
import per.martin.aviation.airport.service.AirportService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/23 21:06
 * @since JDK1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:spring/spring-dao.xml","classpath:spring/spring-services.xml","classpath:spring/spring-web.xml"})
public class TestAirport {

    @Autowired
    AirportService airportService;

    @Autowired
    AirportMapper airportMapper;

    @Test
    public void testAirportService() {
        try {
            airportService.getAirChartByCode("ZBAA");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAirportMapper() {
        Airport a = airportMapper.selectByColumn("ICAO","ZBAA");
        System.out.println(a);
    }
}

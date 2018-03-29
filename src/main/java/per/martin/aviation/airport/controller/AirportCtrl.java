package per.martin.aviation.airport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.airport.entity.Airport;
import per.martin.aviation.airport.service.AirportService;
import per.martin.aviation.airport.vo.AirChartVo;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.utils.JSONResult;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 9:33
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/airport")
public class AirportCtrl {
    private AirportService airportService;

    @Autowired
    public AirportCtrl(AirportService airportService) {
        this.airportService = airportService;
    }

    @RequestMapping(value = "/addAirport",method = RequestMethod.POST)
    @ResponseBody
    public JSONResult addAirport(Airport airport) {
        airportService.addAirport(airport);
        return JSONResult.getInstance(StatusCode.INSERT_SUCCESS,"success");
    }

    @RequestMapping(value = "/getAirCharByCode")
    @ResponseBody
    public JSONResult getAirCharByCode(@Validated String code) {
        try {
            List<AirChartVo> res = airportService.getAirChartByCode(code);
            return JSONResult.getInstance(200,"success",res);
        } catch (Exception e) {
            e.printStackTrace();
            return JSONResult.getInstance(400,"没有该机场数据");
        }
    }


}

package per.martin.aviation.aircraft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.aircraft.entity.AircraftType;
import per.martin.aviation.aircraft.service.AircraftTypeService;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.utils.JSONResult;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/21 19:52
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/aircraftType")
public class AircraftTypeCtrl {
    private AircraftTypeService aircraftTypeService;

    @Autowired
    public AircraftTypeCtrl(AircraftTypeService aircraftTypeService) {
        this.aircraftTypeService = aircraftTypeService;
    }

    @RequestMapping(value = "/getAllAircraft")
    @ResponseBody
    public JSONResult allAircraftType() {
        List<AircraftType> ls = aircraftTypeService.getAllAircraftType();
        return JSONResult.getInstance(200,"success",ls);
    }

    @RequestMapping(value = "/addAircraft")
    @ResponseBody
    public JSONResult addAircraftType(AircraftType aircraftType) {
        aircraftTypeService.addAircraftType(aircraftType);
        return JSONResult.getInstance(StatusCode.INSERT_SUCCESS,"success");
    }



}

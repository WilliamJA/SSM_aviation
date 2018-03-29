package per.martin.aviation.aircompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.martin.aviation.aircompany.entity.AirCompany;
import per.martin.aviation.aircompany.service.AirCompanyService;
import per.martin.aviation.statuscode.StatusCode;
import per.martin.aviation.utils.JSONResult;

import java.util.List;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 16:56
 * @since JDK1.8
 */
@Controller
@RequestMapping(value = "/airCompany")
public class AirCompanyCtrl {
    private AirCompanyService airCompanyService;

    @Autowired
    public AirCompanyCtrl(AirCompanyService airCompanyService) {
        this.airCompanyService = airCompanyService;
    }

    @RequestMapping(value = "/getAllAirCompany")
    @ResponseBody
    public JSONResult getAllAirCompany() {
        List<AirCompany> res = airCompanyService.getAll();
        return JSONResult.getInstance(StatusCode.SELECT_SUCCESS,"success",res);
    }

    @RequestMapping(value = "/addAirCompany")
    @ResponseBody
    public JSONResult addAirCompany(AirCompany airCompany) {
        airCompanyService.addAirCompany(airCompany);
        return JSONResult.getInstance(StatusCode.INSERT_SUCCESS,"添加机型成功");
    }

    @RequestMapping(value = "/deleteAirCompany")
    @ResponseBody
    public JSONResult deleteAirCompany(Integer id) {
        airCompanyService.delAirCompanyById(id);
        return JSONResult.getInstance(StatusCode.DELETE_SUCCESS,"删除机型成功");
    }

}

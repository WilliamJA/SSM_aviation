package per.martin.aviation.aircompany.service;

import per.martin.aviation.aircompany.entity.AirCompany;

import java.util.List;

/**
 * 飞机制造商基本服务
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 16:48
 * @since JDK1.8
 */
public interface AirCompanyService {
    /**
     * 添加制造商
     * @param airCompany
     */
    void addAirCompany(AirCompany airCompany);

    /**
     * 根据id删除制造商
     * @param id
     */
    void delAirCompanyById(Integer id);

    /**
     * 获取所有制造商信息
     * @return
     */
    List<AirCompany> getAll();

    /**
     * 根据id删除制造商
     * @param id
     * @param company
     */
    void modifyById(Integer id,AirCompany company);

}

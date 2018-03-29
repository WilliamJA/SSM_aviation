package per.martin.aviation.airport.vo;

import java.io.Serializable;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/25 17:17
 * @since JDK1.8
 */
public class AirChartVo implements Serializable {
    //航图名称
    private String name;
    //航图地址
    private String url;

    public AirChartVo(String name,String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

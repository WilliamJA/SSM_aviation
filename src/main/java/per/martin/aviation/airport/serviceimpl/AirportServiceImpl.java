package per.martin.aviation.airport.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import per.martin.aviation.airport.dao.AirportMapper;
import per.martin.aviation.airport.entity.Airport;
import per.martin.aviation.airport.service.AirportService;
import per.martin.aviation.airport.vo.AirChartVo;

import java.io.File;
import java.util.*;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/22 9:34
 * @since JDK1.8
 */
@Service
public class AirportServiceImpl implements AirportService {

    private AirportMapper airportMapper;

    @Autowired
    public AirportServiceImpl(AirportMapper airportMapper) {
        this.airportMapper = airportMapper;
    }

    public void addAirport(Airport airport) {
        airportMapper.insert(airport);
    }

    /**
     * 获取文件名和地址
     * @return
     * @throws Exception
     */

    public List<AirChartVo> getFileNameAndUrl(File file) {
        List<AirChartVo> ls = new ArrayList<>();

        if(file == null) throw new NullPointerException("文件为空");
        if(file.isDirectory() && file.listFiles() != null) {
            for(File f : file.listFiles()) {
                if(f.isDirectory()) {
                    getFileNameAndUrl(f);
                } else {
                    String path = f.getPath();
                    String fileName = f.getName();
                    ls.add(new AirChartVo(fileName.substring(0,fileName.lastIndexOf(".")), path.substring(path.lastIndexOf("\\") + 1)));
                }
            }
        }
        return ls;
    }

    @Override
    public List<AirChartVo> getAirChartByCode(String code) throws Exception {
        Airport airport = airportMapper.selectByColumn("ICAO","\"" + code + "\"");

        ClassPathResource resource = new ClassPathResource("file.properties");

        Properties properties = new Properties();
        properties.load(resource.getInputStream());
        String path = properties.getProperty("upload") + airport.getAirChartUrl();

        return getFileNameAndUrl(new File(path));
    }

}

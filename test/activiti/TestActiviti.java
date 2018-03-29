package activiti;

import org.activiti.engine.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author martin
 * @version v1.0
 * createDate  2018/3/23 10:09
 * @since JDK1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/spring-dao.xml","classpath:/spring/spring-activiti.xml"})
public class TestActiviti {

    @Autowired
    ProcessEngine engine;

    @Test
    public void testActivitiConfig() {
        System.out.println(engine);
    }

    @Test
    public void testActivitiService() {
        TaskService taskService = engine.getTaskService();
        HistoryService historyService = engine.getHistoryService();
        RepositoryService repositoryService = engine.getRepositoryService();

        RuntimeService runtimeService = engine.getRuntimeService();
        ManagementService managementService = engine.getManagementService();
    }


}

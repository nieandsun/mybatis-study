import com.nrsc.mybatis.Service.TUserService;
import com.nrsc.mybatis.config.SelfDBConfig;
import com.nrsc.mybatis.domian.TUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/***
 * @author : Sun Chuan
 * @date : 2020/1/11
 * Description :
 */
@Slf4j
public class MybatisSpringStartTest {


    @Test
    public void test1() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SelfDBConfig.class);
        //从IOC容器中获取TUserService对象
        TUserService userService = ac.getBean(TUserService.class);

        TUser user = userService.selectByPrimaryKey(1);
        log.info("获取到的数据为:{}", user);
    }
}

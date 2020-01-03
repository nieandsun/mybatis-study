import com.nrsc.mybatis.domain.TUser;
import com.nrsc.mybatis.mapper.TUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


@Slf4j
public class MybatisQuickStart {

    private SqlSessionFactory sqlSessionFactory;

    /****
     * 构建全局变量SqlSessionFactory
     * @throws IOException
     */
    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 1.读取mybatis配置文件创SqlSessionFactory
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        inputStream.close();
    }


    /***
     * 快速入门1  --- ibatis的方式，其实Mybatis底层也用的这种方式
     */
    @Test
    public void quickStart1() {
        // 2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.获取对应mapper
        TUser user = sqlSession.selectOne("com.nrsc.mybatis.mapper.TUserMapper.selectByPrimaryKey", 1);
        // 4.执行查询语句并返回结果

        log.info("user111:" + user);
    }

    /***
     * mybatis的方式
     */
    @Test
    public void quickStart2() {
        // 2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.获取对应mapper
        TUserMapper mapper = sqlSession.getMapper(TUserMapper.class);
        // 4.执行查询语句并返回结果
        TUser user = mapper.selectByPrimaryKey(1);
        log.info("user222:" + user);
    }

}

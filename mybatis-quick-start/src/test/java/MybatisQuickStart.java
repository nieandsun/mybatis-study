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
import java.util.Arrays;
import java.util.List;


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
        // 3.执行查询语句并返回结果 -- 第二次查询会走缓存
        TUser user = sqlSession.selectOne("com.nrsc.mybatis.mapper.TUserMapper.selectByPrimaryKey", 1);
        TUser user2 = sqlSession.selectOne("com.nrsc.mybatis.mapper.TUserMapper.selectByPrimaryKey", 1);
        // 4.关闭session
        sqlSession.close();
        log.info("user111:" + user);
        log.info("user111:" + user2);
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
        List<TUser> tUsers = mapper.selectListByIdList(Arrays.asList(1, 2, 3));
        //5.关闭session
        sqlSession.close();
        log.info("user222:" + user);
        log.info("user222:" + tUsers);
    }


    /***
     * 快速入门3  --- ibatis的方式，其实Mybatis底层也用的这种方式
     */
    @Test
    public void quickStart3() {
        // 2.获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3.执行查询语句并返回结果 -- 第二次查询会走缓存
        List<TUser> userList = sqlSession.selectList("com.nrsc.mybatis.mapper.TUserMapper.selectListByIdList", Arrays.asList(1, 2, 3));
        // 4.关闭session
        sqlSession.close();
        log.info("user111:" + userList);
    }

}

package cn.itcast.test;

import cn.itcast.dao.ItemsDao;
import cn.itcast.domain.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * items测试类
 */
public class ItemsTest {

    @Test
    public void daoTest(){

        //加载spring核心配置文件，获取applicationcontext对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用bean获取id对象
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        //使用对象执行方法
        Items item = itemsDao.findById(2);
        System.out.println(item);
    }
}

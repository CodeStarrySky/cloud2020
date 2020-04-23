package com.wch.springcloud;

import com.wch.springcloud.dao.OrderDao;
import com.wch.springcloud.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDaoTest {

    @Resource
    private OrderDao orderDao;

    @Test
    public void createTest(){
      //  Order order = new Order(null,2L,3L,4,5L,6);
        //orderDao.create(order);
    }



}

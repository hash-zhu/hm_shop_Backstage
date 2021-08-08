package com.ityunjie.test;

import com.ityunjie.DemoApplication;


import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@SpringBootTest(classes = DemoApplication.class)
public class DemoApplicationTest  {

    @Test
    public void test1() {
        System.out.println("test");
    }

}

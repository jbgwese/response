package com.econetwireless.epay.business.config;
import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.econetwireless.epay.business.config.RootConfig;

public class RootConfigTest {

    @Test
    public void test() {
        ApplicationContext context=new AnnotationConfigApplicationContext(RootConfig.class);
        assertNotNull(context);
    }


}
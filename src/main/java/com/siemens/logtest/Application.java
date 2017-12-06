package com.siemens.logtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

/**
 * @author yuanxin.zhang@siemens.com
 * Created by zhangyuanxin on 2017/12/6.
 */
@Controller
@EnableWebMvc
@EnableWebSocket
@SpringBootApplication
@EnableJms
@EnableAsync
public class Application extends WebMvcConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Application.class);
        springApplication.run(args);
    }

}

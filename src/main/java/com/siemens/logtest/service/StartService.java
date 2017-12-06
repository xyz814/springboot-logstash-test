package com.siemens.logtest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * yuanxin.zhang@siemens.com
 * Created by zhangyuanxin on 2017/12/6.
 */
@Service
@Transactional
public class StartService implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LogService logService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

        log.info("logtest...start...1");
        log.info("logtest...start...2");
        log.info("logtest...start...3");

        try {
            logService.printLog();
        } catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }
}

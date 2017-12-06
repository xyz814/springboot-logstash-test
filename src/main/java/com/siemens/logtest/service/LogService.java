package com.siemens.logtest.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yuanxin.zhang@siemens.com
 *         Created by zhangyuanxin on 2017/12/6.
 */
@Service
@Transactional
public class LogService {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public void printLog() throws InterruptedException {
        int i = 10000;
        while (true) {
            log.info("### ### ### ### logtest ### ### ### ### " + i + "");
            if (i % 3 == 0) {
                log.error("### ### ### ### logtest ### ### ### ### " + i + "");
            }
            i++;
            Thread.sleep(1000);
        }
    }
}

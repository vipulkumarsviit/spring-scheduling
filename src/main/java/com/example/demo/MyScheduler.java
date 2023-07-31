package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyScheduler {
    @Scheduled(cron = "${app.scheduler.my-scheduler.time}")
    public void schedule() {
        log.info("running MyScheduler");
    }
}

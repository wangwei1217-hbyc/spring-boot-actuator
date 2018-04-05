package com.wangwei.study;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by wangwei on 2018/4/5.
 */
//@Component
public class MyHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.down().withDetail("error","MyHealth closed").build();
    }
}

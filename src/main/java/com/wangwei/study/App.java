package com.wangwei.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.WebSocketAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * 自定义健康状态检测：创建一个类实现HealthIndicator接口，重写health方法，并纳入到spring容器管理当中。
 *
 * CounterService：用来计数的服务，可以从spring容器中直接获取使用。
 * GaugeService：用来统计某个值，可以从spring容器中直接获取使用。
 */
@SpringBootApplication()
@PropertySource({"my.properties"})
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);


    }
}

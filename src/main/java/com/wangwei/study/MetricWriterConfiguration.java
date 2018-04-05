package com.wangwei.study;

import org.springframework.boot.actuate.autoconfigure.ExportMetricWriter;
import org.springframework.boot.actuate.metrics.jmx.JmxMetricWriter;
import org.springframework.boot.actuate.metrics.writer.MetricWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.export.MBeanExporter;

/**
 * 将度量信息输出到Jmx，可以使用jdk下bin目录下面自带的jconsole、jmc、jvisualvm(需安装MBean插件)
 */
@Configuration
public class MetricWriterConfiguration {

    @Bean
    @ExportMetricWriter
    public MetricWriter createMetricWriter(MBeanExporter mBeanExporter){
        return new JmxMetricWriter(mBeanExporter);
    }
}

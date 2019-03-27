package com.mtdp.collector.classload;

import com.mtdp.collector.Collector;
import com.mtdp.collector.Metrics;
import org.junit.Test;

public class JvmClassLoadMetricsCollectorTest {

    @Test
    public void getMetrics() {
        Collector collector = new JvmClassLoadMetricsCollector();
        Metrics metrics = collector.getMetrics();
        System.out.println(metrics);
    }
}
package com.mtdp.collector.classload;

import com.mtdp.collector.Collector;
import com.mtdp.collector.Metrics;

import java.lang.management.ClassLoadingMXBean;
import java.lang.management.ManagementFactory;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/3/21
 */
public class JvmClassLoadMetricsCollector implements Collector {

    @Override
    public String getName() {
        return "jvm.classloading";
    }

    @Override
    public Metrics getMetrics() {
        return doCollect();
    }

    private JvmClassLoadMetrics doCollect() {
        ClassLoadingMXBean classLoadingMXBean = ManagementFactory.getClassLoadingMXBean();

        JvmClassLoadMetrics jvmClassLoadMetrics = new JvmClassLoadMetrics();
        jvmClassLoadMetrics.setLoadedCount(classLoadingMXBean.getLoadedClassCount());
        jvmClassLoadMetrics.setTotalLoadedCount(classLoadingMXBean.getTotalLoadedClassCount());
        jvmClassLoadMetrics.setUnLoadedCount(classLoadingMXBean.getUnloadedClassCount());
        return jvmClassLoadMetrics;
    }
}

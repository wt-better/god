package com.mtdp.collector.gc;

import com.mtdp.collector.Collector;
import com.mtdp.collector.Metrics;

import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.List;

/**
 * JVM指标收集器
 *
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/3/21
 */
public class JvmGcMetricsCollector implements Collector {

    @Override
    public String getName() {
        return "jvm.gc";
    }

    @Override
    public Metrics getMetrics() {

        return null;
    }


    private void doCollect() {
        List<GarbageCollectorMXBean> garbageCollectorMXBeanList = ManagementFactory.getGarbageCollectorMXBeans();

    }
}

package com.mtdp.collector;

import com.mtdp.collector.gc.JvmGcMetricsCollector;

/**
 * Collector,due to collect Metrics
 *
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/3/21
 * @see Metrics
 * @see JvmGcMetricsCollector
 */
public interface Collector {

    /**
     * obtain collector name
     *
     * @return collector name
     */
    String getName();

    /**
     * obtain collector collected metrics
     *
     * @return metrics
     */
    Metrics getMetrics();
}

package com.mtdp.collector.classload;

import com.mtdp.collector.Metrics;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/3/21
 */
public class JvmClassLoadMetrics implements Metrics {

    private int loadedCount;
    private long totalLoadedCount;
    private long unLoadedCount;

    public int getLoadedCount() {
        return loadedCount;
    }

    public void setLoadedCount(int loadedCount) {
        this.loadedCount = loadedCount;
    }

    public long getTotalLoadedCount() {
        return totalLoadedCount;
    }

    public void setTotalLoadedCount(long totalLoadedCount) {
        this.totalLoadedCount = totalLoadedCount;
    }

    public long getUnLoadedCount() {
        return unLoadedCount;
    }

    public void setUnLoadedCount(long unLoadedCount) {
        this.unLoadedCount = unLoadedCount;
    }

    @Override
    public String toString() {
        return "JvmClassLoadMetrics{" +
                "loadedCount=" + loadedCount +
                ", totalLoadedCount=" + totalLoadedCount +
                ", unLoadedCount=" + unLoadedCount +
                '}';
    }
}

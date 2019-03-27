package com.mtdp.collector.gc.fullgccount;

import sun.jvmstat.monitor.Monitor;
import sun.jvmstat.monitor.MonitorException;
import sun.jvmstat.monitor.MonitoredHost;
import sun.jvmstat.monitor.MonitoredVm;
import sun.jvmstat.monitor.VmIdentifier;

import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;

/**
 * @author <a href="wangte@meitaun.com">Te</a>
 * @date created at 2019/3/21
 */
public class Solution1 {

    private static final String YOUNG_GC_MONITOR_NAME = "sun.gc.collector.0.invocations";
    private static final String FULL_GC_MONITOR_NAME = "sun.gc.collector.1.invocations";

    public static void main(String[] args) throws URISyntaxException, MonitorException {
        /*
          Returns the managed bean for the runtime system of
          the Java virtual machine.
         */
        String name = ManagementFactory.getRuntimeMXBean().getName();
        //获取pid
        String pid = name.substring(0, name.indexOf("@"));

        VmIdentifier vmId = new VmIdentifier(pid);
        MonitoredHost monitoredHost = MonitoredHost.getMonitoredHost(vmId);
        MonitoredVm monitoredVm = monitoredHost.getMonitoredVm(vmId, 0);

        Monitor youngGCMonitor = monitoredVm.findByName(YOUNG_GC_MONITOR_NAME);
        Monitor fullGCMonitor = monitoredVm.findByName(FULL_GC_MONITOR_NAME);
        System.out.println(youngGCMonitor.getValue());
        System.out.println(fullGCMonitor.getValue());
    }
}

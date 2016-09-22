package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_MONITORWALL_GET_ENABLE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int                 nMonitorWallNum;                // 5gJSG=J}A?
    public NET_MONITORWALL_ENABLE_INFO[] stuEnable = new NET_MONITORWALL_ENABLE_INFO[FinalVar.SDK_MAX_MONITORWALL_NUM];  // 5gJSG=J9D\

    public NET_OUT_MONITORWALL_GET_ENABLE() {
    	for(int i = 0 ; i < FinalVar.SDK_MAX_MONITORWALL_NUM; ++i) {
    		stuEnable[i] = new NET_MONITORWALL_ENABLE_INFO();
    	}
    }
}

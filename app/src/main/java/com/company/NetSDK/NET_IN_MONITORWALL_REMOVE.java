package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_MONITORWALL_REMOVE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                 nMonitorWallNum;                // R*I>3}5D5gJSG=J}A?
    public byte[][]            szNames = new byte[FinalVar.SDK_MAX_MONITORWALL_NUM][FinalVar.SDK_COMMON_STRING_128];  // 5gJSG=C{3F

}

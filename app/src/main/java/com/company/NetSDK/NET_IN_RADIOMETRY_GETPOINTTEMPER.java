package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_RADIOMETRY_GETPOINTTEMPER implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

    public int                 nChannel;                           // M(5@:E
    public SDK_POINT           stCoordinate = new SDK_POINT();     // 2bNB5c5DWx1j,Wx1jV5 0~8192
}

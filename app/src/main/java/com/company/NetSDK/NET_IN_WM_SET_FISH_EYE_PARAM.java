package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_WM_SET_FISH_EYE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public int                             nChannel;            // Jd3vM(5@:E;rHZ:OFAPiDbM(5@:E, pszCompositeIDN*NULLJ1SPP'
    public String                     	   pszCompositeID;      // HZ:OFAID
    public int                             nWindowID;           // 6TS&Jd3vFA5D40?Z:E

    public int           					emMount;            // ScQ[02W0D#J= NET_FISHEYE_MOUNT_MODE
    public int    							emCalibrate;        // ScQ[=CU}D#J= NET_WM_FISHEYE_CALIBRATE_MODE
    public NET_WM_SET_FISHEYE_INIT_PARAM   stInitParam;         // D#J=3uJ<;/8w;-CfPEO"   
    public NET_WM_SET_FISHEYE_EPTZ_PARAM	stEPtzParam;		// 5gWSTFL(Ku7ERF6/2NJ}
	public NET_IN_WM_SET_FISH_EYE_PARAM(int fishEyeRegionNum) {
		stInitParam = new NET_WM_SET_FISHEYE_INIT_PARAM(fishEyeRegionNum);
		stEPtzParam = new NET_WM_SET_FISHEYE_EPTZ_PARAM();		
	}
}

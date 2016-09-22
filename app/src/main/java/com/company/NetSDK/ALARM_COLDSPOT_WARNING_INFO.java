package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_COLDSPOT_WARNING_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public int                 nAction;                        // 0:?*J< 1:M#V9
    public int                 nChannelID;                     // JSF5M(5@:E
    public SDK_POINT            stuCoordinate = new SDK_POINT();                   // @d5c5DWx1j,Wx1jV5 0~8192
    public float               fColdSpotValue;                  // @d5cNB6HV5
    public int                 nTemperatureUnit;               // NB6H5%N;(51G0EdVC5DNB6H5%N;),<{ CFG_TEMPERATURE_UNIT
}

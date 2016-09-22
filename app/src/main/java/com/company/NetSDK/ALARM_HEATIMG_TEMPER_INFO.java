package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_HEATIMG_TEMPER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public byte                szName[] = new byte[64];                         // NB6HRl3#5cC{3F  4S2bNB9fTrEdVCOnVPQ!Tq
    public int                 nAlarmId;                           // 1(>/On1`:E    
    public int                 nResult;                            // 1(>/=a9{V5 fTemperatureValue 5D@`PM,<{C6>Y NET_RADIOMETRY_RESULT
    public int                 nAlarmContion;                      // 1(>/Lu<~,<{C6>Y NET_RADIOMETRY_ALARMCONTION
    public float               fTemperatureValue;                  // 1(>/NB6HV5
    public int                 nTemperatureUnit;                   // NB6H5%N;(51G0EdVC5DNB6H5%N;),<{ CFG_TEMPERATURE_UNIT
    public SDK_POINT            stCoordinate = new SDK_POINT();                       // 1(>/5c5DWx1j   O`6TWx1jLeO5,H!V5>yN*0~8191
    public int                 nPresetID;                          // T$VC5c
    public int                 nChannel;                           // M(5@:E
    public int                 nAction;                            // 0:?*J< 1:M#V9 -1:N^RbRe
}

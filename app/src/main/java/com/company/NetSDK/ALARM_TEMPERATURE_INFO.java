package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * temperature alarm info
 * \else
 * NB6H9}8_1(>/
 * \endif
 */
public class ALARM_TEMPERATURE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * sensor name
	 * \else
	 * NB6H4+8PFwC{3F
	 * \endif
	 */
	public byte               szSensorName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start	
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int                nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * current temperature, unit:degree centigrade
	 * \else
	 * 51G0NB6HV5, 5%N;IcJO6H
	 * \endif
	 */
	public float              fTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME           stTime = new NET_TIME();
}

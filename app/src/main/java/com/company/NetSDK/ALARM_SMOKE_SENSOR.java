package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of smoke sensor
 * \else
 * QL8P1(>/
 * \endif
 */
public class ALARM_SMOKE_SENSOR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * current time
	 * \else
	 * 51G0J1<d
	 * \endif
	 */
	public NET_TIME        stuCurTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 1(>/M(5@
	 * \endif
	 */
	public int             nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:hight temperature alarm start,0:end
	 * \else
	 * 1:8_NB1(>/?*J<#,0#:8_NB1(>/=aJx
	 * \endif
	 */
	public byte            byHighTemperature;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1:smoke alarm start,0:end
	 * \else
	 * 1:QL8P1(>/?*J<#,0#:QL8P1(>/=aJx
	 * \endif
	 */
	public byte            bySmoke;
}

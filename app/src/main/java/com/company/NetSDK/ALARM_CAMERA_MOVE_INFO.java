package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Camera Displacement Alarm Event Struction
 * \else
 * IcOq;zRFN;1(>/JB<~
 * \endif
 */
public class ALARM_CAMERA_MOVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Alarming Channel Numbers 
	 * \else
	 * 1(>/7"IzM(5@J}
	 * \endif
	 */
	public int                         nChannelNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarming Channel Info 
	 * \else
	 * 7"Iz1(>/M(5@:EPEO"
	 * \endif
	 */
	public byte               alarmChannels[] = new byte[FinalVar.SDK_MAX_CHANNUM_EX];
}

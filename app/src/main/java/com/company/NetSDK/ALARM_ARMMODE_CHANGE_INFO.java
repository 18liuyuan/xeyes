package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Arming/Disarming Status Change Event Info
 * \else
 * 2<377@W4L,1d;/JB<~5DPEO"
 * \endif
 */
public class ALARM_ARMMODE_CHANGE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Status After Change {@link com.company.NetSDK.NET_ALARM_MODE NET_ALARM_MODE}
	 * \else
	 * 1d;/:s5DW4L, {@link com.company.NetSDK.NET_ALARM_MODE NET_ALARM_MODE}
	 * \endif
	 */
	public int                 bArm;
	
	/**
	 * \if ENGLISH_LANG
	 * Scene Mode {@link com.company.NetSDK.NET_SCENE_MODE NET_SCENE_MODE}
	 * \else
	 * Gi>0D#J= {@link com.company.NetSDK.NET_SCENE_MODE NET_SCENE_MODE}
	 * \endif
	 */
	public int                 emSceneMode;
	
	/**
	 * \if ENGLISH_LANG
	 * ID number, remote control number or keypad address, emTriggerMode=0 when  belong to NET_EM_TRIGGER_MODE_NET
	 * \else
	 * ID:E, R#?XFw1`:E;r<|EL5XV7, emTriggerModeN*NET_EM_TRIGGER_MODE_NET@`PMJ1N*0
	 * \endif
	 */
	public int                 dwID; 
	
	/**
	 * \if ENGLISH_LANG
	 * trigger mode, NET_EM_TRIGGER_MODE
	 * \else
	 * 4%7"7=J=, NET_EM_TRIGGER_MODE
	 * \endif
	 */
	public int                 emTriggerMode; 
}

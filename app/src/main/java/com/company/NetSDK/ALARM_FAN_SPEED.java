package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fan speed abnormal
 * \else
 * 7gIHW*KYRl3#JB<~
 * \endif
 */
public class ALARM_FAN_SPEED implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-?*J<, 1-M#V9
	 * \endif
	 */
	public int                dwAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * index
	 * \else
	 * 7gIHPr:E
	 * \endif
	 */
	public int                dwIndex;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * 4+8PFwC{3F
	 * \endif
	 */
	public byte                 szName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * current speed
	 * \else
	 * 51G0W*KY
	 * \endif
	 */
	public int                dwCurrent;                           
}

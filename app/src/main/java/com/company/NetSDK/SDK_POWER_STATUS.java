package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Power status
 * \else
 * 5gT4W4L,
 * \endif
 */
public class SDK_POWER_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Search succeeded or not
	 * \else
	 * 2iQ/JG7q3I9&
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Power amount
	 * \else
	 * 5gT4J}A?
	 * \endif
	 */
	public int                 nCount;

	/**
	 * \if ENGLISH_LANG
	 * Power status
	 * \else
	 * 5gT4W4L,
	 * \endif
	 */
	public SDK_POWER_INFO       stuPowers[] = new SDK_POWER_INFO[FinalVar.SDK_MAX_POWER_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Battery Number
	 * \else
	 * 5g3XJ}A?
	 * \endif
	 */
	public int                 nBatteryNum;

	/**
	 * \if ENGLISH_LANG
	 * Battery Status
	 * \else
	 * 5g3XW4L,
	 * \endif
	 */
	public SDK_BATTERY_INFO     stuBatteries[] = new SDK_BATTERY_INFO[FinalVar.SDK_MAX_BATTERY_NUM];
	 
	 public SDK_POWER_STATUS(){
		 for(int i=0 ; i<FinalVar.SDK_MAX_POWER_NUM ; i++){
			 stuPowers[i] = new SDK_POWER_INFO();
		 }
		 
		 for( int i =0 ; i<FinalVar.SDK_MAX_BATTERY_NUM ; i++){
			 stuBatteries[i] = new SDK_BATTERY_INFO();
		 }
	 }
}

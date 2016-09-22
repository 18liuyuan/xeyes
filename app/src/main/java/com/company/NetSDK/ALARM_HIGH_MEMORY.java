package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm of High memory Occupancy rate, temporarily we set the max limit as 95%
 * \else
 * DZ4fU<SCBJ9}8_JB<~1(>/#,T]6(IOO^95%!#
 * \endif
 */
public class ALARM_HIGH_MEMORY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0#:M#V9#, 1#:?*J<
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1000 times of  memory Occupancy rate
	 * \else
	 * DZ4fU<SCBJ5D100016
	 * \endif
	 */
	public int      nUsed;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time	
	 * \else
	 * JB<~7"IzJ1<d    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}

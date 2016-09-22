package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * battery scheduled notice event
 * \else
 * 5g3X5gA?6(J1M(V*JB<~
 * \endif
 */
public class ALARM_BATTERYPOWER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * battery no.
	 * \else
	 * 5g3XPr:E
	 * \endif
	 */
	public int 		  nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * JB<~J1<d
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * battery percentage
	 * \else
	 * 5g3X5gA?0Y7V1H
	 * \endif
	 */
	public int        nPercent;
}

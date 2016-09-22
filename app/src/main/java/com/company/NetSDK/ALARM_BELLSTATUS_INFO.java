package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * bell status event
 * \else
 * >/:EW4L,JB<~
 * \endif
 */
public class ALARM_BELLSTATUS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * bell channel no. 
	 * \else
	 * >/:EM(5@:E
	 * \endif
	 */
	public int         nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * event time
	 * \else
	 * JB<~J1<d
	 * \endif
	 */
	public NET_TIME    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int         nAction;                                   
}

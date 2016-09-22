package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MACcollision detection configuration
 * \else
 * MAC3eM;<l2bEdVC
 * \endif
 */
public class ALARM_MAC_COLLISION_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm activation
	 * \else
	 * 1(>/A*6/
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
}

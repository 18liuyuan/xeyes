package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP collision detection alarm configuration
 * \else
 * IP3eM;<l2b1(>/EdVC
 * \endif
 */
public class ALARM_IP_COLLISION_CFG implements Serializable {

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

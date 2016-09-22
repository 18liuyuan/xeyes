package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Netabort Alarm Configuration
 * \else
 * MxBg6O?*1(>/EdVC
 * \endif
 */
public class CFG_NETABORT_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean					bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event Handler  
	 * \else
	 * 1(>/A*6/
	 * \endif
	 */
	public CFG_ALARM_MSG_HANDLE	stuEventHandler = new CFG_ALARM_MSG_HANDLE();
}

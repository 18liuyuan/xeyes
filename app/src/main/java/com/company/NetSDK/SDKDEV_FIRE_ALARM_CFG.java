package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fire alarm
 * \else
 * ;p>/1(>/
 * \endif
 */
public class SDKDEV_FIRE_ALARM_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * ;p>/1(>/J1D\#;
	 * \endif
	 */
	public boolean                byFireEn; 
	
	/**
	 * \if ENGLISH_LANG
	 * handler
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX(); 
}

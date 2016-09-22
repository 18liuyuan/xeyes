package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Raid evnet config
 * \else
 * RaidJB<~EdVC
 * \endif
 */
public class SDKDEV_RAID_EVENT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * RaidJB<~J9D\
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * handle
	 * \else
	 * 4&@m7=J=
	 * \endif
	 */
	public SDK_MSG_HANDLE_EX    struHandle = new SDK_MSG_HANDLE_EX(); 
}

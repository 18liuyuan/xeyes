package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network Anomaly alarm
 * \else
 * MxBgRl3#1(>/
 * \endif
 */
public class SDK_NETBROKEN_ALARM_CFG implements Serializable {
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
	public byte               byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Message
	 * \else
	 * O{O"
	 * \endif
	 */
	public SDK_MSG_HANDLE       struHandle = new SDK_MSG_HANDLE();
}

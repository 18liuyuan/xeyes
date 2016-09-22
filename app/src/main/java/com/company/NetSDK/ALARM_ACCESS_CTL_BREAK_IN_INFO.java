package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Intrusion Event Detail
 * \else
 * 43HkJB<~OjO8PEO"
 * \endif
 */
public class ALARM_ACCESS_CTL_BREAK_IN_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Door Channel No.
	 * \else
	 * CEM(5@:E
	 * \endif
	 */
	public int             nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * CE={C{3F
	 * \endif
	 */
	public byte            szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME        stuTime = new NET_TIME();
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Open Event Detail
 * \else
 * CE={N49XJB<~OjO8PEO"
 * \endif
 */
public class ALARM_ACCESS_CTL_NOT_CLOSE_INFO implements Serializable {
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
	
	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int             nAction;
}

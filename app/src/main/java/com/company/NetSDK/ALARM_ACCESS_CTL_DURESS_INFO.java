package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Threat Card Swiping Event Detail
 * \else
 * P2FH?(K"?(JB<~OjO8PEO"
 * \endif
 */
public class ALARM_ACCESS_CTL_DURESS_INFO implements Serializable {
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
	 * Threat Card No.
	 * \else
	 * P2FH?(:E
	 * \endif
	 */
	public byte            szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME        stuTime = new NET_TIME();
}

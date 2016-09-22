package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Card Type
 * \else
 * ?(@`PM
 * \endif
 */
public class NET_ACCESSCTLCARD_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown
	 * \else
	 * N4V*
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_UNKNOWN = -1;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal Card
	 * \else
	 * R;0c?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GENERAL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * VIP
	 * \else
	 * VIP?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_VIP = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Guest Card
	 * \else
	 * @41v?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_GUEST = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Patrol Card
	 * \else
	 * Q2B_?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_PATROL = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Black List Card
	 * \else
	 * :ZC{5%?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_BLACKLIST = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Threat Card
	 * \else
	 * P2FH?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_CORCE = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Master Card
	 * \else
	 * D8?(
	 * \endif
	 */
	public static final int NET_ACCESSCTLCARD_TYPE_MOTHERCARD = 0xff;
}

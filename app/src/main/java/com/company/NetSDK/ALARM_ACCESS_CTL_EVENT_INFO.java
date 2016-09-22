package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Access Control Event
 * \else
 * CE={JB<~
 * \endif
 */
public class ALARM_ACCESS_CTL_EVENT_INFO implements Serializable {
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
	public int                         nDoor;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Name
	 * \else
	 * CE={C{3F
	 * \endif
	 */
	public byte                        szDoorName[] = new byte[FinalVar.SDK_MAX_DOORNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Event Time
	 * \else
	 * 1(>/JB<~7"Iz5DJ1<d
	 * \endif
	 */
	public NET_TIME                    stuTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * CE={JB<~@`PM
	 * \endif
	 */
	public int                         emEventType;
	
	/**
	 * \if ENGLISH_LANG
	 * Access Control Event Type
	 * \else
	 * K"?(=a9{#,TRUE1mJ>3I9&#,FALSE1mJ>J'0\
	 * \endif
	 */
	public boolean                     bStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * Card Type
	 * \else
	 * ?(@`PM
	 * \endif
	 */
	public int                         emCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Unlock Method
	 * \else
	 * ?*CE7=J=
	 * \endif
	 */
	public int                         emOpenMethod;
	
	/**
	 * \if ENGLISH_LANG
	 * Card No.
	 * \else
	 * ?(:E
	 * \endif
	 */
	public byte                        szCardNo[] = new byte[FinalVar.SDK_MAX_CARDNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte                        szPwd[] = new byte[FinalVar.SDK_MAX_CARDPWD_LEN];
}

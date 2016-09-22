package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Entrance Guard Record  Information
 * \else
 * CE={C\Bk<GB<</PEO"
 * \endif
 */
public class NET_RECORDSET_ACCESS_CTL_PWD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * <GB<</1`:E#,V;6A
	 * \endif
	 */
	public int			nRecNo; 
	
	/**
	 * \if ENGLISH_LANG
	 * Creat Time
	 * \else
	 * 44=(J1<d
	 * \endif
	 */
	public NET_TIME		stuCreateTime; 
	
	/**
	 * \if ENGLISH_LANG
	 * User's ID
	 * \else
	 * SC;'ID
	 * \endif
	 */
	public char        	szUserID[] 		= new char[FinalVar.SDK_MAX_USERID_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Open Password
	 * \else
	 * ?*CEC\Bk
	 * \endif
	 */
	public char			szDoorOpenPwd[] = new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm Password
	 * \else
	 * 1(>/C\Bk
	 * \endif
	 */
	public char			szAlarmPwd[] 	= new char[FinalVar.SDK_MAX_CARDPWD_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * SPP'5D5DCEJ}D?
	 * \endif
	 */
	public int			nDoorNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * SPH(O^5DCEPr:E#,<4CFG_CMD_ACCESS_EVENTEdVCCFG_ACCESS_EVENT_INFO5DJ}WiOB1j
	 * \endif
	 */
	public int		    sznDoors[] 		= new int[FinalVar.SDK_MAX_DOOR_NUM]; 
}

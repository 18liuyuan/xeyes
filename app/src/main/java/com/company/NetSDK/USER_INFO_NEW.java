package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info structure body 
 * \else
 * SC;'PEO"
 * \endif
 */
public class USER_INFO_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID
	 * \else
	 * Id:E
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group ID 
	 * \else
	 * WiID:E
	 * \endif
	 */
	public int				dwGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name 
	 * \else
	 * C{WVC{
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * C\Bk
	 * \endif
	 */
	public char			passWord[] = new char[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Right amount 
	 * \else
	 * H(O^AP1m3$6H
	 * \endif
	 */
	public int				dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right 
	 * \else
	 * H(O^AP1m
	 * \endif
	 */
	public int				rights[] = new int[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note 
	 * \else
	 * 18W"
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask#,0x00000001 - support account reusable
	 * \else
	 * QZBk#,0x00000001 - V'3VSC;'84SC
	 * \endif
	 */
	public int				dwFouctionMask;			
}

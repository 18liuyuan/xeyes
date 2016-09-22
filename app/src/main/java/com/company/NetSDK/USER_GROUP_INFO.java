package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User group info
 * \else
 * SC;'WiPEO"
 * \endif
 */
public class USER_GROUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID 
	 * \else
	 * ID:E
	 * \endif
	 */
	public int					dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group name 
	 * \else
	 * WiC{
	 * \endif
	 */
	public char				name[] = new char[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Right list length 
	 * \else
	 * H(O^3$6H
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right list 
	 * \else
	 * H(O^AP1m
	 * \endif
	 */
	public int					rights[] = new int[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note 
	 * \else
	 * 18W"
	 * \endif
	 */
	public char				memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}

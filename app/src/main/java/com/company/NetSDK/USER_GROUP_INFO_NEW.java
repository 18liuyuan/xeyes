package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User group info
 * \else
 * SC;'WiPEO"
 * \endif
 */
public class USER_GROUP_INFO_NEW implements Serializable {
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
	 * Name 
	 * \else
	 * WiC{
	 * \endif
	 */
	public char				name[] = new char[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Right amount 
	 * \else
	 * H(O^3$6H
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * H(O^AP1m
	 * \endif
	 */
	public int 				rights[] = new int[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note 
	 * \else
	 * 18W" 
	 * \endif
	 */
	public char				memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}

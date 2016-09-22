package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User info
 * \else
 * SC;'PEO"
 * \endif
 */
public class USER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User ID 
	 * \else
	 * SC;'Id
	 * \endif
	 */
	public int					dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Group ID 
	 * \else
	 * WiID
	 * \endif
	 */
	public int					dwGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * User name 
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public char				name[] = new char[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public char				passWord[] = new char[FinalVar.SDK_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Right list amount
	 * \else
	 * H(O^AP1m3$6H
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right
	 * \else
	 * H(O^AP1m
	 * \endif
	 */
	public int					rights[] = new int[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Note: One Chinese character stands for 3-bit. One English character stands for 1-bit. The total length shall be less than 31. Add end symbol at the end.
	 * \else
	 * 18W"
	 * \endif
	 */
	public char				memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * reusable.1#:Reusable#,0#:do not reuse. 
	 * \else
	 * JG7q84SC#;1#:84SC#,0#:2;84SC
	 * \endif
	 */
	public int					dwReusable;
}

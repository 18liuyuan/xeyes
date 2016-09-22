package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Support the device with max 8 bits user name. Corresponding to the  QueryUserInfo and  OperateUserInfo .Right information 
 * \else
 * H(O^PEO", V'3VSC;'C{Wn4s3$6HN*8N;5DIh18#,6TS&  QueryUserInfo :M OperateUserInfo =S?Z
 * \endif
 */
public class OPR_RIGHT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right ID
	 * \else
	 * H(O^ID
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * H(O^C{WV
	 * \endif
	 */
	public char			name[] = new char[FinalVar.SDK_RIGHT_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Memo
	 * \else
	 * 18W"
	 * \endif
	 */
	public char			memo[] = new char[FinalVar.SDK_MEMO_LENGTH];
}

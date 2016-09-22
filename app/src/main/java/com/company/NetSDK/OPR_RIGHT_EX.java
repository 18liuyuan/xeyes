package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Right information Corresponding to the  QueryUserInfoEx and  OperateUserInfoEx .
 * \else
 * H(O^PEO", V'3VSC;'C{Wn4s3$6HN*8N;;r16N;5DIh18#,6TS&@)U9=S?Z QueryUserInfoEx :M OperateUserInfoEx
 * \endif
 */
public class OPR_RIGHT_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ID
	 * \else
	 * H(O^ID
	 * \endif
	 */
	public int				dwID;
	
	/**
	 * \if ENGLISH_LANG
	 * Name
	 * \else
	 * H(O^C{ 
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

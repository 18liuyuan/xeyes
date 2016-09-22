package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User information list. Support 16-bit user name and password length
 * \else
 * SC;'PEO"1m
 * \endif
 */
public class USER_MANAGE_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right list length 
	 * \else
	 * H(O^PEO"
	 * \endif
	 */
	public int					dwRightNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Right info 
	 * \else
	 * H(O^PEO" 
	 * \endif
	 */
	public OPR_RIGHT_EX		rightList[] = new OPR_RIGHT_EX[FinalVar.SDK_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Group list length 
	 * \else
	 * WiAP1m3$6H 
	 * \endif
	 */
	public int					dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * SC;'WiPEO"
	 * \endif
	 */
	public USER_GROUP_INFO_EX  groupList[] = new USER_GROUP_INFO_EX[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User list length 
	 * \else
	 * SC;'AP1m3$6H
	 * \endif
	 */
	public int					dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * SC;'PEO"
	 * \endif
	 */
	public USER_INFO_EX		userList[] = new USER_INFO_EX[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask#;0x00000001 - support account reuse#,0x00000002 - Need verification when change password 
	 * \else
	 * QZBk#;0x00000001 - V'3VSC;'84SC#,0x00000002 - C\BkP^8DPhR*P#Qi
	 * \endif
	 */
	public int					dwFouctionMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Need verification when change password
	 * \else
	 * V'3V5DSC;'C{Wn4s3$6H
	 * \endif
	 */
	public byte				byNameMaxLength;
	
	/**
	 * \if ENGLISH_LANG
	 * The max password length supported 
	 * \else
	 * V'3V5DC\BkWn4s3$6H
	 * \endif
	 */
	public byte				byPSWMaxLength;
	
	public USER_MANAGE_INFO_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_RIGHT_NUM; i++) {
			rightList[i] = new OPR_RIGHT_EX();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_GROUP_NUM; i++) {
			groupList[i] = new USER_GROUP_INFO_EX();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_USER_NUM; i++) {
			userList[i] = new USER_INFO_EX();
		}
	}
}

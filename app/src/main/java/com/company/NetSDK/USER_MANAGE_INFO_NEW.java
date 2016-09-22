package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User information list 
 * \else
 * SC;'PEO"1m
 * \endif
 */
public class USER_MANAGE_INFO_NEW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Right information 
	 * \else
	 * H(O^AP1m3$6H
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
	public OPR_RIGHT_NEW		rightList[] = new OPR_RIGHT_NEW[FinalVar.SDK_NEW_MAX_RIGHT_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * SC;'WiAP1m3$6H
	 * \endif
	 */
	public int					dwGroupNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User group info 
	 * \else
	 * SC;'WiAP1m
	 * \endif
	 */
	public USER_GROUP_INFO_EX2 groupListEx[] = new USER_GROUP_INFO_EX2[FinalVar.SDK_MAX_GROUP_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User info 
	 * \else
	 * SC;'AP1m3$6H
	 * \endif
	 */
	public int					dwUserNum;
	
	/**
	 * \if ENGLISH_LANG
	 * User list 
	 * \else
	 * SC;'AP1m
	 * \endif
	 */
	public USER_INFO_NEW		userList[] = new USER_INFO_NEW[FinalVar.SDK_MAX_USER_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Submask#;0x00000001 - Support account reuse#,0x00000002 - Need verification when change password 
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

	public USER_MANAGE_INFO_NEW() {
		for(int i=0 ; i<FinalVar.SDK_NEW_MAX_RIGHT_NUM ; i++) {
			rightList[i] = new OPR_RIGHT_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_USER_NUM ; i++) {
			userList[i] = new USER_INFO_NEW();
		}
		
		for(int i =0 ; i<FinalVar.SDK_MAX_GROUP_NUM ; i++) {
			groupListEx[i] = new USER_GROUP_INFO_EX2();
		}
	}
}

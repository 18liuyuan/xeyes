package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_USER_REJECT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ip
	 * \else
	 * ip5XV7
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User Group
	 * \else
	 * SC;'Wi
	 * \endif
	 */
	public byte                szUserGroup[] = new byte[32]; 
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte                szUserName[] = new byte[32]; 
}

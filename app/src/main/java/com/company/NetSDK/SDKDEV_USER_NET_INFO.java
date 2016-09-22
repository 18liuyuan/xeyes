package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * User network use status info 
 * \else
 * SC;'MxBgJ9SCW4L,PEO"
 * \endif
 */
public class SDKDEV_USER_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * User name 
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte				szUserName[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Group 
	 * \else
	 * SC;'Wi
	 * \endif
	 */
	public byte				szUserGroup[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Login time 
	 * \else
	 * 5GHkJ1<d
	 * \endif
	 */
	public NET_TIME			time = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Enabled channel amount 
	 * \else
	 * ?*Ft5DM(5@8vJ}
	 * \endif
	 */
	public int					nOpenedChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel network status 
	 * \else
	 * M(5@MxBgW4L,
	 * \endif
	 */
	public SDKDEV_USE_CHANNEL_STATE	channelInfo[] = new SDKDEV_USE_CHANNEL_STATE[FinalVar.SDK_MAX_CHANNUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Ip address 
	 * \else
	 * ip5XV7
	 * \endif
	 */
	public byte                szIpAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN_EX];
	
	public SDKDEV_USER_NET_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
			channelInfo[i] = new SDKDEV_USE_CHANNEL_STATE();
		}
	}
}

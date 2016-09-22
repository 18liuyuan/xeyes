package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP setup 
 * \else
 * NTPEdVC
 * \endif
 */
public class SDKDEV_NTP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable or not
	 * \else
	 * JG7qFtSC
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * NTP  server default port is 123
	 * \else
	 * NTP7~NqFwD,HO6K?ZN*123
	 * \endif
	 */
	public int                 nHostPort;

	/**
	 * \if ENGLISH_LANG
	 * Host IP
	 * \else
	 * Vw;zIP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Domain name
	 * \else
	 * SrC{
	 * \endif
	 */
	public byte                szDomainName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Read only ,0:IP,1:domain name ,2:IP and domain name
	 * \else
	 * 2;?IIhVC#,0#:1mJ>IP#,1#:1mJ>SrC{#,2#:1mJ>IP:MSrC{
	 * \endif
	 */
	public int                 nType;

	/**
	 * \if ENGLISH_LANG
	 * Update time(minute)
	 * \else
	 * 8|PBJ1<d(7VVS)
	 * \endif
	 */
	public int                 nUpdateInterval;

	/**
	 * \if ENGLISH_LANG
	 * Please refer to SDK_TIME_ZONE_TYPE
	 * \else
	 * <{SDK_TIME_ZONE_TYPE
	 * \endif
	 */
	public int                 nTimeZone;
}

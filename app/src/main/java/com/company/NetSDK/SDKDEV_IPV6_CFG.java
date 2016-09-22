package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IPv6 config
 * \else
 * IPv6EdVC
 * \endif
 */
public class SDKDEV_IPV6_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * link address: string length = 44;(every host has an exclusive link address, read only)
	 * \else
	 * A4B75XV7: WV7{4., 3$6HN*44;(>VSrMxDZC?L(Vw;zS5SPN(R;5DA4B75XV7#,V;6A)
	 * \endif
	 */
	public byte               szLinkAddr[] = new byte[44];

	/**
	 * \if ENGLISH_LANG
	 * host IP
	 * \else
	 * Vw;zIP
	 * \endif
	 */
	public byte               szHostIP[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * net prefix, 1-128
	 * \else
	 * MxBgG0W:#(76N'#:1-128#,?I6A?IP4#)
	 * \endif
	 */
	public int              dwPreFix;

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * D,HOMx9X
	 * \endif
	 */
	public byte               szGateWay[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * enable of auto get ip
	 * \else
	 * WT6/;qH!J9D\
	 * \endif
	 */
	public boolean               bAutoGet;

	/**
	 * \if ENGLISH_LANG
	 * primary DNS
	 * \else
	 * JWQ!DNS
	 * \endif
	 */
	public byte               szPrimaryDns[] = new byte[40];

	/**
	 * \if ENGLISH_LANG
	 * second DNS
	 * \else
	 * 18Q!DNS
	 * \endif
	 */
	public byte               szSecondDns[] = new byte[40];
}

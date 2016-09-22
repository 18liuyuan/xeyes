package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP modify configuration
 * \else
 * IPP^8DEdVC
 * \endif
 */
public class SDKCTRL_IPMODIFY_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * device IP
	 * \else
	 * G06KIh18IP
	 * \endif
	 */
	public byte            szRemoteIP[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

	/**
	 * \if ENGLISH_LANG
	 * submask
	 * \else
	 * WSMxQZBk
	 * \endif
	 */
	public byte            szSubmask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * gatway
	 * \else
	 * Mx9X
	 * \endif
	 */
	public byte            szGateway[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];

	/**
	 * \if ENGLISH_LANG
	 * MAC addr
	 * \else
	 * MAC5XV7
	 * \endif
	 */
	public byte            szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * device type
	 * \else
	 * Ih18@`PM
	 * \endif
	 */
	public byte            szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
}

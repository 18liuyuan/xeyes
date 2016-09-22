package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to SearchDevices
 * \else
 * 6TS& SearchDevices =S?Z
 * \endif
 */
public class DEVICE_NET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte				szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * tcp6K?Z
	 * \endif
	 */
	public int					nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask
	 * \else
	 * WSMxQZBk
	 * \endif
	 */
	public byte				szSubmask[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * Mx9X
	 * \endif
	 */
	public byte				szGateway[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address
	 * \else
	 * MAC5XV7
	 * \endif
	 */
	public byte				szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * 6KIh18@`PM
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Manufactory
	 * \else
	 * D?1jIh185DIz2z3'IL,>_Le2N?< EM_IPC_TYPE @`
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 4: IPv4, szXXX is in format with dot; 6:IPv6, szXXX is 128-bit *16 bytes) numerical format
	 * \else
	 * 4: IPv4, szXXXN*5c7VWV7{4.PNJ=;  6:IPv6, szXXXN*128N;(16WV=Z)J}V5PNJ=
	 * \endif
	 */
	public byte                byIPVersion;
}

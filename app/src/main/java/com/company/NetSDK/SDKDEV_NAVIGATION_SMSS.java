package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NAVIGATION OR SMS, INetSDK.ControlDevice(SDK_NAVIGATION_SMS)
 * \else
 * 5<:=PEO":M6LO{O", INetSDK.ControlDevice(SDK_NAVIGATION_SMS)
 * \endif
 */
public class SDKDEV_NAVIGATION_SMSS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * phone no
	 * \else
	 * 5g;0:EBk
	 * \endif
	 */
	public byte                szPhoneNum[] = new byte[FinalVar.SDK_MAX_PHONE_NO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * time of sending message
	 * \else
	 * PEO"7"KMJ1<d
	 * \endif
	 */
	public NET_TIME            stMsgTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * type:Navigation message-Navigation,short message--SMS
	 * \else
	 * PEO"@`PM#(5<:=PEO"-Navigation#; 6LO{O"--SMS#)
	 * \endif
	 */
	public byte                szMsgType[] = new byte[FinalVar.SDK_MAX_MSGTYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * message to send
	 * \else
	 * 7"KM5DPEO"DZH]
	 * \endif
	 */
	public byte                szSmsContext[] = new byte[FinalVar.SDK_MAX_MSG_LEN];

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * FpJ<>-N36H
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stLogiLati = new SDKDEV_LONGI_LATI();

	/**
	 * \if ENGLISH_LANG
	 * 01:marking true longitude
	 * \else
	 * 01#:1jV>7"@45DJGUfJ5>-N36H
	 * \endif
	 */
	public int        uFlag;

	/**
	 * \if ENGLISH_LANG
	 * TNC,TXZ
	 * \else
	 * TNC,N*?-A"5B5XM<VPPD5<:=8qJ=#,TXZ,N*LlPPU_5XM<VPPD5<:=8qJ=
	 * \endif
	 */
	public byte                szNavigationType[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * address
	 * \else
	 * 5X5cPEO"
	 * \endif
	 */
	public byte                szAddress[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * mode
	 * \else
	 * 5<:=D#J= SPRecommendMF<v#,Economical>-<CPM#,Fastest Wn?l#;Shortest Wn6L#;
	 * \endif
	 */
	public byte                szNavigationMode[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * passing
	 * \else
	 * >-SI5c
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stPassLogiLati[] = new SDKDEV_LONGI_LATI[5];

	/**
	 * \if ENGLISH_LANG
	 * no passing
	 * \else
	 * 2;>-SI5c
	 * \endif
	 */
	public SDKDEV_LONGI_LATI    stNoPassLogiLati[] = new SDKDEV_LONGI_LATI[5];
	
	public SDKDEV_NAVIGATION_SMSS() {
		for (int i = 0; i < 5; i++) {
			stPassLogiLati[i] = new SDKDEV_LONGI_LATI();
			stNoPassLogiLati[i] = new SDKDEV_LONGI_LATI();
		}
	}
}

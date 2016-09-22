package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless routing config
 * \else
 * N^O_B7SIEdVC
 * \endif
 */
public class SDKDEV_WIRELESS_ROUTING_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSIDC{3F
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * hide SSID
	 * \else
	 * JG7qR~2XSSID
	 * \endif
	 */
	public boolean                bHideSSID;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                szIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * sub mark
	 * \else
	 * WSMxQZBk
	 * \endif
	 */
	public byte                szSubMark[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * gateway
	 * \else
	 * Mx9X
	 * \endif
	 */
	public byte                szGateWay[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * country
	 * \else
	 * 9z<R, DefaultD,HO2;V86(!#9z<RC{3FAP1m2N?<N^O_B7SID\A&PEO"
	 * \endif
	 */
	public byte                szCountry[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * safe type: 1-no encryption; 2-WEP; 2-WPA-PSK; 3-WPA2-PSK
	 * \else
	 * <xH(D#J=: 1-2;<SC\; 2-WEPD#J=; 2-WPA-PSKD#J=; 3-WPA2-PSKD#J=
	 * \endif
	 */
	public int                 nSafeType;

	/**
	 * \if ENGLISH_LANG
	 * encryption: WEP(1-auto 2-open 3-shareable); WPA-PSK/WPA2-PSK(4-TKIP 5-AES)
	 * \else
	 * <SC\7=J=: WEPD#J=(1-WT6/ 2-?*7E 3-92Om); WPA-PSKD#J=/WPA2-PSKD#J=(4-TKIP 5-AES)
	 * \endif
	 */
	public int                 nEncryption;

	/**
	 * \if ENGLISH_LANG
	 * key
	 * \else
	 * A,=SC\T?
	 * \endif
	 */
	public byte                szKey[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * PE5@, SPP'PE5@AP1m2N?<N^O_B7SID\A&PEO"
	 * \endif
	 */
	public int                 nChannel;

	/**
	 * \if ENGLISH_LANG
	 * auto channel select
	 * \else
	 * WT6/Q!TqPE5@
	 * \endif
	 */
	public boolean                bAutoChannelSelect;
}

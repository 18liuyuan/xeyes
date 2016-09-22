package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Select to use one wireless device
 * \else
 * Q!TqJ9SCD38vN^O_Ih18
 * \endif
 */
public class SDKDEV_WLAN_DEVICE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];
	
	/**
	 * \if ENGLISH_LANG
	 * Connection mode#;0#:adhoc,1#:Infrastructure
	 * \else
	 * A,=SD#J=#;0#:adhoc#,1#:Infrastructure
	 * \endif
	 */
	public int                 nLinkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption#;0#:off,2#:WEP64bit,3#:WEP128bit
	 * \else
	 * <SC\#;0#:off#,2#:WEP64bit#,3#:WEP128bit
	 * \endif
	 */
	public int                 nEncryption;
}

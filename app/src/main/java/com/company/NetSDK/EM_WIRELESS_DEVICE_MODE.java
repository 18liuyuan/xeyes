package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless Device Mode
 * \else
 * N^O_Ih189$WwD#J=
 * \endif
 */
public class EM_WIRELESS_DEVICE_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown mode
	 * \else
	 * D#J=N4J61p
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_UNKNOWN = 0;                
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * Normal FUM(D#J=
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_NORMAL = 1;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Polling. It only to be valid when emType of NET_CODEID_INFO is NET_WIRELESS_DEVICE_TYPE_REMOTECONTROL
	 * \else
	 * Polling Q2<lD#J= V;SPemTypeN*RemoteControlJ12ED\4&SZQ2<lD#J=
	 * \endif
	 * @see NET_CODEID_INFO
	 */
	public static final int EM_WIRELESS_DEVICE_MODE_POLLING = 2;                    
}

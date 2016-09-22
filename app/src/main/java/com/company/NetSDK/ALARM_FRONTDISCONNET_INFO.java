package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * front IPC disconnect alarm info
 * \else
 * G06K6OMx1(>/PEO"
 * \endif
 */
public class ALARM_FRONTDISCONNET_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel id
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start	
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int                nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME           stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * front IP's address
	 * \else
	 * G06KIPC5DIP5XV7
	 * \endif
	 */
	public byte               szIpAddress[] = new byte[FinalVar.MAX_PATH];
}

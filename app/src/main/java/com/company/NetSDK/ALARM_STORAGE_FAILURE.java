package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage failure alarm info
 * \else
 * 4f4"Rl3#1(>/
 * \endif
 */
public class ALARM_STORAGE_FAILURE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:stop 1:start
	 * \else
	 * 0#:M#V9#, 1#:?*J<
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * protocol type
	 * \else
	 * P-Ri@`PM#,D?G0V;V'3VFTP
	 * \endif
	 */
	public byte      szProtocol[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * server device's ip 
	 * \else
	 * 7~NqFwIP5XV7
	 * \endif
	 */
	public byte      szServerAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * port number
	 * \else
	 * 6K?Z:E
	 * \endif
	 */
	public int     dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel, from 1, 0 means does not distinguish
	 * \else
	 * M(5@:E, 4S1?*J<, 01mJ>2;Gx7VM(5@
	 * \endif
	 */
	public int       nChannel;
}

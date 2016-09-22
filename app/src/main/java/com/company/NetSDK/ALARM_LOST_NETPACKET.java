package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm of netpackage loss
 * \else
 * MxBg7"KMJ}>]6*0|JB<~1(>/
 * \endif
 */
public class ALARM_LOST_NETPACKET implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0: Stop, 1: start
	 * \else
	 * 0#:M#V9#, 1#:?*J<
	 * \endif
	 */
	public int      ActionType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel ID, start from 1
	 * \else
	 * M(5@:E#,4S1?*J<
	 * \endif
	 */
	public int      nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Bit stream type, 0: main stream; 1: extra stream1; 2: extra stream2; 3: extra stream3; 4: snapshot stream
	 * \else
	 * BkAw@`PM#,0#:VwBkAw#;1#:8(BkAw1#;2#:8(BkAw2#;3#:8(BkAw3#;4#:W%M<BkAw
	 * \endif
	 */
	public int      nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP address of sending
	 * \else
	 * 7"KM6KIP5XV7
	 * \endif
	 */
	public byte      szRemoteIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port address of sending 
	 * \else
	 * 7"KM6K5D6K?Z5XV7
	 * \endif
	 */
	public int     dwRemotePort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time
	 * \else
	 * JB<~7"IzJ1<d    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}

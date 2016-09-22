package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm of record loss
 * \else
 * 6*B<OqJB<~1(>/
 * \endif
 */
public class ALARM_LOST_RECORD implements Serializable {
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
	 * Bit Stream type, 0: main stream; 1: extra stream1; 2: extra stream2; 3: extra stream3; 4: snapshot stream
	 * \else
	 * BkAw@`PM#,0#:VwBkAw#;1#:8(BkAw1#;2#:8(BkAw2#;3#:8(BkAw3#;4#:W%M<BkAw
	 * \endif
	 */
	public int      nStreamType;
	
 	/**
	 * \if ENGLISH_LANG
	 * Event occurrence time	
	 * \else
	 * JB<~7"IzJ1<d    
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}

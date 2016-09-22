package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of ivs
 * \else
 * VGD\1(>/JB<~
 * \endif
 */
public class ALARM_IVS_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * JB<~7"IzJ1<d    
	 * \endif
	 */
	public NET_TIME   stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * channel ID,from 0
	 * \else
	 * M(5@:E#,4S0?*J<
	 * \endif
	 */
	public int        nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * 1(>/@`PM
	 * \endif
	 */
	public byte       szType[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * state,0-reset,1-setting,2-pulse
	 * \else
	 * 1(>/W4L,#,0-1(>/84N;#,1-1(>/VCN;, 2-Bv3eJ=1(>/
	 * \endif
	 */
	public int        nState;
}

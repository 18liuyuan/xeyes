package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * output parameter about getting channel of preview 
 * \else
 * ;qH!5<2%T$@@M(5@:E 3v2N
 * \endif
 */
public class NET_OUT_GET_COMPOSITE_PREVIEW_CHANNEL implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * the amount of using channel  
	 * \else
	 * M(5@J}A?
	 * \endif
	 */
	public int                      nChannelNum;                       
    
	/**
	 * \if ENGLISH_LANG
	 * the using channel
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int[]                    nChannel = new int[FinalVar.MAX_PREVIEW_CHANNEL_NUM]; 
}

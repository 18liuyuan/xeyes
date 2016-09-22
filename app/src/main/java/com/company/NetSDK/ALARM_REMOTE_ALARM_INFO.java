package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of remote 
 * \else
 * T63LMb2?1(>/PEO"
 * \endif
 */
public class ALARM_REMOTE_ALARM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel ID,from 1
	 * \else
	 * M(5@:E#,4S1?*J<
	 * \endif
	 */
	public int        nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * state,0-reset,1-setting
	 * \else
	 * 1(>/W4L,#,0-1(>/84N;#,1-1(>/VCN;
	 * \endif
	 */
	public int        nState;
}

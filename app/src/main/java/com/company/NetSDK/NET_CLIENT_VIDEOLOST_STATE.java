package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Struct of video loss alarm
 * \else
 * JSF56*J'1(>/W4L,PEO"6TS&=a99Le
 * \endif
 */
public class NET_CLIENT_VIDEOLOST_STATE implements Serializable {	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount 
	 * \else
	 * M(5@J}A? 
	 * \endif
	 */
	public int				   channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * Use bit to stand for alarm status of channel 0-31. 0-No alarm#,1-Have alarm 
	 * \else
	 * C?R;8vint04N;1mJ>32M(5@5D1(>/W4L,, 0-1mJ>N^1(>/, 1-1mJ>SP1(>/
	 * \endif
	 */
	public int           	   dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}

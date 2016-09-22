package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * Mb2?1(>/W4L,PEO"6TS&=a99Le
 * \endif
 */
public class NET_CLIENT_ALARM_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm input amount
	 * \else
	 * 1(>/JdHk8vJ}
	 * \endif
	 */
	public int				  alarminputcount;
	
	/**
	 * \if ENGLISH_LANG
	 * DWORD value is the state by bit of 32 channels,0-no alarm,1-alarm
	 * \else
	 * C?R;8vDWORD04N;1mJ>32M(5@5D1(>/W4L,, 0-1mJ>N^1(>/, 1-1mJ>SP1(>/
	 * \endif
	 */
	public int                dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK]; 
}

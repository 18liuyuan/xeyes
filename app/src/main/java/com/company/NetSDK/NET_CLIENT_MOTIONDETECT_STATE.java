package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding structure of motion detect alarm status info
 * \else
 * 6/L,<l2b1(>/W4L,PEO"6TS&=a99Le
 * \endif
 */
public class NET_CLIENT_MOTIONDETECT_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * M(5@8vJ}
	 * \endif
	 */
	public int				channelcount;
	
	/**
	 * \if ENGLISH_LANG
	 * DWORD value is the state by bit of 32 channels,0-no alarm,1-alarm
	 * \else
	 * C?R;8vint04N;1mJ>32M(5@5D1(>/W4L,, 0-1mJ>N^1(>/, 1-1mJ>SP1(>/
	 * \endif
	 */
	public int              dwAlarmState[] = new int[FinalVar.SDK_MAX_CHANMASK];
}

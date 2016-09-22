package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Abnormal record alarm
 * \else
 * B<OqRl3#1(>/
 * \endif
 */
public class ALARM_RECORD_FAILED_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:start 1:stop
	 * \else
	 * 0:?*J< 1:M#V9
	 * \endif
	 */
	public int                  nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel no
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                  nIndex;
}

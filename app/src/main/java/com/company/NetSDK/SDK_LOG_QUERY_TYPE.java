package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log search type 
 * \else
 * HUV>2iQ/@`PM
 * \endif
 */
public class SDK_LOG_QUERY_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * All logs
	 * \else
	 * KySPHUV>
	 * \endif
	 */
	public static final int     SDKLOG_ALL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * System logs 
	 * \else
	 * O5M3HUV>
	 * \endif
	 */
	public static final int     SDKLOG_SYSTEM = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Configuration logs
	 * \else
	 * EdVCHUV>
	 * \endif
	 */
	public static final int     SDKLOG_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage logs
	 * \else
	 * 4f4"O`9X
	 * \endif
	 */
	public static final int     SDKLOG_STORAGE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm logs 
	 * \else
	 * 1(>/HUV>
	 * \endif
	 */
	public static final int     SDKLOG_ALARM = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * Record related
	 * \else
	 * B<OsO`9X
	 * \endif
	 */
	public static final int     SDKLOG_RECORD = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * Account related
	 * \else
	 * UJ:EO`9X
	 * \endif
	 */
	public static final int     SDKLOG_ACCOUNT = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log 
	 * \else
	 * Ge3}HUV>
	 * \endif
	 */
	public static final int     SDKLOG_CLEAR = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback related 
	 * \else
	 * ;X7EO`9X
	 * \endif
	 */
	public static final int     SDKLOG_PLAYBACK = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * Concerning the front-end management and running
	 * \else
	 * G06K9\@mTKPPO`9X
	 * \endif
	 */
	public static final int     SDKLOG_MANAGER = 9;
}

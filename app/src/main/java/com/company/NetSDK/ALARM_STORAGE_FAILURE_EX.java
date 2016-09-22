package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of storage failure
 * \else
 * 4f4"4mNs1(>/
 * \endif
 */
public class ALARM_STORAGE_FAILURE_EX implements Serializable {
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
	public int                 nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[FinalVar.SDK_EVENT_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * device name
	 * \else
	 * 4f4"Ih18C{3F
	 * \endif
	 */
	public byte                szDevice[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * group name
	 * \else
	 * 4f4"WiC{3F
	 * \endif
	 */
	public byte                szGroup[] = new byte[FinalVar.SDK_STORAGE_NAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * path
	 * \else
	 * B7>6
	 * \endif
	 */
	public byte                szPath[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * error type
	 * \else
	 * 4mNs@`PM
	 * \endif
	 */
	public int                 emError;
}

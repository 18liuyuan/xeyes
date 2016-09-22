package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of file system
 * \else
 * ND<~O5M38f>/
 * \endif
 */
public class ALARM_FILE_SYSTEM_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * mount name
	 * \else
	 * ND<~O5M39RTXC{
	 * \endif
	 */
	public byte                 szMountDir[] = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * state, 0: Unkown, 1: Normal, 2: Error
	 * \else
	 * ND<~O5M3W4L,, 0: Unkown, 1: Normal, 2: Error
	 * \endif
	 */
	public int                nState;
}

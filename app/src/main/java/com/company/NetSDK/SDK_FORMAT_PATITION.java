package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * format the partition information, INetSDK.ControlDevice(SDK_CTRL_FORMAT_PATITION)
 * \else
 * 8qJ=;/7VGxPEO", INetSDK.ControlDevice(SDK_CTRL_FORMAT_PATITION)
 * \endif
 */
public class SDK_FORMAT_PATITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * storage name
	 * \else
	 * 4f4"Ih18C{3F
	 * \endif
	 */
	public String		pszStorageName; 
	
	/**
	 * \if ENGLISH_LANG
	 * partition name
	 * \else
	 * 7VGxC{
	 * \endif
	 */
	public String		pszPatitionName; 
}

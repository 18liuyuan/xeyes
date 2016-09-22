package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * black list snap info
 * \else
 * :ZC{5%35A>W%EDJB<~
 * \endif
 */
public class SDK_BLACKLIST_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * number of plate
	 * \else
	 * 35EF:E
	 * \endif
	 */
	public byte      szPlateNumber[] = new byte[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME  stuTime = new NET_TIME();
}

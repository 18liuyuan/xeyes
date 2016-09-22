package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Information of Records in Device Hard Disk
 * \else
 * Ih18S2EL@o5DB<OsPEO"
 * \endif
 */
public class DEV_DISK_RECORD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * The Earliest Recording Time 
	 * \else
	 * WnTgB<OsJ1<d
	 * \endif
	 */
	public NET_TIME			stuBeginTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Most Recently Recording Time
	 * \else
	 * Wn=|B<OsJ1<d
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
}

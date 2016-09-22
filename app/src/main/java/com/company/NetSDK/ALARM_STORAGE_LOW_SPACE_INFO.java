package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of storage low space
 * \else
 * 4f4"H]A?2;WcJB<~
 * \endif
 */
public class ALARM_STORAGE_LOW_SPACE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0:start 2:stop
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
	 * total space byte
	 * \else
	 * W\H]A?, byte
	 * \endif
	 */
	public long               nTotalSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * free space byte
	 * \else
	 * J#S`H]A?, byte
	 * \endif
	 */
	public long               nFreeSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * used percent
	 * \else
	 * RQ>-J9SC5D0Y7V1H
	 * \endif
	 */
	public int                 nPercent;
}

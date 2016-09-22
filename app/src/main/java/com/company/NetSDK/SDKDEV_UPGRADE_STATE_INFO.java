package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * device program upgrade status
 * \else
 * ;qH!Ih18I}<6W4L,
 * \endif
 */
public class SDKDEV_UPGRADE_STATE_INFO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:None- no update found, default status; 1:Regular-general upgrade; 2:Emergency-forced; 3:Upgrading-upgrading
	 * \else
	 * 0:None-C;SP<l2b5=8|PB, D,HOW4L,; 1:Regular-R;0cI}<6; 2:Emergency-G?VFI}<6; 3:Upgrading-I}<6VP
	 * \endif
	 */
    public int                 nState;
	/**
	 * \if ENGLISH_LANG
	 * old version
	 * \else
	 * >I0f1>
	 * \endif
	 */
    public byte                szOldVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * new version
	 * \else
	 * PB0f1>
	 * \endif
	 */
    public byte                szNewVersion[] = new byte[FinalVar.UPDATE_VERSION_LEN];
	/**
	 * \if ENGLISH_LANG
	 * progress
	 * \else
	 * I}<6=x6H
	 * \endif
	 */
    public long                dwProgress;
}

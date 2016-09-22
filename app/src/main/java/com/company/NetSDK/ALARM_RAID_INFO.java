package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query RAID state
 * \else
 * 2iQ/RAIDW4L,
 * \endif
 */
public class ALARM_RAID_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * RAID number
	 * \else
	 * IO1(5DRAID8vJ}   
	 * \endif
	 */
	public int              nRaidNumber;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID info
	 * \else
	 * Rl3#5DRAIDPEO"
	 * \endif
	 */
	public RAID_STATE_INFO  stuRaidInfo[] = new RAID_STATE_INFO[FinalVar.SDK_MAX_RAID_NUM];
	
	public ALARM_RAID_INFO() {
		for (int i = 0; i < FinalVar.SDK_MAX_RAID_NUM; i++) {
			stuRaidInfo[i] = new RAID_STATE_INFO();
		}
	}
}

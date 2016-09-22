package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Multiple-zone privacy mask configuration
 * \else
 * 6`GxSrUZ52EdVC
 * \endif
 */
public class SDKDEV_VIDEOCOVER_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel name
	 * \else
	 * M(5@C{
	 * \endif
	 */
	public byte                szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone amount supported
	 * \else
	 * V'3V5DUZ52?iJ}
	 * \endif
	 */
	public byte                bTotalBlocks;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zones have been set.
	 * \else
	 * RQIhVC5DUZ52?iJ}
	 * \endif
	 */
	public byte                bCoverCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask zone
	 * \else
	 * 828G5DGxSr
	 * \endif
	 */
    VIDEO_COVER_ATTR    CoverBlock[] = new VIDEO_COVER_ATTR[FinalVar.SDK_MAX_VIDEO_COVER_NUM];    
    
    public SDKDEV_VIDEOCOVER_CFG() {
    	for (int i = 0; i < FinalVar.SDK_MAX_VIDEO_COVER_NUM; i++) {
    		CoverBlock[i] = new VIDEO_COVER_ATTR();
    	}
    }
}

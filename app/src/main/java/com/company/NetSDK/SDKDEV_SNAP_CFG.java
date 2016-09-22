package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snap function configuration
 * \else
 * W%M<9&D\EdVC
 * \endif
 */
public class SDKDEV_SNAP_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	/**
	 * \if ENGLISH_LANG
	 * Schedule snap button. (Go to alarm activation setup interface to enable alarm snap function.)
	 * \else
	 * 6(J1W%M<?*9X(1(>/W%M<?*9XTZ8w1(>/A*6/EdVCVPLeOV)
	 * \endif
	 */
	public byte             bTimingEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * timing snapshot interval hour
	 * \else
	 * 6(J1W%M<J1<d<d8tP!J1J}
	 * \endif
	 */
	public byte             bPicIntervalHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Schedule snap interval. Unit is second. Now device max supports 30 minutes interval. 
	 * \else
	 * 6(J1W%M<J1<d<d8t#,5%N;N*Ck,D?G0Ih18V'3VWn4s5DW%M<J1<d<d8tN*307VVS
	 * \endif
	 */
	public short            PicTimeInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap encode setup. Now supports resolution, video quality, frame rate setup. The frame rate here is negative number. It stands for the snap amount in one second.
	 * \else
	 * W%M<1`BkEdVC#,OVV'3VFdVP5D7V1fBJ!";-VJ!"V!BJIhVC#,V!BJTZUb@oJG8:J}#,1mJ>R;CkW%M<5D4NJ}!#
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];     // W%M<1`BkEdVC#,OVV'3VFdVP5D7V1fBJ!";-VJ!"V!BJIhVC#,V!BJTZUb@oJG8:J}#,1mJ>R;CkW%M<5D4NJ}!#
	
	public SDKDEV_SNAP_CFG() {
		for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
			struSnapEnc[i] = new SDK_VIDEOENC_OPT();
		}
	}
}

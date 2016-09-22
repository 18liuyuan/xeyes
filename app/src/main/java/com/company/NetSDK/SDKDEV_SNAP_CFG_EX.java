package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * snap function extern configuration
 * \else
 * W%M<9&D\EdVC@)U9
 * \endif
 */
public class SDKDEV_SNAP_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * timing diagram switch(in tach of the alarm configuration)
	 * \else
	 * 6(J1W%M<?*9X(1(>/W%M<?*9XTZ8w1(>/A*6/EdVCVPLeOV)
	 * \endif
	 */
	public byte             bTimingEnable;

	/**
	 * \if ENGLISH_LANG
	 * the number of hours interval
	 * \else
	 * 6(J1W%M<J1<d<d8tP!J1J}
	 * \endif
	 */
	public byte             bPicIntervalHour;

	/**
	 * \if ENGLISH_LANG
	 * time interval(s),the biggest capture device support interval 30min now
	 * \else
	 * 6(J1W%M<J1<d<d8t#,5%N;N*Ck,D?G0Ih18V'3VWn4s5DW%M<J1<d<d8tN*307VVS
	 * \endif
	 */
	public short            PicTimeInterval;

	/**
	 * \if ENGLISH_LANG
	 * snap encode configuration,support resolution ,image quality and frame rate setting,frame rate is negative,say for a second to grasp figure number
	 * \else
	 * W%M<1`BkEdVC#,OVV'3VFdVP5D7V1fBJ!";-VJ!"V!BJIhVC#,V!BJTZUb@oJG8:J}#,1mJ>R;CkW%M<5D4NJ}!#
	 * \endif
	 */
	public SDK_VIDEOENC_OPT  struSnapEnc[] = new SDK_VIDEOENC_OPT[SNAP_TYPE.SNAP_TYP_NUM];

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 1(>/4%7":sC?4NW%M<J1<d<d8tJ1<d 5%N;Ck
	 * \endif
	 */
	public int            dwTrigPicIntervalSecond;
    
    public SDKDEV_SNAP_CFG_EX() {
    	for (int i = 0; i < SNAP_TYPE.SNAP_TYP_NUM; i++) {
    		struSnapEnc[i] = new SDK_VIDEOENC_OPT();
    	}
    }
}

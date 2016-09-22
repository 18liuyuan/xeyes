package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 code level
 * \else
 * H264 1`Bk<61p
 * \endif
 */
public class CFG_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P frame#,only support progressive and CAVLC
	 * \else
	 * La9)I/PV!#,=vV'3Vprogressive(VpPPI(Ch):MCAVLC
	 * \endif
	 */
	public static final int PROFILE_BASELINE = 1;                       

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B frame#,support progressiv and interlaced#,provide CAVLC or CABAC
	 * \else
	 * La9)I/P/BV!#,V'3Vprogressiv:Minterlaced#,La9)CAVLC;rCABAC
	 * \endif
	 */
	public static final int PROFILE_MAIN = 2;                               

	/**
	 * \if ENGLISH_LANG
	 * Provide I/P/B/SP/SI frame, only support progressive and CAVLC
	 * \else
	 * La9)I/P/B/SP/SIV!#,=vV'3Vprogressive(VpPPI(Ch):MCAVLC
	 * \endif
	 */
	public static final int PROFILE_EXTENDED = 3;                           

	/**
	 * \if ENGLISH_LANG
	 * As FRExt#,Main_Profile new#:8x8 intra prediction(8x8 frame forecast), custom 
	 * quant(custom), lossless video coding, more yuv formats
	 * \else
	 * <4FRExt#,Main_Profile;y4!IOPBTv#:8x8 intra prediction(8x8 V!DZT$2b), custom\n
	 * quant(WT6(ReA?;/), lossless video coding(N^KpJSF51`Bk), 8|6`5Dyuv8qJ=
	 * \endif
	 */
	public static final int PROFILE_HIGH = 4;                               
												
}

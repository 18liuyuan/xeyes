package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * H264 profile rank
 * \else
 * H264 1`Bk<61p
 * \endif
 */
public class EM_H264_PROFILE_RANK implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * offer I/P frame, only support progressive and CAVLC
	 * \else
	 * La9)I/PV!#,=vV'3Vprogressive(VpPPI(Ch):MCAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_BASELINE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B frame, support progressiv and interlaced,offer CAVLC and CABAC
	 * \else
	 * La9)I/P/BV!#,V'3Vprogressiv:Minterlaced#,La9)CAVLC;rCABAC
	 * \endif
	 */
	public static final int SDK_PROFILE_MAIN = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * offer I/P/B/SP/SI frame,only support progressive and CAVLC
	 * \else
	 * La9)I/P/B/SP/SIV!#,=vV'3Vprogressive(VpPPI(Ch):MCAVLC
	 * \endif
	 */
	public static final int SDK_PROFILE_EXTENDED = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * FRExt,base on Main_Profile:8x8 intra prediction, custom quant, lossless video coding, more yuv
	 * \else
	 * <4FRExt#,Main_Profile;y4!IOPBTv#:8x8 intra prediction(8x8 V!DZT$2b), custom 
	 * quant(WT6(ReA?;/), lossless video coding(N^KpJSF51`Bk), 8|6`5Dyuv8qJ=
	 * \endif
	 */
	public static final int SDK_PROFILE_HIGH = 4;
}

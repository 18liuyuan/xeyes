package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture functional attributes structure
 * \else
 * W%M<9&D\JtPT=a99Le
 * \endif
 */
public class SDK_QUERY_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount 
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int					nChannelNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution(Bit). Please refer to enumeration CAPTURE_SIZE
	 * \else
	 * 7V1fBJ(04N;)#,>_Le2i?4C6>YCAPTURE_SIZE
	 * \endif
	 */
	public int					dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Frequency[128] array
	 * \else
	 * Frequence[128]J}Wi5DSPP'3$6H
	 * \endif
	 */
	public int					nFramesCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate(value) 
	 * -25:1f/25s;-24:1f/24s;-23:1f/23s;-22:1f/23s
	 * ?-?-
	 * 0: invalid;1:1f/s;2:2f/s;3:13f/s
	 * 4:4f/s;5:5f/s;17:17f/s;18:18f/s
	 * 19:19f/s;20:20f/s
	 * ?-?-
	 * 25: 25f/s
	 * \else
	 * V!BJ(04J}V5)
	 * -25#:25Ck1V!#;-24#:24Ck1V!#;-23#:23Ck1V!#;-22#:22Ck1V!
	 * !-!-
	 * 0#:N^P'#;1#:1Ck1V!#;2#:1Ck2V!#;3#:1Ck3V!
	 * 4#:1Ck4V!#;5#:1Ck5V!#;17#:1Ck17V!#;18#:1Ck18V!
	 * 19#:1Ck19V!#;20#:1Ck20V!
	 * !-!-
	 * 25: 1Ck25V!
	 * \endif
	 */
	public byte					Frames[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * valid length of SnapMode[16] array
	 * \else
	 * SnapMode[16]J}Wi5DSPP'3$6H
	 * \endif
	 */
	public int					nSnapModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (value)0:activate scheduled snapshot,1:Manually activate snapshot
	 * \else
	 * (04J}V5)0#:6(J14%7"W%M<#,1#:JV6/4%7"W%M<
	 * \endif
	 */
	public byte					SnapMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Valid length of Format[16] array
	 * \else
	 * Format[16]J}Wi5DSPP'3$6H
	 * \endif
	 */
	public int					nPicFormatCount;
	
	/**
	 * \if ENGLISH_LANG
	 * (Value)0:BMP format,1:JPG format
	 * \else
	 * (04J}V5)0#:BMP8qJ=#,1#:JPG8qJ=
	 * \endif
	 */
	public byte 				PictureFormat[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * valid length of Quality[32] array
	 * \else
	 * Quality[32]J}Wi5DSPP'3$6H
	 * \endif
	 */
	public int					nPicQualityCount;
	
	/**
	 * \if ENGLISH_LANG
	 * value
	 * 100:Image quality 100%;80:Image quality 80%;60:Image quality60%
	 * 50:Image quality50%;30:Image quality30%;10:Image quality10%
	 * \else
	 * 04J}V5
	 * 100#:M<OsVJA?100%#;80:M<OsVJA?80%#;60:M<OsVJA?60%
	 * 50:M<OsVJA?50%#;30:M<OsVJA?30%#;10:M<OsVJA?10%
	 * \endif
	 */
	public byte 				PictureQuality[] = new byte[32];
}

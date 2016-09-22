package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Format
 * \else
 * JSF58qJ=
 * \endif
 */
public class CFG_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capacity 
	 * \else
	 * D\A&
	 * \endif
	 */
	public boolean				abCompression;
	public boolean				abWidth;
	public boolean				abHeight;
	public boolean				abBitRateControl;
	public boolean				abBitRate;
	public boolean				abFrameRate;
	public boolean				abIFrameInterval;
	public boolean				abImageQuality;
	public boolean				abFrameType;
	public boolean				abProfile;

	/**
	 * \if ENGLISH_LANG
	 * Compression Format , CFG_VIDEO_COMPRESSION
	 * \else
	 * JSF5Q9Ku8qJ=, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emCompression;			

	/**
	 * \if ENGLISH_LANG
	 * Video Width
	 * \else
	 * JSF5?m6H
	 * \endif
	 */
	public int					nWidth;						

	/**
	 * \if ENGLISH_LANG
	 * Video Height 
	 * \else
	 * JSF58_6H
	 * \endif
	 */
	public int					nHeight;					

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate Control, CFG_VIDEO_COMPRESSION
	 * \else
	 * BkAw?XVFD#J=, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emBitRateControl;			

	/**
	 * \if ENGLISH_LANG
	 * Bit Rate(kbps) 
	 * \else
	 * JSF5BkAw(kbps)
	 * \endif
	 */
	public int					nBitRate;					

	/**
	 * \if ENGLISH_LANG
	 * Frame Rate 
	 * \else
	 * JSF5V!BJ
	 * \endif
	 */
	public float				nFrameRate;					

	/**
	 * \if ENGLISH_LANG
	 * I Frame Interval 
	 * \else
	 * IV!<d8t(1-100)#,1HHg501mJ>C?498vBV!;rPV!#,IhVCR;8vIV!!#
	 * \endif
	 */
	public int					nIFrameInterval;			

	/**
	 * \if ENGLISH_LANG
	 * Image Quality#(VBR#)!#value#:1-6 6#:best image quality, CFG_VIDEO_COMPRESSION
	 * \else
	 * M<OqVJA?, CFG_VIDEO_COMPRESSION
	 * \endif
	 */
	public int					emImageQuality;				

	/**
	 * \if ENGLISH_LANG
	 * Frame Type 0#-DHAV#,1#-"PS"
	 * \else
	 * 4r0|D#J=.0#-DHAV#,1#-"PS"
	 * \endif
	 */
	public int					nFrameType;					

	/**
	 * \if ENGLISH_LANG
	 * CFG_H264_PROFILE_RANK
	 * \else
	 * H.2641`Bk<61p, CFG_H264_PROFILE_RANK
	 * \endif
	 */
	public int					emProfile;                
}

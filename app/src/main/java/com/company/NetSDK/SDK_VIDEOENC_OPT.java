package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Channel audio and video properties
 * \else
 * M(5@RtJSF5JtPT
 * \endif
 */
public class SDK_VIDEOENC_OPT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * The Video Enable; 1: open, 0: Close
	 * \else
	 * JSF5J9D\#;1#:4r?*#,0#:9X1U
	 * \endif
	 */
	
	public byte				byVideoEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream Control; referring to the constant stream control "defined as follows:
	 * Definition			Numerical 
	 * SDK_CAPTURE_BRC_CBR	0 
	 * SDK_CAPTURE_BRC_VBR	1 
	 * \else
	 * BkAw?XVF#;2NUU3#A?"BkAw?XVF"6(Re
	 * \endif
	 */
	public byte				byBitRateControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Frame rate
	 * \else
	 * V!BJ
	 * \endif
	 */
	public byte				byFramesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode:please refer to constant Encode Mode definition
	 * \else
	 * 1`BkD#J=#;2NUU3#A?"1`BkD#J="6(Re
	 * \endif
	 */
	public byte				byEncodeMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution:please refer to constant Resolution definition.
	 * \else
	 * 7V1fBJ#;2NUU3#A?"7V1fBJ"6(Re
	 * \endif
	 */
	public byte				byImageSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Level 1-6
	 * \else
	 * =+byImageQlty=xPP@)U9#,HtbyImageQltyN*0#,W%M<EdVC5DImgQltyN*10/30/50/60/80/100Ay8vV5#,BkAwEdVC5DImgQltyV5N*1-6#,<fH]V.G05D1-6554N#,Ht//ImgQltyTypeN*1#,TrImgQlty76N'N*0~100
	 * \endif
	 */
	public byte				byImageQlty;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 
	 * \endif
	 */
	public byte             byImageQltyType;
	
	/**
	 * \if ENGLISH_LANG
	 * Limit stream parameter
	 * \else
	 * O^BkAw2NJ}
	 * \endif
	 */
	public int				wLimitStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable audio;1:open,0:close
	 * \else
	 * RtF5J9D\#;1#:4r?*#,0#:9X1U
	 * \endif
	 */
	public byte				byAudioEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode mode:0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \else
	 * RtF51`Bk@`PM: 0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \endif
	 */
	public byte				wFormatTag;
	
	/**
	 * \if ENGLISH_LANG
	 * Track amount
	 * \else
	 * Iy5@J}
	 * \endif
	 */
	public int				nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling depth 	
	 * \else
	 * 2IQyIn6H	
	 * \endif
	 */
	public int				wBitsPerSample;
	
	/**
	 * \if ENGLISH_LANG
	 * Enabling audio
	 * \else
	 * RtF55~<SJ9D\
	 * \endif
	 */
	public byte				bAudioOverlay;
	
	/**
	 * \if ENGLISH_LANG
	 * H.264 Profile rank(when byEncodeMode is h264, this value works ), see enmu struct EM_H264_PROFILE_RANK,when this value is 0, it means nothing
	 * \else
	 * H.264 Profile5H<6(511`BkD#J=N*H264J14K2NJ}V5SPP'),2NUUC6>Y@`PMEM_H264_PROFILE_RANK#,4+0#,<fH]RTG0#,1mJ>8CWV6NN^P'#,2;PhR*?<BG<61p!#
	 * \endif
	 */
	public byte				bH264ProfileRank;
	
	/**
	 * \if ENGLISH_LANG
	 * Sampling rate
	 * \else
	 * 2IQyBJ
	 * \endif
	 */
	public int				nSamplesPerSec;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-149. I frame interval amount. Describe the P frame amount between two I frames.
	 * \else
	 * IV!<d8tV!J}A?#,ChJvA=8vIV!V.<d5DPV!8vJ}#,0-149
	 * \endif
	 */
	public byte				bIFrameInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				bScanMode;
}

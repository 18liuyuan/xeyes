package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * stream config corresponding capacity
 * \else
 * BkAwEdVC6TS&D\A&
 * \endif
 */
public class NET_STREAM_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * supported audio encode type#,see DH_TALK_CODING_TYPE
	 * \else
	 * V'3V5DRtF51`Bk@`PM#,Oj<{DH_TALK_CODING_TYPE
	 * \endif
	 */
	public int                 nAudioCompressionTypes[] = new int[FinalVar.SDK_MAX_AUDIO_ENCODE_TYPE];
	
	/**
	 * \if ENGLISH_LANG
	 * audio compression quantity
	 * \else
	 * RtF5Q9Ku8qJ=8vJ}
	 * \endif
	 */
	public int                 nAudioCompressionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * video encode mode mask#,see "encode mode"
	 * \else
	 * JSF51`BkD#J=QZBk#,Oj<{"1`BkD#J="
	 * \endif
	 */
	public int                 dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution, discard
	 * \else
	 * V'3V5DJSF57V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuResolutionTypes[] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * different resolution max frame, subscript nResolutionTypescorresponding
	 * \else
	 * 2;M,7V1fBJOBV!BJWn4sV5#,OB1jSknResolutionTypes6TS&
	 * \endif
	 */
	public int                 nResolutionFPSMax[] = new int[FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * video resolution quantity
	 * \else
	 * JSF57V1fBJ8vJ}
	 * \endif
	 */
	public int                 nResolutionTypeNum;
	
	/**
	 * \if ENGLISH_LANG
	 * max video stream(kbps)
	 * \else
	 * Wn4sJSF5BkAw(kbps)
	 * \endif
	 */
	public int                 nMaxBitRateOptions; 
	
	/**
	 * \if ENGLISH_LANG
	 * min video stream(kbps)
	 * \else
	 * WnP!JSF5BkAw(kbps)
	 * \endif
	 */
	public int                 nMinBitRateOptions;
	
	/**
	 * \if ENGLISH_LANG
	 * supported5DH.264 Profile level,refer to enumeration type EM_H264_PROFILE_RANK;
	 * \else
	 * V'3V5DH.264 Profile5H<6#,2NUUC6>Y@`PM EM_H264_PROFILE_RANK;
	 * \endif
	 */
	public byte                bH264ProfileRank[] = new byte[EM_H264_PROFILE_RANK.SDK_PROFILE_HIGH];
	
	/**
	 * \if ENGLISH_LANG
	 * supported H.264 Profile level
	 * \else
	 * V'3V5DH.264 Profile5H<68vJ}
	 * \endif
	 */
	public int                 nH264ProfileRankNum;
	
	/**
	 * \if ENGLISH_LANG
	 * when resolution is  cif, max p frame(Kbps)
	 * \else
	 * 517V1fBJN*cifJ1Wn4spV!(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMaxSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when currentresolution is cif, min p frame(Kbps)
	 * \else
	 * 517V1fBJN*cifJ1WnP!pV!(Kbps)
	 * \endif
	 */
	public int                 nCifPFrameMinSize;
	
	/**
	 * \if ENGLISH_LANG
	 * video max frame rate#,as 0 #,make nResolutionFPSMax as standard
	 * \else
	 * JSF5V!BJWn4sV5#,N*0J1#,RTnResolutionFPSMaxN*W<
	 * \endif
	 */
	public int                 nFPSMax;
	
	/**
	 * \if ENGLISH_LANG
	 * supportedvideo resolution
	 * \else
	 * V'3V5DJSF57V1fBJ
	 * \endif
	 */
	public SDK_RESOLUTION_INFO  stuIndivResolutionTypes[][] = new SDK_RESOLUTION_INFO[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM][FinalVar.SDK_MAX_CAPTURE_SIZE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * 0: stuResolutionTypes is valid 1: stuIndivResolutionTypes is valid
	 * \else
	 * 0: stuResolutionTypes,nResolutionTypeNum SPP'
	 * \endif
	 */
	public boolean             abIndivResolution;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 2;M,1`BkD#J=7V1pV'3V5DJSF57V1fBJ8vJ}
	 * \endif
	 */
	public int                 nIndivResolutionNums[] = new int[FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM];
	
	public NET_STREAM_CFG_CAPS() {
		for (int i = 0; i < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; i++) {
			stuResolutionTypes[i] = new SDK_RESOLUTION_INFO();
		}
		
		for (int i = 0; i < FinalVar.SDK_MAX_COMPRESSION_TYPES_NUM; i++) {
			for (int j = 0; j < FinalVar.SDK_MAX_CAPTURE_SIZE_NUM; j++) {
				stuIndivResolutionTypes[i][j] = new SDK_RESOLUTION_INFO();
			}
		}
	}
}

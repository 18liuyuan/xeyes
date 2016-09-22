package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * dsp Configuration
 * \else
 * dspEdVC
 * \endif
 */
public class CFG_DSPENCODECAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Video Standard Mask,Video Standard Supported By Device Indicated By Bits 
	 * \else
	 * JSF5VFJ=QZBk,04N;1mJ>Ih18D\9;V'3V5DJSF5VFJ=
	 * \endif
	 */
	public int				dwVideoStandardMask;	

	/**
	 * \if ENGLISH_LANG
	 * Resolution Mask,Resolution Supported By Device Indicated By Bits
	 * \else
	 * 7V1fBJQZBk,04N;1mJ>Ih18D\9;V'3V5D7V1fBJ
	 * \endif
	 */
	public int				dwImageSizeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Encode Mode Mask,Encode Mode Supported By Device Indicated By Bits
	 * \else
	 * 1`BkD#J=QZBk,04N;1mJ>Ih18D\9;V'3V5D1`BkD#J=
	 * \endif
	 */
	public int				dwEncodeModeMask;		

	/**
	 * \if ENGLISH_LANG
	 * Multimedia Function Supported By Device Indicated By Bits,First Bit Means Support Main Stream, Second Means Support Substream 1, Third Bit Means Support Main Stream 2, Fifth Bit Means Support jpg Snapshot 
	 * \else
	 * 04N;1mJ>Ih18V'3V5D6`C=Le9&D\,\n
	 * 5ZR;N;1mJ>V'3VVwBkAw\n
	 * 5Z6~N;1mJ>V'3V8(BkAw1\n
	 * 5ZH}N;1mJ>V'3V8(BkAw2\n
	 * 5ZNeN;1mJ>V'3VjpgW%M<
	 * \endif
	 */
	public int				dwStreamCap;			


	/**
	 * \if ENGLISH_LANG
	 * Means when Main Stream Is Each Resolution,the Substream Resolution Mask Supported 
	 * \else
	 * 1mJ>VwBkAwN*8w7V1fBJJ1,V'3V5D8(BkAw7V1fBJQZBk
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];

	/**
	 * \if ENGLISH_LANG
	 * DSP Supported Max Encode Power 
	 * \else
	 * DSPV'3V5DWn8_1`BkD\A& 
	 * \endif
	 */
	public int				dwMaxEncodePower;		

	/**
	 * \if ENGLISH_LANG
	 * Each DSP Supports Max Support Channel Num 
	 * \else
	 * C??iDSPV'3VWn6`JdHkJSF5M(5@J} 
	 * \endif
	 */
	public int				wMaxSupportChannel;		

	/**
	 * \if ENGLISH_LANG
	 * DSP If Every Channel Max Encode Set Sync;0:Not Sync,1:Sync 
	 * \else
	 * DSPC?M(5@5DWn4s1`BkIhVCJG7qM,2=;0:2;M,2=,1:M,2=
	 * \endif
	 */
	public int				wChannelMaxSetSync;		

	/**
	 * \if ENGLISH_LANG
	 * Max Collect Frame Rate Under Different Resolutions,Corresponding To dwVideoStandardMask By Bits 
	 * \else
	 * 2;M,7V1fBJOB5DWn4s2I</V!BJ,SkdwVideoStandardMask04N;6TS&
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * Symbol,Need Meet the Demands Below When Configuration, Or Does Not Work; 
	 * <pre>
	 * 0:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability 
	 * 1:Main Stream Encode Capability+Substream Encode Capability >= Device Encode Capability,
	 * Substream Encode Capability >= Main Stream Capability,Substream Resolution >= Main Stream Resolution,
	 * Main Stream and Substream Framerate >= Front End Video Collect Frame Rate
	 * 2:N5 Calculation,Substream Resolution >= Main Stream Resolution,Supported Check Resolution and Corresponding Max Frame Rate
	 * </pre>
	 * \else
	 * 1jV>,EdVCJ1R*Gs7{:OOBCfLu<~,7qTrEdVC2;D\IzP';
	 * <pre>
	 * 0:VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A&,
	 * 1:VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A&,
	 * 8(BkAw5D1`BkD\A& <= VwBkAw5D1`BkD\A&,
	 * 8(BkAw5D7V1fBJ <= VwBkAw5D7V1fBJ,
	 * VwBkAw:M8(BkAw5DV!BJ <= G06KJSF52I</V!BJ
	 * 2:N55D<FKc7=7(
	 * 8(BkAw5D7V1fBJ <= VwBkAw5D7V1fBJ
	 * 2iQ/V'3V5D7V1fBJ:MO`S&Wn4sV!BJ
	 * </pre>
	 * \endif
	 */
	public byte				bEncodeCap;				


	/**
	 * \if ENGLISH_LANG
	 * bResolution Length 
	 * \else
	 * bResolution5D3$6H
	 * \endif
	 */
	public byte				byResolutionNum;			

	/**
	 * \if ENGLISH_LANG
	 * bResolution_1 Length 
	 * \else
	 * bResolution_15D3$6H
	 * \endif
	 */
	public byte				byResolutionNum_1;		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream,Index As Resolution,If Support This Resolution,Then bResolution[n]is Supported Max Frame Rate.Ortherwise0.
	 * \else
	 * VwBkAw,04UU7V1fBJ=xPPKwR},Hg9{V'3V8C7V1fBJ,TrbResolution[n]5HSZV'3V5DWn4sV!BJ.7qTrN*0.
	 * \endif
	 */
	public byte				byResolution[] = new byte[256];								

	/**
	 * \if ENGLISH_LANG
	 * Substream 1,Same as The Main Stream Specification 
	 * \else
	 * 8(VzBkAw1,M,VwBkAwK5Cw.
	 * \endif
	 */
	public byte				byResolution_1[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Supported Resolution Array,See CFG_SNAPCAPINFO_INFO Page CAPTURE_SIZE Specification 
	 * \else
	 * V'3V5D7V1fBJJ}Wi,2N<{enum CAPTURE_SIZE
	 * \endif
	 */
	public byte				byImageSize[] = new byte[256];		

	/**
	 * \if ENGLISH_LANG
	 * Means When Main Streams are Each Resolition,Wupported SubStream Resolution,Array Subscript Means Main Stream Support Resolition
	 * \else
	 * 1mJ>VwBkAwN*8w7V1fBJJ1,V'3V5D8(BkAw7V1fBJ,J}WiOB1j1mJ>VwBkAwKyV'3V5D7V1fBJV5.
	 * \endif
	 */
	public byte				byImageSize_Assi[][] = new byte[256][256]; 
}

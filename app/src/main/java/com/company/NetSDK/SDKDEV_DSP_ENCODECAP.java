package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP ability to describe#,the type of expansion#,the corresponding CLIENT_QueryDevState interface
 * \else
 * DSPD\A&ChJv#,@)U9@`PM#,6TS&QueryDevState=S?Z
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask bit device can support video format 
	 * \else
	 * JSF5VFJ=QZBk#,04N;1mJ>Ih18D\9;V'3V5DJSF5VFJ=
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask#,the device can support the resolution represented by bit 
	 * \else
	 * 7V1fBJQZBk#,04N;1mJ>Ih18D\9;V'3V5D7V1fBJ
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encoding mode mask, the device can support the resolution represented by bit
	 * \else
	 * 1`BkD#J=QZBk#,04N;1mJ>Ih18D\9;V'3V5D1`BkD#J=
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Bit indicates the device supports multimedia features\n
	 * First expressed support for the main stream,\n
	 * Expressed support for auxiliary stream1,\n
	 * Expressed support for third place auxiliary stream2,\n
	 * Fifth expressed support for jpg shots
	 * \else
	 * 04N;1mJ>Ih18V'3V5D6`C=Le9&D\\n
	 * 5ZR;N;1mJ>V'3VVwBkAw\n
	 * 5Z6~N;1mJ>V'3V8(BkAw1\n
	 * 5ZH}N;1mJ>V'3V8(BkAw2\n
	 * 5ZNeN;1mJ>V'3VjpgW%M<
	 * \endif
	 */
	public int				dwStreamCap;			

	/**
	 * \if ENGLISH_LANG
	 * Said that the main stream for each resolution,the auxiliary stream resolution mask support
	 * \else
	 * 1mJ>VwBkAwN*8w7V1fBJJ1#,V'3V5D8(BkAw7V1fBJQZBk!#
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DSP support the highest coding capacity 
	 * \else
	 * DSPV'3V5DWn8_1`BkD\A& 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * Each DSP supports up to enter the number of video channels 
	 * \else
	 * C??iDSPV'3VWn6`JdHkJSF5M(5@J} 
	 * \endif
	 */
	public short				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * DSP per channel encoding settings synchronization; 0: no sync, 1: Synchronous 
	 * \else
	 * DSPC?M(5@5DWn4s1`BkIhVCJG7qM,2=#;0#:2;M,2=#,1#:M,2=
	 * \endif
	 */
	public short				wChannelMaxSetSync;
	
	/**
	 * \if ENGLISH_LANG
	 * The largest acquisition frame rate, resolution and dwVideoStandardMask corresponding bitwise
	 * \else
	 * 2;M,7V1fBJOB5DWn4s2I</V!BJ#,SkdwVideoStandardMask04N;6TS&.
	 * \endif
	 */
	public byte				bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 1 Main stream encoding + auxiliary stream encoding capability <= encoding 
	 * 2 The auxiliary stream coding capacity <= main-stream encoding capabilities 
	 * 3 Resolution <= resolution of the main stream of the auxiliary stream 
	 * 4 Framerate <= front-end video capture frame rate of the main stream and secondary stream 
	 * \else
	 * 1jV>#,EdVCJ1R*Gs7{:OOBCfLu<~#,7qTrEdVC2;D\IzP'#;
	 * 0 VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A& 
	 * 1 VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A& 
	 * 2 8(BkAw5D1`BkD\A& <= VwBkAw5D1`BkD\A& 
	 * 3 8(BkAw5D7V1fBJ <= VwBkAw5D7V1fBJ 
	 * 4 VwBkAw:M8(BkAw5DV!BJ <= G06KJSF52I</V!BJ 
	 * \endif
	 */
	public byte				bEncodeCap;
}

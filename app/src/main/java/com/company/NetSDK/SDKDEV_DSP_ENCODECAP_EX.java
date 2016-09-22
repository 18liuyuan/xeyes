package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP extend capacity description. Corresponding to INetSDK.QueryDevState
 * \else
 * DSP@)U9D\A&ChJv#,6TS&INetSDK.QueryDevState=S?Z
 * \endif
 */
public class SDKDEV_DSP_ENCODECAP_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * video format mask. Bit stands for the video format device supported.
	 * \else
	 * JSF5VFJ=QZBk#,04N;1mJ>Ih18D\9;V'3V5DJSF5VFJ=
	 * \endif
	 */
	public int               dwVideoStandardMask;

	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * 7V1fBJQZBk#,04N;1mJ>Ih18D\9;V'3V5D7V1fBJ
	 * \endif
	 */
	public int               dwImageSizeMask;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * 1`BkD#J=QZBk#,04N;1mJ>Ih18D\9;V'3V5D1`BkD#J=
	 * \endif
	 */
	public int               dwEncodeModeMask;

	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported.
	 * The first bit:main stream
	 * The second bit:extra stream 1
	 * The third bit:extra stream 2
	 * The forth bit:extra stream 3
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * 04N;1mJ>Ih18V'3V5D6`C=Le9&D\#,
	 * 5ZR;N;1mJ>V'3VVwBkAw
	 *  5Z6~N;1mJ>V'3V8(BkAw1
	 *  5ZH}N;1mJ>V'3V8(BkAw2
	 *  5ZKDN;1mJ>V'3V8(BkAw3
	 *  5ZNeN;1mJ>V'3VjpgW%M<
	 * \endif
	 */
	public int               dwStreamCap;

	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask, the 0,1,2 member in the group correspond extra stream1,2,3
	 * \else
	 * 1mJ>VwBkAwN*8w7V1fBJJ1#,V'3V5D8(BkAw7V1fBJQZBk, J}WiVP5D0,1,2T*KX7V1p4z1m8(BkAw1,2,3
	 * \endif
	 */
	public int               dwImageSizeMask_Assi[][] = new int[3][64];
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSPV'3V5DWn8_1`BkD\A&
	 * \endif
	 */
	public int               dwMaxEncodePower;

	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * C??iDSPV'3VWn6`JdHkJSF5M(5@J}
	 * \endif
	 */
	public short                wMaxSupportChannel;

	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not;0:do not synchronized,1:synchronized
	 * \else
	 * DSPC?M(5@5DWn4s1`BkIhVCJG7qM,2=#;0#:2;M,2=#,1#:M,2=
	 * \endif
	 */
	public short                wChannelMaxSetSync;

	/**
	 * \if ENGLISH_LANG
	 * The max sampling frame rate in different resolution. Bit corresponding to the dwVideoStandardMask.
	 * \else
	 * 2;M,7V1fBJOB5DWn4s2I</V!BJ#,SkdwVideoStandardMask04N;6TS&
	 * \endif
	 */
	public byte                bMaxFrameOfImageSize[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * Symbol. The configuration shall meet the following requirements, otherwise the configuration is invalid.
	 * 0:main stream encode capacity+extra stream encode capacity<= device encode capacity 
	 * 1:main stream encode capacity +extra stream encode capacity<= device encode capacity 
	 * Extra stream encode capacity <=main stream encode capacity 
	 * Extra stream resolution<=main stream resolution 
	 * Main stream resolution and extra stream resolution <=front-end video collection frame rate
	 * 2:N5 Device
	 * Extra stream encode capacity <=main stream encode capacity
	 * Query  the supported resolution and the corresponding maximum frame rate
	 * \else
	 * 1jV>#,EdVCJ1R*Gs7{:OOBCfLu<~#,7qTrEdVC2;D\IzP'#;
	 * 0#:VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A&#,
	 *  1#:VwBkAw5D1`BkD\A&+8(BkAw5D1`BkD\A& <= Ih185D1`BkD\A&#,
	 *  8(BkAw5D1`BkD\A& <= VwBkAw5D1`BkD\A&#,
	 *  8(BkAw5D7V1fBJ <= VwBkAw5D7V1fBJ#,
	 *  VwBkAw:M8(BkAw5DV!BJ <= G06KJSF52I</V!BJ
	 *  2#:N55D<FKc7=7(
	 *  8(BkAw5D7V1fBJ <= VwBkAw5D7V1fBJ
	 *  2iQ/V'3V5D7V1fBJ:MO`S&Wn4sV!BJ
	 * \endif
	 */
	public byte                bEncodeCap;

	/**
	 * \if ENGLISH_LANG
	 * bit0-main stream, bit1-extra stream1, bit2-extra stream2
	 * \else
	 * 5Z0N;1mJ>VwBkAw, FdK|04N;R@4N1mJ>8(BkAw, Hg5ZR;N;1mJ>8(BkAw1,5Z6~CG1mJ>8(BkAw2
	 * \endif
	 */
	public int               dwExtraStream;

	/**
	 * \if ENGLISH_LANG
	 * extra stream compression
	 * \else
	 * C?R;8vV51mJ>6TS&8(BkAw5D1`Bk8qJ=V'3V
	 * \endif
	 */
	public int               dwCompression[] = new int[3];
}

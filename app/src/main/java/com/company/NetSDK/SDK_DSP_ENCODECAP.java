package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity description. Correspondign to GetDevConfig
 * \else
 * DSPD\A&ChJv#,6TS& GetDevConfig =S?Z
 * \endif
 */
public class SDK_DSP_ENCODECAP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video format mask. Bit stands for the video format device supported.
	 * \else
	 * JSF5VFJ=QZBk#,04N;1mJ>Ih18D\9;V'3V5DJSF5VFJ=
	 * \endif
	 */
	public int				dwVideoStandardMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Resolution mask bit. Bit stands for the resolution setup devices supported.
	 * \else
	 * 7V1fBJQZBk#,04N;1mJ>Ih18D\9;V'3V5D7V1fBJIhVC
	 * \endif
	 */
	public int				dwImageSizeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode mode mask bit. Bit stands for the encode mode devices supported.
	 * \else
	 * 1`BkD#J=QZBk#,04N;1mJ>Ih18D\9;V'3V5D1`BkD#J=IhVC	
	 * \endif
	 */
	public int				dwEncodeModeMask;
	
	/**
	 * \if ENGLISH_LANG
	 * The multiple-media function the devices supported \n
	 * The first bit:main stream \n
	 * The second bit:extra stream 1 \n
	 * The third bit:extra stream 2 \n
	 * The fifth bit: snapshot in .jpg format
	 * \else
	 * 04N;1mJ>Ih18V'3V5D6`C=Le9&D\#, \n
	 * 5ZR;N;1mJ>V'3VVwBkAw \n
	 * 5Z6~N;1mJ>V'3V8(BkAw1 \n
	 * 5ZH}N;1mJ>V'3V8(BkAw2 \n
	 * 5ZNeN;1mJ>V'3VjpgW%M<
	 * \endif
	 */
	public int				dwStreamCap;
												
	/**
	 * \if ENGLISH_LANG
	 * When the main stream is the corresponding resolution, the supported extra stream resolution mask.
	 * \else
	 * 1mJ>VwBkAwN*8w7V1fBJJ1#,V'3V5D8(BkAw7V1fBJQZBk!#
	 * \endif
	 */
	public int				dwImageSizeMask_Assi[] = new int[8];
	
	/**
	 * \if ENGLISH_LANG
	 * The highest encode capacity DSP supported
	 * \else
	 * DSPV'3V5DWn8_1`BkD\A& 
	 * \endif
	 */
	public int				dwMaxEncodePower;
	
	/**
	 * \if ENGLISH_LANG
	 * The max video channel amount each DSP supported.
	 * \else
	 * C??iDSPV'3VWn6`JdHkJSF5M(5@J} 
	 * \endif
	 */
	public int				wMaxSupportChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max encode bit setup in each DSP channel  are synchronized or not ;0:does not synchronized,1:synchronized
	 * \else
	 * DSPC?M(5@5DWn4s1`BkIhVCJG7qM,2=#;0#:2;M,2=#,1#:M,2=
	 * \endif
	 */
	public int				wChannelMaxSetSync;
}

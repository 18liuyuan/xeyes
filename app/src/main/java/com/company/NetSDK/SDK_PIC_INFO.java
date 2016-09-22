package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture info
 * \else
 * NoLe6TS&M<F,ND<~PEO"
 * \endif
 */
public class SDK_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current picture file's offset in the binary file, byte
	 * \else
	 * ND<~TZ6~=xVFJ}>]?iVP5DF+RFN;VC, 5%N;:WV=Z
	 * \endif
	 */
	public int                dwOffSet;
	
	/**
	 * \if ENGLISH_LANG
	 * Current picture file's size, byte
	 * \else
	 * ND<~4sP!, 5%N;:WV=Z
	 * \endif
	 */
	public int                dwFileLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture width, pixel
	 * \else
	 * M<F,?m6H, 5%N;:OqKX
	 * \endif
	 */
	public int                wWidth;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture high, pixel
	 * \else
	 * M<F,8_6H, 5%N;:OqKX          
	 * \endif
	 */
	public int                wHeight;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The structure of the image watermarking capabilities
 * \else
 * M<OsK.S!D\A&=a99Le
 * \endif
 */
public class SDK_WATERMAKE_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1 support; 0 does not support.
	 * \else
	 * 1 V'3V;0 2;V'3V
	 * \endif
	 */
	public char		isSupportWM;
	
	/**
	 * \if ENGLISH_LANG
	 * 0: text watermark; 1: picture watermark; 2: supports both text watermark and image watermark
	 * \else
	 * 0:NDWVK.S!;1:M<F,K.S!;2:M,J1V'3VNDWVK.S!:MM<F,K.S!
	 * \endif
	 */
	public char		supportWhat;
}

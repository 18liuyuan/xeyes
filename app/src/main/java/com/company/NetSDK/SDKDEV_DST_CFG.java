package com.company.NetSDK;

import java.io.Serializable;


public class SDKDEV_DST_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DST position way. 0: position in date  , 1:position in week
	 * \else
	 * ODAnJ16(N;7=J= 0:04HUFZ6(N;7=J=, 1:04V\6(N;7=J=
	 * \endif
	 */
	public int                 nDSTType;

	/**
	 * \if ENGLISH_LANG
	 * Enable DTS
	 * \else
	 * ?*J<ODAnJ1
	 * \endif
	 */
	public SDK_DST_POINT        stDSTStart = new SDK_DST_POINT();

	/**
	 * \if ENGLISH_LANG
	 * End DTS
	 * \else
	 * =aJxODAnJ1
	 * \endif
	 */
	public SDK_DST_POINT        stDSTEnd = new SDK_DST_POINT();
}

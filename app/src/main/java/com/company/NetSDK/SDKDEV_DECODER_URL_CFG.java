package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder protocol rtsp url configuration
 * \else
 * =bBkFwrtsp urlEdVC
 * \endif
 */
public class SDKDEV_DECODER_URL_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * main stream url
	 * \else
	 * VwBkAwurl
	 * \endif
	 */
	public byte            szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * extra stream url
	 * \else
	 * 8(BkAwurl
	 * \endif
	 */
	public byte            szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
}

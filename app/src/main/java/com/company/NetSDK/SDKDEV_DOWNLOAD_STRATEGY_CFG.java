package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video download policy configuration
 * \else
 * B<OsOBTX2_BTEdVC
 * \endif
 */
public class SDKDEV_DOWNLOAD_STRATEGY_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TRUE#:High-speed downloads, FALSE: ordinary download
	 * \else
	 * TRUE#:8_KYOBTX#,FALSE#:FUM(OBTX
	 * \endif
	 */
	public boolean                bEnable;
}

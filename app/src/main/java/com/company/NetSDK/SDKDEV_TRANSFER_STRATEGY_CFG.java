package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Network transmission strategy configuration
 * \else
 * MxBg4+Jd2_BTEdVC
 * \endif
 */
public class SDKDEV_TRANSFER_STRATEGY_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * 0#:Video quality priority,1#:Fluency priority,2#:Auto,
	 * \else
	 * 0#:;-VJSEOH#,1#:Aw3)PTSEOH#,2#:WT6/!#
	 * \endif
	 */
	public int                 iStrategy;
}

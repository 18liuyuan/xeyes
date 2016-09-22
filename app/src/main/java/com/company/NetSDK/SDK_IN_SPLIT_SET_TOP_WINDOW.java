package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitWindowLevels's interface input param(setting window order)
 * \else
 * SetSplitWindowLevels=S?ZJdHk2NJ}(IhVC40?Z4NPr)
 * \endif
 */
public class SDK_IN_SPLIT_SET_TOP_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID
	 * \else
	 * M(5@:E(FA:E)
	 * \endif
	 */
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndown ID
	 * \else
	 * 40?ZPr:E
	 * \endif
	 */
	public int					nWindowID;
}

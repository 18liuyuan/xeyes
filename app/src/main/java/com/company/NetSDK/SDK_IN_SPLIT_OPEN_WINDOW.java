package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * OpenSplitWindow's interface input param(open window)
 * \else
 * OpenSplitWindow=S?ZJdHk2NJ}(?*40)
 * \endif
 */
public class SDK_IN_SPLIT_OPEN_WINDOW implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel no.
	 * \else
	 * M(5@:E(FA:E)
	 * \endif
	 */
	public int					nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Windon position, 0~8192
	 * \else
	 * 40?ZN;VC, 0~8192
	 * \endif
	 */
	public SDK_RECT				stuRect = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Coordinate whether meet the confitions
	 * \else
	 * Wx1jJG7qBzWcV1M(Lu<~, V1M(JGV8F4=SFA7=J=OB#,4K40?ZGxSrU}:CN*No@mFAGxSr
	 * \endif
	 */
	public boolean				bDirectable;
}

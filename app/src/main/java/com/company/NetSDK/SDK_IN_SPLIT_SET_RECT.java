package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitWindowRect's interface input param(setting the window position)
 * \else
 * SetSplitWindowRectJdHk2NJ}(IhVC40?ZN;VC)
 * \endif
 */
public class SDK_IN_SPLIT_SET_RECT implements Serializable {
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
	 * Window order
	 * \else
	 * 40?ZPr:E
	 * \endif
	 */
	public int 				nWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * Wndow position, 0~8192
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

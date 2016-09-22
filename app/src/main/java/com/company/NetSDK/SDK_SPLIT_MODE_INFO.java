package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split mode info
 * \else
 * R;FAD;5D7V8nD#J=PEO"
 * \endif
 */
public class SDK_SPLIT_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode#,value corresponding to SDK_SPLIT_MODE
	 * \else
	 * 7V8nD#J=, V56TS&@`SDK_SPLIT_MODE
	 * \endif
	 */
	public int         		emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Group SN
	 * \else
	 * 7VWiPr:E
	 * \endif
	 */
	public int					nGroupID;
	
	/**
	 * \if ENGLISH_LANG
	 * Display type, look for SDK_SPLIT_DISPLAY_TYPE
	 * \else
	 * OTJ>@`PM#;>_Le<{SDK_SPLIT_DISPLAY_TYPE#(W"JM8wD#J=OBOTJ>DZH]SI"PicInPic">v6(, 8wD#J=OBOTJ>DZH]04NVD>ISP9fTr>v6(#(<4DisChnWV6N>v6(#)!#<fH]#,C;SPUbR;8vOnJ1#,D,HON*FUM(OTJ>@`PM,<4"General"#)
	 * \endif
	 */
	public int	                dwDisplayType;
}

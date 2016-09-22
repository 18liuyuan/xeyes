package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Split capability
 * \else
 * 7V8nD\A&
 * \endif
 */
public class SDK_SPLIT_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The split amount supported
	 * \else
	 * V'3V5D7V8nD#J=J}A?
	 * \endif
	 */
	public int					nModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The split mode supported#, corresponding to SDK_SPLIT_MODE
	 * \else
	 * V'3V5D7V8nD#J=, 6TS&@`SDK_SPLIT_MODE
	 * \endif
	 */
	public int					emSplitMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Max display source allocation amount
	 * \else
	 * Wn4sOTJ>T4EdVCJ}
	 * \endif
	 */
	public int				    nMaxSourceCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of free window support
	 * \else
	 * V'3V5DWn4sWTSI?*40J}D?
	 * \endif
	 */
	public int					nFreeWindowCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Support collection
	 * \else
	 * JG7qV'3VGx?iJU2X
	 * \endif
	 */
	public boolean				bCollectionSupported;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * QZBk1mJ>6`8vOTJ>@`PM#,>_Le<{SDK_SPLIT_DISPLAY_TYPE#(W"JM8wD#J=OBOTJ>DZH]SI"PicInPic">v6(, 8wD#J=OBOTJ>DZH]04NVD>ISP9fTr>v6(#(<4DisChnWV6N>v6(#)!#<fH]#,C;SPUbR;8vOnJ1#,D,HON*FUM(OTJ>@`PM,<4"General"#)
	 * \endif
	 */
	public int              	dwDisplayType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ;-VP;-V'3V5D7V8nD#J=J}A?
	 * \endif
	 */
	public int					nPIPModeCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number#, corresponding to SDK_SPLIT_MODE
	 * \else
	 * ;-VP;-V'3V5D7V8nD#J=#, 6TS&@`SDK_SPLIT_MODE
	 * \endif
	 */
	public int					emPIPSplitMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	
	
	/**
	 * \if ENGLISH_LANG
	 * supported input channel
	 * \else
	 * V'3V5DJdHkM(5@
	 * \endif
	 */
	 public int                szInputChannels[] = new int[FinalVar.SDK_SPLIT_INPUT_NUM];  
	 
	/**
	 * \if ENGLISH_LANG
	 *  supported input channel quantity, 0 means no input channel limit
	 * \else
	 * V'3V5DJdHkM(5@8vJ}, 01mJ>C;SPJdHkM(5@O^VF
	 * \endif
	*/
	 public int					nInputChannelCount;
	 

	 /**
		 * \if ENGLISH_LANG
		 * enable split mode quantity
		 * \else
		 * Ft6/7V8nD#J=J}A?
		 * \endif
	 */
	 
	 public int					nBootModeCount;
	 
	 /**
		 * \if ENGLISH_LANG
		 * support enable default video split mode#,value corresponding to SDK_SPLIT_MODE
		 * \else
		 * V'3V5DFt6/D,HO;-Cf7V8nD#J=, V56TS&@`SDK_SPLIT_MODE
		 * \endif
	 */
	 public int					emBootMode[] = new int[FinalVar.SDK_MAX_SPLIT_MODE_NUM];
	 
	 
}

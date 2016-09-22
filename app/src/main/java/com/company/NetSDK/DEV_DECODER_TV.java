package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV parameters
 * \else
 * TV2NJ}PEO"
 * \endif
 */
public class DEV_DECODER_TV implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TV ID
	 * \else
	 * TV:E
	 * \endif
	 */
	public int				nID;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable, open or close
	 * \else
	 * J9D\#,?*Ft;r9X1U
	 * \endif
	 */
	public boolean			bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Partition number
	 * \else
	 *  ;-Cf7V8nJ}
	 * \endif
	 */
	public int				nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * All encoder information
	 * \else
	 * 8w;-Cf1`BkFwPEO"dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_GENERALJ1SPP'
	 * \endif
	 */
	public DEV_ENCODER_INFO stuDevInfo[] = new DEV_ENCODER_INFO[16];
	
	/**
	 * \if ENGLISH_LANG
	 * Split mode supported
	 * \else
	 * V'3V5D7V8nD#J=
	 * \endif
	 */
	public byte			bySupportSplit[] = new byte[10];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel input no. 
	 * \else
	 * JdHkM(5@Wi:E,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_PIPJ11mJ>;-VP;-OTJ>@`PMOBSPP'#;
	 * \endif
	 */
	public byte            byGroupNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Display Type, can look for DH_SPLIT_DISPLAY_TYPE
	 * \else
	 * OTJ>@`PM#;>_Le<{SDK_SPLIT_DISPLAY_TYPE#(W"JM8wD#J=OBOTJ>DZH]SI"PicInPic">v6(, 8wD#J=OBOTJ>DZH]04NVD>ISP9fTr>v6(#(<4DisChnWV6N>v6(#)!#<fH]#,C;SPUbR;8vOnJ1#,D,HON*FUM(OTJ>@`PM,<4"General"#)
	 * \endif
	 */
	public int             dwDisplayType;
    
    public DEV_DECODER_TV() {
    	for (int i=0 ; i<16 ; i++) {
    		stuDevInfo[i] = new DEV_ENCODER_INFO();
    	}
    }
}

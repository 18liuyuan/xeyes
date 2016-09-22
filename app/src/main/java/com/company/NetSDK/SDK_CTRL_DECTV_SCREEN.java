package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * CtrlDecTVScreen =S?Z2NJ}
 * \endif
 */
public class SDK_CTRL_DECTV_SCREEN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 7V8nD#J=
	 * \endif
	 */
	public int             nSplitType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * OTJ>M(5@,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_GENERALJ1SPP',5wSCU_7VEd5DDZ4f3$6H2;D\P!SZnSplitType5D4sP!
	 * \endif
	 */
	public byte[]          pEncoderChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JdHkM(5@Wi:E,dwDisplayType=SDK_SPLIT_DISPLAY_TYPE_PIPJ11mJ>;-VP;-OTJ>@`PMOBSPP'#;
	 * \endif
	 */
	public byte            byGroupNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * OTJ>@`PM#;>_Le<{SDK_SPLIT_DISPLAY_TYPE#(W"JM8wD#J=OBOTJ>DZH]SI"PicInPic">v6(, 8wD#J=OBOTJ>DZH]04NVD>ISP9fTr>v6(#(<4DisChnWV6N>v6(#)!#<fH]#,C;SPUbR;8vOnJ1#,D,HON*FUM(OTJ>@`PM,<4"General"#)
	 * \endif
	 */
	public int             dwDisplayType;
}

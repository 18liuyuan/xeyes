package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * New network keyboard
 * \else
 * PBMxBg<|EL?XVF
 * \endif
 */
public class NKB_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The address of DVR or others, 0xFF is broadcast address
	 * \else
	 * N*DVR5HIh185DNo@m5XV7:E,0xFFN*9c2%5XV7
	 * \endif
	 */
	public byte                bAddressCode;
	
	/**
	 * \if ENGLISH_LANG
	 * code of status 0/1, 0 is down, 1 is up
	 * \else
	 * W4L,Bk 0/1 01mJ>04<|04OB 11mJ>04<|7E?*
	 * \endif
	 */
	public byte                bKeyStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 1
	 * \else
	 * @)U9WV=Z1
	 * \endif
	 */
	public byte                bExtern1;
	
	/**
	 * \if ENGLISH_LANG
	 * extend byte 2
	 * \else
	 * @)U9WV=Z2
	 * \endif
	 */
	public byte                bExtern2;
}

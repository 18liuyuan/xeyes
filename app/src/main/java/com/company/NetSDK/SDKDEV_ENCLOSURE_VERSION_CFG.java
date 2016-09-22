package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * enclosure version config
 * \else
 * 5gWSN'@80f1>:EEdVC 
 * \endif
 */
public class SDKDEV_ENCLOSURE_VERSION_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type mask,such as LIMITSPEED | DRIVEALLOW
	 * \else
	 * N'@8@`PMQZBk#,HgLIMITSPEED | DRIVEALLOW
	 * \endif
	 */
	public int          unType; 
	
	/**
	 * \if ENGLISH_LANG
	 * version
	 * \else
	 * C?8v@`PMR;8v0f1>:E,SCSZM3R;F=L(SkIh18IO5DN'@8EdVC
	 * \endif
	 */
	public int          unVersion[] = new int[32]; 
}

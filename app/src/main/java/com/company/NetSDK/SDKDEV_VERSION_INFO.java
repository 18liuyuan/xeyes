package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device software version information. Corresponding to QueryDevState
 * \else
 * Ih18Hm<~0f1>PEO"#,6TS& QueryDevState=S?Z
 * \endif
 */
public class SDKDEV_VERSION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * PrAP:E
	 * \endif
	 */
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type. See enumeration NET_DEVICE_TYPE. Please refer to SDKDEV_SYSTEM_ATTR_CFG 
	 * \else
	 * Ih18@`PM#,<{C6>Y NET_DEVICE_TYPE,2N<{ SDKDEV_SYSTEM_ATTR_CFG 
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may bu null.
	 * \else
	 * Ih18OjO8PM:E#,WV7{4.8qJ=#,?ID\N*?U
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol version No. 
	 * \else
	 * P-Ri0f1>:E
	 * \endif
	 */
	public int				nProtocalVer;
	
	/**
	 * \if ENGLISH_LANG
	 * Software version 
	 * \else
	 * Hm<~0f1> 
	 * \endif
	 */
	public byte				szSoftWareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Software version build date 
	 * \else
	 * Hm<~0f1>1`RkHUFZ
	 * \endif
	 */
	public int				dwSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version 
	 * \else
	 * 4SF,0f1>PEO"#,WV7{4.8qJ=#,?ID\N*?U
	 * \endif
	 */
	public byte				szPeripheralSoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Dsp software version build date 
	 * \else
	 * 4SF,0f1>1`RkHUFZ
	 * \endif
	 */
	public int				dwPeripheralSoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * 5X@mPEO"6(N;P>F,0f1>PEO"#,WV7{4.8qJ=#,?ID\N*?U
	 * \endif
	 */
	public byte				szGeographySoftwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 5X@mPEO"6(N;P>F,0f1>1`RkHUFZ
	 * \endif
	 */
	public int				dwGeographySoftwareBuildDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Hadrware version 
	 * \else
	 * S2<~0f1>
	 * \endif
	 */
	public byte				szHardwareVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Not in use now 
	 * \else
	 * OVTZC;SPJ9SC 
	 * \endif
	 */
	public int				dwHardwareDate;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version 
	 * \else
	 * web0f1> 
	 * \endif
	 */
	public byte				szWebVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Web version build date 
	 * \else
	 * web0f1>1`RkHUFZ 
	 * \endif
	 */
	public int				dwWebBuildDate;
}

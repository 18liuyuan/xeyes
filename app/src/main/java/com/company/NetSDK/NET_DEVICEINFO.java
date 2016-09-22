package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device information
 * \else
 * Ih18PEO"
 * \endif
 */
public class NET_DEVICEINFO implements Serializable {
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
	public byte				sSerialNumber[] = new byte[FinalVar.SDK_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm input amount
	 * \else
	 * DVR1(>/JdHk8vJ}
	 * \endif
	 */
	public byte				byAlarmInPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR alarm output amount
	 * \else
	 * DVR1(>/Jd3v8vJ}
	 * \endif
	 */
	public byte				byAlarmOutPortNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR HDD amount 
	 * \else
	 * DVRS2EL8vJ}
	 * \endif
	 */
	public byte				byDiskNum;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR type.Please refer to NET_DEVICE_TYPE
	 * \else
	 * DVR@`PM, <{C6>YNET_DEVICE_TYPE
	 * \endif
	 */
	public byte				byDVRType;
	
	/**
	 * \if ENGLISH_LANG
	 * DVR channel amount 
	 * \else
	 * DVRM(5@8vJ}
	 * \endif
	 */
	public byte				byChanNum;
}

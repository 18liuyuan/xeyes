package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Decoder information
 * \else
 * A,=S5D1`BkFwPEO"
 * \endif
 */
public class DEV_DECODER_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type
	 * \else
	 * @`PM
	 * \endif
	 */
	public byte			szDecType[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * TV number
	 * \else
	 * TV8vJ}
	 * \endif
	 */
	public int				nMonitorNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel number
	 * \else
	 * =bBkM(5@8vJ}
	 * \endif
	 */
	public int				nEncoderNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Supported by a number of TV screen partition
	 * \else
	 * V'3V5DTV;-Cf7V8nJ}#,RTJ}WiPNJ=1mJ>#,0N*=aN2
	 * \endif
	 */
	public byte			szSplitMode[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV enable
	 * \else
	 * 8wTVJ9D\
	 * \endif
	 */
	public byte            bMonitorEnable[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * TV tip display enable 0:not support 1:support.
	 * \else
	 * V8J>JG7qV'3VTVLaJ>PEO"5~<SIhVC, 0:2;V'3V 1:V'3V.
	 * \endif
	 */
	public byte            bTVTipDisplay;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 8w=bBkM(5@OTJ>5~<SPEO"J9D\
	 * \endif
	 */
	public byte            byLayoutEnable[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 8w=bBkM(5@OTJ>5~<SPEO"J9D\QZBk,4S5MN;5=8_N;V'3V648vM(5@,FdVPdwLayoutEnMask[0]JG5M32N;
	 * \endif
	 */
	public int           	dwLayoutEnMask[] = new int[2];
}

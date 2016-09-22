package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 485 Decoder Configuration
 * \else
 * 485=bBkFwEdVC
 * \endif
 */
public class SDK_485_CFG implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Com Attributes
	 * \else
	 * 4.?ZJtPT
	 * \endif
	 */
	public SDK_COMM_PROP        struComm = new SDK_COMM_PROP();
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type,corresponding to the subscriptof "Protocol List(Refer to SDKDEV_COMM_CFG)
	 * \else
	 * P-Ri@`PM#,6TS&"P-RiC{AP1m(2N?<SDKDEV_COMM_CFG)OB1j
	 * \endif
	 */
	public byte                wProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-Compatible,local PTZ 1-Remote network PTZ(DEV_ENCODER_CFG) 
	 * \else
	 * 0-<fH]#,1>5XTFL( 1-T63LMxBgTFL(,M(9}D\A&2iQ/(DEV_ENCODER_CFG) 
	 * \endif
	 */
	public byte                bPTZType;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder Address#;0 - 255
	 * \else
	 * =bBkFw5XV7#;0 - 255 
	 * \endif
	 */
	public byte                wDecoderAddress;
	
	/**
	 * \if ENGLISH_LANG
	 * Martix ID
	 * \else
	 * >XUs:E
	 * \endif
	 */
	public byte                byMartixID;
}

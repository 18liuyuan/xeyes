package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm:overlay set configuration
 * \else
 * atm:EdVC5~<SIhVC
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Net, 2:Com, 3:Com422
	 * \else
	 * 1:Net(MxBg), 2:Com(4.?Z), 3:Com422(4.?Z422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name
	 * \else
	 * P-RiC{WV#,
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * overlay channel,the mask means: dwChannelMask[0] is channel 1,so on
	 * \else
	 * 5~<S5DM(5@:E#,QZBk1mJ>, dwChannelMask[0]1mJ>0-31M(5@#,R@4K@`MF!#
	 * \endif
	 */
	public int               dwChannelMask[] = new int[8];

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview(preview), 2:Encode(encode), 3:Preview&Encode(preview and encode)
	 * \else
	 * 1:Preview(T$@@5~<S), 2:Encode(1`Bk5~<S), 3:Preview&Encode(T$@@:M1`Bk5~<S)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom , 3:RightTop , 4:RightBottom
	 * \else
	 * 1:LeftTop(WsIO), 2:LeftBottom(WsOB), 3:RightTop(SRIO), 4:RightBottom(SROB)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * latch time,0~65535s
	 * \else
	 * 5~<SOTJ>QS3YJ1<d,?(:EB<OqQSJ19X1UJ1<d,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * number of key word
	 * \else
	 * 9X<|WV8vJ}
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key word
	 * \else
	 * 8wJSF5M(5@6TS&J}>]T49X<|WV(2;M,M(5@?IRT6TS&2;M,5DJ}>]T4)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[256];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * atm: overlay configuration
 * \else
 * atm:EdVC5~<SIhVC
 * \endif
 */
public class SDKDEV_ATM_OVERLAY_CONFIG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 1:Network, 2:Comm
	 * \else
	 * 1:Net(MxBg), 2:Com(4.?Z), 3:Com422(4.?Z422)
	 * \endif
	 */
	public int               dwDataSource;

	/**
	 * \if ENGLISH_LANG
	 * protocol name, from DHDEV_ATM_OVERLAY_GENERAL
	 * \else
	 * P-RiC{WV#,SIDHDEV_ATM_OVERLAY_GENERAL75;X
	 * \endif
	 */
	public byte                szProtocol[] = new byte[33];

	/**
	 * \if ENGLISH_LANG
	 * channel mask
	 * \else
	 * 5~<S5DM(5@:E#,QZBk1mJ>!#
	 * \endif
	 */
	public int               dwChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * 1:Preview, 2:Encode, 3:Preview&Encode
	 * \else
	 * 1:Preview(T$@@5~<S), 2:Encode(1`Bk5~<S), 3:Preview&Encode(T$@@:M1`Bk5~<S)
	 * \endif
	 */
	public byte                bMode;

	/**
	 * \if ENGLISH_LANG
	 * 1:LeftTop, 2:LeftBottom, 3:RightTop, 4:RightBottom
	 * \else
	 * 1:LeftTop(WsIO), 2:LeftBottom(WsOB), 3:RightTop(SRIO), 4:RightBottom(SROB)
	 * \endif
	 */
	public byte                bLocation;

	/**
	 * \if ENGLISH_LANG
	 * display latch time on overlay, instruct the video's close latch time, 0~65535
	 * \else
	 * 5~<SOTJ>QS3YJ1<d,?(:EB<OqQSJ19X1UJ1<d,0~65535s
	 * \endif
	 */
	public int                 nLatchTime;

	/**
	 * \if ENGLISH_LANG
	 * key number
	 * \else
	 * 9X<|WV8vJ}
	 * \endif
	 */
	public byte                bRecordSrcKeyNum;

	/**
	 * \if ENGLISH_LANG
	 * key of channels
	 * \else
	 * 8wJSF5M(5@6TS&J}>]T49X<|WV(2;M,M(5@?IRT6TS&2;M,5DJ}>]T4)
	 * \endif
	 */
	public int                 nRecordSrcKey[] = new int[32];
}

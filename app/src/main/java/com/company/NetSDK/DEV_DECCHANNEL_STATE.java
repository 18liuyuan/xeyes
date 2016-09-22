package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Current decoding channel status(including channel status, decoding stream info and etc.)
 * \else
 * 51G0=bBkM(5@W4L,PEO"(0|@(M(5@W4L,#,=bBkAwPEO"5H)
 * \endif
 */
public class DEV_DECCHANNEL_STATE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Responding decoding channel number
	 * \else
	 * 6TS&=bBkM(5@:E
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * Current decoding channel in opertion status:0 -free,1 -realtime monitoring,2 - playback 3 - Decode Tour
	 * \else
	 * 51G0=bBkM(5@U}TZ2YWwW4L,:0#-?UOP#,1#-J5J1<`JS#,2#-;X7E 3 - BVQ2
	 * \endif
	 */
	public byte            byChnState;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data frame rate
	 * \else
	 * 51G0J}>]V!BJ
	 * \endif
	 */
	public byte			byFrame;
	                       
	/**
	 * \if ENGLISH_LANG
	 * Decoding channel data amount
	 * \else
	 * =bBkM(5@J}>]W\A?
	 * \endif
	 */
	public int				nChannelFLux;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoding data amount
	 * \else
	 * =bBkJ}>]A?
	 * \endif
	 */
	public int             nDecodeFlux;
	
	/**
	 * \if ENGLISH_LANG
	 * Current data resolution
	 * \else
	 * 51G0J}>]7V1fBJ
	 * \endif
	 */
	public byte            szResolution[] = new byte[16];
}

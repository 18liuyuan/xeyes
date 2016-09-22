package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get device encode config corresponding capacity input parameter
 * \else
 * ;qH!Ih181`BkEdVC6TS&D\A&JdHk2NJ}
 * \endif
 */
public class NET_IN_ENCODE_CFG_CAPS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelId; 
	
	/**
	 * \if ENGLISH_LANG
	 * stream type#,0#:main stream#;1#:sub stream1#;2#:sub stream2#;3#:sub stream3#;4#:snapshot stream
	 * can be left unset, whatever value it is set, you get results of main stream, sub stream1 and snapshot stream
	 * \else
	 * BkAw@`PM#,0#:VwBkAw#;1#:8(BkAw1#;2#:8(BkAw2#;3#:8(BkAw3#;4#:W%M<BkAw
	 * 4K2NJ}?IRT2;Ln#,2;B[V86(J2C4@`PM#,Ih186<75;XVw!"8(!"W%M<BkAw5DD\A&
	 * \endif
	 */
	public int                 nStreamType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Encode config#,cia calling dhconfigsdk.dll port CLIENT_PacketData to get
	 * correspondingsampling command is CFG_CMD_ENCODE
	 * \else
	 * EncodeEdVC#,M(9}5wSCdhconfigsdk.dllVP=S?ZCLIENT_PacketData7bW05C5=
	 * 6TS&5D7bW0C|AnN* CFG_CMD_ENCODE 
	 * \endif
	 */
	public byte                pchEncodeJson[];
}

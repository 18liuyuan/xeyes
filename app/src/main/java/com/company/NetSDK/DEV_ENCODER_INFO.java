package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Encoder information
 * \else
 * A,=S5D1`BkFwPEO"
 * \endif
 */
public class DEV_ENCODER_INFO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR 
	 * \else
	 * G06KDVR5DIP5XV7
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * G06KDVR5D6K?Z:E
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * =bBkM(5@J9D\
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number decoder
	 * \else
	 * 6TS&=bBkM(5@:E
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte			szDevPwd[]	= new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Number
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int				nDevChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Stream type; 0:Main Stream, 1:Sub-stream
	 * \else
	 * BkAw@`PM#,0#:VwBkAw#;1#:8(BkAw1; 2:snap; 3: 8(BkAw2
	 * \endif
	 */
	public int				nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * -1: auto, 0:TCP, 1:UDP, 2:Multicast
	 * \else
	 * -1: auto, 0#:TCP#;1#:UDP#;2#:Wi2%
	 * \endif
	 */	
	public byte			byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:Direct Connect, 1:transmit
	 * \else
	 * 0#:V1A,#;1#:W*7"
	 * \endif
	 */
	public byte			byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Listening port services, for transmit
	 * \else
	 * V8J>UlL}7~Nq5D6K?Z#,W*7"J1SPP'
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type
	 * 0:compatible with each other
	 * 1:private 2nd protocol
	 * 2:private system integration protocol
	 * 3:private DSS protocol
	 * 4:private rtsp protocol
	 * \else
	 * P-Ri@`PM
	 * 0:<fH]RTG0
	 * 1:4s;*6~4zP-Ri
	 * 2:4s;*O5M3</3IP-Ri
	 * 3:4s;*DSSP-Ri
	 * 4:4s;*rtspP-Ri
	 * \endif
	 */
	public int				dwProtoType;
																
	/**
	 * \if ENGLISH_LANG
	 * Front device name
	 * \else
	 * G06KIh18C{3F
	 * \endif
	 */
	public byte			szDevName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * video source type:0-SD,1-HD	
	 * \else
	 * 8C=bBkM(5@51G0JSF5T4@`PM:0-1jGe(SD),1-8_Ge(HD),W":Ih18V'3V8_GeM(5@2ESPP'		
	 * \endif
	 */
	public byte            byVideoInType;
	
	/**
	 * \if ENGLISH_LANG
	 * szDevIp extended, IP or domain name
	 * \else
	 * szDevIp@)U9#,G06KDVR5DIP5XV7(?IRTJdHkSrC{)
	 * \endif
	 */
	public byte			szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * snap mode(when nStreamType==2 effective) 0:That request a frame,1:Time to send a request
	 * \else
	 * W%M<D#J=(nStreamType==2J1SPP') 0#:1mJ>GkGsR;V!,1#:1mJ>6(J17"KMGkGs
	 * \endif
	 */
	public byte            bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device manufacturers,See the enum struct EM_IPC_TYPE
	 * \else
	 * D?1jIh185DIz2z3'IL,>_Le2N?<EM_IPC_TYPE@`
	 * \endif
	 */
	public byte            byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's device type,0:IPC
	 * \else
	 * D?1jIh185DIh18@`PM,0:IPC
	 * \endif
	 */
	public byte            byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * The target device's decode policy
	 * 0:LatencyLevel3 1:LatencyLevel2
	 * 2:LatencyLevel1 3:MiddleLevel
	 * 4:FluencyLevel3 5:FluencyLevel2
	 * 6:FluencyLevel1
	 * \else
	 * D?1jIh185D=bBk2_BT
	 * 0:<fH]RTG0
	 * 1:J5J15H<68_ 
	 * 2:J5J15H<6VP
	 * 3:J5J15H<65M
	 *  4:D,HO5H<6
	 *  5:Aw3)5H<68_ 
	 *  6:Aw3)5H<6VP
	 *  7:Aw3)5H<65M
	 * \endif
	 */
	public byte            byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * http port 0-65535
	 * \else
	 * Http6K?Z:E,0-65535
	 * \endif
	 */
	public int             dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * RTSP port 0-65535
	 * \else
	 * Rtsp6K?Z:E,0-65535
	 * \endif
	 */
	public int             dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * remote channel name
	 * \else
	 * T63LM(5@C{3F, V;SP6AH!5=5DC{3F2;N*?UJ12E?IRTP^8D8CM(5@5DC{3F
	 * \endif
	 */
	public byte			szChnName[] = new byte[32];
}

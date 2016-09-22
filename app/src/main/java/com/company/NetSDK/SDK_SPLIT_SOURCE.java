package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Display source
 * \else
 * OTJ>T4
 * \endif
 */
public class SDK_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean			    bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * IP, null means there is no setup.
	 * \else
	 * IP, ?U1mJ>C;SPIhVC
	 * \endif
	 */
	public byte			    szIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte			    szUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte			    szPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * Port
	 * \else
	 * 6K?Z
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int				    nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Video bit stream. -1-auto, 0-main stream, 1-extra stream 1, 2-extra stream 2, 3-extra stream 3
	 * \else
	 * JSF5BkAw, -1-WT6/, 0-VwBkAw, 1-8(BkAw1, 2-8(BkAw2, 3-8(BkAw3, 4-snap, 5-T$@@
	 * \endif
	 */
	public int				    nStreamType;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-standard definition, 1-high definition
	 * \else
	 * GeNz6H, 0-1jGe, 1-8_Ge
	 * \endif
	 */
	public int				    nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Protocol type#, value corresponding to SDK_DEVICE_PROTOCOL
	 * \else
	 * P-Ri@`PM. V56TS&@`SDK_DEVICE_PROTOCOL
	 * \endif
	 */
	public int					emProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * Ih18C{3F
	 * \endif
	 */
	public byte			    szDevName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int					nVideoChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int					nAudioChannel;

	/**
	 * \if ENGLISH_LANG
	 * Decoder or not.
	 * \else
	 * JG7qJG=bBkFw
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:TCP;1:UDP;2:multicast
	 * \else
	 * -1: auto, 0#:TCP#;1#:UDP#;2#:Wi2%
	 * \endif
	 */
	public byte				byConnType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:connect directly; 1:transfer 
	 * \else
	 * 0#:V1A,#;1#:W*7"
	 * \endif
	 */
	public byte				byWorkMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Isten port, valid with transfer; when byConnType is multicast, it is multiport
	 * \else
	 * V8J>UlL}7~Nq5D6K?Z#,W*7"J1SPP'; byConnTypeN*Wi2%J1#,TrWwN*6`2%6K?Z
	 * \endif
	 */
	public int				wListenPort;
	
	/**
	 * \if ENGLISH_LANG
	 * SzDevIp extension, front DVR Ip address (enter domain name)
	 * \else
	 * szDevIp@)U9#,G06KDVR5DIP5XV7(?IRTJdHkSrC{)
	 * \endif
	 */
	public byte				szDevIpEx[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Snapshot mode (valid when nStreamType==4) 0: request for single frame, 1: sechdule sending request
	 * \else
	 * W%M<D#J=(nStreamType==4J1SPP') 0#:1mJ>GkGsR;V!,1#:1mJ>6(J17"KMGkGs
	 * \endif
	 */
	public byte				bySnapMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device manufacturer. Refer to EM_IPC_TYPE for detailed information.
	 * \else
	 * D?1jIh185DIz2z3'IL, >_Le2N?<EM_IPC_TYPE@`
	 * \endif
	 */
	public byte				byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device type, 0:IPC
	 * \else
	 * D?1jIh185DIh18@`PM, 0:IPC
	 * \endif
	 */
	public byte				byDeviceType;
	
	/**
	 * \if ENGLISH_LANG
	 * Target device decode policy, 0:compatible with previous  
	 * 1:real time level high 2: real time level medium
	 * 3: real time level low 4: default level 
	 * 5: fluency level high 6: fluency level medium
	 * 7: fluency level low
	 * \else
	 * D?1jIh185D=bBk2_BT, 0:<fH]RTG0	
	 * 1:J5J15H<68_  2:J5J15H<6VP	
	 * 3:J5J15H<65M  4:D,HO5H<6	
	 * 5:Aw3)5H<68_  6:Aw3)5H<6VP	
	 * 7:Aw3)5H<65M
	 * \endif
	 */
	public byte				byDecodePolicy;
	
	/**
	 * \if ENGLISH_LANG
	 * Http port number, 0-65535
	 * \else
	 * Http6K?Z:E, 0-65535
	 * \endif
	 */
	public int					dwHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Rtsp port number, 0-65535
	 * \else
	 * Rtsp6K?Z:E, 0-65535
	 * \endif
	 */
	public int					dwRtspPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel name, modifiable only when name read is not vacant
	 * \else
	 * T63LM(5@C{3F, V;SP6AH!5=5DC{3F2;N*?UJ12E?IRTP^8D8CM(5@5DC{3F
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Multicast IP address. Valid only when byConnType is multicast
	 * \else
	 * 6`2%IP5XV7, byConnTypeN*Wi2%J1SPP'
	 * \endif
	 */
	public byte				szMcastIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device ID, ""-null, "Local"  "Remote"
	 * \else
	 * Ih18ID, ""-null, "Local"-1>5XM(5@, "Remote"-T63LM(5@, ;rU_LnHk>_Le5DRemoteDeviceVP5DIh18ID
	 * \endif
	 */
	public byte				szDeviceID[] = new byte[FinalVar.SDK_DEV_ID_LEN_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Is remote channel or not(read only)
	 * \else
	 * JG7qT63LM(5@(V;6A)
	 * \endif
	 */
	public boolean				bRemoteChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote channel ID (read only), effective when bRemoteChannel=TRUE
	 * \else
	 * T63LM(5@ID(V;6A), bRemoteChannel=TRUEJ1SPP'
	 * \endif
	 */
	public int 				nRemoteChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Type of device, such as IPC, DVR, NVR and so on
	 * \else
	 * Ih18@`PM, HgIPC, DVR, NVR5H
	 * \endif
	 */
	public byte				szDevClass[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device specific type, such as IPC-HF3300
	 * \else
	 * Ih18>_LePM:E, HgIPC-HF3300
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * VwBkAwurl5XV7, byManuFactoryN* SDK_IPC_OTHERJ1SPP'
	 * \endif
	 */
	public byte				szMainStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra stream url, effective when byManuFactory = SDK_IPC_OTHER
	 * \else
	 * 8(BkAwurl5XV7, byManuFactoryN* SDK_IPC_OTHER J1SPP'
	 * \endif
	 */
	public byte				szExtraStreamUrl[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Unique channel ID, read only
	 * \else
	 * Ih18DZM3R;1`:E5DN(R;M(5@:E, V;6A
	 * \endif
	 */
	public int					nUniqueChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Ssascade authemyication, effective when device ID = Local/Cascade/SerialNo,  SerialNo is device seral no.
	 * \else
	 * <6A*HOV$PEO", Ih18IDN*Local/Cascade/SerialNoJ1SPP', FdVPSerialNoJGIh18PrAP:E
	 * \endif
	 */
	public SDK_CASCADE_AUTHENTICATOR stuCascadeAuth = new SDK_CASCADE_AUTHENTICATOR();
	
	/**
	 * \if ENGLISH_LANG
	 * 0-normal video source, 1- alarm video source
	 * \else
	 * 0-FUM(JSF5T4, 1-1(>/JSF5T4
	 * \endif
	 */
	public int                 nHint; 
	
	/**
	 * \if ENGLISH_LANG
	 * back main stream address quantity
	 * \else
	 * 18SCVwBkAw5XV7J}A?
	 * \endif
	 */
	public int                 nOptionalMainUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup main stream address list
	 * \else
	 * 18SCVwBkAw5XV7AP1m
	 * \endif
	 */
	public byte                szOptionalMainUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH]; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address quantity
	 * \else
	 * 18SC8(BkAw5XV7J}A?
	 * \endif
	 */
	public int                 nOptionalExtraUrlCount; 
	
	/**
	 * \if ENGLISH_LANG
	 * backup sub stream address list
	 * \else
	 * 18SC8(BkAw5XV7AP1m
	 * \endif
	 */
	public byte                szOptionalExtraUrls[][] = new byte[FinalVar.SDK_MAX_OPTIONAL_URL_NUM][FinalVar.MAX_PATH];

	/**
	 * \if ENGLISH_LANG
	 * tour time intertval	unit#:second
	 * \else
	 * BVQ2J1<d<d8t	5%N;#:Ck
	 * \endif
	 */
	public int                 nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte                szUserEx[] = new byte[FinalVar.SDK_NEW_USER_NAME_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte                szPwdEx[] = new byte[FinalVar.SDK_NEW_USER_PSW_LENGTH];
	
	/**
	 * \if ENGLISH_LANG
	 * type of pushstream,effective when byConnType is TCP-Push or UDP-Push 
	 * \else
	 * MFAw7=J=5DBkAw@`PM,V;SPbyConnTypeN*TCP-Push;rUDP-Push2ESP8CWV6N
	 * \endif
	 * @see EM_SRC_PUSHSTREAM_TYPE
	 */
	public int 				   emPushStream;           

}

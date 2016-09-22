package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Production definition
 * \else
 * 2zF76(Re
 * \endif
 */
public class SDK_PRODUCTION_DEFNITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int					nVideoInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * JSF5Jd3vM(5@J}
	 * \endif
	 */
	public int					nVideoOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote decode channel amount
	 * \else
	 * T63L=bBkM(5@J}
	 * \endif
	 */
	public int					nRemoteDecChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * Ih18@`PM
	 * \endif
	 */
	public char				szDevType[] = new char[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM customer
	 * \else
	 * OEM?M;'
	 * \endif
	 */
	public char				szVendor[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM version
	 * \else
	 * OEM0f1>
	 * \endif
	 */
	public int					nOEMVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Main version No.
	 * \else
	 * Vw0f1>:E
	 * \endif
	 */
	public int					nMajorVerion;
	
	/**
	 * \if ENGLISH_LANG
	 * SUb version No.
	 * \else
	 * 4N0f1>:E
	 * \endif
	 */
	public int					nMinorVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * Revision version
	 * \else
	 * P^6)0f1>
	 * \endif
	 */
	public int					nRevision;
	
	/**
	 * \if ENGLISH_LANG
	 * Web version
	 * \else
	 * Web0f1>
	 * \endif
	 */
	public char				szWebVerion[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Default setup
	 * \else
	 * D,HOSoQT
	 * \endif
	 */
	public char				szDefLanguage[] = new char[FinalVar.SDK_MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Release time. Unit is second.
	 * \else
	 * 7"2<J1<d, >+H75=Ck
	 * \endif
	 */
	public NET_TIME			stuBuildDateTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int					nAudioInChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * RtF5Jd3vM(5@J}
	 * \endif
	 */
	public int					nAudioOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Support schedule storage or not.
	 * \else
	 * JG7qV'3V6(J14f4"
	 * \endif
	 */
	public boolean				bGeneralRecord;
	
	/**
	 * \if ENGLISH_LANG
	 * Support local storage or not.
	 * \else
	 * JG7qV'3V1>5X4f4"
	 * \endif
	 */
	public boolean				bLocalStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support network storage or not.
	 * \else
	 * JG7qV'3VMxBg4f4"
	 * \endif
	 */
	public boolean				bRemoteStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support emergency local storage or not.
	 * \else
	 * JG7qV'3V=t<14f4"5=1>5X
	 * \endif
	 */
	public boolean				bLocalurgentStore;
	
	/**
	 * \if ENGLISH_LANG
	 * Support real-time compression storage or not.
	 * \else
	 * JG7qV'3VJ5J1Q9Ku4f4"
	 * \endif
	 */
	public boolean				bRealtimeCompress;
	
	/**
	 * \if ENGLISH_LANG
	 * The video format supported. bit0-PAL, bit1-NTSC
	 * \else
	 * V'3V5DJSF5VFJ=AP1m, bit0-PAL, bit1-NTSC
	 * \endif
	 */
	public int					dwVideoStandards;
	
	/**
	 * \if ENGLISH_LANG
	 * Default video format, 0-PAL, 1-NTSC
	 * \else
	 * 6KD,HOJSF5VFJ=, 0-PAL, 1-NTSC
	 * \endif
	 */
	public int					nDefVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Max extra stream channel amount
	 * \else
	 * Wn4s8(BkAwB7J}
	 * \endif
	 */
	public int					nMaxExtraStream;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote record channel amount
	 * \else
	 * T63LB<OqM(5@J}
	 * \endif
	 */
	public int					nRemoteRecordChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote snap channel amount
	 * \else
	 * T63LW%M<M(5@J}
	 * \endif
	 */
	public int					nRemoteSnapChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote video analysis channel amount
	 * \else
	 * T63LJSF57VNvM(5@J}
	 * \endif
	 */
	public int					nRemoteVideoAnalyseChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote real-time stream transmit max channel amount
	 * \else
	 * T63LJ5J1AwW*7"Wn4sM(5@J}
	 * \endif
	 */
	public int					nRemoteTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote transmit file channel amount
	 * \else
	 * T63LND<~AwVq7$M(5@M(5@J}
	 * \endif
	 */
	public int					nRemoteTransmitFileChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max network transmit channel amount
	 * \else
	 * Wn4sMxBg4+JdM(5@W\J}
	 * \endif
	 */
	public int					nStreamTransmitChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max read file channel amount
	 * \else
	 * Wn4s6AND<~AwM(5@W\J}
	 * \endif
	 */
	public int					nStreamReadChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network send capability, kbps
	 * \else
	 * Wn4sBkAwMxBg7"KMD\A&, kbps
	 * \endif
	 */
	public int					nMaxStreamSendBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Max bit stream network interface capability, kbps
	 * \else
	 * Wn4sBkAwMxBg=S?ZD\A&, kbps
	 * \endif
	 */
	public int					nMaxStreamRecvBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Old compression file or not. Delete P frame and save I frame.
	 * \else
	 * JG7qQ9Ku>IND<~, H%3}PV!, 1#AtIV!
	 * \endif
	 */
	public boolean				bCompressOldFile;
	
	/**
	 * \if ENGLISH_LANG
	 * Support RAID or not.
	 * \else
	 * JG7qV'3VRAID
	 * \endif
	 */
	public boolean				bRaid;
	
	/**
	 * \if ENGLISH_LANG
	 * Max pre-record time.Unit is second.
	 * \else
	 * Wn4sT$B<J1<d, s
	 * \endif
	 */
	public int					nMaxPreRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ alarm or not.
	 * \else
	 * JG7qV'3VTFL(1(>/
	 * \endif
	 */
	public boolean				bPtzAlarm;
	
	/**
	 * \if ENGLISH_LANG
	 * Support PTZ or not.
	 * \else
	 * JG7qV'3VTFL(
	 * \endif
	 */
	public boolean				bPtz;
	
	/**
	 * \if ENGLISH_LANG
	 * Support corresponding function of the ATM or not.
	 * \else
	 * JG7qOTJ>ATMO`9X9&D\
	 * \endif
	 */
	public boolean				bATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Support 3G module or not.
	 * \else
	 * JG7qV'3V3GD#?i
	 * \endif
	 */
	public boolean				b3G;
	
	/**
	 * \if ENGLISH_LANG
	 * With number button or not.
	 * \else
	 * JG7q4xJ}WV<|
	 * \endif
	 */
	public boolean				bNumericKey;
	
	/**
	 * \if ENGLISH_LANG
	 * With Shift button or not.
	 * \else
	 * JG7q4xShift<|
	 * \endif
	 */
	public boolean				bShiftKey;
	
	/**
	 * \if ENGLISH_LANG
	 * Number character map sheet is right or not.
	 * \else
	 * J}WVWVD8S3Id1mJG7qU}H7
	 * \endif
	 */
	public boolean				bCorrectKeyMap;
	
	/**
	 * \if ENGLISH_LANG
	 * The new 2nd ATM front panel.
	 * \else
	 * PB5D6~4zATMG0Cf0e
	 * \endif
	 */
	public boolean				bNewATM;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder or not
	 * JG7qJG=bBkFw
	 * \endif
	 */
	public boolean				bDecoder;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder info. Valid when bDecoder=true.bDecoder=true
	 * \else
	 * =bBkFwPEO", bDecoder=trueJ1SPP'
	 * \endif
	 */
	public DEV_DECODER_INFO		stuDecoderInfo = new DEV_DECODER_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Integration ceiling screen output channel
	 * \else
	 * HZ:OFAJd3vM(5@IOO^
	 * \endif
	 */
	public int					nVideoOutputCompositeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Support WPS or not
	 * \else
	 * JG7qV'3VWPS9&D\
	 * \endif
	 */
	public boolean                bSupportedWPS;
	
	/**
	 * \if ENGLISH_LANG
	 * VGA video output channel number
	 * \else
	 * VGAJSF5Jd3vM(5@J}
	 * \endif
	 */
	public int					nVGAVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * TV video output channel number
	 * \else
	 * TVJSF5Jd3vM(5@J}
	 * \endif
	 */
	public int					nTVVideoOutputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of remote channels
	 * \else
	 * Wn4sT63LM(5@J}
	 * \endif
	 */
	public int					nMaxRemoteInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max number of matrix channels
	 * \else
	 * Wn4s>XUsM(5@J}
	 * \endif
	 */
	public int					nMaxMatrixInputChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of road ways 1~6
	 * \else
	 * VGD\=;M(Wn4s355@J} 1~6
	 * \endif
	 */
	public int                 nMaxRoadWays;
	
	/**
	 * \if ENGLISH_LANG
	 * Max counts of screen when docking with the camera 0~20
	 * \else
	 * :MO`;z6T=SWn6`V'3V5DGxSrFA8vJ} 0~20
	 * \endif
	 */
	public int                 nMaxParkingSpaceScreen;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(K.F=WnP!=G6H, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(K.F=Wn4s=G6H, [0-360]
	 * \endif
	 */
	public int					nPtzHorizontalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(49V1WnP!=G6H, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(49V1Wn4s=G6H, [-90,90]
	 * \endif
	 */
	public int					nPtzVerticalAngleMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JG7qV'3VTFL(9&D\2K5%
	 * \endif
	 */
	public boolean				bPtzFunctionMenu;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JG7qV'3V5F9b?XVF
	 * \endif
	 */
	public boolean				bLightingControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JV6/5F9b?XVFD#J=, 04N;, <{NET_LIGHTING_CTRL_ON_OFF
	 * \endif
	 */
	public int				dwLightingControlMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * =|9b5FWiJ}A?, 01mJ>2;V'3V
	 * \endif
	 */
	public int					nNearLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * T69b5FWiJ}A?, 01mJ>2;V'3V
	 * \endif
	 */
	public int					nFarLightNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JG7qV'3V?XVF>[=9
	 * \endif
	 */
	public boolean				bFocus;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JG7qV'3V?XVF9bH&
	 * \endif
	 */
	public boolean				bIris;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(V'3V5DP-RiAP1m, ?IRTJG6`8v, C?8vSC';'7V8t
	 * \endif
	 */
	public char				szPtzProtocolList[] = new char[FinalVar.SDK_COMMON_STRING_1024];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * JG7qV'3VSjK"?XVF
	 * \endif
	 */
	public boolean				bRainBrushControl;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * SjK"J}A?, N*0J11mJ>2;V'3V
	 * \endif
	 */
	public int					nBrushNumber;
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix input channel, the subscript corresponding matrix number
	 * \else
	 * OBN;>XUsJSF5JdHkM(5@, OB1j6TS&>XUs1`:E
	 * \endif
	 */
	public int                 szLowerMatrixInputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * inferior video matrix output channel, the subscript corresponding matrix number
	 * \else
	 * OBN;>XUsJSF5Jd3vM(5@, OB1j6TS&>XUs1`:E
	 * \endif
	 */
	public int				   szLowerMatrixOutputChannels[] = new int[FinalVar.SDK_MAX_LOWER_MITRIX_NUM];
	
}


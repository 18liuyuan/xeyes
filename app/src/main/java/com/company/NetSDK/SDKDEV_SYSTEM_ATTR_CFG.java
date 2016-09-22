package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * System information
 * \else
 * O5M3PEO"
 * \endif
 */
public class SDKDEV_SYSTEM_ATTR_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Version info 
	 * \else
	 * 0f1>PEO"
	 * \endif
	 */
	public SDK_VERSION_INFO		stVersion = new SDK_VERSION_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * DSP capacity description 
	 * \else
	 * DSPD\A&ChJv
	 * \endif
	 */
	public SDK_DSP_ENCODECAP	stDspEncodeCap = new SDK_DSP_ENCODECAP();
	
	/**
	 * \if ENGLISH_LANG
	 * SN
	 * \else
	 * PrAP:E
	 * \endif
	 */
	public byte				szDevSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type. Please refer to enumeration DHDEV_DEVICE_TYPE
	 * \else
	 * Ih18@`PM#,<{C6>YNET_DEVICE_TYPE
	 * \endif
	 */
	public byte				byDevType;
	
	/**
	 * \if ENGLISH_LANG
	 * Device detailed type. String format. It may be empty.
	 * <pre>
	 * Enumeration definition				Type 
	 * NET_DVR_NONREALTIME_MACE				Non real-time MACE 
	 * NET_DVR_NONREALTIME					Non real-time 
	 * NET_NVS_MPEG1						NVS 
	 * NET_DVR_MPEG1_2						MPEG1 2-channel DVR 
	 * NET_DVR_MPEG1_8						MPEG1 8-channel DVR 
	 * NET_DVR_MPEG4_8						MPEG4 8-channel DVR 
	 * NET_DVR_MPEG4_16						MPEG4 16-channel DVR 
	 * NET_DVR_MPEG4_SX2					LB series DVR 
	 * NET_DVR_MEPG4_ST2					GB series DVR 
	 * NET_DVR_MEPG4_SH2					HB series DVR 
	 * NET_DVR_MPEG4_GBE					GBE series DVR 
	 * NET_DVR_MPEG4_NVSII					II NVS 
	 * NET_DVR_STD_NEW						New standard configuration protocol 
	 * NET_DVR_DDNS							DDNS server 
	 * NET_DVR_ATM							ATM 
	 * NET_NB_SERIAL						The 2nd non real-time NB DVR 
	 * NET_LN_SERIAL						LN series DVR 
	 * NET_BAV_SERIAL						BAV series DVR 
	 * NET_SDIP_SERIAL						SDIP series DVR 
	 * NET_IPC_SERIAL						IPC series DVR 
	 * NET_NVS_B							NVS B series 
	 * NET_NVS_C							NVS H series 
	 * NET_NVS_S							NVS S series 
	 * NET_NVS_E							NVS E series 
	 * NET_DVR_NEW_PROTOCOL					Search device type from QueryDevState. By string format. 
	 * NET_NVD_SERIAL						Decoder 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						Hybrid dvr 
	 * NET_SVR_SERIAL						SVR series 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVR series 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE intelligent analysis box 
	 * NET_ITC_SERIAL						ITS camera 
	 * NET_HWS_SERIAL						Radar speed measuring device 
	 * NET_PVR_SERIAL						PVR 
	 * NET_IVS_SERIAL						IVS#(intelligent video server series#) 
	 * NET_IVS_B							General intelligent video detect server 
	 * NET_IVS_F							Facial recognition server 
	 * NET_IVS_V							Video quality analysis server 
	 * NET_MATRIX_SERIAL					Matrix 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							People counting server 
	 * </pre>
	 * \else
	 * Ih18OjO8PM:E#,WV7{4.8qJ=#,?ID\N*?U
	 * C6>Y6(Re								@`PM 
	 * NET_DVR_NONREALTIME_MACE				7GJ5J1MACE 
	 * NET_DVR_NONREALTIME					7GJ5J1 
	 * NET_NVS_MPEG1						MxBgJSF57~NqFw 
	 * NET_DVR_MPEG1_2						MPEG16~B7B<Oq;z 
	 * NET_DVR_MPEG1_8						MPEG10KB7B<Oq;z 
	 * NET_DVR_MPEG4_8						MPEG40KB7B<Oq;z 
	 * NET_DVR_MPEG4_16						MPEG4J.AyB7B<Oq;z 
	 * NET_DVR_MPEG4_SX2					LBO5APB<Oq;z 
	 * NET_DVR_MEPG4_ST2					GBO5APB<Oq;z 
	 * NET_DVR_MEPG4_SH2					HBO5APB<Oq;z 
	 * NET_DVR_MPEG4_GBE					GBEO5APB<Oq;z 
	 * NET_DVR_MPEG4_NVSII					II4zMxBgJSF57~NqFw 
	 * NET_DVR_STD_NEW						PB1jW<EdVCP-Ri 
	 * NET_DVR_DDNS							DDNS7~NqFw 
	 * NET_DVR_ATM							ATM;z 
	 * NET_NB_SERIAL						6~4z7GJ5J1NBO5AP;zFw 
	 * NET_LN_SERIAL						LNO5AP2zF7 
	 * NET_BAV_SERIAL						BAVO5AP2zF7 
	 * NET_SDIP_SERIAL						SDIPO5AP2zF7 
	 * NET_IPC_SERIAL						IPCO5AP2zF7 
	 * NET_NVS_B							NVS BO5AP 
	 * NET_NVS_C							NVS HO5AP 
	 * NET_NVS_S							NVS SO5AP 
	 * NET_NVS_E							NVS EO5AP 
	 * NET_DVR_NEW_PROTOCOL					4SQueryDevStateVP2iQ/Ih18@`PM,RTWV7{4.8qJ=!# 
	 * NET_NVD_SERIAL						=bBkFw!# 
	 * NET_DVR_N5							N5 
	 * NET_DVR_MIX_DVR						;l:Odvr 
	 * NET_SVR_SERIAL						SVRO5AP 
	 * NET_SVR_BS							SVR-BS 
	 * NET_NVR_SERIAL						NVRO5AP 
	 * NET_DVR_N51							N51 
	 * NET_ITSE_SERIAL						ITSE VGD\7VNv:P 
	 * NET_ITC_SERIAL						VGD\=;M(Oq;zIh18 
	 * NET_HWS_SERIAL						@W4o2bKYRGHWS 
	 * NET_PVR_SERIAL						1cP/J=RtJSF5B<Oq;z 
	 * NET_IVS_SERIAL						IVS#(VGD\JSF57~NqFwO5AP#) 
	 * NET_IVS_B							M(SCVGD\JSF5Ul2b7~NqFw 
	 * NET_IVS_F							HKA3J61p7~NqFw 
	 * NET_IVS_V							JSF5VJA?Uo6O7~NqFw 
	 * NET_MATRIX_SERIAL					>XUs 
	 * NET_DVR_N52							N52 
	 * NET_DVR_N56							N56 
	 * NET_ESS_SERIAL						ESS 
	 * NET_IVS_PC							HKJ}M3<F7~NqFw 
	 * \endif
	 */
	public byte				szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Video port amount
	 * \else
	 * JSF5?ZJ}A?
	 * \endif
	 */
	public byte				byVideoCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio port amount 
	 * \else
	 * RtF5?ZJ}A?
	 * \endif
	 */
	public byte				byAudioCaptureNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * 6T=2JdHk=S?ZJ}A?
	 * \endif
	 */
	public byte				byTalkInChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * 6T=2Jd3v=S?ZJ}A?
	 * \endif
	 */
	public byte				byTalkOutChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byDecodeChanNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm input port amount
	 * \else
	 * 1(>/JdHk?ZJ}
	 * \endif
	 */
	public byte				byAlarmInNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm output amount port
	 * \else
	 * 1(>/Jd3v?ZJ}
	 * \endif
	 */
	public byte				byAlarmOutNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Network port amount 
	 * \else
	 * MxBg?ZJ}
	 * \endif
	 */
	public byte				byNetIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * USB USB port amount
	 * \else
	 * USB?ZJ}A?
	 * \endif
	 */
	public byte				byUsbIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * IDE amount
	 * \else
	 * IDEJ}A?
	 * \endif
	 */
	public byte				byIdeIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * 4.?ZJ}A?
	 * \endif
	 */
	public byte				byComIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * LPT amount
	 * \else
	 * 2"?ZJ}A?
	 * \endif
	 */
	public byte				byLPTIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byVgaIONum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlNum;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP
	 * \else
	 * NSP
	 * \endif
	 */
	public byte				byIdeControlType;
	
	/**
	 * \if ENGLISH_LANG
	 * NSP, expansible description 
	 * \else
	 * NSP#,@)U9ChJv
	 * \endif
	 */
	public byte				byCapability;
	
	/**
	 * \if ENGLISH_LANG
	 * Video matrix output amount
	 * \else
	 * JSF5>XUsJd3v?ZJ}
	 * \endif
	 */
	public byte				byMatrixOutNum;			
	
	/**
	 * \if ENGLISH_LANG
	 * Operate when HDD is full(overwrite/stop)
	 * \else
	 * S2ELBz4&@m7=J=(828G!"M#V9)
	 * \endif
	 */
	public byte				byOverWrite;
	
	/**
	 * \if ENGLISH_LANG
	 * Video file Package length
	 * \else
	 * B<Os4r0|3$6H
	 * \endif
	 */
	public byte				byRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable  DTS or not  1--enable. 0--disable
	 * \else
	 * JG7qJ5PPODAnJ1 1-J5PP 0-2;J5PP
	 * \endif
	 */
	public byte				byDSTEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Device serial number. Remote control can use this SN to control.
	 * \else
	 * Ih181`:E#,SCSZR#?X
	 * \endif
	 */
	public int					wDevNo;
	
	/**
	 * \if ENGLISH_LANG
	 * Video format
	 * \else
	 * JSF5VFJ=:0-PAL,1-NTSC
	 * \endif
	 */
	public byte				byVideoStandard;
	
	/**
	 * \if ENGLISH_LANG
	 * Date format
	 * \else
	 * HUFZ8qJ=
	 * \endif
	 */
	public byte				byDateFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Date separator(0:".",1:"-",2:"/")
	 * \else
	 * HUFZ7V8n7{(0#:"."#,1#:"-"#,2#:"/")
	 * \endif
	 */
	public byte				byDateSprtr;
	
	/**
	 * \if ENGLISH_LANG
	 * Time separator  (0-24H,1-12H)
	 * \else
	 * J1<d8qJ= (0-24P!J1#,1#-12P!J1)
	 * \endif
	 */
	public byte				byTimeFmt;
	
	/**
	 * \if ENGLISH_LANG
	 * Please refer to SDK_LANGUAGE_TYPE for enumeration value
	 * \else
	 * C6>YV5Oj<{ SDK_LANGUAGE_TYPE
	 * \endif
	 */
	public byte				byLanguage;
}

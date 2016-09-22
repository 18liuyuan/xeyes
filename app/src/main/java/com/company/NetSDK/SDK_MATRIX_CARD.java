package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Matrix sub card info
 * \else
 * >XUsWS?(	
 * \endif
 */
public class SDK_MATRIX_CARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Valid or not
	 * \else
	 * JG7qSPP'
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub card type
	 * \else
	 * WS?(@`PM
	 * \endif
	 */
	public int					dwCardType;
	
	/**
	 * \if ENGLISH_LANG
	 * Signal interface type, "CVBS", "VGA", "DVI"...
	 * \else
	 * PE:E=S?Z@`PM, "CVBS", "VGA", "DVI"...
	 * \endif
	 */
	public byte		    	szInterface[] = new byte[FinalVar.SDK_MATRIX_INTERFACE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device IP or domain name. The sub card that has no network conneciton can be null.
	 * \else
	 * Ih18ip;rSrC{, N^MxBg=S?Z5DWS?(?IRTN*?U
	 * \endif
	 */
	public byte		    	szAddress[] = new byte[FinalVar.SDK_MAX_IPADDR_OR_DOMAIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port No. The sub card that has no network conneciton can be 0.
	 * \else
	 * 6K?Z:E, N^MxBg=S?Z5DWS?(?IRTN*0
	 * \endif
	 */
	public int			    	nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Definition. 0=standard definition. 1=High definition
	 * \else
	 * GeNz6H, 0=1jGe, 1=8_Ge
	 * \endif
	 */
	public int					nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel amount
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int					nVideoInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel amount
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int					nAudioInChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel amount
	 * \else
	 * JSF5Jd3vM(5@J}
	 * \endif
	 */
	public int					nVideoOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel amount
	 * \else
	 * RtF5Jd3vM(5@J}
	 * \endif
	 */
	public int				    nAudioOutChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel amount	
	 * \else
	 * JSF51`BkM(5@J}
	 * \endif
	 */
	public int			    	nVideoEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel amount
	 * \else
	 * RtF51`BkM(5@J}
	 * \endif
	 */
	public int				    nAudioEncChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel amount
	 * \else
	 * JSF5=bBkM(5@J}
	 * \endif
	 */
	public int			    	nVideoDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel amount
	 * \else
	 * RtF5=bBkM(5@J}
	 * \endif
	 */
	public int			    	nAudioDecChn;
	
	/**
	 * \if ENGLISH_LANG
	 * Status: 0-OK, 1-no respond, 2-network disconnection, 3-conflict, 4-upgrading now
	 * \else
	 * W4L,: 0-U}3#, 1-N^OlS&, 2-MxBg5tO_, 3-3eM;, 4-U}TZI}<6
	 * \endif
	 */
	public int					nStauts;
	
	/**
	 * \if ENGLISH_LANG
	 * COM amount
	 * \else
	 * 4.?ZJ}
	 * \endif
	 */
	public int					nCommPorts;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel min value
	 * \else
	 * JSF5JdHkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nVideoInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video input channel max value
	 * \else
	 * JSF5JdHkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nVideoInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel min value
	 * \else
	 * RtF5JdHkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAudioInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio input channel max value
	 * \else
	 * RtF5JdHkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nAudioInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel min value
	 * \else
	 * JSF5Jd3vM(5@:EWnP!V5
	 * \endif
	 */
	public int					nVideoOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output channel max value
	 * \else
	 * JSF5Jd3vM(5@:EWn4sV5
	 * \endif
	 */
	public int					nVideoOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel min value
	 * \else
	 * RtF5Jd3vM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAudioOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio output channel max value
	 * \else
	 * RtF5Jd3vM(5@:EWn4sV5	
	 * \endif
	 */
	public int					nAudioOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel min value
	 * \else
	 * JSF51`BkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nVideoEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video encode channel max value
	 * \else
	 * JSF51`BkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nVideoEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel min value
	 * \else
	 * RtF51`BkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAudioEncChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio encode channel max value
	 * \else
	 * RtF51`BkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nAudioEncChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel min value
	 * \else
	 * JSF5=bBkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nVideoDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Video decode channel max value
	 * \else
	 * JSF5=bBkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nVideoDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel min value
	 * \else
	 * RtF5=bBkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAudioDecChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Audio decode channel max value
	 * \else
	 * RtF5=bBkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nAudioDecChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Number of cascade channel
	 * \else
	 * <6A*M(5@J}
	 * \endif
	 */
	public int					nCascadeChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * Cascade channel bitrate (Mbps)
	 * \else
	 * <6A*M(5@4x?m, 5%N;Mbps
	 * \endif
	 */
	public int					nCascadeChannelBitrate;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/JdHkM(5@J}
	 * \endif
	 */
	public int					nAlarmInChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/JdHkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAlarmInChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/JdHkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nAlarmInChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/Jd3vM(5@J}
	 * \endif
	 */
	public int					nAlarmOutChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/JdHkM(5@:EWnP!V5
	 * \endif
	 */
	public int					nAlarmOutChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 1(>/JdHkM(5@:EWn4sV5
	 * \endif
	 */
	public int					nAlarmOutChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * VGD\7VNvM(5@J}
	 * \endif
	 */
	public int					nVideoAnalyseChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * VGD\7VNvM(5@:EWnP!V5
	 * \endif
	 */
	public int					nVideoAnalyseChnMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * VGD\7VNvM(5@:EWn4sV5
	 * \endif
	 */
	public int					nVideoAnalyseChnMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 4.?Z:EWnP!V5
	 * \endif
	 */
	public int					nCommPortMin;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 4.?Z:EWn4sV5
	 * \endif
	 */
	public int					nCommPortMax;
	
	/**
	 * \if ENGLISH_LANG
	 * Version
	 * \else
	 * 0f1>PEO"
	 * \endif
	 */
	public byte[]               szVersion = new byte[FinalVar.SDK_COMMON_STRING_32];
	
	/**
	 * \if ENGLISH_LANG
	 * Build Time
	 * \else
	 * 1`RkJ1<d
	 * \endif
	 */
    public NET_TIME             stuBuildTime = new NET_TIME(); 
	
}

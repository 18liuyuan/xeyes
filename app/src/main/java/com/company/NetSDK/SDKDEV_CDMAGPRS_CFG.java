package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_CDMAGPRS_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless module enable
	 * \else
	 * N^O_D#?iJ9D\1jV>
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Network type mask;Use bit to represent,The first bit:Automatic selection
	 * The second bit:TD-SCDMA network;The third bit:WCDMA network;
	 * The fourth bit:CDMA 1.x network;The fifth bit:GPRS network;The sixth bit:EVDO network
	 * The seventh bit:EVDO network;The eighth bit:WIFI network;
	 * \else
	 * Ih18V'3VMxBg@`PMQZBk;04N;1mJ>,5ZR;N;;WT6/Q!Tq;
	 * 5Z6~N;#:TD-SCDMAMxBg#;5ZH}N;#:WCDMAMxBg;
	 * 5ZKDN;#:CDMA 1.xMxBg;5ZNeN;#:CDMA2000MxBg;5ZAyN;#:GPRSMxBg;
	 * 5ZF_N;#:EVDOMxBg;5Z0KN;#:WIFI
	 * \endif
	 */
	public int               dwTypeMask;

	/**
	 * \if ENGLISH_LANG
	 * Types of wireless networks,EM_GPRSCDMA_NETWORK_TYPE
	 * \else
	 * 51G05DN^O_MxBg@`PM#,N*EM_GPRSCDMA_NETWORK_TYPEV5
	 * \endif
	 */
	public int               dwNetType;

	/**
	 * \if ENGLISH_LANG
	 * Access Point Name
	 * \else
	 * =SHk5cC{3F
	 * \endif
	 */
	public byte                szAPN[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up number
	 * \else
	 * 2&:E:EBk
	 * \endif
	 */
	public byte                szDialNum[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up user name
	 * \else
	 * 2&:ESC;'C{
	 * \endif
	 */
	public byte                szUserName[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Password
	 * \else
	 * 2&:EC\Bk
	 * \endif
	 */
	public byte                szPWD[] = new byte[128];
    
    /* OBCfJGIh185DV;6A2?7V */
	/**
	 * \if ENGLISH_LANG
	 * Wireless network registration status
	 * \else
	 * N^O_MxBgW"2aW4L,
	 * \endif
	 */
	public boolean                iAccessStat;

	/**
	 * \if ENGLISH_LANG
	 * dial-up IP of Front-end equipment
	 * \else
	 * G06KIh182&:EIP#,WV7{4., 0|@('\0'=aJx7{9216byte
	 * \endif
	 */
	public byte                szDevIP[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up mask of Front-end equipment
	 * \else
	 * G06KIh182&:EWSMxQZBk#,WV7{4., 0|@('\0'=aJx7{9216byte
	 * \endif
	 */
	public byte                szSubNetMask[] = new byte[16];

	/**
	 * \if ENGLISH_LANG
	 * Dial-up Gateway of Front-end equipment
	 * \else
	 * G06KIh182&:EMx9X#,WV7{4., 0|@('\0'=aJx7{9216byte
	 * \endif
	 */
	public byte                szGateWay[] = new byte[16];
	
    /* IOCfJGIh185DV;6A2?7V */
	/**
	 * \if ENGLISH_LANG
	 * Keep-alive time
	 * \else
	 * 1#;nJ1<d
	 * \endif
	 */
	public int                 iKeepLive;

	/**
	 * \if ENGLISH_LANG
	 * 3G dial period,valid time period,start dialing;beyond this period,shut the dial.
	 * \else
	 * 3G2&:EJ1<d6N#,SPP'J1<d6NV.DZ#,?*Ft2&:E#;SPP'J1<d6NV.Mb#,9X1U2&:E!#
	 * \endif
	 */
    public SDK_3G_TIMESECT      stSect[][] = new SDK_3G_TIMESECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_TSECT];
    
    /**
	 * \if ENGLISH_LANG
	 * Whether need to be active by voice or message
	 * \else
	 * JG7qPhR*1;SoRt;r6LPE<$;n
	 * \endif
	 */
	public byte                byActivate;

	/**
	 * \if ENGLISH_LANG
	 * SIM(UIM) State: 1, 0 (read-only data) be occupied the 1 byte
	 * \else
	 * SIM(UIM)W4L,:4fTZ1,2;4fTZ0  (V;6AJ}>]) U<SCReserved5D18vWV=Z
	 * \endif
	 */
	public byte                bySimStat;

	/**
	 * \if ENGLISH_LANG
	 * identify mode
	 * \else
	 * <xH(7=J=
	 * \endif
	 */
	public byte                szIdentify[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up,0- cut down ppp connect,1-ppp dial-up
	 * \else
	 * PPP2&:E,0-6O?*pppA,=S#,1-ppp2&:E
	 * \endif
	 */
	public boolean                bPPPEnable;

	/**
	 * \if ENGLISH_LANG
	 * PPP Dial-up statr(real only),see EM_MOBILE_PPP_STATE
	 * \else
	 * PPP2&:EW4L,(V;6A)#,>_Le:,Re<{EM_MOBILE_PPP_STATE
	 * \endif
	 */
	public byte                bPPPState;

	/**
	 * \if ENGLISH_LANG
	 * net card state(read only),see EM_3GMOBILE_STATE
	 * \else
	 * Mx?(Ky4&W4L,(V;6A)#,>_Le:,Re<{EM_3GMOBILE_STATE
	 * \endif
	 */
	public byte                bNetCardState;

	/**
	 * \if ENGLISH_LANG
	 * physics card no.
	 * \else
	 * No@m?(:E
	 * \endif
	 */
	public byte                szPhyCardNo[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * PIN show or not(read only), 0-don't support 1-show, 2-don't show
	 * \else
	 * PINBkJG7qOTJ>(V;6A), 0-2;V'3V, 1-OTJ>, 2-2;OTJ>
	 * \endif
	 */
	public byte                byPinShow;

	/**
	 * \if ENGLISH_LANG
	 * PIN setting enable(read only), 0-disable, 1-enable
	 * \else
	 * PINBkIhVCJ9D\(V;6A), 0-2;J9D\, 1-J9D\
	 * \endif
	 */
	public byte                byPinEnable;

	/**
	 * \if ENGLISH_LANG
	 * the rest of pin setting number(read only), 0~3
	 * \else
	 * PINBkJ#S`IhVC4NJ}(V;6A), 0~3
	 * \endif
	 */
	public byte                byPinCount;
	
    //-------------------------------RTOBWV6NIhVCdwSize:s2ESPP'------------------------------------
	/**
	 * \if ENGLISH_LANG
	 * value of PIN, a combination of letters or numbers
	 * \else
	 * PINBkV5, WVD8;rJ}WV5DHNRbWi:O
	 * \endif
	 */
	public byte                szPinNo[] = new byte[16];
    
    public SDKDEV_CDMAGPRS_CFG() {
    	for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
    		for (int j = 0; j < FinalVar.SDK_N_TSECT; j++) {
    			stSect[i][j] = new SDK_3G_TIMESECT();
    		}
    	}
    }
}

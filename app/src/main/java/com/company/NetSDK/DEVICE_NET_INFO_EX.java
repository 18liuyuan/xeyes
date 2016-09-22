package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Corresponding to StartSearchDevices
 * \else
 * 6TS& StartSearchDevices =S?Z
 * \endif
 */
public class DEVICE_NET_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 4 for IPV4, 6 for IPV6
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public int                 iIPVersion;
	
	/**
	 * \if ENGLISH_LANG
	 * IP IPV4 like"192.168.0.1" IPV6 like "2008::1/64"
	 * \else
	 * IP IPV4PNHg"192.168.0.1" IPV6PNHg"2008::1/64"
	 * \endif
	 */
	public byte				szIP[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Tcp port
	 * \else
	 * tcp6K?Z
	 * \endif
	 */
	public int				    nPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Subnet mask(IPV6 do not have subnet mask)
	 * \else
	 * WSMxQZBk IPV6N^WSMxQZBk
	 * \endif
	 */
	public byte				szSubmask[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Gateway
	 * \else
	 * Mx9X
	 * \endif
	 */
	public byte				szGateway[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * MAC address
	 * \else
	 * MAC5XV7
	 * \endif
	 */
	public byte				szMac[] = new byte[FinalVar.SDK_MACADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device type
	 * \else
	 * Ih18@`PM
	 * \endif
	 */
	public byte				szDeviceType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device manufactory, see EM_IPC_TYPE
	 * \else
	 * D?1jIh185DIz2z3'IL,>_Le2N?<EM_IPC_TYPE@`	
	 * \endif
	 */
	public byte                byManuFactory;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-Standard definition 2-High definition
	 * \else
	 * 1-1jGe 2-8_Ge
	 * \endif
	 */
	public byte                byDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * Dhcp, true-open, false-close
	 * \else
	 * DhcpJ9D\W4L,, true-?*, false-9X
	 * \endif
	 */
	public boolean                bDhcpEn;
	
	/**
	 * \if ENGLISH_LANG
	 * ECC data 
	 * \else
	 * P#QiJ}>] M(9}Rl2=KQKw;X5w;qH!(TZP^8DIh18IPJ1;aSC4KPEO"=xPPP#Qi)
	 * \endif
	 */
	public byte                verifyData[] = new byte[88];
	
	/**
	 * \if ENGLISH_LANG
	 * Serial no
	 * \else
	 * 6KPrAP:E
	 * \endif
	 */
	public byte                szSerialNo[] = new byte[FinalVar.SDK_DEV_SERIALNO_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Soft version  
	 * \else
	 * Ih18Hm<~0f1>:E   
	 * \endif
	 */
	public byte                szDevSoftVersion[] = new byte[FinalVar.SDK_MAX_URL_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device detail type
	 * \else
	 * Ih18PM:E
	 * \endif
	 */
	public byte                szDetailType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * OEM type
	 * \else
	 * OEM?M;'@`PM
	 * \endif
	 */
	public byte                szVendor[] = new byte[FinalVar.SDK_MAX_STRING_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * Ih18C{3F
	 * \endif
	 */
	public byte                szDevName[] = new byte[FinalVar.SDK_MACHINE_NAME_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * User name for log in device(it need be filled when modify device ip)
	 * \else
	 * 5GB=Ih18SC;'C{#(TZP^8DIh18IPJ1PhR*LnP4#)
	 * \endif
	 */
	public byte                szUserName[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Pass word for log in device(it need be filled when modify device ip)
	 * \else
	 * 5GB=Ih18C\Bk#(TZP^8DIh18IPJ1PhR*LnP4#)
	 * \endif
	 */
	public byte                szPassWord[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP server port
	 * \else
	 * HTTP7~Nq6K?Z:E
	 * \endif
	 */
	public int					nHttpPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video input channel
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int                	wVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of remote video input
	 * \else
	 * T63LJSF5JdHkM(5@J}
	 * \endif
	 */
	public int                	wRemoteVideoInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of video output channel 
	 * \else
	 * JSF5Jd3vM(5@J}
	 * \endif
	 */
	public int                	wVideoOutputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm input
	 * \else
	 * 1(>/JdHkM(5@J}
	 * \endif
	 */
	public int                	wAlarmInputCh;
	
	/**
	 * \if ENGLISH_LANG
	 * Count of alarm output
	 * \else
	 * 1(>/Jd3vM(5@J}
	 * \endif
	 */
	public int                	wAlarmOutputCh;
}

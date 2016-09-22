package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_VEHICLE_SINGLE_WIFI_AP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 0:Not scan wifi (Manually added), 1: scanned wifi
	 * \else
	 * 0:7GI(Chwifi (JV6/Lm<S5D), 1I(Ch5=5Dwifi
	 * \endif
	 */
	public boolean        bIsScan;

	/**
	 * \if ENGLISH_LANG
	 * SSID
	 * \else
	 * SSID
	 * \endif
	 */
	public byte        szSSID[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Verify type
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \else
	 * P#Qi@`PM
	 * 0:OPEN 
	 * 1:RESTRICTE
	 * 2:WEP
	 * 3:WPA
	 * 4:WPA2
	 * 5:WPA-PSK
	 * 6:WPA2-PSK
	 * \endif
	 */
	public int         nSafeType;
	
	/**
	 * \if ENGLISH_LANG
	 * Encryption method
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(No verify)
	 * 5:AUTO
	 * 6:SHARED
	 * \else
	 * <SC\7=J=
	 * 0:OPEN
	 * 1:TKIP
	 * 2:WEP
	 * 3:AES
	 * 4:NONE(2;P#Qi)
	 * 5:AUTO
	 * 6:SHARED
	 * \endif
	 */
	public int        nEncryprion;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection key
	 * \else
	 * A,=SC\T?
	 * \endif
	 */
	public byte        szKey[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * AP site signal
	 * \else
	 * APU>5cPE:E
	 * \endif
	 */
	public int         nStrength;

	/**
	 * \if ENGLISH_LANG
	 * AP site maximum transmission rate, with units, read-only
	 * \else
	 * APU>5c5DWn4s4+JdKYBJ,4x5%N; V;6A
	 * \endif
	 */
	public int         nMaxBitRate;

	/**
	 * \if ENGLISH_LANG
	 * If success connect read-only
	 * \else
	 * JG7qA,=S3I9&V;6A
	 * \endif
	 */
	public int         nIsCnnted;

	/**
	 * \if ENGLISH_LANG
	 * If save read-only
	 * \else
	 * JG7qRQ>-1#4fV;6A
	 * \endif
	 */
	public int         nIsSaved;

	/**
	 * \if ENGLISH_LANG
	 * Priority,(1-32)
	 * \else
	 * SEOH<6,(1-32)
	 * \endif
	 */
	public int         nPriority;

	/**
	 * \if ENGLISH_LANG
	 * Host address
	 * \else
	 * Vw;z5XV7
	 * \endif
	 */
	public byte        szHostIP[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Host network mask
	 * \else
	 * Vw;zQZBk
	 * \endif
	 */
	public byte        szHostNetmask[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Host gateway
	 * \else
	 * Vw;zMx9X
	 * \endif
	 */
	public byte        szHostGateway[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Radio frequency, using channel logo
	 * \else
	 * N^O_F5BJ#,2ISCM(5@1jJ6
	 * \endif
	 */
	public int         nWifiFreq;

	/**
	 * \if ENGLISH_LANG
	 * 0:disable 1:enable(default value is 1)
	 * \else
	 * 0#:2;J9D\ 1#:J9D\(I(Ch5=5DdhcpD,HOJ9D\4r?*)
	 * \endif
	 */
	public int         nEnDHCP;

	/**
	 * \if ENGLISH_LANG
	 * Verify index of WEP,0:no support,1-4 is index
	 * \else
	 * WEPP#Qi@`PMOB5DC\T?KwR},0#:2;V'3VC\T?KwR} >0:C\T?KwR}V5#,76N'1-4
	 * \endif
	 */
	public byte        byKeyIndex;
}

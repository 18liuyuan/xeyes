package com.company.NetSDK;

import java.io.Serializable;

public class CFG_WLAN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                    szWlanName[] = new byte[FinalVar.CFG_COMMON_STRING_32];   // WlanC{3F, V;D\;qH!2;D\P^8D
	public boolean                    bEnable;                            // WIFIMx?(J9D\?*9X, TRUE4r?*, FALSE9X1U
    public byte                    szSSID[] = new byte[FinalVar.CFG_MAX_SSID_LEN];           // MxBgC{3F(SSID)
    public boolean                    bConnectEnable;                     // JV6/A,=S?*9X, TRUEJV6/A,=S, FALSEJV6/6O?*
    public boolean                    bLinkEnable;                        // WT6/A,=S?*9X, TRUE2;WT6/A,=S, FALSEWT6/A,=S, IPCN^RbRe
    public int                     nLinkMode;                          // A,=SD#J=, 0: auto, 1: adhoc, 2: Infrastructure
    public int                     nEncryption;                        // <SC\D#J=, 0: off, 1: on, 2: WEP-OPEN, 3: WEP-SHARED, 4: WPA-TKIP, 5: WPA-PSK-TKIP, 6: WPA2-TKIP, 7: WPA2-PSK-TKIP, 8: WPA-AES, 9: WPA-PSK-AES, 10: WPA2-AES, 11: WPA2-PSK-AES
																	    /* 6~4zbyAuthMode  , byEncrAlgr  SkH}4zS3Id9XO5
																	    AuthenticationHOV$7=J=  DataEncryptionJ}>]<SC\7=J=  Encryption<SC\D#J=
																	    OPEN                    NONE                        "On" 
																	    OPEN                    WEP                         "WEP-OPEN"
																	    SHARD                   WEP                         "WEP-SHARED"
																	    WPA                     TKIP                        "WPA-TKIP"
																	    WPA-PSK                 TKIP                        "WPA-PSK-TKIP"
																	    WPA2                    TKIP                        "WPA2-TKIP"
																	    WPA2-PSK                TKIP                        "WPA2-PSK-TKIP"
																	    WPA                     AES(CCMP)                   "WPA-AES"
																	    WPA-PSK                 AES(CCMP)                   "WPA-PSK-AES"
																	    WPA2                    AES(CCMP)                   "WPA2-AES"
																	    WPA2-PSK                AES(CCMP)                   "WPA2-PSK-AES"
																	    WPA                     TKIP+AES( mix Mode)         "WPA-TKIP";rU_"WPA-AES"
																	    WPA-PSK                 TKIP+AES( mix Mode)         "WPA-PSK-TKIP";rU_"WPA-PSK-AES"
																	    WPA2                    TKIP+AES( mix Mode)         "WPA2-TKIP";rU_"WPA2-AES"
																	    WPA2-PSK                TKIP+AES( mix Mode)         "WPA2-PSK-TKIP";rU_"WPA2-PSK-AES"
																	    */
    public int                     emAuthentication;            // HOV$7=J=, T]J1C;SC, EM_CFG_WIRELESS_AUTHENTICATION
    public int                     emDataEncryption;            // J}>]<SC\7=J=, T]J1C;SC, EM_CFG_WIRELESS_DATA_ENCRYPT
    public int                     nKeyType;                           // C\Bk@`PM, 0: Hex, 1: ASCII
    public int                     nKeyID;                             // CXT?KwR}, H!V50~3
    public byte                    szKeys[][] = new byte[4][32];                      // KDWiC\Bk
    public boolean                    bKeyFlag;                           // C\BkJG7qRQ>-IhVC
    public CFG_WLAN_EAP            stuEap = new CFG_WLAN_EAP();                             // EAP
    public CFG_WLAN_NETWORK        stuNetwork = new CFG_WLAN_NETWORK();                         // Network
}

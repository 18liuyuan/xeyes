package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * wireless device expended configuration
 * \else
 * N^O_Ih18@)U9EdVC
 * \endif
 */
public class SDKDEV_WLAN_DEVICE_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * server id
	 * \else
	 * 7~NqC{3F
	 * \endif
	 */
	public byte                szSSID[] = new byte[36];

	/**
	 * \if ENGLISH_LANG
	 * mac address
	 * \else
	 * mac5XV7
	 * \endif
	 */
	public byte                szMacAddr[] = new byte[18];

	/**
	 * \if ENGLISH_LANG
	 * connect state 0: not connect,1: connected
	 * \else
	 * JG7qA,=S3I9& 0:C;SP#,1: A,=S3I9&
	 * \endif
	 */
	public byte                byApConnected;

	/**
	 * \if ENGLISH_LANG
	 * connect mod 0:adhoc 1:Infrastructure;
	 * \else
	 * A,=SD#J= 0:adhoc 1:Infrastructure;
	 * \endif
	 */
	public byte                byLinkMode;

	/**
	 * \if ENGLISH_LANG
	 * rssi quality(dbm)
	 * \else
	 * PE:EG?6H(dbm)
	 * \endif
	 */
	public int                 nRSSIQuality;

	/**
	 * \if ENGLISH_LANG
	 * max transmit speed
	 * \else
	 * U>5c5DWn4s4+JdKYBJ
	 * \endif
	 */
	public int        unApMaxBitRate;

	/**
	 * \if ENGLISH_LANG
	 * attestation mod:0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(only use in Adhoc mode),
	 * 7-11 are mix mode,choose one of them can to be connected 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * \else
	 * HOV$D#J=0:OPEN;1:SHARED;2:WPA;3:WPA-PSK;4:WPA2;5:WPA2-PSK;
	 * 6:WPA-NONE(SCTZadhocMxBgD#J=),
	 * 7-11JG;l:OD#J=#,Q!TqFdVPHN:NR;VV6<?IRT=xPPA,=S 
	 * 7:WPA-PSK | WPA2-PSK; 8:WPA | WPA2; 9:WPA | WPA-PSK;
	 * 10:WPA2 | WPA2-PSK; 11:WPA | WPA-PSK |WPA2 |WPA2-PSK //12: UnKnown
	 * \endif
	 */
	public byte                byAuthMode;

	/**
	 * \if ENGLISH_LANG
	 * encrypt mod 0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES( mix Mode) 8: UnKnown
	 * \else
	 * <SC\D#J=0:off; 2:WEP64bit; 3:WEP128bit; 4:WEP; 5:TKIP; 6:AES(CCMP)
	 * 7: TKIP+AES(;l:OD#J=) 8: UnKnown
	 * \endif
	 */
	public byte                byEncrAlgr;

	/**
	 * \if ENGLISH_LANG
	 * link quality 0~100(%)
	 * \else
	 * A,=SG?6H 0~100(%)
	 * \endif
	 */
	public byte                byLinkQuality;
}

package com.company.NetSDK;

import java.io.Serializable;

public class SDKCTRL_CONNECT_WIFI_BYWPS_IN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * WPS connect type,0:virtual buttons; 1:(device)pin; 2:(wifi hot point)pin
	 * \else
	 * WPSA,=S@`PM,0:PiDb04E%7=J=; 1:(Ih186K)pinBk7=J=; 2:(wifiHH5c6K)pinBk7=J=
	 * \endif
	 */
	public int       	nType; 
	
	/**
	 * \if ENGLISH_LANG
	 * when SSID,nType is 1 or 2,availability,biggest support 32-bit
	 * \else
	 * SSID#,nTypeN*1;r2J1SPP'#,Wn4sV'3V32N;
	 * \endif
	 */
	public byte       	szSSID[] = new byte[FinalVar.SDK_MAX_SSID_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * APPIN, when nType = 2,availability,PIN is 8 digits,from the wife(hot point)
	 * \else
	 * APPINBk, nTypeN*2J1SPP'#,PINBkN*8N;J}WV#,Ub8vpinBkJG4SwifiHH5c6KDC5=5D
	 * \endif
	 */
	public byte       	szApPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * device pin,when nType = 1,availability.produced by the device when empty,not empty soecified by the user,need to increase in wifi
	 * \else
	 * Ih18pinBk,nTypeN*1J1SPP':N*?UJ1SIIh182zIz;2;N*?UJ1<41mJ>SISC;'Ih6(#,Wn4sV'3V8N;J}WV#,Ub8vpinBkR*TZWIFIHH5c6KTv<S
	 * \endif
	 */
	public byte      	szWLanPin[] = new byte[FinalVar.SDK_MAX_APPIN_LEN];
}

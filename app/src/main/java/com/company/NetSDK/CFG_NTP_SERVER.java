package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NTP server
 * \else
 * NTP 7~NqFw
 * \endif
 */
public class CFG_NTP_SERVER implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable switch 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * NTP IP address or network name of NTP Server
	 * \else
	 * NTP7~NqFw  IP5XV7;rMxBgC{
	 * \endif
	 */
	public byte[]				szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port number of NTP Server
	 * \else
	 * 6K?Z:E
	 * \endif
	 */
	public int					nPort;

}

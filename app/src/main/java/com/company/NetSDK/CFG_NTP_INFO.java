package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Time Synchronization Server Configuration
 * \else
 * J1<dM,2=7~NqFwEdVC
 * \endif
 */
public class CFG_NTP_INFO implements Serializable{
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
	
	/**
	 * \if ENGLISH_LANG
	 * Update cycle, in minutes.
	 * \else
	 * 8|PBV\FZ#,5%N;N*7VVS. 01mJ>2;P#J1
	 * \endif
	 */
	public int					nUpdatePeriod; 
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone
	 * \else
	 * J1Gx
	 * \endif
	 * @see J1Gx6(Re(TimeZone Type) EM_CFG_TIME_ZONE_TYPE
	 */
	public int					emTimeZoneType;
	
	/**
	 * \if ENGLISH_LANG
	 * Time zone description
	 * \else
	 * J1GxChJv
	 * \endif
	 */
	public byte[]				szTimeZoneDesc = new byte[FinalVar.MAX_NAME_LEN]; 
	
	/**
	 * \if ENGLISH_LANG
	 * The number of standby NTP servers
	 * \else
	 * J5<J18SCNTP7~NqFw8vJ}
	 * \endif
	 */
	public int                 nSandbyServerNum;   
	
	/**
	 * \if ENGLISH_LANG
	 * Standby NTP Servers
	 * \else
	 * 18Q!NTP7~NqFw5XV7
	 * \endif
	 */
    public CFG_NTP_SERVER[]      stuStandbyServer = new CFG_NTP_SERVER[FinalVar.MAX_NTP_SERVER];   
    
    public CFG_NTP_INFO() {
    	for (int i = 0; i < FinalVar.MAX_NTP_SERVER; ++i) {
    		stuStandbyServer[i] = new CFG_NTP_SERVER();
    	}
    }
}

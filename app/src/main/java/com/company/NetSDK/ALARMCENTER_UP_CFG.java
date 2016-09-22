package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The setup of alarm upload
 * \else
 * 1(>/IO4+5DEdVC
 * \endif
 */
public class ALARMCENTER_UP_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable upload
	 * \else
	 * IO4+J9D\
	 * \endif
	 */
	public byte                byEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center listening port 
	 * \else
	 * 1(>/VPPDUlL}6K?Z
	 * \endif
	 */
	public short                wHostPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm center IP
	 * \else
	 * 1(>/VPPDIP
	 * \endif
	 */
    public byte                sHostIPAddr[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
    
    /**
     * \if ENGLISH_LANG
     * Enable scheduled upload.Use it to upload IP or domain name to the centre.
     * \else
     * 6(J1IO4+J9D\#,?IRTSC@4OrVPPDIO4+IP;rSrC{5H
     * \endif
     */
    public int                 nByTimeEn;
    
    /**
     * \if ENGLISH_LANG
     * Set upload date 
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \else
     * IhVCIO4+HUFZ  
     * "Never = 0", "Everyday = 1", "Sunday = 2", 
     * "Monday = 3", Tuesday = 4", "Wednesday = 5",
     * "Thursday = 6", "Friday = 7", "Saturday = 8"
     * \endif
     */
    public int                 nUploadDay;
    
    /**
     * \if ENGLISH_LANG
     * Set upload time ,[0~23]o'clock
     * \else
     * IhVCIO4+J1<d ,[0~23]5c
     * \endif
     */
    public int                 nUploadHour;
}

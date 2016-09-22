package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 *  TV wall display unit
 * \else
 * 5gJSG=OTJ>5%T*
 * \endif
 */
public class SDK_MONITORWALL_OUTPUT implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * device ID, local time is""
	 * \else
	 * Ih18ID, 1>;zJ1N*""
	 * \endif
	 */
    public byte[]              szDeviceID = new byte[FinalVar.SDK_DEV_ID_LEN];         
    
    /**
     * \if ENGLISH_LANG
     * channel no.
     * \else
     * M(5@:E
     * \endif
     */
    public int                 nChannel;                          
    
    /**
     * \if ENGLISH_LANG
     * screen name 
     * \else
     * FAD;C{3F
     * \endif
     */
    public byte[]              szName = new byte[FinalVar.SDK_DEV_NAME_LEN];            
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device composite channel information 
 * \else
 * HZ:OFAM(5@PEO"    
 * \endif
 */
public class SDK_COMPOSITE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
    
    /**
	 * \if ENGLISH_LANG
	 * Monitor wall name
	 * \else
	 * 5gJSG=C{3F
	 * \endif
	 */
    public byte[]           szMonitorWallName = new byte[FinalVar.SDK_DEVICE_NAME_LEN];  
    
    /**
	 * \if ENGLISH_LANG
	 * Composite ID
	 * \else
	 * HZ:OFAID
	 * \endif
	 */
    public byte[]           szCompositeID = new byte[FinalVar.SDK_DEV_ID_LEN_EX]; 
    
    /**
	 * \if ENGLISH_LANG
	 * Virtual channel
	 * \else
	 * PiDbM(5@:E
	 * \endif
	 */
    public int              nVirtualChannel;                     

}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup list 
 * \else
 * 187]Ih18OjO8PEO"  
 * \endif
 */
public class SDKDEV_BACKUP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Device name
	 * \else
	 * Ih18C{
	 * \endif
	 */ 
    public byte[]             szName = new byte[32];  
	/**
	 * \if ENGLISH_LANG
	 * Backup device type
	 * \else
	 * 187]Ih185D=iVJ@`PM(C6>YV5<{SDKDEV_BACKUP_TYPE)
	 * \endif
	 */ 
    public byte               byType; 
	/**
	 * \if ENGLISH_LANG
	 * Interface type of backup device 
	 * \else
	 * 187]Ih185D=S?Z@`PM(C6>YV5<{SDKDEV_BACKUP_BUS)
	 * \endif
	 */
    public byte               byBus;    
    /**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * W\H]A?, RTkBytesN*5%N;
	 * \endif
	 */
    public int              nCapability;   
    /**
  	 * \if ENGLISH_LANG
  	 * Remain capability 
  	 * \else
  	 * J#S`H]A?,RTkBytesN*5%N;
  	 * \endif
  	 */
    public int              nRemain;                    
    /**
  	 * \if ENGLISH_LANG
  	 * Remote backup directory
  	 * \else
  	 * T63L187]5DD?B<
  	 * \endif
  	 */
    public byte[]          szDirectory = new byte[128];               
}

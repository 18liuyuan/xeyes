package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Backup device type
 * \else
 * 187]Ih18=iVJ@`PM
 * \endif
 */
public class SDKDEV_BACKUP_TYPE implements Serializable{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	 /**
  	 * \if ENGLISH_LANG
  	 * Private file system
  	 * \else
  	 * K=SPND<~O5M3
  	 * \endif
  	 */
    public static final int                 BT_DHFS = 0;    
    /**
  	 * \if ENGLISH_LANG
  	 * Mobile hard disk drive 
  	 * \else
  	 * RF6/S2EL
  	 * \endif
  	 */
   	public static final int                BT_DISK = 1;      
   	/**
  	 * \if ENGLISH_LANG
  	 * CD record 
  	 * \else
  	 * 9bEL?LB<
  	 * \endif
  	 */
    public static final int                BT_CDRW = 2;                                 
}

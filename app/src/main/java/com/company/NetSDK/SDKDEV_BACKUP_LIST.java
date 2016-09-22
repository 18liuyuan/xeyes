package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device backup list 
 * \else
 * 187]Ih18AP1m  
 * \endif
 */
public class SDKDEV_BACKUP_LIST implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup device number
	 * \else
	 * J5<J5D187]Ih18J}A?
	 * \endif
	 */ 
    public int                 nBackupDevNum;   
    
	/**
	 * \if ENGLISH_LANG
	 * Backup device name
	 * \else
	 * 187]Ih185DC{3F
	 * \endif
	 */ 
    public byte[][]   szBackupDevNames = new byte[FinalVar.SDK_MAX_BACKUPDEV_NUM][FinalVar.SDK_MAX_BACKUP_NAME]; 
}

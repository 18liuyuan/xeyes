package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * storage error
 * \else
 * 4f4"4mNs@`PM
 * \endif
 */
public class EM_STORAGE_ERROR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * no error
	 * \else
	 * N^
	 * \endif
	 */
	public static final int STORAGE_ERROR_NONE = 0;
	
 	/**
	 * \if ENGLISH_LANG
	 * patition error 
	 * \else
	 * 7VGx4mNs          
	 * \endif
	 */
	public static final int STORAGE_ERROR_PATITION = 1;
	
 	/**
	 * \if ENGLISH_LANG
	 * init system file error	
	 * \else
	 * 3uJ<;/ND<~O5M34mNs    
	 * \endif
	 */
	public static final int STORAGE_ERROR_INIT_FS = 2;
	
 	/**
	 * \if ENGLISH_LANG
	 * read data error
	 * \else
	 * 6AJ}>]J'0\
	 * \endif
	 */
	public static final int STORAGE_ERROR_READ_DATA = 3;
	
 	/**
	 * \if ENGLISH_LANG
	 * write data error
	 * \else
	 * P4J}>]J'0\
	 * \endif
	 */
	public static final int STORAGE_ERROR_WRITE_DATA = 4;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID error
	 * \else
	 * RAID4mNs
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_FAILED = 5;
	
 	/**
	 * \if ENGLISH_LANG
	 * RAID degranded 
	 * \else
	 * RAID=5<6
	 * \endif
	 */
	public static final int STORAGE_ERROR_RAID_DEGRADED = 6;
	
 	/**
	 * \if ENGLISH_LANG
	 * iSCSI error
	 * \else
	 * iSCSI4mNs
	 * \endif
	 */
	public static final int STORAGE_ERROR_ISCSI_FAILED = 7;
}

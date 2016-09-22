package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Position Group Information
 * \else
 * 4f4"WiPEO"
 * \endif
 */
public class CFG_STORAGEGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage Pool Name 
	 * \else
	 * 4f4"WiC{3F
	 * \endif
	 */
	public byte[]				szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Disks Buffer 
	 * \else
	 * No@m4EELPr:E;:3eGx
	 * \endif
	 */
	public int					nBufSize;
	
 	/**
	 * \if ENGLISH_LANG
	 * Buffer Length 
	 * \else
	 * ;:3eGxbyDisks5D3$6H
	 * \endif
	 */
	public byte[]				byDisks;
	
 	/**
	 * \if ENGLISH_LANG
	 * Disk Number 
	 * \else
	 * 4f4"WiVP5D4EELJ}
	 * \endif
	 */
	public int					nDiskNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group INdex (1~Maximum Number of Disks) 
	 * \else
	 * 4f4"WiPr:E(1~Wn4sS2ELJ})
	 * \endif
	 */
	public int					nGoupIndex;
	
	public CFG_STORAGEGROUP_INFO(int nBufSize) {
		this.nBufSize = nBufSize;
		this.byDisks = new byte[nBufSize];
	}
}
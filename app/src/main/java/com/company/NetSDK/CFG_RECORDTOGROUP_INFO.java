package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record-storage group corresponding info
 * \else
 * B<Oq-4f4"Wi 6TS&PEO"
 * \endif
 */
public class CFG_RECORDTOGROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel Id 
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int				nChannelID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\  
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage Group Name, Read-only 
	 * \else
	 * 4f4"WiC{3F, V;6A
	 * \endif
	 */
	public byte[]			szGroupName = new byte[FinalVar.MAX_STORAGEGROUPNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage GroupIndex(1~max group, 0 no group) 
	 * \else
	 * 4f4"WiPr:E(1~Wn4sELWi, 0Tr1mJ>N^6TS&ELWi)#,M(9}4K2NJ}SkCFG_STORAGE_GROUP_INFO9XA*
	 * \endif
	 */
	public int				nGroupIndex;
}

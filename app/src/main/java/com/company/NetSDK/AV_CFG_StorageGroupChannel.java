package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage Group Channel Related Structure
 * \else
 * 4f4"WiM(5@O`9XEdVC
 * \endif
 */
public class AV_CFG_StorageGroupChannel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Max Pictures Storage in Each Channel Folder, Cover If Surpass 
	 * \else
	 * C?8vM(5@ND<~<PM<F,4f4"IOO^, 3,9}>M828G
	 * \endif
	 */
	public int			nMaxPictures;
	
 	/**
	 * \if ENGLISH_LANG
	 * Channel Indicated By the String In the Naming Rule, %c Corresponding Content 
	 * \else
	 * M(5@TZC|C{9fTr@o5DWV7{4.1mJ>, %c6TS&5DDZH]
	 * \endif
	 */
	public byte[]		szPath = new byte[FinalVar.AV_CFG_Max_ChannelRule];
}

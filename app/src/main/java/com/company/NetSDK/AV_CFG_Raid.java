package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Raid Info Structure
 * \else
 * RaidPEO"
 * \endif
 */
public class AV_CFG_Raid implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Name 
	 * \else
	 * C{3F
	 * \endif
	 */
	public byte[]		szName = new byte[FinalVar.AV_CFG_Raid_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Level 
	 * \else
	 * 5H<6
	 * \endif
	 */
	public int			nLevel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Disk Member Count 
	 * \else
	 * 4EEL3IT1J}A?
	 * \endif
	 */
	public int			nMemberNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Disk Member 
	 * \else
	 * 4EEL3IT1
	 * \endif
	 */
	public byte[][]		szMembers = new byte[FinalVar.AV_CFG_Max_Rail_Member][FinalVar.AV_CFG_Max_Path];
}

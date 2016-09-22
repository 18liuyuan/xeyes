package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RAID state
 * \else
 * RAIDRl3#PEO"
 * \endif
 */
public class RAID_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Raid name
	 * \else
	 * RaidC{3F
	 * \endif
	 */
	public byte          szName[] = new byte[16];
	
 	/**
	 * \if ENGLISH_LANG
	 * type 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \else
	 * @`PM 1:Jbod     2:Raid0      3:Raid1     4:Raid5
	 * \endif
	 */
	public byte          byType;
	
 	/**
	 * \if ENGLISH_LANG
	 * status 0:unknown ,1:active,2:degraded,3:inactive,4:recovering
	 * \else
	 * W4L, 0:unknown #,1:active#,2:degraded#,3:inactive#,4:recovering
	 * \endif
	 */
	public byte          byStatus;
	
 	/**
	 * \if ENGLISH_LANG
	 * nMember number 
	 * \else
	 * nMemberJ}Wi5DSPP'J}>]8vJ}
	 * \endif
	 */
	public int           nCntMem;
	
 	/**
	 * \if ENGLISH_LANG
	 * 1,2,3,.
	 * \else
	 * 1,2,3,... Wi3I4EELM(5@,JG8vJ}Wi
	 * \endif
	 */
	public int           nMember[] = new int[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * capacity(G)
	 * \else
	 * H]A?,5%N;G
	 * \endif
	 */
	public int           nCapacity;
	
 	/**
	 * \if ENGLISH_LANG
	 * remain space(M)
	 * \else
	 * J#S`H]A?#,5%N;M
	 * \endif
	 */
	public int           nRemainSpace;
	
 	/**
	 * \if ENGLISH_LANG
	 * Tank 0:main,1:tank1,2:tank2 ...
	 * \else
	 * @)U99q 0:Vw;z#,1:@)U99q1#,2:@)U99q2#,!-!-
	 * \endif
	 */
	public int           nTank;                                
}

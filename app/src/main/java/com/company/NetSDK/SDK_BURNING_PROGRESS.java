package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Burner progress 
 * \else
 * ?LB<=x6H
 * \endif
 */
public class SDK_BURNING_PROGRESS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Burner status;0:ready to burn,1:burner typs is not correct. It does not match. 
	 * 2:there is no burner available,3:There is burning in process,4:Burner is not free(It is backup or buring or playback.) 
	 * \else
	 * ?LB<;zW4L,#;0#:?IRT?LB<#,1#:?LB<;z@`PM2;6T#,JGR;8v7G9bELIh18#,
	 * 2#:N4UR5=?LB<;z#,3#:SPFdK|9bELTZ?LB<#,4#:?LB<;z4&SZ7G?UOPW4L,#,<4TZ187]!"?LB<;r;X7EVP
	 * \endif
	 */
	public byte				bBurning;
													 
	/**
	 * \if ENGLISH_LANG
	 * CD type;0:private file system,1:Portable HDD or flash disk,2:CD
	 * \else
	 * ELF,@`PM#;0#:K=SPND<~O5M3#,1#:RF6/S2EL;rUEL#,2#:9bEL
	 * \endif
	 */
	public byte				bRomType;
	
	/**
	 * \if ENGLISH_LANG
	 * Operation type;0:free,1:backup,2:burning,3:playback from the cd 
	 * \else
	 * 2YWw@`PM#;0#:?UOP#,1#:U}TZ187]VP#,2#:U}TZ?LB<VP#,3#:U}TZ=xPP9bEL;X7E
	 * \endif
	 */
	public byte				bOperateType;
	
	/**
	 * \if ENGLISH_LANG
	 * Backup pr burning status:0:stop or end,1:start,2:error,3:full,4:initializing
	 * \else
	 * 187];r?LB<9}3LW4L,#;0-M#V9 1-?*J< 2-3v4m 3-Bz 4-=aJx 5-U}TZ3uJ<;/ 6-T]M# 7-5H4}8=<~
	 * \endif
	 */
	public byte				bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin time 
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME			stTimeStart = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Burning time(second)
	 * \else
	 * RQ?LB<J1<d(Ck)
	 * \endif
	 */
	public int				dwTimeElapse;
	
	/**
	 * \if ENGLISH_LANG
	 * Total space
	 * \else
	 * 9bELW\H]A?
	 * \endif
	 */
	public int				dwTotalSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Free space
	 * \else
	 * 9bELJ#S`H]A?
	 * \endif
	 */
	public int				dwRemainSpace;
	
	/**
	 * \if ENGLISH_LANG
	 * Burned capacity 
	 * \else
	 *RQ?LB<H]A?
	 * \endif
	 */
	public int				dwBurned;
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved
	 * \else
	 * 1#At
	 * \endif
	 */
	public int				dwStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * The burning channel mask 
	 * \else
	 * U}TZ?LB<5DM(5@QZBks
	 * \endif
	 */
	public int				wChannelMask;
}

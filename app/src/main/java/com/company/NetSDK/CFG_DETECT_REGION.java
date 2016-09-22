package com.company.NetSDK;

import java.io.Serializable;

public class CFG_DETECT_REGION implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Zone ID
	 * \else
	 * GxSrID
	 * \endif
	 */
	public int				     nRegionID;

	/**
	 * \if ENGLISH_LANG
	 * Motion window name
	 * \else
	 * 6/L,40?ZC{3F
	 * \endif
	 */
	public byte                 szRegionName[] = new byte[FinalVar.CFG_COMMON_STRING_64];

	/**
	 * \if ENGLISH_LANG
	 * Area threshold!j?value[0, 100]
	 * \else
	 * Cf;}7'V5#,H!V5[0, 100]
	 * \endif
	 */
	public int                  nThreshold;

	/**
	 * \if ENGLISH_LANG
	 * Sensitivity 1??6
	 * \else
	 * AiCt6H1!+6
	 * \endif
	 */
	public int					 nSenseLevel;

	/**
	 * \if ENGLISH_LANG
	 * Motion zone row
	 * \else
	 * 6/L,<l2bGxSr5DPPJ}
	 * \endif
	 */
	public int					 nMotionRow;

	/**
	 * \if ENGLISH_LANG
	 * Motion detection zone column
	 * \else
	 * 6/L,<l2bGxSr5DAPJ}
	 * \endif
	 */
	public int					 nMotionCol;

	/**
	 * \if ENGLISH_LANG
	 * Detection zone!j?max 32*32 blocks
	 * \else
	 * <l2bGxSr#,Wn6`32*32?iGxSr
	 * \endif
	 */
	public byte				 byRegion[][] = new byte[FinalVar.MAX_MOTION_ROW][FinalVar.MAX_MOTION_COL];
}

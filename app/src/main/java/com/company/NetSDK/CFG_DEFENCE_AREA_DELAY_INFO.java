package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 
 * \else
 * 7@GxQSJ1EdVC(6TS& CFG_CMD_DEFENCE_AREA_DELAY C|An)
 * \endif
 */
public class CFG_DEFENCE_AREA_DELAY_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * SP=xHkQSJ15D7@Gx@`PM#,3}7@Gx@`PMEM_CFG_DefenceAreaType_Entrance2Mb, 6<J9SC4K=xHkQSJ1
	 * \endif
	 */
	public int                 nEnterDelay1;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * V;SP7@Gx@`PMN*EM_CFG_DefenceAreaType_Entrance2, 2E;aJ9SC4K=xHkQSJ1
	 * \endif
	 */
	public int                 nEnterDelay2;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * KySPSPMK3vQSJ15D7@Gx, 6<J9SC4KMK3vQSJ1
	 * \endif
	 */
	public int                 nExitDelay;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Compensation Light
 * \else
 * 299b5FEdVC
 * \endif
 */
public class CFG_FLASH_LIGHT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean                bEnable;                        

	/**
	 * \if ENGLISH_LANG
	 * Brightness  0~100
	 * \else
	 * AA6H 0~100
	 * \endif
	 */
	public int                	  nBrightness;                    

	/**
	 * \if ENGLISH_LANG
	 * Compensation light working period
	 * \else
	 * 299b5F9$WwJ1<d6N
	 * \endif
	 */
	public CFG_TIME_SECTION		  stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT];
	
	public CFG_FLASH_LIGHT() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule Information
 * \else
 * J1<d1mPEO"
 * \endif
 */
public class CFG_TIME_SCHEDULE implements Serializable{
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * whether holiday config is enabled, default value is FALSE, DO NOT enable it unless you get TRUE after get config
	 * \else
	 * JG7qV'3V=Z<YHUEdVC#,D,HON*2;V'3V#,3}7G;qH!EdVC:s75;XN*TRUE#,2;R*J9D\<YHUEdVC
	 * \endif
	 */
    public boolean                bEnableHoliday;
    
    /**
     * \if ENGLISH_LANG
     * The First Dimension Before the 7 Elements Corresponding 7 Days a week?(:?Eighth Elements Corresponding Holiday Up to Six Time Periods Per Day
     * \else
     * 5ZR;N,G078vT*KX6TS&C?V\7Ll#,5Z88vT*KX6TS&=Z<YHU#,C?LlWn6`68vJ1<d6N
     * \endif
     */
	public CFG_TIME_SECTION[][]	  stuTimeSection = new CFG_TIME_SECTION[FinalVar.MAX_TIME_SCHEDULE_NUM][FinalVar.MAX_REC_TSECT]; 

	public CFG_TIME_SCHEDULE() {
		for(int i = 0 ; i < FinalVar.MAX_TIME_SCHEDULE_NUM; i ++) {
			for(int j = 0; j < FinalVar.MAX_REC_TSECT; j ++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
	}
}

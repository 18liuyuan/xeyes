package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record Configuration
 * \else
 * 6(J1B<OqEdVCPEO"
 * \endif
 */
public class CFG_RECORD_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID(from 0) 
	 * \else
	 * M(5@:E(0?*J<)
	 * \endif
	 */
	public int                 	nChannelID;					

	/**
	 * \if ENGLISH_LANG
	 * Time Section 
	 * \else
	 * J1<d1m
	 * \endif
	 */
	public CFG_TIME_SECTION		stuTimeSection[][] = new CFG_TIME_SECTION[FinalVar.WEEK_DAY_NUM][FinalVar.MAX_REC_TSECT]; 

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time#,(0~300) 0 means closed
	 * \else
	 * T$B<J1<d#,N*AcJ11mJ>9X1U(0~300)
	 * \endif
	 */
	public int					nPreRecTime;				

	/**
	 * \if ENGLISH_LANG
	 * Prerecord Time#,(0~300) 0 means closed 
	 * \else
	 * B<OqH_S`?*9X
	 * \endif
	 */
	public boolean				bRedundancyEn;				

	/**
	 * \if ENGLISH_LANG
	 * Stream Types;
	 * <pre>
	 * Value Stream Type 
	 * 0 Main Stream 
	 * 1 Auxiliary Stream 1 
	 * 2 Auxiliary Stream 2 
	 * 3 Auxiliary Stream 3 
	 * </pre>
	 * \else
	 * 0#-VwBkAw#,1#-8(BkAw1#,2#-8(BkAw2#,3#-8(BkAw3
	 * \endif
	 */
	public int					nStreamType;				

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read-Only 
	 * \else
	 * P-Ri0f1>:E, V;6A
	 * \endif
	 */
	public int					nProtocolVer;				

	/**
	 * \if ENGLISH_LANG
	 * as true, holiday config info#,bHolidayEn, only stuHolTimeSection valid;
	 * \else
	 * N*trueJ1SP<YHUEdVCPEO"#,bHolidayEn!"stuHolTimeSection2ESPP';
	 * \endif
	 */
	public boolean				abHolidaySchedule;          
	/**
	 * \if ENGLISH_LANG
	 * Holiday record enable TRUE: enable,FALSE:disable
	 * \else
	 * <YHUB<OqJ9D\TRUE:J9D\,FALSE:N4J9D\
	 * \endif
	 */
	public boolean              bHolidayEn;                 

	/**
	 * \if ENGLISH_LANG
	 * Holiday record schedule
	 * \else
	 * <YHUB<OqJ1<d1m
	 * \endif
	 */
	public CFG_TIME_SECTION    	stuHolTimeSection[] = new CFG_TIME_SECTION[FinalVar.MAX_REC_TSECT];          
	
	public CFG_RECORD_INFO() {
		for (int i = 0; i < FinalVar.WEEK_DAY_NUM; i++) {
			for (int j = 0; j < FinalVar.MAX_REC_TSECT; j++) {
				stuTimeSection[i][j] = new CFG_TIME_SECTION();
			}
		}
		
		for (int i = 0; i < FinalVar.MAX_REC_TSECT; i++) {
			stuHolTimeSection[i] = new CFG_TIME_SECTION();
		}
	}
}

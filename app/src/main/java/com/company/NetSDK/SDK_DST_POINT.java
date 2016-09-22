package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DST(Daylight Save Time) setup
 * \else
 * DST(ODAnJ1)EdVC
 * \endif
 */
public class SDK_DST_POINT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year[200 - 2037]
	 * \else
	 * Dj[200 - 2037]
	 * \endif
	 */
	public int                 nYear;
	
	/**
	 * \if ENGLISH_LANG
	 * Month[1 - 12]
	 * \else
	 * TB[1 - 12]
	 * \endif
	 */
	public int                 nMonth;
	
	/**
	 * \if ENGLISH_LANG
	 * Hour[0 - 23]
	 * \else
	 * P!J1 [0 - 23]
	 * \endif
	 */
	public int                 nHour;
	
	/**
	 * \if ENGLISH_LANG
	 * Minute [0 - 59]
	 * \else
	 * 7VVS [0 - 59]
	 * \endif
	 */
	public int                 nMinute;
	
	/**
	 * \if ENGLISH_LANG
	 * [-1 - 4]0:It means it adopts the date calculation method.
	 * 1:in week: the first week ,2:the second week,3:the third week,4: The fourth week ,-1: the last week  
	 * \else
	 * [-1 - 4]0:1mJ>J9SC04HUFZ<FKc5D7=7(
	 * 1: 04V\<FKc: 5ZR;V\,2: 5Z6~V\,3: 5ZH}V\,4: 5ZKDV\,-1: Wn:sR;V\
	 * \endif
	 */
	public int                 nWeekOrDay;
	
	/**
	 * \if ENGLISH_LANG
	 * week[0 - 6](nWeekOrDay:calculated in week )0: Sunday, 1:Monday , 2:Tuesday ,3: Wednesday,4:Thirsday ,5: Friday,6:Saturday
	 * \else
	 * V\[0 - 6](nWeekOrDay#:04V\<FKcJ1)0:PGFZHU, 1:PGFZR;, 2:PGFZ6~,3:PGFZH},4:PGFZKD,5:PGFZNe,6:PGFZAy
	 * \endif
	 */
	public int             iWeekDay;
	
	/**
	 * \if ENGLISH_LANG
	 * date[1 - 31] (nWeekOrDay: in date)
	 * \else
	 * HUFZ[1 - 31] (nWeekOrDay#:04HUFZ<FKc)
	 * \endif
	 */
	public int             iDay;
    
}

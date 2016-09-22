package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time period structure 
 * \else
 * J1<d6N=a99	
 * \endif
 */
public class SDK_TSECT implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Current record period . Bit means the four Enable functions. From the low bit to the high bit:Motion detection record, alarm record and general record, when Motion detection and alarm happened at the same time can record.
	 * \else
	 * 511mJ>B<OqJ1<d6NJ1#,04N;1mJ>KD8vJ9D\#,4S5MN;5=8_N;7V1p1mJ>6/<lB<Os!"1(>/B<Os!"FUM(B<Os!"6/<l:M1(>/M,J17"Iz2EB<Oq
	 * \endif
	 */
	public int     				bEnable;				
	public int					iBeginHour;
	public int					iBeginMin;
	public int					iBeginSec;
	public int					iEndHour;
	public int					iEndMin;
	public int					iEndSec;
}

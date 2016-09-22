package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Year
 * \else
 * Ih181#;nEdVC
 * \endif
 */
public class CFG_DEVICEKEEPALIVE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * ?*Ft1#;nJ9D\
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 1#;nJ1<d<d8t#,1XPkJG>=105DV5#,5%N;#:Ck
	 * \endif
	 */
	public int					nInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 1#;nJ'0\4NJ}#,1#;nJ'0\4NJ}5=4o8CV5HON*Ih186OO_
	 * \endif
	 */
	public int					nFailTimes;
	
	/**
	 * \if ENGLISH_LANG
	 * Year
	 * \else
	 * 5H4}MbIh<S5g:sFt6/:s<l2b1#;nPDLx#,5%N;#:Ck
	 * \endif
	 */
	public int					nWaitBootTime;
}

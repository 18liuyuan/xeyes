package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Time structure
 * \else
 * J1<d6N=a99 
 * \endif
 */
public class SDK_3G_TIMESECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Time period enable,1 shows this time period valid,0 shows invalid.
	 * \else
	 * J1<d6NJ9D\#,11mJ>8CJ1<d6NSPP'#,01mJ>8CJ1<d6NN^P'!#
	 * \endif
	 */
	public byte                bEnable; 
	public byte                bBeginHour;
	public byte                bBeginMin;
    public byte                bBeginSec;
    public byte                bEndHour;
    public byte                bEndMin;
    public byte                bEndSec;
}

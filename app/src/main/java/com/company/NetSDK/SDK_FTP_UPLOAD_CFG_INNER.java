package com.company.NetSDK;

import java.io.Serializable;


public class SDK_FTP_UPLOAD_CFG_INNER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable invalid
	 * \else
	 * 8CJ1<d6NDZ5D!0J9D\!1N^P'#,?I:vBT
	 * \endif
	 */
	public SDK_TSECT        struSect = new SDK_TSECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Motion Detect Record
	 * \else
	 * IO4+6/L,<l2bB<Os
	 * \endif
	 */
	public boolean            bMdEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Alarm Record
	 * \else
	 * IO4+Mb2?1(>/B<Os
	 * \endif
	 */
	public boolean            bAlarmEn;
	
	/**
	 * \if ENGLISH_LANG
	 * Upload Normal Record
	 * \else
	 * IO4+FUM(6(J1B<Oq
	 * \endif
	 */
	public boolean            bTimerEn;
}

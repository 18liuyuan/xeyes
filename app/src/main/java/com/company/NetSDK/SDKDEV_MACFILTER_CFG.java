package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * MAC filter configuration
 * \else
 * MAC9}BKEdVC=a99Le
 * \endif
 */
public class SDKDEV_MACFILTER_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public int                 dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * current list type,0:white list, 1:blacklist (The device can enable only one type of list) can only user one kind of device
	 * \else
	 * 51G0C{5%@`PM#:0#:0WC{5% 1#::ZC{5%#(Ih18V;D\J9R;VVC{5%IzP'#,;rU_JG0WC{5%;rU_JG:ZC{5%#)
	 * \endif
	 */
	public int                 dwType;

	/**
	 * \if ENGLISH_LANG
	 * black list Mac
	 * \else
	 * :ZC{5%Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuBannedMac = new MACFILTER_INFO();

	/**
	 * \if ENGLISH_LANG
	 * white list Mac
	 * \else
	 * 0WC{5%Mac
	 * \endif
	 */
	public MACFILTER_INFO        stuTrustMac = new MACFILTER_INFO();
}

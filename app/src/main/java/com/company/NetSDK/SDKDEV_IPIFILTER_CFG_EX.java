package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * IP Filtering extended configuration
 * \else
 * IP9}BKEdVC=a99Le@)U9
 * \endif
 */
public class SDKDEV_IPIFILTER_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public int                dwEnable;

	/**
	 * \if ENGLISH_LANG
	 * The current list type;0:White List 1:Blacklist(The device can enable only one type of list) can only user one kind of device
	 * \else
	 * 51G0C{5%@`PM#:0#:0WC{5% 1#::ZC{5%#(Ih18V;D\J9R;VVC{5%IzP'#,;rU_JG0WC{5%;rU_JG:ZC{5%#)
	 * \endif
	 */
	public int                dwType;

	/**
	 * \if ENGLISH_LANG
	 * Black list
	 * \else
	 * :ZC{5%
	 * \endif
	 */
	public IPIFILTER_INFO_EX    BannedIP = new IPIFILTER_INFO_EX();

	/**
	 * \if ENGLISH_LANG
	 * Trusted sites
	 * \else
	 * 0WC{5%
	 * \endif
	 */
	public IPIFILTER_INFO_EX    TrustIP = new IPIFILTER_INFO_EX();
}

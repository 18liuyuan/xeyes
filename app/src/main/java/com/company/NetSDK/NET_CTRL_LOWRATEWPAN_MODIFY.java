package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * modify device info
 * \else
 * P^8DN^O_Ih18PEO"
 * \endif
 */
public class NET_CTRL_LOWRATEWPAN_MODIFY implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Can only Modify the szName or bEnable of NET_CODEID_INFO.
	 * \else
	 * =vD\P^8D NET_CODEID_INFO VP5D szName :M  bEnable WV6N
	 * \endif
	 */
	public NET_CODEID_INFO stuCodeIDInfo = new NET_CODEID_INFO();    
}

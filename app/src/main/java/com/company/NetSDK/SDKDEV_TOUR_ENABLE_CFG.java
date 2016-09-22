package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * tour enable configuration
 * \else
 * BVQ2J9D\EdVC
 * \endif
 */
public class SDKDEV_TOUR_ENABLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * BVQ2J9D\
	 * \endif
	 */
	public boolean                bEnable; 
	
	/**
	 * \if ENGLISH_LANG
	 * is touring or not(read only). bStart=FALSE when tour is able but doesn't set
	 * \else
	 * JG7qU}TZBVQ2(V;6A). BVQ2J9D\4r?*5+C;SPEdVCBVQ2JdHkT4J1, bStart=FALSE
	 * \endif
	 */
	public boolean                bStart; 
}

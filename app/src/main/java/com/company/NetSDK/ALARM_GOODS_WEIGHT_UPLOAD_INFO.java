package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * goods weight uploa
 * \else
 * 35TX;uVXPEO"IO4+
 * \endif
 */
public class ALARM_GOODS_WEIGHT_UPLOAD_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * goods weight(kg)
	 * \else
	 * 51G0;uVX(kg)
	 * \endif
	 */
	public int        dwGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * self weight(kg)
	 * \else
	 * WTVX(kg)
	 * \endif
	 */
	public int        dwSelfWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * total weight(kg)
	 * \else
	 * W\VX(kg)
	 * \endif
	 */
	public int        dwTotalWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * standard weight(kg)
	 * \else
	 * :K6(;uVX(kg)
	 * \endif
	 */
	public int        dwStandardWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * weight scale	
	 * \else
	 * ;uVX1H@}    
	 * \endif
	 */
	public int        dwWeightScale;
}

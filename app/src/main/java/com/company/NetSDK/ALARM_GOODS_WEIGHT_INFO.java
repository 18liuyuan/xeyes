package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of good weight
 * \else
 * 35TX;uVX1(>/
 * \endif
 */
public class ALARM_GOODS_WEIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * 0-start, 1-stop
	 * \else
	 * 0-?*J<, 1-M#V9
	 * \endif
	 */
	public int          nAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * 0-greater than dwMaxGoodsWeight, 1-less than dwMinGoodsWeight, 2-the change greater than dwAlarmWeight
	 * \else
	 * 0-4sSZWn4s;uVX, 1-P!SZWnP!;uVX, 2-;uVX1d;/3,9}1(>/cPV5
	 * \endif
	 */
	public int          nAlarmType;
	
 	/**
	 * \if ENGLISH_LANG
	 * good weight(kg)
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
	
 	/**
	 * \if ENGLISH_LANG
	 * the max(kg)
	 * \else
	 * Wn4s;uVX(kg)
	 * \endif
	 */
	public int        dwMaxGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * the min(kg)
	 * \else
	 * WnP!;uVX(kg)
	 * \endif
	 */
	public int        dwMinGoodsWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * alarm of threshold(kg)
	 * \else
	 * 1(>/cPV5(kg)
	 * \endif
	 */
	public int        dwAlarmWeight;
	
 	/**
	 * \if ENGLISH_LANG
	 * whight change when gather(kg)
	 * \else
	 * 2I</J1<d<d8tDZ;uVX1d;/(kg)
	 * \endif
	 */
	public int          nWeightChange;
	
 	/**
	 * \if ENGLISH_LANG
	 * gather time(s)
	 * \else
	 * >2V92I</J1<d(s)
	 * \endif
	 */
	public int          nCheckTime;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * net flux abnormal
 * \else
 * MxBgAwA?Rl3#JB<~
 * \endif
 */
public class ALARM_NET_FLUX implements Serializable {
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
	public int                dwAction;
	
 	/**
	 * \if ENGLISH_LANG
	 * data flux,KB	
	 * \else
	 * 51G0J}>]AwA?, KB
	 * \endif
	 */
	public int                dwDataFlux;
	
 	/**
	 * \if ENGLISH_LANG
	 * time
	 * \else
	 * JB<~7"IzJ1<d
	 * \endif
	 */
	public NET_TIME             stuTime = new NET_TIME();
}

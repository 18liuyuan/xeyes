package com.company.NetSDK;

import java.io.Serializable;

public class EM_RADIOMETRY_PERIOD implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int EM_RADIOMETRY_PERIOD_UNKNOWN = 0;			// N4V*
	public static final int EM_RADIOMETRY_PERIOD_5  = 5;			// 57VVS<GB<1m#,D,HO
	public static final int EM_RADIOMETRY_PERIOD_10 = 10;           // 107VVS<GB<1m
	public static final int EM_RADIOMETRY_PERIOD_15 = 15;           // 157VVS<GB<1m
	public static final int EM_RADIOMETRY_PERIOD_30 = 30;           // 307VVS<GB<1m
}

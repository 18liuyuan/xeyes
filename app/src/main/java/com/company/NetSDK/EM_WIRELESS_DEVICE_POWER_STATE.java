package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Wireless device power state
 * \else
 * / N^O_Ih185gA?W4L,
 * \endif
 */
public class EM_WIRELESS_DEVICE_POWER_STATE implements Serializable{
	private static final long serialVersionUID = 1L; 
	
	/**
	 * \if ENGLISH_LANG
	 * Unknown type
	 * \else
	 * / N4V*
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Normal
	 * \else
	 * / 5gA?U}3#
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_NORMAL = 1;           
	
	/**
	 * \if ENGLISH_LANG
	 * Low
	 * \else
	 * / 5M5gA?
	 * \endif
	 */
	public static final int EM_WIRELESS_DEVICE_POWER_LOW = 2;    
}

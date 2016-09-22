package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CoilFault alarm event
 * \else
 * O_H& / 35<lFw1(>/
 * \endif
 */
public class ALARM_WINGDING_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * road number
	 * \else
	 * 355@:E
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * coil ID
	 * \else
	 * O_H&ID
	 * \endif
	 */
	public int                 nWindingID;
	
 	/**
	 * \if ENGLISH_LANG
	 * event happen time 
	 * \else
	 * 1(>/7"IzJ1<d
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device state,0 indicate fault recover,1 indicate fault happen
	 * \else
	 * Ih18W4L,#,01mJ>9JUO;V84#,11mJ>7"Iz9JUO
	 * \endif
	 */
	public int                 nState;
 	/**
	 * \if ENGLISH_LANG
	 * Channel of alarm
	 * \else
	 * 1(>/5DM(5@:E
	 * \endif
	 */
	public int                 dwChannel;
}

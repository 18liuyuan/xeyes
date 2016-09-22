package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Light CompensationDevice Fault Alarm
 * \else
 * 299bIh189JUO1(>/
 * \endif
 */
public class ALARM_EQUIPMENT_FILL_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Vehicle Lane No. 
	 * \else
	 * 355@:E
	 * \endif
	 */
	public int                 nDriveWayID;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Occuring Time 
	 * \else
	 * 1(>/7"IzJ1<d
	 * \endif
	 */
	public NET_TIME            stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Status#,0 Means Fault Recovery#,1 Means Fault Occurs 
	 * \else
	 * Ih18W4L,#,01mJ>9JUO;V84#,11mJ>7"Iz9JUO
	 * \endif
	 */
	public int                 nState;
	
 	/**
	 * \if ENGLISH_LANG
	 * Alarm Channel No. 
	 * \else
	 * 1(>/5DM(5@:E
	 * \endif
	 */
	public int                 dwChannel;
}

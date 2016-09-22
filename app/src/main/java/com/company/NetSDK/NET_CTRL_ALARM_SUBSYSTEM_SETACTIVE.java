package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm sub system activation setup parameter(corresponding SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET command)
 * \else
 * 1(>/WSO5M3<$;nIhVC2NJ}(6TS&SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SETC|An)
 * \endif
 */
public class NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * sub system no.
	 * \else
	 * WSO5M3:E
	 * \endif
	 */
	public int					nChannelId;
	
	/**
	 * \if ENGLISH_LANG
	 * sub system enable status ,TRUE means enable, FALSE means disable
	 * \else
	 * WSO5M3FtSCW4L,,TRUE 1mJ>FtSC,FALSE1mJ>2;FtSC
	 * \endif
	 */
	public boolean 				bActive; 
}

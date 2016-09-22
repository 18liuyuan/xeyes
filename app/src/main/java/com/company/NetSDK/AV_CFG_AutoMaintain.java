package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Auto Maintenance
 * \else
 * WT6/N,;$
 * \endif
 */
public class AV_CFG_AutoMaintain implements Serializable {
	
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Auto Reboot Date, -1 Never, 0~6 Sunday~Saturday, 7 Everyday
	 * \else
	 * WT6/VXFtHUFZ, -1S@2;, 0~6V\HU~V\Ay, 7C?Ll
	 * \endif
	 */
	public int			nAutoRebootDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Hour, 0~23 
	 * \else
	 * WT6/VXFtP!J1, 0~23
	 * \endif
	 */
	public int			nAutoRebootHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Reboot Minute, 0~59 
	 * \else
	 * WT6/VXFt7VVS, 0~59
	 * \endif
	 */
	public int			nAutoRebootMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Date 
	 * \else
	 * WT6/9X;zHUFZ
	 * \endif
	 */
	public int			nAutoShutdownDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Hour 
	 * \else
	 * WT6/9X;zP!J1
	 * \endif
	 */
	public int			nAutoShutdownHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * AUto Shutdown Minute 
	 * \else
	 * WT6/9X;z7VVS
	 * \endif
	 */
	public int			nAutoShutdownMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Date 
	 * \else
	 * WT6/Ft6/HUFZ
	 * \endif
	 */
	public int			nAutoStartupDay;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Hour 
	 * \else
	 * WT6/Ft6/P!J1
	 * \endif
	 */
	public int			nAutoStartupHour;
	
 	/**
	 * \if ENGLISH_LANG
	 * Auto Start Minute 
	 * \else
	 * WT6/Ft6/7VVS
	 * \endif
	 */
	public int			nAutoStartupMinute;
	
 	/**
	 * \if ENGLISH_LANG
	 * true means enable auto reboot#,false means disable auto reboot
	 * \else
	 * true1mJ>?*FtWT6/VXFt#,false1mJ>9X1UWT6/VXFt
	 * \endif
	 */
	public boolean		bAutoRebootEnable;
}

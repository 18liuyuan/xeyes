package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PowerControl's interface input param(monitor wall power control)
 * \else
 * PowerControl=S?ZJdHk2NJ}(5gJSG=5gT4?XVF)
 * \endif
 */
public class SDK_IN_WM_POWER_CTRL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Monitor wall ID
	 * \else
	 * 5gJSG=Pr:E
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Block ID, NULL/""- means all
	 * \else
	 * Gx?iID, NULL/""-KySPGx?i
	 * \endif
	 */
	public String				pszBlockID;
	
	/**
	 * \if ENGLISH_LANG
	 * TV ID, -1 means all
	 * \else
	 * OTJ>5%T*Pr:E, -11mJ>Gx?iVPKySPOTJ>5%T*
	 * \endif
	 */
	public int					nTVID;
	
	/**
	 * \if ENGLISH_LANG
	 * Power on or not
	 * \else
	 * JG7q4r?*5gT4
	 * \endif
	 */
	public boolean				bPowerOn;
}

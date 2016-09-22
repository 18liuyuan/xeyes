package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SaveMonitorWallCollection's interface input param(save monitor wall plans)
 * \else
 * SaveMonitorWallCollection=S?ZJdHk2NJ}(1#4f5gJSG=T$08)
 * \endif
 */
public class SDK_IN_WM_SAVE_COLLECTION implements Serializable {
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
	 * Name pf plan
	 * \else
	 * T$08C{3F
	 * \endif
	 */
	public String				pszName;
}

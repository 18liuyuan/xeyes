package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RenameMonitorWallCollection's interface input param(plan rename)
 * \else
 * RenameMonitorWallCollection=S?ZJdHk2NJ}(T$08VXC|C{)
 * \endif
 */
public class SDK_IN_WM_RENAME_COLLECTION implements Serializable {
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
	 * Old name
	 * \else
	 * T-C{3F
	 * \endif
	 */
	public String				pszOldName;
	
	/**
	 * \if ENGLISH_LANG
	 * New name
	 * \else
	 * PBC{3F
	 * \endif
	 */
	public String				pszNewName;
}

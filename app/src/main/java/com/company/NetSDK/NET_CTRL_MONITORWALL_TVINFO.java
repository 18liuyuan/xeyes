package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV Wall Display Information Control Parameters
 * \else
 * 5gJSG=OTJ>PEO"?XVF2NJ}
 * \endif
 */
public class NET_CTRL_MONITORWALL_TVINFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * TV Wall ID
	 * \else
	 * 5gJSG=ID
	 * \endif
	 */
	public int					nMonitorWallID;
	
	/**
	 * \if ENGLISH_LANG
	 * Display Decoding Channel Information
	 * \else
	 * OTJ>=bBkM(5@PEO"
	 * \endif
	 */
	public boolean				bDecodeChannel;
}

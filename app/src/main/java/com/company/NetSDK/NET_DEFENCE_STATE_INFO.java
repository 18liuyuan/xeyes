package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Zpne status info, INetSDK.QueryDevStatecorresponding to command SDK_DEVSTATE_DEFENCE_STATE
 * \else
 * 7@GxW4L,PEO", INetSDK.QueryDevState6TS&C|AnSDK_DEVSTATE_DEFENCE_STATE
 * \endif
 */
public class NET_DEFENCE_STATE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Input parameter
	 * \else
	 * JdHk2NJ}
	 * \endif
	 */
	public NET_IN_DEFENCE_STATE_INFO stuIn = new NET_IN_DEFENCE_STATE_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Output parameter
	 * \else
	 * Jd3v2NJ}
	 * \endif
	 */
	public NET_OUT_DEFENCE_STATE_INFO stuOut = new NET_OUT_DEFENCE_STATE_INFO();
}


package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * W%M<9&D\JtPT=a99Le
 * \else
 * Capture functional attributes structure
 * \endif
 */
public class SDK_SNAP_ATTR_EN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * M(5@8vJ}
	 * \endif
	 */
	public int					nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Capture properties 
	 * \else
	 * W%M<JtPT
	 * \endif
	 */
	public SDK_QUERY_SNAP_INFO  stuSnap[] = new SDK_QUERY_SNAP_INFO[FinalVar.SDK_MAX_CHANNUM];
	
	public SDK_SNAP_ATTR_EN() {
		for (int i = 0; i < FinalVar.SDK_MAX_CHANNUM; i++) {
			stuSnap[i] = new SDK_QUERY_SNAP_INFO();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitSourceEx  Port input parameter
 * \else
 * SetSplitSourceEx =S?Z5DJdHk2NJ}
 * \endif
 */
public class NET_IN_SET_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Video output control {@link com.company.NetSDK.EM_VIDEO_OUT_CTRL_TYPE EM_VIDEO_OUT_CTRL_TYPE}
	 * \else
	 * JSF5Jd3v?XVF7=J= {@link com.company.NetSDK.EM_VIDEO_OUT_CTRL_TYPE EM_VIDEO_OUT_CTRL_TYPE}
	 * \endif
	 */
	public int 					emCtrlType;
	
	/**
	 * \if ENGLISH_LANG
	 * Video output logic channel no., emCtrlType as EM_VIDEO_OUT_CTRL_CHANNEL is valid
	 * \else
	 * JSF5Jd3vB_<-M(5@:E, emCtrlTypeN*EM_VIDEO_OUT_CTRL_CHANNELJ1SPP'
	 * \endif
	 */
	public int						nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID, emCtrlType as EM_VIDEO_OUT_CTRL_COMPOSITE_ID is valid
	 * \else
	 * F4=SFAID, emCtrlTypeN*EM_VIDEO_OUT_CTRL_COMPOSITE_IDJ1SPP'
	 * \endif
	 */
	public String					pszCompositeID;
	
	/**
	 * \if ENGLISH_LANG
	 * Window no., -1 means current split mode all windows
	 * \else
	 * 40?Z:E, -11mJ>51G07V8nD#J=OB5DKySP40?Z
	 * \endif
	 */
	public int						nWindow;
	
	/**
	 * \if ENGLISH_LANG
	 * Video source info, When nWindow=-1, video source is a group, and quantity match window
	 * \else
	 * JSF5T4PEO", 51nWindow=-1J1, JSF5T4JG8vJ}Wi, GRJ}A?Sk40?ZJ}R;VB
	 * \endif
	 */
	public SDK_SPLIT_SOURCE			pstuSources[];
	
	/**
	 * \if ENGLISH_LANG
	 * Video source quantity
	 * \else
	 * JSF5T4J}A?
	 * \endif
	 */
	public int						nSourceCount;	 
	
	public NET_IN_SET_SPLIT_SOURCE(int nSourceCount) {
		this.nSourceCount = nSourceCount;
		pstuSources = new SDK_SPLIT_SOURCE[nSourceCount];
		for (int i = 0; i < nSourceCount; i++) {
			pstuSources[i] = new SDK_SPLIT_SOURCE();
		}
	}
}

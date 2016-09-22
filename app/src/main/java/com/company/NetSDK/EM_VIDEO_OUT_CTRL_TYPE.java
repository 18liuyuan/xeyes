package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video output control method
 * \else
 * JSF5Jd3v?XVF7=J=
 * \endif
 */
public class EM_VIDEO_OUT_CTRL_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Logic channel no. control method, for physical screen and splicing screen both valid
	 * \else
	 * B_<-M(5@:E?XVF7=J=, 6TNo@mFA:MF4=SFA6<SPP'
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_CHANNEL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Splicing screen ID control method,for splicing screen only
	 * \else
	 * F4=SFAID?XVF7=J=, V;6TF4=SFASPP'
	 * \endif
	 */
	public static final int     EM_VIDEO_OUT_CTRL_COMPOSITE_ID = 1;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * StartUploadFileBurned output parameter
 * \else
 * StartUploadFileBurned Jd3v2NJ}
 * \endif
 */
public class NET_OUT_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * "start"#:system is ready, may start to upload; "busy"#:system is busy, please try again later. "error"#:system is not writing, return error request failed
	 * \else
	 * "start"#:O5M3W<18>MPw,?IRT?*J<IO4+; "busy"#:O5M3C&,IT:sTZJT!#"error"#:O5M3N4TZ?LB<VP,75;X3v4m,GkGsJ'0\
	 * \endif
	 */
	public char                szState[] = new char[FinalVar.SDK_MAX_NAME_LEN];          
}

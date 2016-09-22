package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * local preview split parameter, INetSDK.ControlDevice(SDK_DEVICE_LOCALPREVIEW_SLIPT)
 * \else
 * ?XVFIh186K1>5XT$@@7V8n2NJ}, INetSDK.ControlDevice(SDK_DEVICE_LOCALPREVIEW_SLIPT)
 * \endif
 */
public class DEVICE_LOCALPREVIEW_SLIPT_PARAMETER implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * split mode
	 * \else
	 * 7V8nD#J=#,<{Ih186K1>5XT$@@V'3V5D7V8nD#J=
	 * \endif
	 */
	public int                 nSliptMode;
	
	/**
	 * \if ENGLISH_LANG
	 * split num, start with 1
	 * \else
	 * 51G0R*T$@@5DWS7V8n,4S1?*J<
	 * \endif
	 */
	public int                 nSubSliptNum;
}

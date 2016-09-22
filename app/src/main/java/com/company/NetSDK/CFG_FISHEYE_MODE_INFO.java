package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye mode window location info
 * \else
 * D#?iJ}
 * \endif
 */
public class CFG_FISHEYE_MODE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * mode type, see CFG_CALIBRATE_MODE
	 * \else
	 * D#J=@`PM#,Oj<{ CFG_CALIBRATE_MODE
	 * \endif
	 */
	public int                nModeType;
	
	/**
	 * \if ENGLISH_LANG
	 * current mode window number
	 * \else
	 * 51G0D#J=OB5D40?ZJ}
	 * \endif
	 */
	public int                nWindowNum;
	
	/**
	 * \if ENGLISH_LANG
	 * see window info 
	 * \else
	 * >_Le40?ZPEO"
	 * \endif
	 */
	public CFG_FISHEYE_WINDOW_INFO stuWindwos[] = new CFG_FISHEYE_WINDOW_INFO[FinalVar.CFG_MAX_FISHEYE_WINDOW_NUM];
	
	public CFG_FISHEYE_MODE_INFO() {
		for (int i = 0; i < FinalVar.CFG_MAX_FISHEYE_WINDOW_NUM; i++) {
			stuWindwos[i] = new CFG_FISHEYE_WINDOW_INFO();
		}
	}
}

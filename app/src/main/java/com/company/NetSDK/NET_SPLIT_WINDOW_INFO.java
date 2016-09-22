package com.company.NetSDK;

import java.io.Serializable;

public class NET_SPLIT_WINDOW_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public int                 nWindowID;                      // 40?Z:E
	public int                 nZOrder;                        // Z4NPr
	public byte[]              szControlID = new byte[FinalVar.SDK_DEV_ID_LEN];     // ?XVF1`:E

}

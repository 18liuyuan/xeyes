package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_SNAP_PIC_TO_FILE_PARAM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte      szPicBuf[];               // M<F,DZH],SC;'7VEdDZ4f
	public int       dwPicBufLen;            // M<F,DZH]DZ4f4sP!, 5%N;:WV=Z
	public int       dwPicBufRetLen;         // 75;X5DM<F,4sP!, 5%N;:WV=Z
	
	public NET_OUT_SNAP_PIC_TO_FILE_PARAM(int nBufMax) {
		dwPicBufLen = nBufMax;
		szPicBuf = new byte[dwPicBufLen];
	}
}

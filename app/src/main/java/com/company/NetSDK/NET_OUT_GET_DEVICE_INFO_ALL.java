package com.company.NetSDK;

import java.io.Serializable;

public class NET_OUT_GET_DEVICE_INFO_ALL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                         nDevMax;        // Ih18PEO"5DWn4s8vJ}, V8CwpstuInfoDZ4f?U<d
	public int                         nDevNum;        // J5<J75;X5DIh18PEO"5D8vJ}
	public SDK_REMOTE_DEVICE            pstuInfo[];       // Ih18PEO"V8Uk#,8C=a99LeDZ2?3IT1 dwSize PhSC;'83V5
	
	public NET_OUT_GET_DEVICE_INFO_ALL(int nDevMax) {
		this.nDevMax = nDevMax;
		pstuInfo = new SDK_REMOTE_DEVICE[this.nDevMax];
		for (int i = 0; i < this.nDevMax; i++) {
			pstuInfo[i] = new SDK_REMOTE_DEVICE();
		}
	}
}

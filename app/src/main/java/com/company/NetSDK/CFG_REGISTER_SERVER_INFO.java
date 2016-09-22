package com.company.NetSDK;

import java.io.Serializable;

public class CFG_REGISTER_SERVER_INFO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public boolean             bEnable;                            						// Vw6/W"2aJ9D\
	public byte                szDeviceID[] = new byte[FinalVar.MAX_ADDRESS_LEN];       // Ih18ID
	public int                 nServersNum;                        						// 7~NqFw8vJ}
	public CFG_SERVER_INFO     stuServers[] = new CFG_SERVER_INFO[FinalVar.MAX_SERVER_NUM];  // 7~NqFwJ}Wi       						// 7~NqFwJ}Wi
	
	public CFG_REGISTER_SERVER_INFO() {
		for(int i = 0; i < FinalVar.MAX_SERVER_NUM; ++i) {
			stuServers[i] = new CFG_SERVER_INFO();
		}
	}
}

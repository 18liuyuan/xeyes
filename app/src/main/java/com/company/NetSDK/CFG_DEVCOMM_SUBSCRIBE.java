package com.company.NetSDK;

public class CFG_DEVCOMM_SUBSCRIBE {
	public int                             nSubscribeInfoNum;                  // 4.?ZJ}>]EdVC8vJ}
	public CFG_DEVCOMM_SUBSCRIBE_INFO      stuSubscribeInfo[] = new CFG_DEVCOMM_SUBSCRIBE_INFO[FinalVar.MAX_DEVCOMM_NUM]; // 6)TD4.?ZJ}>]EdVC#,JGR;8vJ}Wi#,C?8vT*KX6TS&R;8v4.?Z
	
	public CFG_DEVCOMM_SUBSCRIBE() {
		for (int i = 0; i < FinalVar.MAX_DEVCOMM_NUM; i++) {
			stuSubscribeInfo[i] = new CFG_DEVCOMM_SUBSCRIBE_INFO();
		}
	}
}
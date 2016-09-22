package com.company.NetSDK;

import java.io.Serializable;

public class NET_IN_BUS_CONFIRM_EVENT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                         nEvent;         // 4}H7HOJB<~5DSPP'J}D?
	public NET_EVENT_INFO_TO_CONFIRM   stuEventInfo[] = new NET_EVENT_INFO_TO_CONFIRM[FinalVar.MAX_EVENT_TO_CONFIRM_NUM];// 4}H7HOJB<~5DPEO"
	
	public NET_IN_BUS_CONFIRM_EVENT() {
		for (int i = 0; i < FinalVar.MAX_EVENT_TO_CONFIRM_NUM; i++) {
			stuEventInfo[i] = new NET_EVENT_INFO_TO_CONFIRM();
		}
	}
}

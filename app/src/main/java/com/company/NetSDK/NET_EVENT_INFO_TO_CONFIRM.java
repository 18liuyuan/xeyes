package com.company.NetSDK;

import java.io.Serializable;

public class NET_EVENT_INFO_TO_CONFIRM implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               dwEventType;            // JB<~@`PM, 6TS&CLIENT_AttachBusState=S?Z5DJB<~@`PM
	public NET_TIME            stuTime = new NET_TIME();                // JB<~J1<d, UTCVF
    public int                lTime;                  // JB<~J1<d, UTCVF, 5%N;Ck
}

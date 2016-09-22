package com.company.NetSDK;

import java.io.Serializable;

public class ALARM_BUS_PAD_SHUTDOWN_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int                nDelayTime;                      // 9X;zQSJ1J1<d#,5%N;#:Ck
	public boolean               bConfirm;                        // JG7qPhR*H7HO
	public NET_TIME_EX        stuUtcTime = new NET_TIME_EX();                      // JB<~7"Iz5DJ1<d
    public int              dwUtc;                           // JB<~7"Iz5DJ1<d, SCSZH7HO
}

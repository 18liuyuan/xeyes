package com.company.NetSDK;

import java.io.Serializable;

public class NET_PAD_CONNECT_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public final static int NET_PAD_CONNECT_STATE_UNKNOWN = 0;       // N4V*
	public final static int NET_PAD_CONNECT_STATE_UNCONNECTED = 1;   // N4A,=S
	public final static int NET_PAD_CONNECT_STATE_CONNECTED = 2;     // A,=S
}

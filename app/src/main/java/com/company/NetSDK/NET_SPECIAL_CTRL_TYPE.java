package com.company.NetSDK;

import java.io.Serializable;

public class NET_SPECIAL_CTRL_TYPE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int NET_SPECIAL_CTRL_SHUTDOWN_PAD = 0;   // 9X1UPADC|An, pInBuf6TS&@`PMNET_IN_SHUTDOWN_PAD*, pOutBuf6TS&@`PMNET_OUT_SHUTDOWN_PAD*

	public static final int NET_SPECIAL_CTRL_REBOOT_PAD = 1;   // VXFtPADC|An, pInBuf6TS&@`PMNET_IN_REBOOT_PAD*, pOutBuf6TS&@`PMNET_OUT_REBOOT_PAD*
}

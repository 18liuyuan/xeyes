package com.company.NetSDK;

import java.io.Serializable;

public class CFG_WLAN_NETWORK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                    szIPAddress[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];        // IP
	public byte                    szSubnetMask[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];       // WSMxQZBk
	public byte                    szDefaultGateway[] = new byte[FinalVar.AV_CFG_IP_Address_Len_EX];   // Mx9X
	public boolean                    bDhcpEnable;                              // JG7q?*FtDHCP
    public byte                    szDnsServers[][] = new byte[2][FinalVar.AV_CFG_IP_Address_Len_EX];    // DNS7~NqFw
}

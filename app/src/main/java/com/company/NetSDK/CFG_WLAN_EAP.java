package com.company.NetSDK;

import java.io.Serializable;

public class CFG_WLAN_EAP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int        emMethod;                           // EAP7=7(, EM_CFG_EAP_METHOD
	public int        emAuthType;                         // EAPIm7]QiV$7=7(, EM_CFG_EAP_AUTH_TYPE
	public byte                    szIdentity[] = new byte[FinalVar.MAX_USERNAME_LEN];       // Im7]
	public byte                    szAnonymousID[] = new byte[FinalVar.MAX_USERNAME_LEN];    // DdC{Im7]
	public byte                    szPassword[] = new byte[FinalVar.MAX_PASSWORD_LEN];       // C\Bk
	public byte                    szCaCert[] = new byte[512];                      // CAV$Ji
	public byte                    szUserCert[] = new byte[512];                    // SC;'V$Ji 
}

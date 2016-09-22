package com.company.NetSDK;

import java.io.Serializable;

public class NET_MOBILE_PUSH_NOTIFY_CFG_DEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                            szRegisterID[] = new byte[FinalVar.MAX_REGISTER_ID_LEN];         // JV;zOrAppple/ Android7~NqFwW"2a75;X5D#,C?4N2;M,
	public byte                            szAppID[] = new byte[FinalVar.MAX_APP_ID_LEN];                   // JV;zC??*R;8v?M;'6K#,;a2zIzR;8v
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * iscsi Direct Deposit#,Source Data Server Configuration Port Structure
 * \else
 * iscsiV14f#,T*J}>]7~NqFwEdVC=S?Z
 * \endif
 */
public class CFG_METADATA_SERVER implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable Swch 
	 * \else
	 * J9D\?*9X
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * IP Adrress Or Nerwork Domian Name 
	 * \else
	 * IP5XV7;rMxBgC{
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.MAX_ADDRESS_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port No.	
	 * \else
	 * 6K?Z:E
	 * \endif
	 */
	public int				dwPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * UJ;'C{  
	 * \endif
	 */
	public byte[]			szUserName = new byte[FinalVar.MAX_USERNAME_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.MAX_PASSWORD_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * distributed ID in a unified way For the Device Using Source Data Server#,Device Marked By the ID  
	 * \else
	 * N*J9SCT*J}>]7~NqFw5DIh18M3R;7VEd5DID#,Ih18RT4KID1jJ6WT<:
	 * \endif
	 */
	public byte[]			szDeviceID = new byte[FinalVar.MAX_REMOTEDEVICENAME_LEN];
}


package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVS config
 * \else
 * MxBg4f4"7~NqFwEdVC
 * \endif
 */
public class CFG_NAS_INFO_EX implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * 0, 1, based on capacity, read-only
	 * \else
	 * 0, 1, SID\A&</H76(, V;6A
	 * \endif
	 */
	public int				nVersion;
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 0 valid, for single server only
	 * \else
	 * nVersion == 0J1SPP', =vV'3V5%7~NqFw
	 * \endif
	 */
	public CFG_NAS_INFO		stuNasOld = new CFG_NAS_INFO();
	
 	/**
	 * \if ENGLISH_LANG
	 * nVersion == 1 valid, for multiple servers
	 * \else
	 * nVersion == 1J1SPP', V'3V6`8v7~NqFw
	 * \endif
	 */
	public CFG_NAS_GROUP_INFO stuNasGroup = new CFG_NAS_GROUP_INFO();
}

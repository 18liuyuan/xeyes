package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * NVS config, including multiple servers
 * \else
 * MxBg4f4"7~NqFwEdVC, 0|:,6`8v7~NqFw
 * \endif
 */
public class CFG_NAS_GROUP_INFO implements Serializable {
 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Storage server quantity
	 * \else
	 * 4f4"7~NqFwJ}A?
	 * \endif
	 */
	public int				nNasNum;
	
 	/**
	 * \if ENGLISH_LANG
	 * Storage server group
	 * \else
	 * 4f4"7~NqFwJ}Wi	
	 * \endif
	 */
	public CFG_NAS_INFO_NEW[]			stuNasInfo = new CFG_NAS_INFO_NEW[FinalVar.MAX_NAS_NUM];
	
	public CFG_NAS_GROUP_INFO() {
		for (int i = 0; i < FinalVar.MAX_NAS_NUM; ++i) {
			this.stuNasInfo[i] = new CFG_NAS_INFO_NEW();
		}
	}
}

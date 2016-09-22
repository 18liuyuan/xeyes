package com.company.NetSDK;

import java.io.Serializable;

public class CFG_SOURCE_FILE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public byte                szFilePath[] = new byte[FinalVar.MAX_PATH];               // ND<~B7>6
	public int                 emFileType;                        // ND<~@`PM#,Oj<{ CFG_SOURCE_FILE_TYPE
}

package com.company.NetSDK;

import java.io.Serializable;

public class SDK_PIC_INFO_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file size,unit:byte
	 * \else
	 * ND<~4sP!, 5%N;:WV=Z
	 * \endif
	 */
	public int                dwFileLenth; 
	
	/**
	 * \if ENGLISH_LANG
	 * file path
	 * \else
	 * ND<~B7>6      
	 * \endif
	 */
	public byte                 szFilePath[] = new byte[FinalVar.MAX_PATH];     
}

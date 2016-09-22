package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Infrared panel 
 * \else
 * :lMbCf0e
 * \endif
 */
public class CFG_INFRARED_BOARD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Panel number, unique identifier
	 * \else
	 * Cf0e1`:E, N(R;1jJ>
	 * \endif
	 */
	public int    nID;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Panel control peripherals name, user-defined
	 * \else
	 * Cf0e?XVFMbIhC{3F, SC;'WT6(Re
	 * \endif
	 */
	public byte 	szName[] = new byte[FinalVar.CFG_COMMON_STRING_64];
	
	/**
	 * \if ENGLISH_LANG
	 * Panel type, 0 to DVD, TV 
	 * \else
	 * Cf0e@`PM, 0-DVD, 1-TV
	 * \endif
	 */
	public int		nCategory;
	
	
	/**
	 * \if ENGLISH_LANG
	 * Infrared communication port 
	 * \else
	 * :lMbM(Q66K?Z
	 * \endif
	 */
	public int		nCommPort;
	
	
	/**
	 * \if ENGLISH_LANG
	 * The associated template ID 
	 * \else
	 * 9XA*5DD#0eID
	 * \endif
	 */
	
	public int		nTemplateID;
	
		
}
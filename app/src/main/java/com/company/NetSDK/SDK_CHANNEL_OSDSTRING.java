package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Data structure of channel video title overlay 
 * \else
 * M(5@;-CfWVD;5~<S5DJ}>]=a99
 * \endif
 */
public class SDK_CHANNEL_OSDSTRING implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean				bEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Character position in each line. The value ranges from 1 to 9.Corresponding to the small keyboard. \n 
	 * 7upper left 	8upper		9upper right  \n 
	 * 4left			5middle 	6right  \n 
	 * 1down left		2down	    3down right  \n 
	 * \else
	 * 8wPPWV7{5DN;VC!!SC1-9U{J}1mJ>#,SkP!<|ELN;VC6TS& \n 
	 * 7WsIO	8IO		9SRIO \n 
	 * 4Ws		5VP		6SR \n 
	 * 1WsOB	2OB		3SROB \n 
	 * \endif
	 */
	public int					dwPosition[] = new int[FinalVar.MAX_STRING_LINE_LEN];	 
	
	/**
	 * \if ENGLISH_LANG
	 * Max 6 lines. Each line max 20 bytes.
	 * \else
	 * Wn6`AyPPWV7{#,C?PPWn6`208vWV=Z
	 * \endif
	 */
	public char				szStrings[][] = new char[FinalVar.MAX_STRING_LINE_LEN][FinalVar.MAX_PER_STRING_LEN];	 
}

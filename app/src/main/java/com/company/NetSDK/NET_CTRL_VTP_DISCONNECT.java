package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Hang up video phone(Corresponding SDK_CTRL_VTP_DISCONNECT)  
 * \else
 * 9R6OJSF55g;0(6TS& SDK_CTRL_VTP_DISCONNECT C|An)
 * \endif
 */
public class NET_CTRL_VTP_DISCONNECT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The device ID to be forward , NULL means don!/t forward
	 * \else
	 * W*7"D?1jIh18ID,N*NULL1mJ>2;W*7"
	 * \endif
	 */
	public String                   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * Call type, EM_NET_VTP_CALL_TYPE
	 * \else
	 * :t=P@`PM, EM_NET_VTP_CALL_TYPE
	 * \endif
	 */
	public int                      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * Intercom unique identifier}NET_CTRL_VTP_DISCONNECT;
	 * \else
	 * 6T=2N(R;1jJ6
	 * \endif
	 */
	public byte                     szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
}

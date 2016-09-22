package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video phone status informations
 * \else
 * JSF55g;0W4L,PEO"
 * \endif
 */
public class NET_VTP_CALL_STATE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Call number
	 * \else
	 * :t=P:EBk
	 * \endif
	 */
    public byte                        szNumber[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Intercom unique identifier
     * \else
     * 6T=2N(R;1jJ6
     * \endif
     */
    public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * Call status
     * \else
     * :t=PW4L,, EM_NET_VTP_CALL_STATE_TYPE
     * \endif
     */
    public int                         emCallState; 
}

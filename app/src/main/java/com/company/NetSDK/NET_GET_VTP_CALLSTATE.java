package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Obtain the calling state of video phone (Corresponding to SDK_DEVSTATE_VTP_CALLSTATE)
 * \else
 * ;qH!JSF55g;0:t=PW4L, (6TS& SDK_DEVSTATE_VTP_CALLSTATE)
 * \endif
 */
public class NET_GET_VTP_CALLSTATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the call type to be queried, input parameter
	 * \else
	 * 4}2iQ/5D:t=P@`PM, EM_NET_VTP_CALL_TYPE, JdHk2NJ}
	 * \endif
	 */
	public int      emCallType; 
	
	/**
	 * \if ENGLISH_LANG
	 * the unique identification to be queried, input parameter
	 * \else
	 * 4}2iQ/5D6T=2N(R;1jJ6, JdHk2NJ}
	 * \endif
	 */
	public byte                        szCallID[] = new byte[FinalVar.SDK_COMMON_STRING_128]; 
	
	/**
	 * \if ENGLISH_LANG
	 * the device to be transmit,  ID= NULL equals to no transmitting,  input parameter
	 * \else
	 * 4}W*7"5DIh18ID, N*NULL1mJ>2;W*7", JdHk2NJ}
	 * \endif
	 */
	public String   szTargetID; 
	
	/**
	 * \if ENGLISH_LANG
	 * State of calling
	 * \else
	 * :t=PW4L,, EM_NET_VTP_CALL_STATE_TYPE, Jd3v2NJ}
	 * \endif
	 */
	public int      emCallState; 
}

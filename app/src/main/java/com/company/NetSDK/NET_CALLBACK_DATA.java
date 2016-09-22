package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Callback data(Asynchronous interface)
 * \else
 * ;X5wJ}>](Rl2==S?Z)
 * \endif
 */
public class NET_CALLBACK_DATA implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Result code;0:Success
	 * \else
	 * 75;XBk#;0#:3I9&
	 * \endif
	 */
	public int					nResultCode;
	
	/**
	 * \if ENGLISH_LANG
	 * Receive data,buffer is opened by the user,from the interface parameters
	 * \else
	 * =SJUJ}>]
	 * \endif
	 */
	public char[]				pBuf;
	
	/**
	 * \if ENGLISH_LANG
	 * The length of receive data
	 * \else
	 * =SJU3$6H
	 * \endif
	 */
	public int					nRetLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Operating handle
	 * \else
	 * 2YWw>d1z
	 * \endif
	 */
	public long				lOperateHandle;
	
	/**
	 * \if ENGLISH_LANG
	 * User parameters
	 * \else
	 * 2YWw6TS&SC;'2NJ}
	 * \endif
	 */
	public long				userdata;
}

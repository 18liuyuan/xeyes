package com.company.NetSDK;

import java.io.Serializable;
/**
 * \if ENGLISH_LANG
 * input parameter about setting mode of course record 
 * \else
 * IhVCB<OqD#J=Hk2N
 * \endif
 */
public class NET_IN_SET_COURSE_RECORD_MODE implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * record mode
	 * \else
	 * B<OqD#J=
	 * \endif
	 * @see NET_EM_RECORD_MODE
	 */
	public int	emRecordMode;                   
}

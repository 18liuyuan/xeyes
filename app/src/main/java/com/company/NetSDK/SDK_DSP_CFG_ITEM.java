package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * DSP capacity search#,when DSP capacity algorithm mark is 2, use.
 * \else
 * DSPD\A&2iQ/#,51DSPD\A&Kc7(1jJ6N*2J1J9SC!#
 * \endif
 */
public class SDK_DSP_CFG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 *  Use resolution enumeration value(CAPTURE_SIZE) as index, main stream resolution corresponding max frame rate, if not support this resolution, then valid is 0.
	 * \else
	 * RT7V1fBJC6>YV5(CAPTURE_SIZE)N*KwR},VwBkAw7V1fBJ6TS&V'3V5DWn4sV!BJ,Hg9{2;V'3V4K7V1fBJ,TrV5N*0.
	 * \endif
	 */
	public byte		bMainFrame[] = new byte[32];			

	/**
	 * \if ENGLISH_LANG
	 * Sub stream 1, use same bMainFrame
	 * \else
	 * 8(BkAw1,J9SCM,bMainFrame
	 * \endif
	 */
	public byte		bExtraFrame_1[] = new byte[32];		
}

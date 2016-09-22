package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record state of everyday in one month
 * \else
 * D3TB5D8wLlJG7q4fTZB<Oq5DW4L,PEO"
 * \endif
 */
public class NET_RECORD_STATUS implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Has record this day 0-no, 1-yes
	 * \else
	 * D3TBDZ5D8wLlJG7q4fTZB<Oq5DW4L,QZBk#,01mJ>C;SP#,11mJ>SP!#
	 * \endif
	 */
	public byte 	 		   flag[] = new byte[32];
}

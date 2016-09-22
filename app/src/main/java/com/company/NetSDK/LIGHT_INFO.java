package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm of traffic light
 * \else
 * =;M(5F9JUO1(>/
 * \endif
 */

public class LIGHT_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * direction: 1-left,2-right,3-straight , 4-turn round
	 * \else
	 * =;M(5F7=Or: 1-WsPP#,2-SRPP#,3-V1PP, 4-5tM7
	 * \endif
	 */
	public byte               byDirection;
	
 	/**
	 * \if ENGLISH_LANG
	 * light state: 1-fault,2-normal
	 * \else
	 * =;M(5FW4L,: 1-9JUO#,2-U}3#
	 * \endif
	 */
	public byte               byState;
}

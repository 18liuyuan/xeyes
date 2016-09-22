package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_FRAMEID implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit Offset
	 * \else
	 * 1jV>N;5DN;F+RF
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position length
	 * \else
	 * 1jV>N;5D3$6H
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position value
	 * \else
	 * 1jV>N;5DV5
	 * \endif
	 */
	public byte          Key[] = new byte[16];

}

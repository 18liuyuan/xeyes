package com.company.NetSDK;

import java.io.Serializable;


public class SDK_SNIFFER_CONTENT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Symbol position bit offset
	 * \else
	 * 1jV>N;5DN;F+RF
	 * \endif
	 */
	public int           Offset;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * D?G0C;SPS&SC
	 * \endif
	 */
	public int           Offset2;

	/**
	 * \if ENGLISH_LANG
	 * The symbol position length
	 * \else
	 * 1jV>N;5D3$6H
	 * \endif
	 */
	public int           Length;

	/**
	 * \if ENGLISH_LANG
	 * It is invalid now
	 * \else
	 * D?G0C;SPS&SC
	 * \endif
	 */
	public int           Length2;

	/**
	 * \if ENGLISH_LANG
	 * Title value
	 * \else
	 * 1jLb5DV5
	 * \endif
	 */
	public byte          Title[] = new byte[12];

	/**
	 * \if ENGLISH_LANG
	 * Key value
	 * \else
	 * 9X<|WV5DV5
	 * \endif
	 */
	public byte          Key[] = new byte[12];
}

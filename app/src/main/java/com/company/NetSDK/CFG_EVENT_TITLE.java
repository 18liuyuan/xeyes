package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event title content structure
 * \else
 * JB<~1jLbDZH]=a99Le
 * \endif
 */
public class CFG_EVENT_TITLE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * title content 
	 * \else
	 * 1jLb
	 * \endif
	 */
	public char					szText[] = new char[FinalVar.MAX_CHANNELNAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Title Upper left coordinate, use 0-8191  relative coordinate systemTie
	 * \else
	 * 1jLbWsIO=GWx1j, 2ISC0-8191O`6TWx1jO5
	 * \endif
	 */
	public CFG_POLYGON			stuPoint = new CFG_POLYGON();			

	/**
	 * \if ENGLISH_LANG
	 * Title width and height,use 0-8191  relative coordinate system#,one or two item(s) is(are)0 means text self-adaptive to width-height
	 * \else
	 * 1jLb5D?m6H:M8_6H,2ISC0-8191O`6TWx1jO5#,D3On;rU_A=OnN*01mJ>04UUWVLeWTJJS&?m8_
	 * \endif
	 */
	public CFG_SIZE     		stuSize = new CFG_SIZE();			

	/**
	 * \if ENGLISH_LANG
	 * Foreground color
	 * \else
	 * G0>0QUI+
	 * \endif
	 */
	public CFG_RGBA				stuFrontColor = new CFG_RGBA();		

	/**
	 * \if ENGLISH_LANG
	 * Background color
	 * \else
	 * 13>0QUI+
	 * \endif
	 */
	public CFG_RGBA				stuBackColor = new CFG_RGBA();		
}

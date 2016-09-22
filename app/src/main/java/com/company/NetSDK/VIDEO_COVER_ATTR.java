package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Privacy mask info
 * \else
 * UZ52PEO"
 * \endif
 */
public class VIDEO_COVER_ATTR implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Privacy mask area coordinates
	 * \else
	 * 828G5DGxSrWx1j
	 * \endif
	 */
	public SDK_RECT             rcBlock = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask color
	 * \else
	 * 828G5DQUI+
	 * \endif
	 */
	public int                 nColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask mode#;0: black block,1: Mosaic
	 * \else
	 * 828G7=J=#;0#::Z?i#,1#:BmH|?K
	 * \endif
	 */
	public byte                bBlockType;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when encode#;1#:Enable,0#:Disable
	 * \else
	 * 1`Bk<6UZ52#;1#:IzP'#,0#:2;IzP'
	 * \endif
	 */
	public byte                bEncode;
	
	/**
	 * \if ENGLISH_LANG
	 * Privacy mask when preview#; 1#:Enable,0#:Disable
	 * \else
	 * T$@@UZ52#; 1#:IzP'#,0#:2;IzP'
	 * \endif
	 */
	public byte                bPriview;
}

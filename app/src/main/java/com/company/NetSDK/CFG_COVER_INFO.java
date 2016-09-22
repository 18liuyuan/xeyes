package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Cover Info
 * \else
 * UZ52PEO"
 * \endif
 */
public class CFG_COVER_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Capability 
	 * \else
	 * D\A&
	 * \endif
	 */
	public boolean				abBlockType;
	public boolean				abEncodeBlend;
	public boolean				abPreviewBlend;

	/**
	 * \if ENGLISH_LANG
	 * Covered Area Coordinate 
	 * \else
	 * 828G5DGxSrWx1j
	 * \endif
	 */
	public CFG_RECT				stuRect = new CFG_RECT();					

	/**
	 * \if ENGLISH_LANG
	 * Covered Color 
	 * \else
	 * 828G5DQUI+
	 * \endif
	 */
	public CFG_RGBA				stuColor = new CFG_RGBA();					

	/**
	 * \if ENGLISH_LANG
	 * Covering Type. 0-Black, 1-Mosaic
	 * \else
	 * 828G7=J=;0#-:Z?i#,1#-BmH|?K
	 * \endif
	 */
	public int					nBlockType;					

	/**
	 * \if ENGLISH_LANG
	 * Encode Blend.1-Take Effect;0-No Effect
	 * \else
	 * 1`Bk<6UZ52;1#-IzP'#,0#-2;IzP'
	 * \endif
	 */
	public int					nEncodeBlend;				

	/**
	 * \if ENGLISH_LANG
	 * Preview Blend;1-Take Effect;0-No Effect
	 * \else
	 * T$@@UZ52;1#-IzP'#,0#-2;IzP'
	 * \endif
	 */
	public int					nPreviewBlend;				
}

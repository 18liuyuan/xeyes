package com.company.NetSDK;

import java.io.Serializable;


/**
 * \if ENGLISH_LANG
 * Synthetic channel configuration
 * \else
 *  :O3IM(5@EdVC
 * \endif
 */
public class CFG_COMPOSE_CHANNEL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Segmentation mode#, corresponding to CFG_SPLITMODE
	 * \else
	 * 7V8nD#J=, 6TS&@`CFG_SPLITMODE
	 * \endif
	 */
	public int	emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Each child window display content  in segmentation mode 
	 * \else
	 * 8nD#J=OB5D8wWS40?ZOTJ>DZH]
	 * \endif
	 */
	public int szChannelCombination[] = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Split Window Number
	 * \else
	 * 7V8n40?ZJ}A?
	 * \endif
	 */
	public int				nChannelCount;
	
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Tour activation config
 * \else
 * BVQ2A*6/EdVC
 * \endif
 */
public class CFG_TOURLINK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Tour enable
	 * \else
	 * BVQ2J9D\
	 * \endif
	 */
	public boolean				bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Tour split mode
	 * \else
	 * BVQ2J15D7V8nD#J=, CFG_SPLITMODE
	 * \endif
	 */
	public int				    emSplitMode;

	/**
	 * \if ENGLISH_LANG
	 * Tour channel no.list
	 * \else
	 * BVQ2M(5@:EAP1m
	 * \endif
	 */
	public int[]			    nChannels = new int[FinalVar.MAX_VIDEO_CHANNEL_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Tour channel quantity
	 * \else
	 * BVQ2M(5@J}A?
	 * \endif
	 */
	public int			        nChannelCount;
}

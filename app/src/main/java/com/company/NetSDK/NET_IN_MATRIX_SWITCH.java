package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CLIENT_MatrixSwitch The input parameters 
 * \else
 *  CLIENT_MatrixSwitch JdHk2NJ}
 * \endif
 */
public class NET_IN_MATRIX_SWITCH implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Segmentation Model, value corresponding to SDK_SPLIT_MODE
	 * \else
	 * 7V8nD#J=, V56TS&@`SDK_SPLIT_MODE
	 * \endif
	 */
	public int			emSplitMode;	
	
	
	/**
	 * \if ENGLISH_LANG
	 *  Output channel, can specify multiple output channel switch together at the same time, the content is consistent
	 * \else
	 * Jd3vM(5@, ?IM,J1V86(6`8vJd3vM(5@R;FpGP;;, DZH]R;VB
	 * \endif
	 */
	public int 		    szOutputChannels[];
	
	
	/**
	 * \if ENGLISH_LANG
	 * Output channel number
	 * \else
	 * Jd3vM(5@J}
	 * \endif
	 */
	
	public  int 		nOutputChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Input channel, each split window corresponding to one input channel 
	 * \else
	 * JdHkM(5@, C?8v7V8n40?ZR;8v6TS&R;8vJdHkM(5@
	 * \endif
	 */
	
	public int 			szInputChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * Input channel number
	 * \else
	 * JdHkM(5@J}
	 * \endif
	 */
	public int 			nInputChannelCount;
	
	
	public NET_IN_MATRIX_SWITCH(int nOutputChannelCount, int nInputChannelCount)
	{
		this.nOutputChannelCount = nOutputChannelCount;
		for(int i = 0; i < nOutputChannelCount; i++)
		{
			szOutputChannels = new int[nOutputChannelCount];
		}
		
		this.nInputChannelCount = nInputChannelCount;
		for(int i = 0; i < nInputChannelCount; i++)
		{
			szInputChannels = new int[nInputChannelCount];
		}
	}
}
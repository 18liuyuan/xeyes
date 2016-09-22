package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the configuration of audio matrix silence
 * \else
 * >2Rt>XUsEdVCPEO"
 * \endif
 */
public class CFG_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the max numbers of input channels lists
	 * \else
	 *  PhR*;qH!/IhVC5D>2Rt5DJd3vM(5@J}A?
	 * \endif
	 */
	public int 						    nMaxInputListCount;
	
	/**
	 * \if ENGLISH_LANG
	 * the numbers of  effective input channels lists
	 * \else
	 *   J5<J;qH!5=5DJd3vM(5@J}A?#,IhVCEdVCJ14K3IT1N^RbRe
	 * \endif
	 */
	public int							nRetInputListCountOut;
	
	
	/**
	 * \if ENGLISH_LANG
	 *  the input channels lists which is need to set silence
	 * \else
	 *   8w8vRtF5Jd3vM(5@6TS&5D>2RtJdHkM(5@#,SC;'7VEd
	 * \endif
	 */
	public CFG_AUDIO_SILENCE_INPUT_CHN  pstSilenceInputChn[];
	
	
	public CFG_AUDIO_MATRIX_SILENCE(int nMaxInputListCount)
	{
		this.nMaxInputListCount = nMaxInputListCount;
		
		pstSilenceInputChn = new CFG_AUDIO_SILENCE_INPUT_CHN[this.nMaxInputListCount];
		for(int i = 0; i < this.nMaxInputListCount; i++)
		{
			pstSilenceInputChn[i] = new CFG_AUDIO_SILENCE_INPUT_CHN();
		}
	} 
}

package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the output channesl which should to be silenced
 * \else
 *  RtF5>XUsIO?XVF>2Rt5DJd3vM(5@
 * \endif
 */
public class NET_SILENCE_CHANNEL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix
	 * \else
	 *  PhR*>2Rt5D>XUs:E
	 * \endif
	 */
	public int				nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels which should to be  silenced
	 * \else
	 *  PhR*>2Rt5DJd3vM(5@J}
	 * \endif
	 */
	public int 				nOutChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels which should to be  silenced
	 * \else
	 *  8C>XUsOBPhR*>2Rt5DJd3vM(5@
	 * \endif
	 */
	public int				nOutPutChannel[] = new int[FinalVar.SDK_MAX_AUDIO_MATRIX_OUTPUT];

}
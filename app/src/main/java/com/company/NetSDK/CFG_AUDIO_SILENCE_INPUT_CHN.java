package com.company.NetSDK;


import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the info of inputchannels
 * \else
 * R;8vRtF5Jd3vM(5@6TS&5D>2RtJdHkM(5@
 * \endif
 */
public class CFG_AUDIO_SILENCE_INPUT_CHN implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the index of matrix, start from 0s
	 * \else
	 * 4KRtF5Jd3vM(5@Ky4&5D>XUs:E#,4S0?*J<
	 * \endif
	 */
	public int 						    nMatrix;
	
	/**
	 * \if ENGLISH_LANG
	 * the output channel, start from 0
	 * \else
	 * 4KRtF5Jd3vM(5@:E#,4S0?*J<
	 * \endif
	 */
     public int 					   nOutChannel;
     
 	/**
 	 * \if ENGLISH_LANG
 	 * the counts of input channels
 	 * \else
 	 * 1;>2Rt5DJdHkM(5@5D8vJ}
 	 * \endif
 	 */
     public int 						nInputChnConut;
     
 	/**
  	 * \if ENGLISH_LANG
  	 * the counts of input channels
  	 * \else
  	 * 1;>2Rt5DJdHkM(5@
  	 * \endif
  	 */
     public short							snInputChannel[] = new short[FinalVar.CFG_MAX_AUDIO_MATRIX_INPUT];
}
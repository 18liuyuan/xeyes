package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Audio matrix silence input parameter
 * \else
 *  RtF5>XUsR;<|>2Rt2YWwJdHk2NJ}
 * \endif
 */
public class NET_IN_AUDIO_MATRIX_SILENCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enbale(true:close voice     false:open voice)
	 * \else
	 *  R;<|>2RtJ9D\?*Ft;r9X1U(true:>2Rt false:?*FtIyRt)
	 * \endif
	 */
	public boolean					bEnable;
	
	
	/**
	 * \if ENGLISH_LANG
	 * the counts of  output channels lists which should to be  silenced
	 * \else
	 *  PhR*?XVF>2Rt5DJd3vM(5@J}
	 * \endif
	 */
	public int						nListCount;
	
	
	/**
	 * \if ENGLISH_LANG
	 * the output channels lists which should to be silenced
	 * \else
	 *  PhR*?XVF>2Rt5DJd3vM(5@PEO"#,SC;'7VEdDZ4f
	 * \endif
	 */
	public NET_SILENCE_CHANNEL stSlienceChannel[];
	
	public NET_IN_AUDIO_MATRIX_SILENCE(int nListCount)
	{
		this.nListCount = nListCount;
		
		if(this.nListCount > 0)
		{
			stSlienceChannel = new NET_SILENCE_CHANNEL[this.nListCount];
			for(int i = 0; i < this.nListCount; i++)
			{
				stSlienceChannel[i] = new NET_SILENCE_CHANNEL();
			}
		}
	}
	
	
}
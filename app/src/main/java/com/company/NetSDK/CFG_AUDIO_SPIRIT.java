package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Voice incentive
 * \else
 * SoRt<$@x
 * \endif
 */
public class CFG_AUDIO_SPIRIT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean				bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Excitation volume threshold, 0 ~ 100
	 * \else
	 * <$@xRtA?cPV5, 0~100
	 * \endif
	 */
	public int					nAudioLimit;
	
	/**
	 * \if ENGLISH_LANG
	 * Incentive delay time, unit: seconds
	 * \else
	 * <$@xQSJ1J1<d, 5%N;: Ck
	 * \endif
	 */
	public int					nDelayTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Speech excitation audio channel properties 
	 * \else
	 * SoRt<$@xRtF5M(5@JtPT
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_CHANNEL stuChannels[];
	
	/**
	 * \if ENGLISH_LANG
	 * Number of audio channels#,stuChannels valiad number
	 * \else
	 * RtF5M(5@J}#,stuChannelsSPP'8vJ}
	 * \endif
	 */
	public int					    nChannelCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Encourage collaboration entry
	 * \else
	 * <$@xA*6/On
	 * \endif
	 */
	public CFG_AUDIO_SPIRIT_LINKAGE stuLinkage = new CFG_AUDIO_SPIRIT_LINKAGE();
	
	
	public CFG_AUDIO_SPIRIT(int nCount)
	{
		this.nChannelCount = nCount;
		
		stuChannels = new CFG_AUDIO_SPIRIT_CHANNEL[nChannelCount];
		for(int i = 0; i < nChannelCount; i++)
		{
			stuChannels[i] = new CFG_AUDIO_SPIRIT_CHANNEL();
		}
	}
}
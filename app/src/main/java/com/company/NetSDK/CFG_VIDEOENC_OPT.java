package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video Encoding Options
 * \else
 * JSF51`Bk2NJ}
 * \endif
 */
public class CFG_VIDEOENC_OPT implements Serializable {
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
	public boolean				abVideoEnable;
	public boolean				abAudioEnable;
	public boolean				abSnapEnable;
	public boolean              abAudioAdd;                 
	public boolean				abAudioFormat;
	
	/**
	 * \if ENGLISH_LANG
	 * Video Enable 
	 * \else
	 * JSF5J9D\
	 * \endif
	 */
	public boolean				bVideoEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Video Format 
	 * \else
	 * JSF58qJ=
	 * \endif
	 */
	public CFG_VIDEO_FORMAT		stuVideoFormat = new CFG_VIDEO_FORMAT();				

	/**
	 * \if ENGLISH_LANG
	 * Audio Enable 
	 * \else
	 * RtF5J9D\
	 * \endif
	 */
	public boolean				bAudioEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Snap Enable 
	 * \else
	 * 6(J1W%M<J9D\
	 * \endif
	 */
	public boolean				bSnapEnable;				

	/**
	 * \if ENGLISH_LANG
	 * Audio Add Enable 
	 * \else
	 * RtF55~<SJ9D\
	 * \endif
	 */
	public boolean              bAudioAddEnable;            

	/**
	 * \if ENGLISH_LANG
	 * Audio Format 
	 * \else
	 * RtF58qJ=
	 * \endif
	 */
	public CFG_AUDIO_ENCODE_FORMAT	stuAudioFormat = new CFG_AUDIO_ENCODE_FORMAT();			
}

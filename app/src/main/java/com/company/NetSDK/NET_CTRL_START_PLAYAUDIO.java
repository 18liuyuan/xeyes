package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * INetSDK.ControlDevice interface SDK_CTRL_START_PLAYAUDIO Order Parameter
 * \else
 * INetSDK.ControlDevice=S?Z5D SDK_CTRL_START_PLAYAUDIO C|An2NJ}
 * \endif
 */
public class NET_CTRL_START_PLAYAUDIO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public char				szAudioPath[] = new char[FinalVar.SDK_MAX_AUDIO_PATH_1];
}

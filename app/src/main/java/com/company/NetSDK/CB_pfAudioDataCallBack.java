package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Audio data of audio talk callback function original shape 
 * \else
 * 7"FpSoRt;X5w
 * \endif
 */
public interface CB_pfAudioDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Audio data of audio talk callback function original shape
	 * @param lTalkHandle handle, return from{@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}
	 * @param pDataBuf Recalled audio data length(unit:byte) 
	 * @param byAudioFlag Audio data home sign, 0:means audio data collected by local audio recording list;
	 * 1:means received audio data sent by devie
	 * \else
	 * 7"FpSoRt;X5w:/J}
	 * @param lTalkHandle {@link com.company.NetSDK.INetSDK#StartTalkEx() StartTalkEx}5D75;XV5
	 * @param pDataBuf ;X5w3v@45DRtF5J}>]5DDZH] 
	 * @param byAudioFlag RtF5J}>]9iJt1jV>,0:1mJ>JG1>5XB<Rt?b2I</5DRtF5J}>];1:1mJ>JU5=5DIh187"9}@45DRtF5J}>]
	 * \endif
	 */
	public void invoke(long lTalkHandle, byte pDataBuf[], byte byAudioFlag);
}

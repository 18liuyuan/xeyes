package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback data callback function original shape 
 * \else
 * ;X7EJ}>];X5w:/J}T-PN
 * \endif
 */
public interface CB_fDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback data callback function original shape 
	 * @param lRealHandle handle, return from {@link com.company.NetSDK.INetSDK#PlayBackByRecordFileEx() PlayBackByRecordFileEx}
	 * @param dwDataType here as 0(original data) 
	 * @param buffer data buffering 
	 * @param dwBufferSize buffering length(unit byte)
	 * \else
	 * ;X7EJ}>];X5w:/J}
	 * @param lRealHandle >d1z, {@link com.company.NetSDK.INetSDK#PlayBackByRecordFileEx() PlayBackByRecordFileEx}5D75;XV5
	 * @param dwDataType Ub@oN*0(T-J<J}>]) 
	 * @param buffer J}>];:3e
	 * @param dwBufferSize ;:3e3$6H(5%N;WV=Z) 
	 * \endif
	 */
	public int invoke(long lRealHandle, int dwDataType, byte buffer[], int dwBufferSize);
}

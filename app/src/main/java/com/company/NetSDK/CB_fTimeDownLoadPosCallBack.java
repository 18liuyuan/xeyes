package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process by time callback function original shape
 * \else
 * 04J1<dOBTX;X5w:/J}T-PM
 * \endif
 */
public interface CB_fTimeDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process by time callback function original shape
	 * @param lPlayHandle handle, return from {@link com.company.NetSDK.INetSDK#PlayBackByTime() PlayBackByTime}
	 * @param dwTotalSize Means total size of the play,unit KB 
	 * @param dwDownLoadSize Means played part size,unit KB,when its value is-1 means play ends 
	 * @param index 
	 * @param recordfileinfo Record info
	 * \else
	 * 04J1<dOBTX;X5w:/J}
	 * @param lPlayHandle {@link com.company.NetSDK.INetSDK#PlayBackByTime() PlayBackByTime} 5D75;XV5
	 * @param dwTotalSize V81>4N2%7EW\4sP!#,5%N;N*KB 
	 * @param dwDownLoadSize V8RQ>-2%7E5D4sP!#,5%N;N*KB#,51FdV5N*-1J11mJ>1>4N;X7E=aJx#,-21mJ>P4ND<~J'0\ 
	 * @param index Pr:E
	 * @param recordfileinfo B<OqDZH]PEO"
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize, int index, NET_RECORDFILE_INFO recordfileinfo);
}

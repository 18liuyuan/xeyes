package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Playback process callback function original shape 
 * \else
 * 04=x6HOBTX;X5w:/J}T-PM
 * \endif
 */
public interface CB_fDownLoadPosCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Playback process callback function original shape 
	 * @param lPlayHandle handle, return from {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}
	 * @param dwTotalSize means total size of the play,unit KB
	 * @param dwDownLoadSize means played part size,unit KB,when its value is-1 means play ends
	 * \else
	 * 04=x6HOBTX;X5w:/J}
	 * @param lPlayHandle >d1z, {@link com.company.NetSDK.INetSDK#DownloadMediaFile() DownloadMediaFile}5D75;XV5
	 * @param dwTotalSize V81>4NOBTXW\4sP!#,5%N;N*KB
	 * @param dwDownLoadSize V8RQ>-OBTX5D4sP!#,5%N;N*KB#,51FdV5N*-1J11mJ>1>4NOBTX=aJx 
	 * \endif
	 */
	public void invoke(long lPlayHandle, int dwTotalSize, int dwDownLoadSize);
}

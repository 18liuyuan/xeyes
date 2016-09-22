package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * File Transfer callback
 * \else
 * ND<~4+Jd;X5w
 * \endif
 */
public interface CB_fTransFileCallBack {
	/**
	 * \if ENGLISH_LANG
	 * File Transfer callback
	 * @param lHandle handle, return from {@link com.company.NetSDK.INetSDK#FileTransmit() FileTransmit}
	 * @param nTransType File transfer type#,currently only DH_DEV_FILETRANS_BURN 
	 * @param nState File transfer status 
	 * @param nSendSize Length of file sent 
	 * @param nTotalSize Total file size 
	 * \else
	 * ND<~4+Jd;X5w:/J}
	 * @param lHandle ND<~4+Jd>d1z {@link com.company.NetSDK.INetSDK#FileTransmit() FileTransmit}
	 * @param nTransType ND<~4+Jd@`PM#,OVTZV;SP SDK_DEV_FILETRANS_BURN 
	 * @param nState ND<~4+JdW4L, 
	 * @param nSendSize 7"KM5DND<~3$6H
	 * @param nTotalSize ND<~W\5D4sP!
	 * \endif
	 */
	public void invoke(long lHandle, int nTransType, int nState, int nSendSize, int nTotalSize);
}

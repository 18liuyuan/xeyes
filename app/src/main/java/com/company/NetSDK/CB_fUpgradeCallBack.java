package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Upgrade device callback function original shape
 * \else
 * I}<6Ih183LPr;X5w
 * \endif
 */
public interface CB_fUpgradeCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Upgrade device callback function original shape
	 * @param lLoginID login handle, return from {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param lUpgradeChannel handle, return from{@link com.company.NetSDK.INetSDK#StartUpgrade() StartUpgrade}
	 * @param nTotalSize update file total length(unit:byte) 
	 * @param nSendSize Sent file length(unit:byte)#,when it is-1#,meand update file sending ends 
	 * \else
	 * I}<6Ih183LPr;X5w:/J}
	 * @param lLoginID 5GB<>d1z, {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param lUpgradeChannel {@link com.company.NetSDK.INetSDK#StartUpgrade() StartUpgrade}75;X5DI}<6>d1zID 
	 * @param nTotalSize I}<6ND<~5DW\3$6H(5%N;:WV=Z) 
	 * @param nSendSize RQ7"KM5DND<~3$6H(5%N;:WV=Z)#,N*-1J1#,1mJ>7"KMI}<6ND<~=aJx 
	 * \endif
	 */
	public void invoke(long lLoginID , long lUpgradeChannel , int nTotalSize , int nSendSize);
}

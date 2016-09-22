package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Snapshot callback function original shape 
 * \else
 * W%M<;X5w
 * \endif
 */
public interface CB_fSnapRev {
	/**
	 * \if ENGLISH_LANG
	 * Snapshot callback function original shape 
	 * @param lLoginID login handle,{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pBuf data pointer 
	 * @param RevLen data length(unit byte)
	 * @param EncodeType image encode type#:0#:mpeg4 I frame 
	 * @param CmdSerial operation NO.#,not used in Synchronous capture conditions 
	 * \else
	 * W%M<;X5w
	 * @param lLoginID 5GB<>d1z#,{@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param pBuf J}>]V8Uk 
	 * @param RevLen J}>]3$6H(5%N;WV=Z)
	 * @param EncodeType M<F,1`Bk@`PM#:0#:mpeg4 IV! 
	 * @param CmdSerial 2YWwAwK.:E#,M,2=W%M<5DGi?vOBSC2;IO 
	 * \endif
	 */
	public void invoke(long lLoginID, byte pBuf[], int RevLen, int EncodeType, int CmdSerial);
}

package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor data callback function original shape
 * \else
 * J5J1<`JSJ}>];X5w
 * \endif
 */
public interface CB_fRealDataCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor data callback function original shape
	 * @param lRealHandle handle, return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}
	 * @param dwDataType label recalled data type#,onceset recall#,The following 4 kinds of data are also callback, users may need to have the option of processing data 
	 * <table>
	 * <tr><td>dwDataType</td><td>pBuffer data type </td></tr>
	 * <tr><td>0</td><td>original data(identical with SaveRealData saved data)</td></tr>
	 * <tr><td>1</td><td>frame data</td></tr>
	 * <tr><td>2</td><td>frame data </td></tr>
	 * <tr><td>3</td><td>pcm audio data</td></tr>
	 * </table>
	 * @param pBuffer recal data#,According to the data of different types each callback different length data, in addition to type 0, other data types are in the frame, each callback data of a frame 
	 * @param dwBufSize recall data length(unit byte)
	 * \else
	 * J5J1<`JSJ}>];X5w:/J}
	 * @param lRealHandle 5GB<>d1z, {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}5D75;XV5
	 * @param dwDataType ;X5w3v@45DJ}>]@`PM
	 * <table>
	 * <tr><td>dwDataType</td><td>pBufferJ}>]@`PM </td></tr>
	 * <tr><td>0</td><td>T-J<J}>](SkSaveRealData1#4f5DJ}>]R;VB) </td></tr>
	 * <tr><td>1</td><td>V!J}>] </td></tr>
	 * <tr><td>2</td><td>yuvJ}>] </td></tr>
	 * <tr><td>3</td><td>pcmRtF5J}>] </td></tr>
	 * </table>
	 * @param pBuffer ;X5wJ}>]#,8y>]J}>]@`PM5D2;M,C?4N;X5w2;M,5D3$6H5DJ}>]#,3}@`PM0#,FdK{J}>]@`PM6<JG04V!#,C?4N;X5wR;V!J}>] 
	 * @param dwBufSize ;X5wJ}>]5D3$6H(5%N;WV=Z) 
	 * \endif
	 */
	public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize);
}

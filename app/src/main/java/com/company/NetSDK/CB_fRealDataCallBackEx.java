package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Real-time monitor data callback function original shape---extensive
 * \else
 * J5J1<`?X;X5w:/J}T-PM
 * \endif
 */
public interface CB_fRealDataCallBackEx {
	/**
	 * \if ENGLISH_LANG
	 * Real-time monitor data callback function original shape---extensive
	 * @param lRealHandle real time monitor ID ,return from {@link com.company.NetSDK.INetSDK#RealPlay() RealPlay}or{@link com.company.NetSDK.INetSDK#RealPlayEx() RealPlayEx}
	 * @param dwDataType label recalled data type #,only dwFlag set labeled data will be recalled#:
	 * <table>
	 * <tr><td>dwDataType</td><td>data type </td></tr>
	 * <tr><td>0</td><td>original data (identicla SaveRealData saveddata)</td></tr>
	 * <tr><td>1</td><td>frame data </td></tr>
	 * <tr><td>2</td><td>yuv data </td></tr>
	 * <tr><td>3</td><td>pcm audio data </td></tr>
	 * </table>
	 * @param pBuffer recall data #,based on different data type each time recall different length data #,except type 0#,other data type all by frame#,each time recall one frame data 
	 * @param dwBufSize recall data parameter structure#,based on different type #,parameter structure differ
	 * @param param recall data length#,based on different type #,length differ(unit byte) 
	 * \else
	 * MxBg6OO_;X5w:/J}
	 * @param lRealHandle J5J1<`JSID,{@link com.company.NetSDK.INetSDK#RealPlay() RealPlay};rU_{@link com.company.NetSDK.INetSDK#RealPlayEx() RealPlayEx}75;XV5
	 * @param dwDataType ;X5w3v@45DJ}>]@`PM
	 * <table>
	 * <tr><td>dwDataType</td><td>pBufferJ}>]@`PM</td></tr> 
	 * <tr><td>0</td><td>T-J<J}>](SkSaveRealData1#4f5DJ}>]R;VB) </td></tr>
	 * <tr><td>1</td><td>V!J}>] </td></tr>
	 * <tr><td>2</td><td>yuvJ}>] </td></tr>
	 * <tr><td>3</td><td>pcmRtF5J}>] </td></tr>
	 * </table>
	 * @param pBuffer ;X5wJ}>]#,8y>]J}>]@`PM5D2;M,C?4N;X5w2;M,5D3$6H5DJ}>]#,3}@`PM0#,FdK{J}>]@`PM6<JG04V!#,C?4N;X5wR;V!J}>] 
	 * @param dwBufSize ;X5wJ}>]2NJ}=a99Le#,8y>]2;M,5D@`PM#,2NJ}=a99R22;R;VB
	 * @param param ;X5wJ}>]5D3$6H#,8y>]2;M,5D@`PM#,3$6HR22;M,(5%N;WV=Z) 
	 * \endif
	 */
	public void invoke(long lRealHandle, int dwDataType, byte[] pBuffer, int dwBufSize, int param);
}

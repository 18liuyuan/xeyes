package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * alarm event type depends on dhnetsdk.h analyzed alarm type 
 * \else
 * ;X5w7=J==xPPJ}>]=bNv#,dwDataType1mJ>J}>]=bNv5C5=@`PM
 * \endif
 */
public interface CB_fAnalyzerData {

	/**
	 * \if ENGLISH_LANG
	 * alarm event type depends on dhnetsdk.h analyzed alarm type 
	 * @param dwDataType parameter type 
	 * @param pDataInfo data parameter 
	 * @param dwStructSize structure size 
	 * @param pBuffer buffering 
	 * @param dwBufSize buffering size 
	 * @see {@link com.company.NetSDK.INetSDK#SetNewDevConfig() SetNewDevConfig} {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \else
	 * B<Oq1(>/JB<~;X5w:/J}
	 * @param dwDataType J}>]@`PM 
	 * @param pDataInfo J}>]2NJ}
	 * @param dwStructSize =a99Le4sP! 
	 * @param pBuffer ;:3e 
	 * @param dwBufSize ;:3e4sP!
	 * @see {@link com.company.NetSDK.INetSDK#SetNewDevConfig() SetNewDevConfig} {@link com.company.NetSDK.INetSDK#ParseData() ParseData}  
	 * \endif
	 */
	public int invoke(double dwDataType, Object pDataInfo, double dwStructSize, byte[] pBuffer, double dwBufSize);
}

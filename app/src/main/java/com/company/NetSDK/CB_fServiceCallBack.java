package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Listening server callback function original shape
 * \else
 * <`L};X5w
 * \endif
 */
public interface CB_fServiceCallBack {
	/**
	 * \if ENGLISH_LANG
	 * Listening server callback function original shape
	 * @param lHandle recall info servier handle , return from {@link com.company.NetSDK.INetSDK#StartService() StartService}
	 * @param pIp upload info device Ip 
	 * @param wPort upload info device Port 
	 * @param lCommand alarm type#,as SetDVRMessCallBack 
	 * @param pParam alarm info buffering area
	 * \else
	 * UlL}7~NqFw;X5w:/J}
	 * @param lHandle 7~Nq>d1z ,{@link com.company.NetSDK.INetSDK#StartService() StartService}75;XV5
	 * @param pIp A,=S5=7~Nq5DIh186Kip 
	 * @param wPort A,=S5=7~Nq5DIh186Kport 
	 * @param lCommand Ih18GkGsC|An, Oj<{  SetDVRMessCallBack
	 * @param pParam Ih18GkGsC|An5D2NJ}#:Ih18PrAP:E 
	 * \endif
	 */
	public int invoke(long lHandle, String pIp, short wPort, int lCommand, Object pParam);
}

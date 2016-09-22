package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye window location info
 * \else
 * ScQ[40?ZN;VCPEO"
 * \endif
 */
public class CFG_FISHEYE_WINDOW_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * window ID
	 * \else
	 * 40?ZID
	 * \endif
	 */
	public int               dwWindowID;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus x axis
	 * \else
	 * EPtz#(5gWSTFL(#)5D=95c:aWx1j
	 * \endif
	 */
	public int               nFocusX;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz, focus y axis   
	 * \else
	 * EPtz (5gWSTFL(#)5D=95cW]Wx1j
	 * \endif
	 */
	public int               nFocusY;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz h-angle
	 * \else
	 * EPtz5DK.F==G6H
	 * \endif
	 */
	public int               nHorizontalAngle;
	
	/**
	 * \if ENGLISH_LANG
	 * EPtz v-angle
	 * \else
	 * EPtz5D49V1=G6H
	 * \endif
	 */
	public int               nVerticalAngle;
}

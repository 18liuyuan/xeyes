package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * General PTZ control command
 * \else
 * M(SCTFL(?XVFC|An
 * \endif
 */
public class SDK_PTZ_ControlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Up
	 * \else
	 * IO
	 * \endif
	 */
	public static final int     SDK_PTZ_UP_CONTROL = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Down
	 * \else
	 * OB
	 * \endif
	 */
	public static final int     SDK_PTZ_DOWN_CONTROL = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Left
	 * \else
	 * Ws
	 * \endif
	 */
	public static final int     SDK_PTZ_LEFT_CONTROL = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Right
	 * \else
	 * SR
	 * \endif
	 */
	public static final int     SDK_PTZ_RIGHT_CONTROL = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * +Zoom in 
	 * \else
	 * 1d16+
	 * \endif
	 */
	public static final int     SDK_PTZ_ZOOM_ADD_CONTROL = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * -Zoom out
	 * \else
	 * 1d16-
	 * \endif
	 */
	public static final int     SDK_PTZ_ZOOM_DEC_CONTROL = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * +Zoom in 
	 * \else
	 * 5w=9+
	 * \endif
	 */
	public static final int     SDK_PTZ_FOCUS_ADD_CONTROL = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * -Zoom out 
	 * \else
	 * 5w=9-
	 * \endif
	 */
	public static final int     SDK_PTZ_FOCUS_DEC_CONTROL = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * + Aperture 
	 * \else
	 * 9bH&+
	 * \endif
	 */
	public static final int     SDK_PTZ_APERTURE_ADD_CONTROL = 8;
	
	/**
	 * \if ENGLISH_LANG
	 * - Aperture
	 * \else
	 * 9bH&-
	 * \endif
	 */
	public static final int     SDK_PTZ_APERTURE_DEC_CONTROL = 9;
	
	/**
	 * \if ENGLISH_LANG
	 * Go to preset 
	 * \else
	 * W*VAT$VC5c
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_MOVE_CONTROL = 10;
	
	/**
	 * \if ENGLISH_LANG
	 * Set
	 * \else
	 * IhVC
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_SET_CONTROL = 11;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete
	 * \else
	 * I>3}
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_DEL_CONTROL = 12;
	
	/**
	 * \if ENGLISH_LANG
	 * Tour
	 * \else
	 * 5c<dQ2:=
	 * \endif
	 */
	public static final int     SDK_PTZ_POINT_LOOP_CONTROL = 13;
	
	/**
	 * \if ENGLISH_LANG
	 * Light and wiper 
	 * \else
	 * 5F9bSjK"
	 * \endif
	 */
	public static final int     SDK_PTZ_LAMP_CONTROL = 14;
}

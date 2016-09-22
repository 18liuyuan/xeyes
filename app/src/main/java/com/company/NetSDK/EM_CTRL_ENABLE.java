package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarm enable control. 
 * \else
 * 1(>/J9D\?XVF7=J=C6>Y@`PM
 * \endif
 */
public class EM_CTRL_ENABLE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * no control enable
	 * \else
	 * 2;?XVFJ9D\
	 * \endif
	 */
	public static final int EM_CTRL_NORMAL = 0;   

	/**
	 * \if ENGLISH_LANG
	 * always enable
	 * \else
	 * W\JGJ9D\
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_EN = 1;  

	/**
	 * \if ENGLISH_LANG
	 * bypass
	 * \else
	 * ETB7
	 * \endif
	 */
	public static final int EM_CTRL_ONCE_DIS = 2;   

	/**
	 * \if ENGLISH_LANG
	 * remove
	 * \else
	 * RF3}
	 * \endif
	 */
	public static final int EM_CTRL_ALWAYS_DIS = 3; 

	/**
	 * \if ENGLISH_LANG
	 * enumeration type total
	 * \else
	 * C6>Y@`PMW\J}
	 * \endif
	 */
	public static final int EM_CTRL_NUM = 4;         
}

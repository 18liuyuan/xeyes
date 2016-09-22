package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail Attachment Type
 * \else
 * SJ<~8=<~@`PM
 * \endif
 */
public class CFG_ATTACHMENT_TYPE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Picture attachment
	 * \else
	 * M<F,8=<~
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_PIC = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Video attachment
	 * \else
	 * JSF58=<~
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_VIDEO = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * Attachment type total
	 * \else
	 * 8=<~@`PMW\J}
	 * \endif
	 */
	public static final int ATTACHMENT_TYPE_NUM = 2;							
}

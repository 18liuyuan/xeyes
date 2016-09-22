package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mail detail content
 * \else
 * SJ<~OjO8DZH]
 * \endif
 */
public class CFG_MAIL_DETAIL implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Attachment type
	 * \else
	 * 8=<~@`PM, CFG_ATTACHMENT_TYPE
	 * \endif
	 */
	public int				   emAttachType;                 

	/**
	 * \if ENGLISH_LANG
	 * File upload limit#,unit kB
	 * \else
	 * ND<~4sP!IOO^#,5%N;kB
	 * \endif
	 */
	public int                 nMaxSize;                     

	/**
	 * \if ENGLISH_LANG
	 * Max record length, unit is s#,valid to video
	 * \else
	 * Wn4sB<OqJ1<d3$6H#,5%N;Ck#,6TvideoSPP'
	 * \endif
	 */
	public int                 nMaxTimeLength;               
}

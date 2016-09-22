package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * TV adjust
 * \else
 * 5w=ZTVJd3v
 * \endif
 */
public class SDKDEV_TVADJUST_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * top(0 - 100)
	 * \else
	 * IO2b1_>`#(0#-100#)
	 * \endif
	 */
	public int             nTop;

	/**
	 * \if ENGLISH_LANG
	 * botton(0 - 100)
	 * \else
	 * OB2b1_>`#(0#-100#)
	 * \endif
	 */
	public int             nBotton;

	/**
	 * \if ENGLISH_LANG
	 * left(0 - 100)
	 * \else
	 * Ws2b1_>`#(0#-100#)
	 * \endif
	 */
	public int             nLeft;

	/**
	 * \if ENGLISH_LANG
	 * right(0 - 100)
	 * \else
	 * SR2b1_>`#(0#-100#)
	 * \endif
	 */
	public int             nRight;
}

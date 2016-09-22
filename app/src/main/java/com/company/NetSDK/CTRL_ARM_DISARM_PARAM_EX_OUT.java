package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/disarm control expansion output parameter
 * \else
 * 1(>/2<377@?XVF@)U9Jd3v2NJ}
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX_OUT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm source input arming failed zone number 
	 * \else
	 * SP1(>/T4JdHk2<7@J'0\5D7@Gx8vJ}
	 * \endif
	 */
	public int               dwSourceNum;
	
	/**
	 * \if ENGLISH_LANG
	 * alarm source input failed zone no.,zone no. start from 0
	 * \else
	 * SP1(>/T4JdHkJ'0\5D7@Gx:E, 7@Gx:E4S0?*J<
	 * \endif
	 */
	public int                 nSource[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * link alarm arming failed zone number 
	 * \else
	 * SPA*6/1(>/2<7@J'0\5D7@Gx8vJ}
	 * \endif
	 */
    public int               dwLinkNum;
    
    /**
     * \if ENGLISH_LANG
     * link alarm failed zone no., zone no. start from 0
     * \else
     * SPA*6/1(>/J'0\5D7@Gx:E, 7@Gx:E4S0?*J<
     * \endif
     */
    public int                 nLink[] = new int[FinalVar.ARM_DISARM_ZONE_MAX];
}

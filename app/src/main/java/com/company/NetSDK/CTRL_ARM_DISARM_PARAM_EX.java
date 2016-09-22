package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * alarm arm/diarm control expansion(corresponding to SDK_CTRL_ARMED_EX)
 * \else
 * 1(>/2<377@?XVF@)U9(6TS&SDK_CTRL_ARMED_EX)
 * \endif
 */
public class CTRL_ARM_DISARM_PARAM_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * alarm arm/disarm control input
	 * \else
	 * 1(>/2<377@?XVFJdHk
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_IN  stuIn = new CTRL_ARM_DISARM_PARAM_EX_IN(); 
	
	/**
	 * \if ENGLISH_LANG
	 * alarm arm/diarm control output
	 * \else
	 * 1(>/2<377@?XVFJd3v
	 * \endif
	 */
	public CTRL_ARM_DISARM_PARAM_EX_OUT stuOut = new CTRL_ARM_DISARM_PARAM_EX_OUT(); 
}

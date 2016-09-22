package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_POINT_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Read-only parameter, shall return to sdk when set, it means supported pre-set number
	 * \else
	 * V;6A2NJ}#,IhVC5DJ1:rPhR*75;X8xsdk#,1mJ>V'3V5DT$VF5cJ}
	 * \endif
	 */
	public int              nSupportNum; 
	
	/**
	 * \if ENGLISH_LANG
	 * 2D config means point info.
	 * \else
	 * 6~N,OB1j1mJ>M(5@:E!#R*IhVC5D5cJ}V57ETZG0nSupportNum8vOB1j@oCf!#
	 * \endif
	 */
	public POINTCFG         stuPointCfg[] = new POINTCFG[16]; 
	
	public SDKDEV_POINT_CFG() {
		for (int i = 0; i < 16; i++) {
			stuPointCfg[i] = new POINTCFG();
		}
	}
}

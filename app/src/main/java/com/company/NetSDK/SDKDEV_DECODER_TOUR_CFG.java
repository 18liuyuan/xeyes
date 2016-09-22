package com.company.NetSDK;

import java.io.Serializable;

public class SDKDEV_DECODER_TOUR_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * the number of Configure structures. The biggest support 32. Specific number of support inquiries through capacity.
	 * \else
	 * EdVC=a99LeJ}D?. OVTZWn4sV'3V328v.>_LeV'3VJ}D??IRTM(9}D\A&2iQ/.
	 * \endif
	 */
	public int                             nCfgNum;

	/**
	 * \if ENGLISH_LANG
	 * Polling configuration array, the effective number of structures by the members of the "nCfgNum" designation. Keep left to expand 32.
	 * \else
	 * BVQ/EdVCJ}Wi,SPP'=a99Le8vJ}SI3IT1"nCfgNum"V86(. 1#At328vAt4}@)U9.
	 * \endif
	 */
	public SDKDEV_DECODER_TOUR_SINGLE_CFG   tourCfg[] = new SDKDEV_DECODER_TOUR_SINGLE_CFG[64];
	
	public SDKDEV_DECODER_TOUR_CFG() {
		for (int i = 0; i < 64; i++) {
			tourCfg[i] = new SDKDEV_DECODER_TOUR_SINGLE_CFG();
		}
	}
}

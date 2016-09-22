package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Host matrix control strategy configuration
 * \else
 * 1>;z>XUs?XVF2_BTEdVC
 * \endif
 */
public class SDKDEV_VIDEO_MATRIX_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Matrix amount(Note#:can not be modified.)
	 * \else
	 * >XUs8vJ}(W"#:2;TJPmP^8D)
	 * \endif
	 */
	public int                 nMatrixNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Video tour
	 * \else
	 * JSF5BVQ2
	 * \endif
	 */
	public SDK_VIDEOGROUP_CFG   struVideoGroup[] = new SDK_VIDEOGROUP_CFG[FinalVar.SDK_MATRIX_MAXOUT];
	
	public SDKDEV_VIDEO_MATRIX_CFG() {
		for (int i = 0; i < FinalVar.SDK_MATRIX_MAXOUT; i++) {
			struVideoGroup[i] = new SDK_VIDEOGROUP_CFG();
		}
	}
}

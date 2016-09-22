package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * audio talk configuration
 * \else
 * SoRt6T=21`BkEdVC
 * \endif
 */
public class SDKDEV_TALK_ENCODE_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Compression type,value,refer to DH_TALK_CODING_TYPE,please set the compression type according to the mode the device supports
	 * \else
	 * Q9Ku8qJ=#,C6>YV5#,O`<{DH_TALK_CODING_TYPE#,Gk8y>]Ih18V'3V5DSoRt6T=2@`PMIhVCQ9Ku8qJ=!#
	 * \endif
	 */
	public int                 nCompression;

	/**
	 * \if ENGLISH_LANG
	 * Encode mode, value, 0 means not support the compression tyep
	 * Set the responding type according to compression type
	 * like AMR, please refer to EM_ARM_ENCODE_MODE
	 * \else
	 * 1`BkD#J=#,C6>YV5#,N*0J11mJ>8CQ9Ku8qJ=2;V'3V1`BkD#J=!#
	 * 8y>]Q9Ku8qJ=?IRTIhVC6TS&5D1`Bk8qJ=#,Hg
	 * AMROj<{EM_ARM_ENCODE_MODE
	 * \endif
	 */
	public int                 nMode;
}

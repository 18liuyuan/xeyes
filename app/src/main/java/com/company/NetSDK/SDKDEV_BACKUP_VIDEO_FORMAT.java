package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video backup config parameter
 * \else
 * JSF5187]EdVC
 * \endif
 */
public class SDKDEV_BACKUP_VIDEO_FORMAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * file type to backup, 0:dav, 1:asf
	 * \else
	 * 187]ND<~@`PM, 0:dav, 1:asf
	 * \endif
	 */
	public byte    backupVideoFormat;

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * 187]C\Bk
	 * \endif
	 */
	public byte    password[] = new byte[6];
}

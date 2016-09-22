package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * CLIENT_StartUploadFileBurned()input param
 * \else
 * StartUploadFileBurned()JdHk2NJ}
 * \endif
 */
public class NET_IN_FILEBURNED_START implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * type of upload,"append", append mode " FILE.zip ",filename be ignored
	 * \else
	 * ND<~IO4+7=J="append",W7<SD#J=,4KJ1?LB<ND<~C{9L6(N*" FILE.zip ",filename1;:vBT
	 * \endif
	 */
	public String         		szMode;                         
	/**
	 * \if ENGLISH_LANG
	 * device name,example "/dev/sda"
	 * \else
	 * 9bELC{3F#,Hg!0/dev/sda!1
	 * \endif
	 */
	public String         		szDeviceName;                   
	/**
	 * \if ENGLISH_LANG
	 * local file name
	 * \else
	 * 1>5XND<~C{3F
	 * \endif
	 */
	public String         		szFilename;                     
	/**
	 * \if ENGLISH_LANG
	 * burn progress callback function
	 * \else
	 * ?LB<=x6H;X5w
	 * \endif
	 */
	public CB_fBurnFileCallBack   cbBurnPos;                      
}

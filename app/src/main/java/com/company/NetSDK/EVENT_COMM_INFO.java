package com.company.NetSDK;

import java.io.Serializable;

public class EVENT_COMM_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * NTP time sync status 
	 * \else
	 * NTPP#J1W4L,
	 * \endif
	 */
	public int                  emNTPStatus;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info number
	 * \else
	 * <]J;T1PEO"J}
	 * \endif
	 */
	public int                  nDriversNum;
	
	/**
	 * \if ENGLISH_LANG
	 * driver info data 
	 * \else
	 * <]J;T1PEO"J}>]
	 * \endif
	 */
	public SDK_MSG_OBJECT_EX    pstDriversInfo[];
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 1>5XS2EL;rU_sd?(3I9&P4HkB7>6,N*NULLJ1#,B7>62;4fTZ
	 * \endif
	 */
	public String               pszFilePath;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * Ih183I9&P45=ftp7~NqFw5DB7>6
	 * \endif
	 */
	public String               pszFTPPath;
	
	/**
	 * \if ENGLISH_LANG
	 * 
	 * \else
	 * 51G0=SHkPhR*;qH!51G0N%UB5D9XA*JSF55DFTPIO4+B7>6
	 * \endif
	 */
	public String               pszVideoPath;
}

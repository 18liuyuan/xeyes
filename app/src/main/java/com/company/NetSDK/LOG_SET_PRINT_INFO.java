package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK global log print
 * \else
 * SDKH+>VHUV>4rS!PEO"
 * \endif
 */
public class LOG_SET_PRINT_INFO implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * reset log path
	 * \else
	 * JG7qVXIhHUV>B7>6
	 * \endif
	 */
	public boolean            bSetFilePath;

	/**
	 * \if ENGLISH_LANG
	 * log path(default"./sdk_log/sdk_log.log")
	 * \else
	 * HUV>B7>6(D,HO"./sdk_log/sdk_log.log")
	 * \endif
	 */
	public byte            szLogFilePath[] = new byte[FinalVar.MAX_LOG_PATH_LEN];

	/**
	 * \if ENGLISH_LANG
	 * reset log size
	 * \else
	 * JG7qVXIhHUV>ND<~4sP!
	 * \endif
	 */
	public boolean            bSetFileSize;

	/**
	 * \if ENGLISH_LANG
	 * each log file size(default size 10240), unit:bit
	 * \else
	 * C?8vHUV>ND<~5D4sP!(D,HO4sP!10240), 5%N;:1HLX
	 * \endif
	 */
	public int    nFileSize;

	/**
	 * \if ENGLISH_LANG
	 * reset log file number
	 * \else
	 * JG7qVXIhHUV>ND<~8vJ}
	 * \endif
	 */
	public boolean            bSetFileNum;

	/**
	 * \if ENGLISH_LANG
	 * log file quantity(default size 10)
	 * \else
	 * HF=SHUV>ND<~8vJ}(D,HO4sP!10)
	 * \endif
	 */
	public int    nFileNum;

	/**
	 * \if ENGLISH_LANG
	 * reset log print strategy
	 * \else
	 * JG7qVXIhHUV>4rS!Jd3v2_BT
	 * \endif
	 */
	public boolean            bSetPrintStrategy;

	/**
	 * \if ENGLISH_LANG
	 * log out strategy, 0: output to file(defualt); 1:output to window
	 * \else
	 * HUV>Jd3v2_BT, 0:Jd3v5=ND<~(D,HO); 1:Jd3v5=40?Z
	 * \endif
	 */
	public int    nPrintStrategy;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * GetMemberNames output parameter
 * \else
 * GetMemberNamesJd3v2NJ}
 * \endif
 */
public class NET_OUT_MEMBERNAME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The error code device returns
	 * \else
	 * Ih1875;X5D4mNsBk
	 * \endif
	 */
	public int           nError;
	
	/**
	 * \if ENGLISH_LANG
	 * Device reboot or not
	 * \else
	 * Ih18JG7qVXFt
	 * \endif
	 */
	public int           nRestart;
	
	/**
	 * \if ENGLISH_LANG
	 * Name amount. Fromt the capability set. Caller fill in.
	 * \else
	 * C{3F8vJ} M(9}D\A&</5C5=#,5wSCU_LnP4
	 * \endif
	 */
	public int           nTotalNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The returned actual name amount
	 * \else
	 * 75;X5DJ5<JC{3F8vJ}
	 * \endif
	 */
	public int           nRetNameCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Name array. The caller apply for the memory. The amount is nTotalNameCount.
	 * \else
	 * C{3FJ}Wi 5wSCU_IjGkDZ4f#,8vJ}JGnTotalNameCount8v
	 * \endif
	 */
	public NET_ARRAY[]   pstNames;
	
	public NET_OUT_MEMBERNAME(int nTotalNameCount, int nNameLen) {
		this.nTotalNameCount = nTotalNameCount;
		pstNames = new NET_ARRAY[nTotalNameCount];
		for (int i = 0; i < nTotalNameCount; i++) {
			pstNames[i] = new NET_ARRAY();
			pstNames[i].dwArrayLen = nNameLen;
			pstNames[i].pArray = new byte[nNameLen];
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * spake disk info
 * \else
 * HH182YWw
 * \endif
 */
public class CTRL_SPARE_DISK_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Enable
	 * \else
	 * Enable#,J9D\#,Disable#,2;J9D\
	 * \endif
	 */
	public byte		szAction[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * Global,Local
	 * \else
	 * Global#,H+>VHH18#,Local#,7GH+>VHH18
	 * \endif
	 */
	public byte		szScope[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * name
	 * \else
	 * HH18C{WV#,HtScopeN*Global#,TrN*HH183X5DC{3F#,7qTr1mJ>RaidWi5DC{3F
	 * \endif
	 */
	public byte		szName[] = new byte[16]; 
	
	/**
	 * \if ENGLISH_LANG
	 * disk index
	 * \else
	 * 4EELPr:E
	 * \endif
	 */
	public int      nIndex;
}

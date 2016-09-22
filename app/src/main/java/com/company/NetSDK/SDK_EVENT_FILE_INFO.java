package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Event file info
 * \else
 * JB<~6TS&ND<~PEO"
 * \endif
 */
public class SDK_EVENT_FILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * The file count in the current file's group
	 * \else
	 * 51G0ND<~KyTZND<~WiVP5DND<~W\J}
	 * \endif
	 */
	public byte               	bCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The index of the file in the group
	 * \else
	 * 51G0ND<~TZND<~WiVP5DND<~1`:E(1`:E1?*J<)
	 * \endif
	 */
	public byte               	bIndex;
	
	/**
	 * \if ENGLISH_LANG
	 * File tag, see the enum struct EM_EVENT_FILETAG
	 * \else
	 * ND<~1jG)#,>_LeK5Cw<{C6>Y@`PMEM_EVENT_FILETAG
	 * \endif
	 */
	public byte               	bFileTag;
	
	/**
	 * \if ENGLISH_LANG
	 * File type,0-normal 1-compose 2-cut picture
	 * \else
	 * ND<~@`PM#,0-FUM( 1-:O3I 2-?YM<
	 * \endif
	 */
	public byte               	bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * File time
	 * \else
	 * ND<~J1<d
	 * \endif
	 */
	public NET_TIME_EX        	stuFileTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * The only id of one group file
	 * \else
	 * M,R;WiW%EDND<~5DN(R;1jJ6
	 * \endif
	 */
	public int              	nGroupId;
}

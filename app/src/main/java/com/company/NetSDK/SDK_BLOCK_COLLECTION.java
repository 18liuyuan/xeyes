package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Areas collection
 * \else
 * Gx?iJU2X
 * \endif
 */
public class SDK_BLOCK_COLLECTION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Split mode
	 * \else
	 * 7V8nD#J=
	 * \endif
	 */
	public int					emSplitMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Window info array
	 * \else
	 * 40?ZPEO"J}Wi
	 * \endif
	 */
	public SDK_WINDOW_COLLECTION stuWnds[] = new SDK_WINDOW_COLLECTION[FinalVar.SDK_MAX_SPLIT_WINDOW];
	
	/**
	 * \if ENGLISH_LANG
	 * Count of window
	 * \else
	 * 40?ZJ}A?
	 * \endif
	 */
	public int					nWndsCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Favorites name
	 * \else
	 * JU2X<PC{3F
	 * \endif
	 */
	public byte				szName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * Jd3vM(5@:E, 0|@(F4=SFA
	 * \endif
	 */
	public int					nScreen;					 
	
	public SDK_BLOCK_COLLECTION() {
		for (int i=0 ; i<FinalVar.SDK_MAX_SPLIT_WINDOW; i++) {
			stuWnds[i] = new SDK_WINDOW_COLLECTION();
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SetSplitSourceEx Port output parameter
 * \else
 * SetSplitSourceEx =S?Z5DJd3v2NJ}
 * \endif
 */
public class NET_OUT_SET_SPLIT_SOURCE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Successfully set return value, corresponding NET_IN_SET_SPLIT_SOURCE window group, user allocated memory, if no need it can be NULL
	 * \else
	 * IhVC3I9&:s5D75;XV5, 6TS&NET_IN_SET_SPLIT_SOURCEVP5D40?ZJ}Wi, SC;'7VEdDZ4f, Hg9{2;PhR*?IRTN*NULL
	 * \endif
	 */
	public NET_SET_SPLIT_SOURCE_RESULT pstuResults[];
	
	/**
	 * \if ENGLISH_LANG
	 * pstuResults group size
	 * \else
	 * pstuResultsJ}Wi5D4sP!
	 * \endif
	 */
	public int						nMaxResultCount;
	
	/**
	 * \if ENGLISH_LANG
	 * Return quantity
	 * \else
	 * 75;X5DJ}A?
	 * \endif
	 */
	public int						nRetCount;
	
	public NET_OUT_SET_SPLIT_SOURCE(int nMaxResultCount) {
		this.nMaxResultCount = nMaxResultCount;
		pstuResults = new NET_SET_SPLIT_SOURCE_RESULT[nMaxResultCount];
		for (int i = 0; i < nMaxResultCount; i++) {
			pstuResults[i] = new NET_SET_SPLIT_SOURCE_RESULT();
		}
	}
}

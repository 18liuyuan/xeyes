package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Query Conditions Of Traffic Black And White List Account Records
 * \else
 * =;M(:Z0WC{5%UK;'<GB<2iQ/Lu<~
 * \endif
 */
public class FIND_RECORD_TRAFFICREDLIST_CONDITION implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number
	 * \else
	 * 35EF:E
	 * \endif
	 */
	public char                     szPlateNumber[] = new char[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * License Plate Number Fuzzy Query
	 * \else
	 * 35EF:EBkD#:}2iQ/
	 * \endif
	 */
	public char                     szPlateNumberVague[] = new char[FinalVar.SDK_MAX_PLATE_NUMBER_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Offset in the query results of first results returned
	 * \else
	 * 5ZR;8vLu75;X=a9{TZ2iQ/=a9{VP5DF+RFA?
	 * \endif
	 */
	public int                      nQueryResultBegin;

	/**
	 * \if ENGLISH_LANG
	 * Whether support the quick query, TRUE: for quick, quick query time don't wait for all add, delete, change operation is completed. The default is non-quick query
	 * \else
	 * JG7q?lKY2iQ/, TRUE:N*?lKY#,?lKY2iQ/J12;5H4}KySPTv!"I>!"8D2YWwMj3I!#D,HON*7G?lKY2iQ/
	 * \endif
	 */
	public boolean                     bRapidQuery;
}

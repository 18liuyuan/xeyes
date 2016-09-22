package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Info of enrichment record file 
 * \else
 * E(KuB<OqND<~PEO"
 * \endif
 */
public class NET_SYNOPSISFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * File name
	 * \else
	 * ND<~C{  
	 * \endif
	 */
	public byte				szFileName[] = new byte[FinalVar.MAX_PATH];
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME			stuStartTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME			stuEndTime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * Server mark,with szFileName[] a choise
	 * \else
	 * TZ7~NqFw@o5D1jJ>#,SkND<~C{2Q!1J9SC
	 * \endif
	 */
	public int					nTaskID;
	
	/**
	 * \if ENGLISH_LANG
	 * 1-record file, 2- source file
	 * \else
	 * 1-JSF5E(KuB<OqND<~#,2-JSF5E(KuT4ND<~
	 * \endif
	 */
	public byte				bFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * OBTXD#J=: 0-04ND<~OBTX, 1-04J1<dOBTX, 2-04ND<~F+RFOBTX
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * file length (byte)
	 * \else
	 * ND<~4sP!#,5%N;:KB
	 * \endif
	 */
	public int					nFileLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * FpJ<ND<~F+RF, 5%N;: KB
	 * \endif
	 */
	public int					nStartFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * =aJxND<~F+RF, 5%N;: KB
	 * \endif
	 */
	public int					nEndFileOffset;			 
}

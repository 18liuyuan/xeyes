package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record file information
 * \else
 * B<OqND<~PEO"
 * \endif
 */
public class NET_RECORDFILE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel number
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int					ch;
	
	/**
	 * \if ENGLISH_LANG
	 * File name 
	 * \else
	 * ND<~C{
	 * \endif
	 */
	public byte					filename[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * File length 
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
	public int					size;
	
	/**
	 * \if ENGLISH_LANG
	 * Start time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME				starttime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * End time 
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME				endtime = new NET_TIME();
	
	/**
	 * \if ENGLISH_LANG
	 * HDD number 
	 * \else
	 * 4EEL:E(Gx7VMxBgB<Oq:M1>5XB<Oq5D@`PM#,0#-1271mJ>1>5XB<Oq,FdVP641mJ>9bEL1#,1281mJ>MxBgB<Oq)
	 * \endif
	 */
	public int					driveno;
	
	/**
	 * \if ENGLISH_LANG
	 * Initial cluster number 
	 * \else
	 * FpJ<4X:E
	 * \endif
	 */
	public int					startcluster;
	
	/**
	 * \if ENGLISH_LANG
	 * Recorded file type  0:general record;1:alarm record ;2:motion detection;3:card number record ;4:image
	 * \else
	 * B<OsND<~@`PM  0#:FUM(B<Os#;1#:1(>/B<Os#;2#:RF6/<l2b#;3#:?(:EB<Os#;4#:M<F,
	 * \endif
	 */
	public byte					nRecordFileType;
	
	/**
	 * \if ENGLISH_LANG
	 * 0:general record 1:Important record
	 * \else
	 * 0:FUM(B<Oq 1:VXR*B<Oq
	 * \endif
	 */
	public byte                 bImportantRecID;
	
	/**
	 * \if ENGLISH_LANG
	 * Document Indexing, when nRecordFileType == 4(Picture), "bImportantRecID << 8 + bHint" is index 
	 * \else
	 * ND<~6(N;KwR}, nRecordFileType == 4(M<F,)J1, "bImportantRecID << 8 + bHint", Wi3IM<F,6(N;KwR} 
	 * \endif
	 */
	public byte                 bHint;
	
	/**
	 * \if ENGLISH_LANG
	 * 0-main stream record 1-sub1 stream record 2-sub2 stream record 3-sub3 stream record
	 * \else
	 * 0-VwBkAwB<Oq 1-8(Bk1AwB<Oq 2-8(BkAw2 3-8(BkAw3B<Oq
	 * \endif
	 */
	public byte                 bRecType;
}

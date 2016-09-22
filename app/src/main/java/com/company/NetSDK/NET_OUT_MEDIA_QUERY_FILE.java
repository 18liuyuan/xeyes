package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Record info, corresponde to CLIENT_FindFileEx, search result
 * \else
 * B<OqPEO"6TS& FindFileEx=S?Z5D SDK_FILE_QUERY_FILE C|An 2iQ/=a9{
 * \endif
 */
public class NET_OUT_MEDIA_QUERY_FILE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel ID,from 0,-1 means search all
	 * \else
	 * M(5@:E4S0?*J<#,-11mJ>2iQ/KySPM(5@
	 * \endif
	 */
	public int					nChannelID;
	
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
	 * Size of file
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
    public int					nFileSize;
    
	/**
	 * \if ENGLISH_LANG
	 * File type 1:jpg, 2: dav
	 * \else
	 * ND<~@`PM 1:jpgM<F,, 2: dav
	 * \endif
	 */
    public byte				byFileType;
    
	/**
	 * \if ENGLISH_LANG
	 * Drive no.
	 * \else
	 * 4EEL:E
	 * \endif
	 */
    public byte                byDriveNo;
    
	/**
	 * \if ENGLISH_LANG
	 * Cluster
	 * \else
	 * 4X:E
	 * \endif
	 */
    public int      			nCluster;
    
	/**
	 * \if ENGLISH_LANG
	 * Path of file
	 * \else
	 * ND<~B7>6
	 * \endif
	 */
    public char				szFilePath[] = new char[FinalVar.MAX_PATH];
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * SDK_FILE_QUERY_FACE_DETECTIONcorresponding face recognition service FINDNEXT search return parameter
 * \else
 * SDK_FILE_QUERY_FACE_DETECTION6TS&5DHKA3J61p7~NqFINDNEXT2iQ/75;X2NJ}
 * \endif
 */
public class MEDIAFILE_FACE_DETECTION_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * channel no.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int        ch;

	/**
	 * \if ENGLISH_LANG
	 * file path
	 * \else
	 * ND<~B7>6
	 * \endif
	 */
	public byte                szFilePath[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * file length
	 * \else
	 * ND<~3$6H
	 * \endif
	 */
	public int        size;

	/**
	 * \if ENGLISH_LANG
	 * start time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME            starttime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * end time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME            endtime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * working directory no.
	 * \else
	 * 9$WwD?B<1`:E
	 * \endif
	 */
	public int        nWorkDirSN;

	/**
	 * \if ENGLISH_LANG
	 * file type  1#:jpg picture
	 * \else
	 * ND<~@`PM  1#:jpgM<F,
	 * \endif
	 */
	public byte                nFileType;

	/**
	 * \if ENGLISH_LANG
	 * file positioning index
	 * \else
	 * ND<~6(N;KwR}
	 * \endif
	 */
	public byte                bHint;

	/**
	 * \if ENGLISH_LANG
	 * disk no.
	 * \else
	 * 4EEL:E
	 * \endif
	 */
	public byte                bDriveNo;

	/**
	 * \if ENGLISH_LANG
	 * picture type, 0-normal, 1-combined, 2-cut
	 * \else
	 * M<F,@`PM, 0-FUM(, 1-:O3I, 2-?YM<
	 * \endif
	 */
	public byte                byPictureType;

	/**
	 * \if ENGLISH_LANG
	 * cluster no.
	 * \else
	 * 4X:E
	 * \endif
	 */
	public int        nCluster;

	/**
	 * \if ENGLISH_LANG
	 * picture type#,see EM_FACE_PIC_TYPE
	 * \else
	 * M<F,@`PM#,Oj<{EM_FACE_PIC_TYPE
	 * \endif
	 */
	public int     emPicType;

	/**
	 * \if ENGLISH_LANG
	 * object ID
	 * \else
	 * NoLeID
	 * \endif
	 */
	public int               dwObjectId;

	/**
	 * \if ENGLISH_LANG
	 * frame no.,group has two elements#,one means small picture#,two means large picture
	 * \else
	 * V!Pr:E,J}WiSP28vT*KXJ1#,5ZR;8v1mJ>P!M<#,5Z6~8v1mJ>4sM<
	 * \endif
	 */
	public int               dwFrameSequence[] = new int[FinalVar.NET_MAX_FRAMESEQUENCE_NUM];

	/**
	 * \if ENGLISH_LANG
	 * frame no.quantity
	 * \else
	 * V!Pr:E8vJ}
	 * \endif
	 */
	public int                 nFrameSequenceNum;

	/**
	 * \if ENGLISH_LANG
	 * time#,group has two elements#,one means small picture#,two means large picture
	 * \else
	 * 7"IzJ1<d#,J}WiSP28vT*KXJ1#,5ZR;8v1mJ>P!M<#,5Z6~8v1mJ>4sM<
	 * \endif
	 */
	public NET_TIME_EX         stTimes[] = new NET_TIME_EX[FinalVar.NET_MAX_TIMESTAMP_NUM];
	
	public int                 nTimeStampNum;

	/**
	 * \if ENGLISH_LANG
	 * Picture number in the cluster
	 * For packaged multiple images in the same cluster,provides indexed mode to position pictures
	 * \else
	 * 1mJ>TZ4XVP5DM<F,Pr:E
	 * 6TSZM,R;8v4XVP4r0|6`UEM<F,,La9)KwR}7=J=6(N;M<F,
	 * \endif
	 */
	public int                 nPicIndex;
	
	public MEDIAFILE_FACE_DETECTION_INFO() {
		for (int i = 0; i < FinalVar.NET_MAX_TIMESTAMP_NUM; i++) {
			stTimes[i] = new NET_TIME_EX();
		}
	}
}

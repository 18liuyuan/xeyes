package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The corresponding parameter when setting log in
 * \else
 * IhVC5GHkJ15DO`9X2NJ}
 * \endif
 */
public class NET_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Waiting time(unit is ms), 0:default 5000ms.
	 * \else
	 * 5H4}3,J1J1<d(:ACkN*5%N;)#,N*0D,HO5000ms
	 * \endif
	 */
	public int					nWaittime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection timeout value(Unit is ms), 0:default 1500ms.
	 * \else
	 * A,=S3,J1J1<d(:ACkN*5%N;)#,N*0D,HO1500ms
	 * \endif
	 */
	public int					nConnectTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Connection trial times(Unit is ms), 0:default 1.
	 * \else
	 * A,=S3"JT4NJ}#,N*0D,HO14N
	 * \endif
	 */
	public int					nConnectTryNum;
	
	/**
	 * \if ENGLISH_LANG
	 * Sub-connection waiting time(Unit is ms), 0:default 10ms.
	 * \else
	 * WSA,=SV.<d5D5H4}J1<d(:ACkN*5%N;)#,N*0D,HO10ms
	 * \endif
	 */
	public int					nSubConnectSpaceTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to device information timeout, 0:default 1000ms.
	 * \else
	 * ;qH!Ih18PEO"3,J1J1<d#,N*0D,HO1000ms
	 * \endif
	 */
	public int					nGetDevInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Each connected to receive data buffer size(Bytes), 0:default 250*1024
	 * \else
	 * C?8vA,=S=SJUJ}>];:3e4sP!(WV=ZN*5%N;)#,N*0D,HO250*1024
	 * \endif
	 */
	public int					nConnectBufSize;
	
	/**
	 * \if ENGLISH_LANG
	 * Access to sub-connect information timeout(Unit is ms), 0:default 1000ms.
	 * \else
	 * ;qH!WSA,=SPEO"3,J1J1<d(:ACkN*5%N;)#,N*0D,HO1000ms
	 * \endif
	 */
	public int					nGetConnInfoTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Timeout value of search video (unit ms), default 3000ms
	 * \else
	 * 04J1<d2iQ/B<OqND<~5D3,J1J1<d(:ACkN*5%N;),N*0D,HON*3000ms
	 * \endif
	 */
	public int                  nSearchRecordTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Dislink disconnect time,0:default 60000ms
	 * \else
	 * <l2bWSA4=S6OO_5H4}J1<d(:ACkN*5%N;)#,N*0D,HON*60000ms
	 * \endif
	 */
	public int                  nsubDisconnetTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Net type, 0-LAN, 1-WAN
	 * \else
	 * MxBg@`PM, 0-LAN, 1-WAN
	 * \endif
	 */
	public byte					byNetType;
	
	/**
	 * \if ENGLISH_LANG
	 * Playback data from the receive buffer size(m),when value = 0,default 4M
	 * \else
	 * ;X7EJ}>]=SJU;:3e4sP!#(MN*5%N;#)#,N*0D,HON*4M
	 * \endif
	 */
	public byte                 byPlaybackBufSize;
	        
	/**
	 * \if ENGLISH_LANG
	 * actual pictures of the receive buffer size(byte)when value = 0,default 2*1024*1024
	 * \else
	 * J5J1M<F,=SJU;:3e4sP!#(WV=ZN*5%N;#)#,N*0D,HON*2*1024*1024
	 * \endif
	 */
	public int                  nPicBufSize;             		 
}

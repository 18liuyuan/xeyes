package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The first recording time
 * \else
 * WnTgB<OqJ1<d
 * \endif
 */
public class NET_FURTHEST_RECORD_TIME implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel amount
	 * \else
	 * M(5@J}D?
	 * \endif
	 */
	public int					nChnCount;
	
	/**
	 * \if ENGLISH_LANG
	 * The first recording time, valid value is 0 to (nChnCount-1).If there is no video, the first recording time is 0.
	 * \else
	 * WnTgB<OqJ1<d,SPP'V5N*G0Cf0 5= (nChnCount-1)8v.Hg9{D3M(5@C;SPB<Os5D;0#,WnTgB<OsJ1<dH+N*0
	 * \endif
	 */
	public NET_TIME			stuFurthestTime[] = new NET_TIME[16];
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.means pStuFurthestTimeAll memory size.
	 * \else
	 * 51M(5@8vJ}4sSZ16J1#,J9SC!#1mJ>OBCfpStuFurthestTimeAllUb?iDZ4f4sP!!#
	 * \endif
	 */
	public int					dwFurthestTimeAllSize;
	
	/**
	 * \if ENGLISH_LANG
	 * when channel >16,use this field.need user apply, memory size(nChnCount*sizeof(NET_TIME)).
	 * \else
	 * 51M(5@8vJ}4sSZ16J1#,J9SC!#4K2?7VDZ4fPhR*SC;'IjGk,IjGk4sP!N*(M(5@8vJ}*sizeof(NET_TIME))!#
	 * \endif
	 */
	public NET_TIME			pStuFurthestTimeAll[];
	
	/**
	 * \if ENGLISH_LANG
	 * Reserved words
	 * \else
	 * 1#AtWV6N
	 * \endif
	 */
	public byte				bReserved[] = new byte[376];			 
	
	public NET_FURTHEST_RECORD_TIME(int nMaxChnNum)
	{
		nChnCount = nMaxChnNum; 
		for (int i = 0; i < 16; i++)
		{
			stuFurthestTime[i] = new NET_TIME();
		}
		
		pStuFurthestTimeAll = new NET_TIME[nChnCount];
		for (int j = 0; j < nChnCount; j++)
		{
			pStuFurthestTimeAll[j] = new NET_TIME();
		}
	}
}

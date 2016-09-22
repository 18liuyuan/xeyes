package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * when nTriggerType==2, client snap info
 * \else
 * nTriggerType==2J1 ?M;'6K4%7"W%ED2NJ}
 * \endif
 */
public class NET_CLIENT_SNAP_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Frame no.
	 * \else
	 * V!Pr:E
	 * \endif
	 */
	public int                 nFrameSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Time stamp, 64 bit ms time stamp
	 * \else
	 * J1<d4A,64N;:ACkJ1<d4A
	 * \endif
	 */
	public double              PTS;
	
	/**
	 * \if ENGLISH_LANG
	 * String#,client custom,"\0" end
	 * \else
	 * WV7{4.#,?M;'6KWT6(Re,"\0"=aN2
	 * \endif
	 */
	public byte				szUserDefinedInfo[] = new byte[FinalVar.SDK_MAX_USER_DEFINE_INFO];
	
	/**
	 * \if ENGLISH_LANG
	 * Client Type {@link com.company.NetSDK.SNAP_CLIENT_TYPE SNAP_CLIENT_TYPE}
	 * \else
	 * ?M;'6K@`PM {@link com.company.NetSDK.SNAP_CLIENT_TYPE SNAP_CLIENT_TYPE}
	 * \endif
	 */
	public int    emSNAP_CLIENT_TYPE;
	
	/**
	 * \if ENGLISH_LANG
	 * Issue card quantity
	 * \else
	 * ?(F,8vJ}
	 * \endif
	 */
	public int               dwRetCardNumber;
    
    /**
	 * \if ENGLISH_LANG
	 * Card Info
	 * \else
	 * ?(F,PEO"
	 * \endif
	 */
	public EVENT_CARD_INFO     stuCardInfo[] = new EVENT_CARD_INFO[FinalVar.SDK_EVENT_MAX_CARD_NUM];
	
	public NET_CLIENT_SNAP_INFO() {
		for (int i = 0; i < FinalVar.SDK_EVENT_MAX_CARD_NUM; i++) {
			stuCardInfo[i] = new EVENT_CARD_INFO();
		}
	}
}

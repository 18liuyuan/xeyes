package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * WEB path configuration
 * \else
 * WEBB7>6EdVC
 * \endif
 */
public class SDKDEV_URL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Snap or not
	 * \else
	 * JG7qW%M<
	 * \endif
	 */
	public boolean                bSnapEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap interval
	 * \else
	 * W%M<V\FZ
	 * \endif
	 */
	public int                 iSnapInterval;
	
	/**
	 * \if ENGLISH_LANG
	 * HTTP host IP
	 * \else
	 * HTTPVw;zIP
	 * \endif
	 */
	public byte                szHostIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Host port
	 * \else
	 * Vw;zport
	 * \endif
	 */
    public short                wHostPort;
    
    /**
	 * \if ENGLISH_LANG
	 * Status message send out interval
	 * \else
	 * W4L,O{O"7"KM<d8t
	 * \endif
	 */
    public int                 iMsgInterval;
    
    /**
	 * \if ENGLISH_LANG
	 * Message status upload URL
	 * \else
	 * W4L,O{O"IO4+URL
	 * \endif
	 */
    public byte                szUrlState[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Picture upload Url 
	 * \else
	 * M<F,IO4+Url 
	 * \endif
	 */
    public byte                szUrlImage[] = new byte[FinalVar.SDK_MAX_URL_LEN];
    
    /**
	 * \if ENGLISH_LANG
	 * Device web SN
	 * \else
	 * ;zFw5Dweb1`:E
	 * \endif
	 */
    public byte                szDevId[] = new byte[FinalVar.SDK_MAX_DEV_ID_LEN];
}

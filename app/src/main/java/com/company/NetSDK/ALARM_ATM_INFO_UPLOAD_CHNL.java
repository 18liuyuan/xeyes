package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Alarming Decoder Alarm
 * \else
 * 1(>/=bBkFw1(>/
 * \endif
 */
public class ALARM_ATM_INFO_UPLOAD_CHNL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * channel
	 * \else
	 * 1(>/=bBkFw1(>/
	 * \endif
	 */
	public int                 nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * ATM id
	 * \else
	 * ATMVU6K:E
	 * \endif
	 */
	public byte                szATMID[] = new byte[32];
	
 	/**
	 * \if ENGLISH_LANG
	 * card number, 6222421541208230456
	 * \else
	 * ?(:E    @}#:6222421541208230456 
	 * \endif
	 */
    public byte                szCardNo[] = new byte[32];
    
 	/**
	 * \if ENGLISH_LANG
	 * trade time, 20111118112200 means 2011-11-18 11:22:00	
	 * \else
	 * =;RWJ1<d    @}#:201111181122001mJ>2011-11-18 11:22:00
	 * \endif
	 */
    public byte                szTradetime[] = new byte[32];
    
 	/**
	 * \if ENGLISH_LANG
	 * trade type
	 * \else
	 * =;RW@`PM    76N': SDK_eATMTradeTypes
	 * \endif
	 */
    public int                 emTradeType;
    
 	/**
	 * \if ENGLISH_LANG
	 * trade mount	0-4294967296
	 * \else
	 * =;RW=p6n    0-4294967296
	 * \endif
	 */
    public int                 nAmount;                    
}

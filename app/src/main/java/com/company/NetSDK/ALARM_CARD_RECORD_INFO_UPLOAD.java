package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Mobile Custom Info Uploading Structure
 * \else
 * ?(:EB<OqPEO"IO4+
 * \endif
 */
public class ALARM_CARD_RECORD_INFO_UPLOAD implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

 	/**
	 * \if ENGLISH_LANG
	 * Channel No.
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                    nChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Recording or not 
	 * \else
	 * JG7qU}TZ?(:EB<Oq
	 * \endif
	 */
	public boolean                bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Card No. Info 
	 * \else
	 * ?(:EPEO"
	 * \endif
	 */
	public byte                   szCardInfo[] = new byte[FinalVar.SDK_MAX_CARD_INFO_LEN];
	
 	/**
	 * \if ENGLISH_LANG
	 * The Card No. Effect of Starting Time 
	 * \else
	 * 8C?(:EIzP'FpJ<J1<d
	 * \endif
	 */
	public NET_TIME               stuTime = new NET_TIME();
	
 	/**
	 * \if ENGLISH_LANG
	 * Preview Overlay Enable 
	 * \else
	 * T$@@5~<SJ9D\
	 * \endif
	 */
	public boolean                bPreviewOverlayEn;
	
 	/**
	 * \if ENGLISH_LANG
	 * Overlay Position,1-Upper Left#,2-Lower Left#,3-Upper Right#,4-Lower Right 
	 * \else
	 * 5~<SN;VC,1-WsIO#,2-WsOB#,3-SRIO#,4-SROB
	 * \endif
	 */
	public byte                   byOverlayPos;                       
}

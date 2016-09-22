package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * activate zone info
 * \else
 * <$;n5D7@GxPEO"
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * zone channel no.
	 * \else
	 * 7@GxM(5@:E
	 * \endif
	 */
	public int nChannel;
	
	/**
	 * \if ENGLISH_LANG
	 * zone activation time 
	 * \else
	 * 7@Gx<$;nJ1<d
	 * \endif
	 */
	public NET_TIME stuActivationTime = new NET_TIME();

}

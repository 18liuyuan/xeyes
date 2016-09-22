package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * RTSP Configuration Structure
 * \else
 * RTSP5DEdVC=a99Le
 * \endif
 */
public class CFG_RTSP_INFO_OUT implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * U{8v9&D\JG7qJ9D\
	 * \endif
	 */
	public boolean 			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RTSP Port 
	 * \else
	 * RTSP7~Nq6K?Z
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtp Start Port 
	 * \else
	 * RTPFpJ<6K?Z
	 * \endif
	 */
	public int				nRtpStartPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * nRtp End Port 
	 * \else
	 * RTP=aJx6K?Z
	 * \endif
	 */
	public int				nRtpEndPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Enable 
	 * \else
	 * RtspOverHttpJ9D\
	 * \endif
	 */
	public boolean			bHttpEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * RtspOverHttp Port 
	 * \else
	 * RtspOverHttp6K?Z
	 * \endif
	 */
	public int				nHttpPort;
}

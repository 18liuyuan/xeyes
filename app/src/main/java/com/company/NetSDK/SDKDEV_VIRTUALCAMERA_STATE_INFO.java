package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device VIRTUALCAMERA informaiton 
 * \else
 * PiDbIcOqM7W4L,2iQ/
 * \endif
 */
public class SDKDEV_VIRTUALCAMERA_STATE_INFO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * connect state, see CONNECT_STATE
	 * \else
	 * A,=SW4L,#,2i?4CONNECT_STATE
	 * \endif
	 */
    public int                 emConnectState;
	
	/**
	 * \if ENGLISH_LANG
	 * uiPOEPort
	 * \else
	 * 4KPiDbIcOqM7KyA,=S5DPOE6K?Z:E#,01mJ>2;JGPOEA,=S 
	 * \endif
	 */
	public int					uiPOEPort;
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceName
	 * \else
	 * Ih18C{3F
	 * \endif
	 */
	public byte                	szDeviceName[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * DeviceType
	 * \else
	 * Ih18@`PM
	 * \endif
	 */
	public byte                	szDeviceType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SystemType
	 * \else
	 * O5M30f1>
	 * \endif
	 */
	public byte                	szSystemType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * SerialNumber
	 * \else
	 * PrAP:E
	 * \endif
	 */
	public byte                	szSerialNo[] = new byte[48];
	
	/**
	 * \if ENGLISH_LANG
	 * VideoInput
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int					nVideoInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AudioInput
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int					nAudioInput;
	
	/**
	 * \if ENGLISH_LANG
	 * AlarmOutput
	 * \else
	 * Mb2?1(>/M(5@J}
	 * \endif
	 */
	public int					nAlarmOutput;

}

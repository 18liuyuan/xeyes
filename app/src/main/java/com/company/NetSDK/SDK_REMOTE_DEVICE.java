package com.company.NetSDK;

import java.io.Serializable;

public class SDK_REMOTE_DEVICE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * enable
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * IP
	 * \else
	 * IP
	 * \endif
	 */
	public byte                szIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * username
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte                szUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH];

	/**
	 * \if ENGLISH_LANG
	 * password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte                szPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH];

	/**
	 * \if ENGLISH_LANG
	 * port
	 * \else
	 * 6K?Z
	 * \endif
	 */
	public int                 nPort;

	/**
	 * \if ENGLISH_LANG
	 * definition. 0-standard definition, 1-high definition
	 * \else
	 * GeNz6H, 0-1jGe, 1-8_Ge
	 * \endif
	 */
	public int                 nDefinition;
	
	/**
	 * \if ENGLISH_LANG
	 * protocol type, SDK_DEVICE_PROTOCOL
	 * \else
	 * P-Ri@`PM, SDK_DEVICE_PROTOCOL
	 * \endif
	 */
	public int                 emProtocol;
	
	/**
	 * \if ENGLISH_LANG
	 * device name
	 * \else
	 * Ih18C{3F
	 * \endif
	 */
	public byte                szDevName[] = new byte[FinalVar.SDK_DEVICE_NAME_LEN];

	/**
	 * \if ENGLISH_LANG
	 * count channel of video input
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int                 nVideoInputChannels;

	/**
	 * \if ENGLISH_LANG
	 * count channel of audio input
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int                 nAudioInputChannels;

	/**
	 * \if ENGLISH_LANG
	 * device type, such as IPC, DVR, NVR
	 * \else
	 * Ih18@`PM, HgIPC, DVR, NVR5H
	 * \endif
	 */
	public byte                szDevClass[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * device type, such as IPC-HF3300
	 * \else
	 * Ih18>_LePM:E, HgIPC-HF3300
	 * \endif
	 */
	public byte                szDevType[] = new byte[FinalVar.SDK_DEV_TYPE_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Http port
	 * \else
	 * Http6K?Z
	 * \endif
	 */
	public int                 nHttpPort;

	/**
	 * \if ENGLISH_LANG
	 * max count of video input
	 * \else
	 * JSF5JdHkM(5@Wn4sJ}
	 * \endif
	 */
	public int                 nMaxVideoInputCount;

	/**
	 * \if ENGLISH_LANG
	 * return count
	 * \else
	 * 75;XJ5<JM(5@8vJ}
	 * \endif
	 */
	public int                 nRetVideoInputCount;
	
	/**
	 * \if ENGLISH_LANG
	 * max count of audion input
	 * \else
	 * JSF5JdHkM(5@PEO"
	 * \endif
	 */
    public SDK_VIDEO_INPUTS    pstuVideoInputs[]; 
    /**
	 * \if ENGLISH_LANG
	 * machine address
	 * \else
	 * Ih182?Jp5X
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[FinalVar.SDK_MAX_CARD_INFO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * serial no.
	 * \else
	 * Ih18PrAP:E
	 * \endif
	 */
	public byte                szSerialNo[] = new byte[FinalVar.SDK_SERIALNO_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Rtsp Port
	 * \else
	 * Rtsp6K?Z
	 * \endif
	 */
	public int                 nRtspPort;
	
	public SDK_REMOTE_DEVICE()
	{
		
	}
	
	public SDK_REMOTE_DEVICE(int nMaxVideoInputCount)
	{
		if(nMaxVideoInputCount > 0)
		{
			this.nMaxVideoInputCount = nMaxVideoInputCount;
			pstuVideoInputs = new SDK_VIDEO_INPUTS[this.nMaxVideoInputCount];
			for(int i = 0; i < this.nMaxVideoInputCount; i++)
			{
				pstuVideoInputs[i] = new SDK_VIDEO_INPUTS();
			}
		}
	}
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Remote Device Structure
 * \else
 * T63LIh18
 * \endif
 */
public class AV_CFG_RemoteDevice implements Serializable { 	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 	/**
	 * \if ENGLISH_LANG
	 * Enable 
	 * \else
	 * J9D\
	 * \endif
	 */
	public boolean			bEnable;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device ID 
	 * \else
	 * Ih18ID
	 * \endif
	 */
	public byte[]			szID = new byte[FinalVar.AV_CFG_Device_ID_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device IP 
	 * \else
	 * Ih18IP
	 * \endif
	 */
	public byte[]			szIP = new byte[FinalVar.AV_CFG_IP_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Port 
	 * \else
	 * 6K?Z
	 * \endif
	 */
	public int				nPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Protoco
	 * \else
	 * P-Ri@`PM
	 * \endif
	 */
	public byte[]			szProtocol = new byte[FinalVar.AV_CFG_Protocol_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Username 
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte[]			szUser = new byte[FinalVar.AV_CFG_User_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Password 
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte[]			szPassword = new byte[FinalVar.AV_CFG_Password_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Serial No.
	 * \else
	 * Ih18PrAP:E
	 * \endif
	 */
	public byte[]			szSerial = new byte[FinalVar.AV_CFG_Serial_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Class 
	 * \else
	 * Ih18@`PM
	 * \endif
	 */
	public byte[]			szDevClass = new byte[FinalVar.AV_CFG_Device_Class_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Type 
	 * \else
	 * Ih18PM:E
	 * \endif
	 */
	public byte[]			szDevType = new byte[FinalVar.AV_CFG_Device_Type_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Name 
	 * \else
	 * ;zFwC{3F
	 * \endif
	 */
	public byte[]			szName = new byte[FinalVar.AV_CFG_Device_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Address 
	 * \else
	 * ;zFw2?Jp5X5c
	 * \endif
	 */
	public byte[]			szAddress = new byte[FinalVar.AV_CFG_Address_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Device Group 
	 * \else
	 * ;zFw7VWi
	 * \endif
	 */
	public byte[]			szGroup = new byte[FinalVar.AV_CFG_Group_Name_Len];
	
 	/**
	 * \if ENGLISH_LANG
	 * Definition, 0-Standard Definition, 1-High Definition 
	 * \else
	 * GeNz6H, 0-1jGe, 1-8_Ge
	 * \endif
	 */
	public int				nDefinition;
	
 	/**
	 * \if ENGLISH_LANG
	 * Video Channel Input Number 
	 * \else
	 * JSF5JdHkM(5@J}
	 * \endif
	 */
	public int				nVideoChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Audio Channel Input Number 
	 * \else
	 * RtF5JdHkM(5@J}
	 * \endif
	 */
	public int				nAudioChannel;
	
 	/**
	 * \if ENGLISH_LANG
	 * Rtsp port no. 
	 * \else
	 * Rtsp6K?Z:E
	 * \endif
	 */
	public int				nRtspPort;
	
 	/**
	 * \if ENGLISH_LANG
	 * Device input type 
	 * \else
	 * Ih18=SHk@`PM
	 * \endif
	 */
	public byte[]			szVendor = new byte[FinalVar.MAX_PATH];
	
 	/**
	 * \if ENGLISH_LANG
	 * Video input channel#,user apply for nMaxVideoInputs CFG_RemoteDeviceVideoInputSpace 
	 * \else
	 * JSF5JdHkM(5@#,SC;'IjGknMaxVideoInputs8vCFG_RemoteDeviceVideoInput?U<d
	 * \endif
	 */
	public CFG_RemoteDeviceVideoInput[]			pVideoInput;

	public int				nMaxVideoInputs;

	public int				nRetVideoInputs;
	
 	/**
	 * \if ENGLISH_LANG
	 * http port
	 * \else
	 * http6K?Z:E
	 * \endif
	 */
	public int				nHttpPort;						
	
	public AV_CFG_RemoteDevice(int nMaxVideoInputs) {
		this.nMaxVideoInputs = nMaxVideoInputs;
		this.pVideoInput = new CFG_RemoteDeviceVideoInput[this.nMaxVideoInputs];
		for (int i = 0; i < this.nMaxVideoInputs; ++i) {
			this.pVideoInput[i] = new CFG_RemoteDeviceVideoInput();
		}
	}
}


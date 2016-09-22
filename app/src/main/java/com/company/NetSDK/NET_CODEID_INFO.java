package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Code info
 * \else
 * 6TBkPEO"
 * \endif
 */
public class NET_CODEID_INFO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private static final int SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN = 32;
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless ID
	 * \else
	 * N^O_ID:E
	 * \endif
	 */
	public long	nWirelessId;  
	
	/**
	 * \if ENGLISH_LANG
	 * The device type of wireless
	 * \else
	 * N^O_Ih18@`PM
	 * \endif
	 * @see NET_WIRELESS_DEVICE_TYPE
	 */
	public int	emType;
	
	/**
	 * \if ENGLISH_LANG
	 * User name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte[]	szName = new byte[FinalVar.SDK_USER_NAME_LENGTH];        
	
	/**
	 * \if ENGLISH_LANG
	 * If enable the device
	 * \else
	 * JG7qFtSCAK4KIh18
	 * \endif
	 */
	public boolean bEnable;                            
	
	/**
	 * \if ENGLISH_LANG
	 * Custom name
	 * \else
	 * WT6(ReC{3F
	 * \endif
	 */
	public byte[] szCustomName = new byte[FinalVar.SDK_COMMON_STRING_64];  
	
	/**
	 * \if ENGLISH_LANG
	 * It only to be valid when emType is NET_WIRELESS_DEVICE_TYPE_DEFENCE
	 * \else 
	 * N^O_7@Gx5DalarmM(5@:E, AlarmEdVC5DOB1j,V;SP emType N* NET_WIRELESS_DEVICE_TYPE_DEFENCE J14KWV6N2ESPP'!#
	 * \endif
	 */
	public int	nChannel;                           
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device Mode.
	 * \else
	 * N^O_Ih189$WwD#J=
	 * \endif
	 * @see EM_WIRELESS_DEVICE_MODE
	 */
	public int	emMode;                            
	
	/**
	 * \if ENGLISH_LANG
	 * The sense method
	 * \else
	 * 4+8PFw7=J=
	 * \endif
	 * @see EM_CODEID_SENSE_METHOD_TYPE
	 */
	public int	emSenseMethod;                      
	
	/**
	 * \if ENGLISH_LANG
	 * Wireless Device SN
	 * \else
	 * N^O_Ih18PrAP:E
	 * \endif
	 */
	public byte[] szSerialNumber = new byte[SDK_WIRELESS_DEVICE_SERIAL_NUMBER_MAX_LEN]; 
}

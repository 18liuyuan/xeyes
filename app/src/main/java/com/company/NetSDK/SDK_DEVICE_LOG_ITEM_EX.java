package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * new Log information. Corresponding to QueryDeviceLog
 * \else
 * PBHUV>PEO"=a99#,6TS&=S?Z QueryDeviceLog =S?Z
 * \endif
 */
public class SDK_DEVICE_LOG_ITEM_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Log type!#enumeration value as DH_NEWLOG_TYPE
	 * \else
	 * HUV>@`PM, 6TS&C6>Y DH_NEWLOG_TYPE
	 * \endif
	 */
	public int					nLogType;
	
	/**
	 * \if ENGLISH_LANG
	 * Date
	 * \else
	 * HUFZ
	 * \endif
	 */
	public SDKDEVTIME			stuOperateTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Operator
	 * \else
	 * 2YWwU_
	 * \endif
	 */
	public byte				szOperator[] = new byte[16];
	
	/**
	 * \if ENGLISH_LANG
	 * union structure type,0:szLogContext;1:stuOldLog
	 * \else
	 * union=a99@`PM,0:szLogContext#;1:stuOldLog!#
	 * \endif
	 */
	public byte				bUnionType;

	//union
	//{
	/**
	 * \if ENGLISH_LANG
	 * Log content
	 * \else
	 * HUV>18W"PEO"
	 * \endif
	 */
	public byte			szLogContext[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Old log structure 
	 * \else
	 * >I5DHUV>=a99Le
	 * \endif
	 */
	public SDK_LOG_ITEM_OLD stuOldLog;
	
	//};
	/**
	 * \if ENGLISH_LANG
	 * Detail operation
	 * \else
	 * >_Le5D2YWwDZH]
	 * \endif
	 */
	public char                szOperation[] = new char[32];
	
	/**
	 * \if ENGLISH_LANG
	 * DetailContext
	 * \else
	 * OjO8HUV>PEO"ChJv
	 * \endif
	 */
	public char				szDetailContext[] = new char[4 * 1024];
	
	public SDK_DEVICE_LOG_ITEM_EX()	{
		stuOperateTime = new SDKDEVTIME();
		stuOldLog = new SDK_LOG_ITEM_OLD();
	}
}

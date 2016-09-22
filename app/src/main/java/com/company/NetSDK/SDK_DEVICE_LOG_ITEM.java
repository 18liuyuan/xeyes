package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Log information. Corresponding to QueryDeviceLog
 * \else
 * HUV>PEO"#,6TS&=S?Z QueryDeviceLog =S?Z
 * \endif
 */
public class SDK_DEVICE_LOG_ITEM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Log type  enumeration value as DH_NEWLOG_TYPE
	 * \else
	 * HUV>@`PM  6TS&C6>Y@`PM   DH_NEWLOG_TYPE
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
	 * >I5DHUV>=a99Le
	 * \else
	 * 6K?ZPr:E
	 * \endif
	 */
	public SDK_LOG_ITEM_OLD stuOldLog;
	
	//};
	
	public SDK_DEVICE_LOG_ITEM() {
		stuOperateTime = new SDKDEVTIME();
		stuOldLog = new SDK_LOG_ITEM_OLD();
	}
}

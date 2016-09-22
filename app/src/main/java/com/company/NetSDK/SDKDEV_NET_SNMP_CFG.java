package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * struct SNMP config struct
 * \else
 * SNMPEdVC=a99
 * \endif
 */
public class SDKDEV_NET_SNMP_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * SNMP enable
	 * \else
	 * SNMPJ9D\
	 * \endif
	 */
	public boolean                bEnable;

	/**
	 * \if ENGLISH_LANG
	 * SNMP port
	 * \else
	 * SNMP6K?Z
	 * \endif
	 */
	public int                 iSNMPPort;

	/**
	 * \if ENGLISH_LANG
	 * read common
	 * \else
	 * 6A92M,Le
	 * \endif
	 */
	public byte                szReadCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * write common
	 * \else
	 * P492M,Le
	 * \endif
	 */
	public byte                szWriteCommon[] = new byte[FinalVar.SDK_MAX_SNMP_COMMON_LEN];

	/**
	 * \if ENGLISH_LANG
	 * trap address
	 * \else
	 * trap5XV7
	 * \endif
	 */
	public byte                szTrapServer[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * trap port
	 * \else
	 * trap6K?Z
	 * \endif
	 */
	public int                 iTrapPort;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V1 enable
	 * \else
	 * Ih18JG7q?*FtV'3V0f1>18qJ=#,02;J9D\#;1J9D\
	 * \endif
	 */
	public byte                bSNMPV1;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V2 enable
	 * \else
	 * Ih18JG7q?*FtV'3V0f1>28qJ=#,02;J9D\#;1J9D\
	 * \endif
	 */
	public byte                bSNMPV2;

	/**
	 * \if ENGLISH_LANG
	 * SNMP V3 enable
	 * \else
	 * Ih18JG7q?*FtV'3V0f1>38qJ=#,02;J9D\#;1J9D\
	 * \endif
	 */
	public byte                bSNMPV3;
}

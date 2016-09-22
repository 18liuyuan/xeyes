package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Holiday Record Iinformation
 * \else
 * <YHU<GB<</PEO"
 * \endif
 */
public class NET_RECORDSET_HOLIDAY implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Record Number,Read-Only
	 * \else
	 * <GB<</1`:E#,V;6A
	 * \endif
	 */
	public int             nRecNo;

	/**
	 * \if ENGLISH_LANG
	 * Valid Door Number
	 * \else
	 * SPP'5D5DCEJ}D?
	 * \endif
	 */
	public int             nDoorNum;

	/**
	 * \if ENGLISH_LANG
	 * Privileged Door Number,That is CFG_CMD_ACCESS_EVENT Configure Array Subscript
	 * \else
	 * SPH(O^5DCEPr:E#,<4CFG_CMD_ACCESS_EVENTEdVCCFG_ACCESS_EVENT_INFO5DJ}WiOB1j
	 * \endif
	 */
	public int             sznDoors[] = new int[FinalVar.SDK_MAX_DOOR_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Start Time
	 * \else
	 * ?*J<J1<d
	 * \endif
	 */
	public NET_TIME        stuStartTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * End Time
	 * \else
	 * =aJxJ1<d
	 * \endif
	 */
	public NET_TIME        stuEndTime = new NET_TIME();

	/**
	 * \if ENGLISH_LANG
	 * Holiday Ennable
	 * \else
	 * <YFZJ9D\
	 * \endif
	 */
	public boolean            bEnable;

	/**
	 * \if ENGLISH_LANG
	 * Holiday No
	 * \else
	 * <YFZ1`:E
	 * \endif
	 */
	public byte            szHolidayNo[] = new byte[FinalVar.SDK_COMMON_STRING_32];
}

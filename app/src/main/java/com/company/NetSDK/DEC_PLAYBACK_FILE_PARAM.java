package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Port serial number
 * \else
 * 04ND<~;X7EG06KIh18Lu<~
 * \endif
 */
public class DEC_PLAYBACK_FILE_PARAM implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * IP address of Front-end DVR
	 * \else
	 * G06KDVR5DIP5XV7
	 * \endif
	 */
	public byte			szDevIp[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Port of Front-end DVR
	 * \else
	 * G06KDVR5D6K?Z:E
	 * \endif
	 */
	public int				wDevPort;
	
	/**
	 * \if ENGLISH_LANG
	 * Decoder channel enable
	 * \else
	 * =bBkM(5@J9D\
	 * \endif
	 */
	public byte			bDevChnEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * The corresponding channel number
	 * \else
	 * 6TS&=bBkM(5@:E
	 * \endif
	 */
	public byte			byDecoderID;
	
	/**
	 * \if ENGLISH_LANG
	 * User Name
	 * \else
	 * SC;'C{
	 * \endif
	 */
	public byte			szDevUser[] = new byte[FinalVar.SDK_USER_NAME_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Password
	 * \else
	 * C\Bk
	 * \endif
	 */
	public byte			szDevPwd[] = new byte[FinalVar.SDK_USER_PSW_LENGTH_EX];
	
	/**
	 * \if ENGLISH_LANG
	 * Record file information
	 * \else
	 * B<OqND<~PEO"
	 * \endif
	 */
	public NET_RECORDFILE_INFO stuRecordInfo = new NET_RECORDFILE_INFO();
}

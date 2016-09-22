package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Serial Port Common Attribute
 * \else
 * 4.?Z;y1>JtPT
 * \endif
 */
public class CFG_COMM_PROP implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * DataBit;0:5#,1:6#,2:7#,3:8
	 * \else
	 * J}>]N;;0:5#,1:6#,2:7#,3:8
	 * \endif
	 */
	public byte				byDataBit;
	
	/**
	 * \if ENGLISH_LANG
	 * StopBit;0:1N;#,1:1.5N;#,2:2N;
	 * \else
	 * M#V9N;;0:1N;#,1:1.5N;#,2:2N;
	 * \endif
	 */
	public byte				byStopBit;
	
	/**
	 * \if ENGLISH_LANG
	 * Parity Bit;0:No Check#,1:Odd Check;2:Even Check
	 * \else
	 * P#QiN;;0:N^P#Qi#,1:FfP#Qi;2:E<P#Qi
	 * \endif
	 */
	public byte				byParity;
	
	/**
	 * \if ENGLISH_LANG
	 * BaudRate;0:300#,1:600#,2:1200#,3:2400#,4:4800#,	
	 * 5:9600#,6:19200#,7:38400#,8:57600#,9:115200
	 * \else
	 * 2(LXBJ;0:300#,1:600#,2:1200#,3:2400#,4:4800#,	
	 * 5:9600#,6:19200#,7:38400#,8:57600#,9:115200
	 * \endif
	 */
	public byte				byBaudRate;
}

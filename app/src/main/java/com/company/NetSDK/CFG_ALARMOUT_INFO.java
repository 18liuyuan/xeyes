package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The state of the alarm output channel configuration 
 * \else
 * 1(>/Jd3vM(5@5DW4L,5DEdVC
 * \endif
 */
public class CFG_ALARMOUT_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Alarm channel number (from zero)
	 * \else
	 * 1(>/M(5@:E(0?*J<)
	 * \endif
	 */
	public int					nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm channel name
	 * \else
	 * 1(>/M(5@C{3F
	 * \endif
	 */
	public byte				szChnName[] = new byte[FinalVar.MAX_CHANNELNAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output types, user-defined
	 * \else
	 * Jd3v@`PM, SC;'WT6(Re
	 * \endif
	 */
	public byte				szOutputType[] = new byte[FinalVar.MAX_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Output mode, 0 - automatic alarm 1 - Forced Alarm 2 - Turn off the alarm
	 * \else
	 * Jd3vD#J=, 0-WT6/1(>/, 1-G?VF1(>/, 2-9X1U1(>/
	 * \endif
	 */
	public int					nOutputMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Pulse mode output time, unit is second(0-255s)
	 * \else
	 * Bv3eD#J=Jd3vJ1<d, 5%N;N*Ck(0-255Ck)
	 * \endif
	 */
	public int                 nPulseDelay;
	
	/**
	 * \if ENGLISH_LANG
	 * Root address, 0 means local channel, 1 means connection expansion channel on first serial, 2?!i3...and so on, -1 means invalid
	 * \else
	 * 8y5XV7, 01mJ>1>5XM(5@, 11mJ>A,=STZ5ZR;8v4.?ZIO5D@)U9M(5@, 2!"3...RT4K@`MF, -11mJ>N^P'
	 * \endif
	 */
	public int                 nSlot;
	
	/**
	 * \if ENGLISH_LANG
	 * First level cascading address, means connected at no. nSlot serial no. nLevel1 sensor or meter, start from 0, -1 means invalid
	 * \else
	 * 5ZR;<6<6A*5XV7, 1mJ>A,=STZ5ZnSlot4.?ZIO5D5ZnLevel18vL=2bFw;rRG1m, 4S0?*J<, -11mJ>N^P'
	 * \endif
	 */
	public int                 nLevel1;
	
	/**
	 * \if ENGLISH_LANG
	 * means nLevel2 field exists or not
	 * \else
	 * 1mJ>nLevel2WV6NJG7q4fTZ
	 * \endif
	 */
	public boolean                abLevel2;
	
	/**
	 * \if ENGLISH_LANG
	 * Second level cascading address, means connected at no. nLevel1 meter sensor no., start from 0
	 * \else
	 * 5Z6~<6<6A*5XV7, 1mJ>A,=STZ5ZnLevel18v5DRG1mIO5DL=2bFwPr:E, 4S0?*J<
	 * \endif
	 */
    public int                 nLevel2;
}

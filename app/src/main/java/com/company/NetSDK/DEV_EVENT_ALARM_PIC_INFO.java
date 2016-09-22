package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of DEV_EVENT_ALARM_PIC_INFO data
 * \else
 * JB<~@`PMDEV_EVENT_ALARM_PIC_INFO(M<F,PEO"JB<~)6TS&5DJ}>]?iChJvPEO"
 * \endif
 */
public class DEV_EVENT_ALARM_PIC_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * M(5@:E
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * JB<~C{3F
	 * \endif
	 */
	public byte                szName[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * J1<d4A(5%N;JG:ACk)
	 * \endif
	 */
    public double              PTS;
    
    /**
     * \if ENGLISH_LANG
     * the event happen time
     * \else
     * JB<~7"Iz5DJ1<d
     * \endif
     */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
     * \if ENGLISH_LANG
     * event ID
     * \else
     * JB<~ID
     * \endif
     */
    public int                 nEventID;
    
    /**
     * \if ENGLISH_LANG
     * stuTime, not in UTC
     * \else
     * JB<~7"Iz5DJ1<d, (Ih18J1<d, 2;R;6(JGutcJ1<d)
     * \endif    
     */
    public NET_TIME_EX         stuTime = new NET_TIME_EX();

    /**
     * \if ENGLISH_LANG
     * nEventType
     * \else
     * JB<~@`PM
     * \endif    
     */
    public int                 nEventType;

    /**
     * \if ENGLISH_LANG
     * nSpeed, km/h
     * \else
     * 35KY#,5%N;km/h
     * \endif    
     */
    public int                 nSpeed;

    /**
     * \if ENGLISH_LANG
     * nSpeedHighLine, km/h
     * \else
     * 8_KYIOO^1(>/V5, 5%N;km/h
     * \endif    
     */
    public int                 nSpeedHighLine;

    /**
     * \if ENGLISH_LANG
     * nDisk
     * \else
     * 4EEL:E
     * \endif    
     */
    public int                 nDisk;

    /**
     * \if ENGLISH_LANG
     * nCluster
     * \else
     * 4X:E
     * \endif    
     */
    public int                 nCluster;

    /**
     * \if ENGLISH_LANG
     * nPartition
     * \else
     * 7VGx:E
     * \endif    
     */
    public int                 nPartition;

    /**
     * \if ENGLISH_LANG
     * szSnapAddr
     * \else
     * W%M<5X5c, SPP'64WV=Z
     * \endif    
     */
    public byte                szSnapAddr[] = new byte[FinalVar.SDK_COMMON_STRING_128];
    
    /**
     * \if ENGLISH_LANG
     * ID of picture
     * \else
     * M<F,N(R;ID
     * \endif    
     */
    public byte                szPicID[] = new byte[FinalVar.SDK_COMMON_STRING_32];

    /**
     * \if ENGLISH_LANG
     * Plate
     * \else
     * 35EF
     * \endif    
     */
    public byte                szPlate[] = new byte[FinalVar.SDK_COMMON_STRING_16];
}

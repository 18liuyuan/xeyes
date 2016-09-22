package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Capture each of the corresponding structure
 * \else
 * C?WiW%0|6TS&5DEdVC=a99
 * \endif
 */
public class SDK_ATM_SNIFFER_CFG_EX implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Source address capture
	 * \else
	 * W%0|T45XV7
	 * \endif
	 */
	public byte                SnifferSrcIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture source port
	 * \else
	 * W%0|T46K?Z
	 * \endif
	 */
	public int                 SnifferSrcPort;

	/**
	 * \if ENGLISH_LANG
	 * Destination address capture
	 * \else
	 * W%0|D?1j5XV7
	 * \endif
	 */
	public byte                SnifferDestIP[] = new byte[FinalVar.SDK_MAX_IPADDR_LEN];

	/**
	 * \if ENGLISH_LANG
	 * Capture the target port
	 * \else
	 * W%0|D?1j6K?Z
	 * \endif
	 */
	public int                 SnifferDestPort;

	/**
	 * \if ENGLISH_LANG
	 * 6 FRAME Options
	 * \else
	 * 68vFRAME Q!On
	 * \endif
	 */
	public SDK_SNIFFER_FRAME_EX snifferFrame[] = new SDK_SNIFFER_FRAME_EX[FinalVar.SDK_SNIFFER_FRAMEID_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Display Position
	 * \else
	 * OTJ>N;VC
	 * \endif
	 */
	public int                 displayPosition;

	/**
	 * \if ENGLISH_LANG
	 * Channel mask
	 * \else
	 * M(5@QZBk  0  ~ 31 M(5@
	 * \endif
	 */
	public int                 recdChannelMask;

	/**
	 * \if ENGLISH_LANG
	 * Data sources enable
	 * \else
	 * J}>]@4T4J9D\
	 * \endif
	 */
	public boolean                bDateScopeEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol enable
	 * \else
	 * P-RiJ9D\
	 * \endif
	 */
	public boolean                bProtocolEnable;

	/**
	 * \if ENGLISH_LANG
	 * Protocol name
	 * \else
	 * P-RiC{WV
	 * \endif
	 */
	public byte                szProtocolName[] = new byte[FinalVar.SDK_SNIFFER_PROTOCOL_SIZE];

	/**
	 * \if ENGLISH_LANG
	 * Capture mode; 0:net,1:232.
	 * \else
	 * W%0|7=J=#,0:net,1:232.
	 * \endif
	 */
	public int                 nSnifferMode;

	/**
	 * \if ENGLISH_LANG
	 * Channel submask  32 ~ 63 channel
	 * \else
	 * M(5@QZBk  32 ~ 63 M(5@
	 * \endif
	 */
	public int                 recdChannelMask1;
    
    public SDK_ATM_SNIFFER_CFG_EX() {
    	for (int i = 0; i < FinalVar.SDK_SNIFFER_FRAMEID_NUM; i++) {
    		snifferFrame[i] = new SDK_SNIFFER_FRAME_EX();
    	}
    }
}

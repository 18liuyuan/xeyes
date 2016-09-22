package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * decoder tour configuration
 * \else
 * =bBkBVQ2EdVC
 * \endif
 */
public class SDKDEV_DECODER_TOUR_SINGLE_CFG implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's ip.Such as"10.7.5.21". Support retention of the domain name, end by '\0'.
	 * \else
	 * G06KIh18ip.@}Hg"10.7.5.21". 1#At6TSrC{5DV'3V.PhR*RT'\0'=aJx.
	 * \endif
	 */
	public byte        szIP[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * Front-end device's port.(0, 65535).
	 * \else
	 * G06KIh186K?Z.(0, 65535).
	 * \endif
	 */
	public int         nPort;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Request channel [1, 16].
	 * \else
	 * GkGsG06KIh18M(5@[1, 16].
	 * \endif
	 */
	public int         nPlayChn;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Stream type, 0:main; 1:sub.
	 * \else
	 * GkGsG06KBkAw@`PM, 0:VwBkAw; 1:8(BkAw.
	 * \endif
	 */
	public int         nPlayType;

	/**
	 * \if ENGLISH_LANG
	 * front-end device's user name,end by '\0'.
	 * \else
	 * 5GB=G06KIh185DSC;'C{,PhR*RT'\0'=aJx.
	 * \endif
	 */
	public byte        szUserName[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * front-end device's Password,end by '\0'.
	 * \else
	 * 5GB=G06KIh185DC\Bk,PhR*RT'\0'=aJx.
	 * \endif
	 */
	public byte        szPassword[] = new byte[32];

	/**
	 * \if ENGLISH_LANG
	 * Round tour interval [10, 120],s.
	 * \else
	 * BVQ2<d8tJ1<d[10, 120],5%N;Ck.
	 * \endif
	 */
	public int         nInterval;

	/**
	 * \if ENGLISH_LANG
	 * device's factory(enum see IPC_TYPE)
	 * \else
	 * D?1jIh183'IL(C6>Y Oj<{IPC_TYPE)
	 * \endif
	 */
	public int       nManuFactory;

	/**
	 * \if ENGLISH_LANG
	 * device's http port
	 * \else
	 * D?1jIh185D6K?Z(Http6K?Z)
	 * \endif
	 */
	public int        nHttpPport;

	/**
	 * \if ENGLISH_LANG
	 * device's rtsp port
	 * \else
	 * D?1jIh185D6K?Z(Rtsp6K?Z)
	 * \endif
	 */
	public int        nRtspPort;

	/**
	 * \if ENGLISH_LANG
	 * service type -1:auto,0:TCP;1:UDP;2:Multicast
	 * \else
	 * 7~Nq@`PM, -1: auto, 0#:TCP#;1#:UDP#;2#:Wi2%
	 * \endif
	 */
	public byte        byServiceType;
}

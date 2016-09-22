package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * 232/485 com card signal info configuration
 * \else
 * 2324.?Z?(:EPE:E!"4854.?Z?(:EPE:EJB<~EdVC
 * \endif
 */
public class COM_CARD_SIGNAL_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * card number start location
	 * \else
	 * ?(:EFpJ<N;
	 * \endif
	 */
	public short                wCardStartPose; 
	
	/**
	 * \if ENGLISH_LANG
	 * card number length
	 * \else
	 * ?(:E3$6H
	 * \endif
	 */
	public short                wCardLenth;
	
	/**
	 * \if ENGLISH_LANG
	 * start string
	 * \else
	 * ?*J<7{
	 * \endif
	 */
	public byte                cStartCharacter[] = new byte[32];
	
	/**
	 * \if ENGLISH_LANG
	 * end string
	 * \else
	 * =aJx7{
	 * \endif
	 */
	public byte                cEndCharacter[] = new byte[32];
}

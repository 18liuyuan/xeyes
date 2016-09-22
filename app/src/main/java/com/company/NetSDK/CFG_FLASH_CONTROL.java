package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Flashlight control
 * \else
 * IA9b5FEdVC
 * \endif
 */
public class CFG_FLASH_CONTROL implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Working mode, 0-flash prohibited, 1- always flash, 2- automatic flash
	 * \else
	 * 9$WwD#J=#,0-={V9IA9b#,1-J<VUIA9b#,2-WT6/IA9b
	 * \endif
	 */
	public byte				byMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Working value,0-0us, 1-64us, 2-128us, 3-192...15-960us 
	 * \else
	 * 9$WwV5, 0-0us, 1-64us, 2-128us, 3-192...15-960us
	 * \endif
	 */
	public byte				byValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Trigger mode, 0-low level, 1- high level, 2- upper edge 3- lower edge
	 * \else
	 * 4%7"D#J=, 0-5M5gF= 1-8_5gF= 2-IOI}QX 3-OB=5QX
	 * \endif
	 */
	public byte				byPole;
	
	/**
	 * \if ENGLISH_LANG
	 * Brightness pre-set value range (0~100)
	 * \else
	 * AA6HT$IhV5  Gx<d0~100
	 * \endif
	 */
	public byte                byPreValue;
	
	/**
	 * \if ENGLISH_LANG
	 * Duty ratio, 0~100  
	 * \else
	 * U<?U1H, 0~100
	 * \endif
	 */
	public byte				byDutyCycle;
	
	/**
	 * \if ENGLISH_LANG
	 * Frenquency multiple, 0~10 
	 * \else
	 * 16F5, 0~10
	 * \endif
	 */
	public byte				byFreqMultiple;
}

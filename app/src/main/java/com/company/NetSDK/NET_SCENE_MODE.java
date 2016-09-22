package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Scene Mode
 * \else
 * Gi>0D#J=
 * \endif
 */
public class NET_SCENE_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Unknown Scene
	 * \else
	 * N4V*3!>0
	 * \endif
	 */
	public static final int NET_SCENE_MODE_UNKNOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Out Mode
	 * \else
	 * Mb3vD#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_OUTDOOR = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * In Mode
	 * \else
	 * JRDZD#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_INDOOR = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * global mode
	 * \else
	 * H+>VD#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_WHOLE = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * immediate mode
	 * \else
	 * A"<4D#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_RIGHTNOW = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * sleeping mode
	 * \else
	 * >MG^D#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_SLEEPING = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * custom mode
	 * \else
	 * WT6(ReD#J=
	 * \endif
	 */
	public static final int NET_SCENE_MODE_CUSTOM = 6;
}

package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye configuration
 * \else
 * ScQ[>5M7EdVC
 * \endif
 */
public class CFG_FISH_EYE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * center point[0,8192]
	 * \else
	 * ScQ[T2PDWx1j,76N'[0,8192]
	 * \endif
	 */
	public CFG_POLYGON         stuCenterPoint = new CFG_POLYGON();
	
	/**
	 * \if ENGLISH_LANG
	 * radius [0,8192]
	 * \else
	 * ScQ[0k>64sP!,76N'[0,8192]
	 * \endif
	 */
	public int        nRadius;
	
	/**
	 * \if ENGLISH_LANG
	 * direction[0,360.0]
	 * \else
	 * >5M7P}W*7=Or,P}W*=G6H[0,360.0]
	 * \endif
	 */
	public float               fDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * place holder	1 roof loading,2 wall loading,3 earth loading.,default 1
	 * \else
	 * >5M702W07=J=	16%W0#,21ZW0#;35XW0,D,HO1
	 * \endif
	 */
	public byte                byPlaceHolder;
	
	/**
	 * \if ENGLISH_LANG
	 * fish eye mode, see CFG_CALIBRATE_MODE enumeration value
	 * \else
	 * ScQ[=CU}D#J=,Oj<{CFG_CALIBRATE_MODEC6>YV5
	 * \endif
	 */
	public byte                byCalibrateMode;
}

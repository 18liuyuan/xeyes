package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * fish eye mode
 * \else
 * ScQ[=CU}D#J=
 * \endif
 */
public class CFG_CALIBRATE_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * unknown mode 
	 * \else
	 * N4V*D#J= 
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_UNKOWN = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * original image mode
	 * \else
	 * T-J<M<OqD#J=
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIAL = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * config mode
	 * \else
	 * EdVCD#J=
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_CONFIG = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * panorama mode
	 * \else
	 * H+>0D#J=
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_PANORAMA = 3;
	
	/**
	 * \if ENGLISH_LANG
	 * dual panorama mode
	 * \else
	 * K+H+>0D#J=
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_DOUBLEPANORAMA = 4;
	
	/**
	 * \if ENGLISH_LANG
	 * 1+3 mode!j!'one original fish eyeimage plus 3 EPtz images!j?
	 * \else
	 * 1+3D#J=#(R;8vT-J<ScQ[M<Oq<S38vEPtzM<Oq#)
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_ORIGIALPLUSTHREEEPTZREGION = 5;
	
	/**
	 * \if ENGLISH_LANG
	 * single image EPtz mode!j!'only one EPtz image!j?
	 * \else
	 * 5%;-CfEPtzD#J=#(V;SPR;8vEPtz;-Cf#)
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_SINGLE = 6;
	
	/**
	 * \if ENGLISH_LANG
	 * 4 image mode!j!'4 EPtz control images!j?
	 * \else
	 * 4;-CfD#J=#(48vEPtz?XVF;-Cf#)
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_FOUREPTZREGION = 7;
	
	/**
	 * \if ENGLISH_LANG
	 * normal mode
	 * \else
	 * FUM(D#J=
	 * \endif
	 */
	public static final int CFG_CALIBRATE_MODE_NORMAL = 8;
}

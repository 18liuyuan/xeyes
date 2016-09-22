package com.company.NetSDK;

import java.io.Serializable;

public class GPS_MODE implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * GPS,GLONASS
	 * \else
	 * GPS!"GLONASS;l:OD#J=(D#?i6(N;J}>]4SGPS!"GLONASSA=U_VP;qH!#,5+>_Le@4T4SZDD8vO5M32;D\H76(,?ID\D#?iDZ2?WT6/;a4&@m)
	 * \endif
	 */
	public final static int GPS_OR_GLONASS_MODE = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * GLONASS
	 * \else
	 * GLONASSD#J=(<4D#?i5D6(N;J}>]4S6mB^K95DGLONASS6(N;O5M3VP;qH!)
	 * \endif
	 */
	public final static int GLONASS_MODE = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * GPS
	 * \else
	 * GPSD#J=(<4D#?i5D6(N;J}>]4SC@9z5DGPSO5M3VP;qH!) 
	 * \endif
	 */
	public final static int GPS_MODE = 2;
}

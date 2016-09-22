package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * longitude latitude
 * \else
 * >-N36H
 * \endif
 */
public class SDKDEV_LONGI_LATI implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * preflag of longitude:N(north),S(south),W(west),E(east)
	 * \else
	 * >-6HG0VC1jV>#:N!"S!"W!"E#,7V1p1mJ>11!"DO!"Nw!"6+!#
	 * \endif
	 */
	public byte                chPreLogi;

	/**
	 * \if ENGLISH_LANG
	 * preflag of latitude:N(north),S(south),W(west),E(east)
	 * \else
	 * N36HG0VC1jV>#:N!"S!"W!"E#,7V1p1mJ>11!"DO!"Nw!"6+!#
	 * \endif
	 */
	public byte                chPreLati;

	/**
	 * \if ENGLISH_LANG
	 * longitude
	 * \else
	 * >-6H
	 * \endif
	 */
	public double              dbLongitude;

	/**
	 * \if ENGLISH_LANG
	 * latitude
	 * \else
	 * N36H
	 * \endif
	 */
	public double              dbLatitude;
}

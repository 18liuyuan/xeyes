package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * get active defence area 
 * \else
 * ;qH!<$;n7@Gx
 * \endif
 */
public class NET_ACTIVATEDDEFENCEAREA implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * \if ENGLISH_LANG
	 * search local alarm input channel quantity,  need user to specify
	 * \else
	 * 2iQ/1>5X1(>/JdHkM(5@<$;n8vJ}#,PhSC;'V86(8vJ}
	 * \endif
	 */
	public int nAlarmInCount;

	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel actual activation quantity
	 * \else
	 * 1>5X1(>/JdHkM(5@J5<J<$;n8vJ}
	 * \endif
	 */
	public int nRetAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * local alarm input channel activated info
	 * \else
	 * 1>5X1(>/JdHkM(5@<$;nPEO"
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuAlarmInDefenceAreaInfo[];

	/**
	 * \if ENGLISH_LANG
	 * search extension module alarm input quantity. User specify
	 * \else
	 * 2iQ/@)U9D#?i1(>/JdHkM(5@8vJ}#,PhSC;'V86(8vJ}
	 * \endif
	 */
	public int nExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extension  module alarm input channel actual activation quantity
	 * \else
	 * @)U9D#?i1(>/JdHkM(5@J5<J<$;n8vJ}
	 * \endif
	 */
	public int nRetExAlarmInCount;
	
	/**
	 * \if ENGLISH_LANG
	 * extend alarm input channel activated info
	 * \else
	 * @)U91(>/JdHkM(5@<$;nPEO"
	 * \endif
	 */
	public NET_ACTIVATEDDEFENCEAREA_INFO pstuExAlarmInDefenceAreaInfo[];
}

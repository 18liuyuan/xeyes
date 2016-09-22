package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Snapshot info
 * \else
 * W%EDPEO"
 * \endif
 */
public class SDK_SIG_CARWAY_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Current car speed,km/h
	 * \else
	 * 51G0355DKY6H#,km/h
	 * \endif
	 */
	public short              snSpeed;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car length, dm
	 * \else
	 * 51G0353$,7VCWN*5%N;
	 * \endif
	 */
	public short              snCarLength;
	
	/**
	 * \if ENGLISH_LANG
	 * Current red light time, s.ms
	 * \else
	 * 51G0355@:l5FJ1<d,Ck.:ACk
	 * \endif
	 */
	public float              fRedTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way snapshot time, s.ms 
	 * \else
	 * 51G0355@W%EDJ1<d,Ck.:ACk
	 * \endif
	 */
	public float              fCapTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Current snapshot Sequence
	 * \else
	 * 51G0W%EDPr:E
	 * \endif
	 */
	public byte               bSigSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * current snapshot type
	 * 0: radar up speed limit;1: radar low speed limit;2: car detector up speed limit;3:car detector low speed limit
	 * 4: reverse;5: break red light;6: red light on;7: red light off;8: snapshot or traffic gate
	 * \else
	 * 51G0355@5DW%ED@`PM
	 * 0: @W4o8_O^KY;1: @W4o5MO^KY;2: 35<lFw8_O^KY;3:35<lFw5MO^KY
	 * 4: DfOr;5: 43:l5F;6: :l5FAA;7: :l5FCp;8: H+2?W%ED;rU_?(?Z
	 * \endif
	 */
	public byte               bType;
	
	/**
	 * \if ENGLISH_LANG
	 * Breaking type :01:left turn;02:straight;03:right
	 * \else
	 * 43:l5F@`PM:01:WsW*:l5F;02:V1PP:l5F;03:SRW*:l5F
	 * \endif
	 */
	public byte               bDirection;
	
	/**
	 * \if ENGLISH_LANG
	 * Current car way traffic light state,0: green, 1: red, 2: yellow
	 * \else
	 * 51G0355@5D:lBL5FW4L,#,0: BL5F, 1: :l5F, 2: ;F5F
	 * \endif
	 */
	public byte               bLightColor;
	
	/**
	 * \if ENGLISH_LANG
	 * Snap flag from device
	 * \else
	 * Ih182zIz5DW%ED1jJ6
	 * \endif
	 */
	public byte               bSnapFlag[] = new byte[16];
}

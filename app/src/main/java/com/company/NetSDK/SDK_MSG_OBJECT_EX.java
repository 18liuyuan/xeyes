package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Video analysis object info expansion structure 
 * \else
 * JSF57VNvNoLePEO"@)U9=a99Le
 * \endif
 */
public class SDK_MSG_OBJECT_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * object ID, each ID means a exclusive object
	 * \else
	 * NoLeID,C?8vID1mJ>R;8vN(R;5DNoLe
	 * \endif
	 */
	public int                 nObjectID;

	/**
	 * \if ENGLISH_LANG
	 * object  type
	 * \else
	 * NoLe@`PM
	 * \endif
	 */
	public byte                szObjectType[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * confidence coefficient (0~255)#, value the bigger means  confidence coefficient the higher
	 * \else
	 * VCPE6H(0~255)#,V5T=4s1mJ>VCPE6HT=8_
	 * \endif
	 */
	public int                 nConfidence;

	/**
	 * \if ENGLISH_LANG
	 * object  motion :1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * NoLe6/Ww:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int                 nAction;

	/**
	 * \if ENGLISH_LANG
	 * box
	 * \else
	 * 0|N':P
	 * \endif
	 */
	public SDK_RECT             BoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * object model center
	 * \else
	 * NoLePMPD
	 * \endif
	 */
	public SDK_POINT            Center = new SDK_POINT();

	/**
	 * \if ENGLISH_LANG
	 * polygon vertex number
	 * \else
	 * 6`1_PN6%5c8vJ}
	 * \endif
	 */
	public int                 nPolygonNum;

	/**
	 * \if ENGLISH_LANG
	 * relatively accurate outline the polygon
	 * \else
	 * =O>+H75DBV@*6`1_PN
	 * \endif
	 */
	public SDK_POINT            Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];

	/**
	 * \if ENGLISH_LANG
	 * means plate, vehicle body and etc. object major color#;by byte means #,are red, green, blue and transparency , such as:RGB value is (0,255,0), transparency is 0, its value is 0x00ff0000.
	 * \else
	 * 1mJ>35EF!"35Im5HNoLeVwR*QUI+#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H,@}Hg:RGBV5N*(0,255,0),M8Cw6HN*0J1, FdV5N*0x00ff0000.
	 * \endif
	 */
	public int               rgbaMainColor;

	/**
	 * \if ENGLISH_LANG
	 * same as DH_MSG_OBJECT corresponding field
	 * \else
	 * M,DH_MSG_OBJECTO`S&WV6N
	 * \endif
	 */
	public byte                szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type #,according to different object  types #,may use the following sub type #:
	 * \else
	 * NoLeWS@`1p#,8y>]2;M,5DNoLe@`PM#,?IRTH!RTOBWS@`PM#:
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture file info or not
	 * \else
	 * JG7qSPNoLe6TS&M<F,ND<~PEO"
	 * \endif
	 */
	public boolean                bPicEnble;

	/**
	 * \if ENGLISH_LANG
	 * object corresponding to picture info
	 * \else
	 * NoLe6TS&M<F,PEO"
	 * \endif
	 */
	public SDK_PIC_INFO         stPicInfo = new SDK_PIC_INFO();

	/**
	 * \if ENGLISH_LANG
	 * snapshot recognition result or not
	 * \else
	 * JG7qJGW%EDUE5DJ61p=a9{
	 * \endif
	 */
	public boolean                bShotFrame;

	/**
	 * \if ENGLISH_LANG
	 * object  color (rgbaMainColor) usable or not
	 * \else
	 * NoLeQUI+(rgbaMainColor)JG7q?ISC
	 * \endif
	 */
	public boolean                bColor;

	/**
	 * \if ENGLISH_LANG
	 * lower color (rgbaLowerBodyColor) usable or not
	 * \else
	 * OB0kImQUI+(rgbaLowerBodyColor)JG7q?ISC
	 * \endif
	 */
	public byte                bLowerBodyColor;

	/**
	 * \if ENGLISH_LANG
	 * time means type #, see EM_TIME_TYPE note
	 * \else
	 * J1<d1mJ>@`PM#,Oj<{EM_TIME_TYPEK5Cw
	 * \endif
	 */
	public byte                byTimeType;

	/**
	 * \if ENGLISH_LANG
	 * for video compression#, current time stamp#(object snapshot or recognition#, attach this recognition frame in one vire frame or jpegpicture#,this frame!/s appearance time in original video#)
	 * \else
	 * Uk6TJSF5E(Ku#,51G0J1<d4A#(NoLeW%ED;rJ61pJ1#,;a=+4KJ61pVGD\V!8=TZR;8vJSF5V!;rjpegM<F,VP#,4KV!KyTZT-J<JSF5VP5D3vOVJ1<d#)
	 * \endif
	 */
	public NET_TIME_EX         stuCurrentTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * start time stamp#(object start appearance#)
	 * \else
	 * ?*J<J1<d4A#(NoLe?*J<3vOVJ1#)
	 * \endif
	 */
	public NET_TIME_EX         stuStartTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * end time stamp#(object last aapearance#)
	 * \else
	 * =aJxJ1<d4A#(NoLeWn:s3vOVJ1#)
	 * \endif
	 */
	public NET_TIME_EX         stuEndTime = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * box(absolute coordinate)
	 * \else
	 * 0|N':P(>x6TWx1j)
	 * \endif
	 */
	public SDK_RECT             stuOriginalBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * LGO coordinate box
	 * \else
	 * 351jWx1j0|N':P
	 * \endif
	 */
	public SDK_RECT             stuSignBoundingBox = new SDK_RECT();

	/**
	 * \if ENGLISH_LANG
	 * current frame no.#(snapshot this object frame#)
	 * \else
	 * 51G0V!Pr:E#(W%OBUb8vNoLeJ15DV!#)
	 * \endif
	 */
	public int               dwCurrentSequence;

	/**
	 * \if ENGLISH_LANG
	 * start frame no.#(object start appearance frame no.#)
	 * \else
	 * ?*J<V!Pr:E#(NoLe?*J<3vOVJ15DV!Pr:E#)
	 * \endif
	 */
	public int               dwBeginSequence;

	/**
	 * \if ENGLISH_LANG
	 * end frame no.#(object disappearance frame no.#)
	 * \else
	 * =aJxV!Pr:E#(NoLeO{JEJ15DV!Pr:E#)
	 * \endif
	 */
	public int               dwEndSequence;

	/**
	 * \if ENGLISH_LANG
	 * start file shift, unit: byte#(object start appearance#,video in original video file moves toward file origin#)
	 * \else
	 * ?*J<J1ND<~F+RF, 5%N;: WV=Z#(NoLe?*J<3vOVJ1#,JSF5V!TZT-J<JSF5ND<~VPO`6TSZND<~FpJ<4&5DF+RF#)
	 * \endif
	 */
	public long               nBeginFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * End file shift, unit: byte#(object disappearance#,video in original video file moves toward file origin#)
	 * \else
	 * =aJxJ1ND<~F+RF, 5%N;: WV=Z#(NoLeO{JEJ1#,JSF5V!TZT-J<JSF5ND<~VPO`6TSZND<~FpJ<4&5DF+RF#)
	 * \endif
	 */
	public long               nEndFileOffset;

	/**
	 * \if ENGLISH_LANG
	 * object  color similarity#,take  value range #:0-100#,group subscript value represents certain color #, see EM_COLOR_TYPE
	 * \else
	 * NoLeQUI+O`KF6H#,H!V576N'#:0-100#,J}WiOB1jV54z1mD3VVQUI+#,Oj<{EM_COLOR_TYPE
	 * \endif
	 */
	public byte                byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * upper object  color  similarity (object  type as human is valid )
	 * \else
	 * IO0kImNoLeQUI+O`KF6H(NoLe@`PMN*HKJ1SPP')
	 * \endif
	 */
	public byte                byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * lower object  color  similarity (object  type as human is valid )
	 * \else
	 * OB0kImNoLeQUI+O`KF6H(NoLe@`PMN*HKJ1SPP')
	 * \endif
	 */
	public byte                byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];

	/**
	 * \if ENGLISH_LANG
	 * related object ID
	 * \else
	 * O`9XNoLeID
	 * \endif
	 */
	public int                 nRelativeID;

	/**
	 * \if ENGLISH_LANG
	 * "ObjectType"is "Vehicle"or "Logo"#, means LOGO lower brand#,such as Audi A6L#,since there are many brands#,SDK shows this field in real-time,device filled as real.
	 * \else
	 * "ObjectType"N*"Vehicle";rU_"Logo"J1#,1mJ>351jOB5DD3R;35O5#,1HHg0B5OA6L#,SISZ35O5=O6`#,SDKJ5OVJ1M84+4KWV6N,Ih18HgJ5LnP4!#
	 * \endif
	 */
	public byte				szSubText[] = new byte[20];

	/**
	 * \if ENGLISH_LANG
	 * Intrusion staff height#,unit cm
	 * \else
	 * HkGVHKT1Im8_#,5%N;cm
	 * \endif
	 */
	public int					nPersonStature;

	/**
	 * \if ENGLISH_LANG
	 * Staff intrusion direction
	 * \else
	 * HKT1HkGV7=Or
	 * \endif
	 */
	public int	emPersonDirection;

	/**
	 * \if ENGLISH_LANG
	 * Use direction same as rgbaMainColor,object  type as human is valid
	 * \else
	 * J9SC7=7(M,rgbaMainColor,NoLe@`PMN*HKJ1SPP'
	 * \endif
	 */
	public int               rgbaLowerBodyColor;
	
	public SDK_MSG_OBJECT_EX() {
		for (int i = 0; i < FinalVar.SDK_MAX_POLYGON_NUM; i++) {
			Contour[i] = new SDK_POINT();
    	}
	}
}

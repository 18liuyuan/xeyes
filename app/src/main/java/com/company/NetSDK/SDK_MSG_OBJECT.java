package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Struct of object info for video analysis 
 * \else
 * JSF57VNvNoLePEO"=a99Le
 * \endif
 */
public class SDK_MSG_OBJECT implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Object ID,each ID represent a unique object
	 * \else
	 * NoLeID,C?8vID1mJ>R;8vN(R;5DNoLe
	 * \endif
	 */
	public int				nObjectID;
	
	/**
	 * \if ENGLISH_LANG
	 * Object type
	 * \else
	 * NoLe@`PM
	 * \endif
	 */
	public byte				szObjectType[] = new byte[128];
	
	/**
	 * \if ENGLISH_LANG
	 * Confidence(0~255),a high value indicate a high confidence
	 * \else
	 * VCPE6H(0~255)#,V5T=4s1mJ>VCPE6HT=8_
	 * \endif
	 */
	public int				nConfidence;
	
	/**
	 * \if ENGLISH_LANG
	 * Object action:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \else
	 * NoLe6/Ww:1:Appear 2:Move 3:Stay 4:Remove 5:Disappear 6:Split 7:Merge 8:Rename
	 * \endif
	 */
	public int				nAction;
	
	/**
	 * \if ENGLISH_LANG
	 * BoundingBox
	 * \else
	 * 0|N':P
	 * \endif
	 */
	public SDK_RECT			BoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * The shape center of the object
	 * \else
	 * NoLePMPD
	 * \endif
	 */
	public SDK_POINT			Center = new SDK_POINT();
	
	/**
	 * \if ENGLISH_LANG
	 * The number of culminations for the polygon
	 * \else
	 * 6`1_PN6%5c8vJ}
	 * \endif
	 */
	public int				nPolygonNum;
	
	/**
	 * \if ENGLISH_LANG
	 * A polygon that have a exactitude figure
	 * \else
	 * =O>+H75DBV@*6`1_PN
	 * \endif
	 */
	public SDK_POINT			Contour[] = new SDK_POINT[FinalVar.SDK_MAX_POLYGON_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * The main color of the object;the first byte indicate red value, as byte order as green, blue, transparence, for example:RGB(0,255,0),transparence = 0, rgbaMainColor = 0x00ff0000.
	 * \else
	 * 1mJ>35EF!"35Im5HNoLeVwR*QUI+#;04WV=Z1mJ>#,7V1pN*:l!"BL!"@6:MM8Cw6H,@}Hg:RGBV5N*(0,255,0),M8Cw6HN*0J1, FdV5N*0x00ff0000.
	 * \endif
	 */
	public int				rgbaMainColor;
	
	/**
	 * \if ENGLISH_LANG
	 * The interrelated text of object,such as number plate,container number
	 * <pre>
	 * "Unknown"
	 * "Audi"
	 * "Honda" 
	 * "Buick" 
	 * "Volkswagen" 
	 * "Toyota" 
	 * "BMW" 
	 * "Peugeot" 
	 * "Ford" 
	 * "Mazda" 
	 * "Nissan" 
	 * "Hyundai" 
	 * "Suzuki" 
	 * "Citroen" 
	 * "Benz"
	 * "BYD" 
	 * "Geely" 
	 * "Lexus"
	 * "Chevrolet"
	 * "Chery"
	 * "Kia"
	 * "Charade"
	 * "DF"
	 * "Naveco"
	 * "SGMW"
	 * "Jinbei"
	 * </pre>
	 * \else
	 * NoLeIOO`9X5D4x0=aJx7{ND1>#,1HHg35EF#,</W0Od:E5H5H
	 * "ObjectType"N*"Vehicle";rU_"Logo"J1#(>!A?J9SCLogo!#VehicleJGN*AK<fH]@O2zF7#)1mJ>351j#,V'3V#:
	 * <pre>
	 * "Unknown"N4V* 
	 * "Audi" 0B5O
	 * "Honda" 1>Lo
	 * "Buick" 1p?K
	 * "Volkswagen" 4sVZ
	 * "Toyota" 7aLo
	 * "BMW" 1&Bm
	 * "Peugeot" 1jVB
	 * "Ford" 8#LX
	 * "Mazda" BmWT4o
	 * "Nissan" DaI#
	 * "Hyundai" OV4z
	 * "Suzuki" AeD>
	 * "Citroen" Q)LzAz
	 * "Benz" 1<3[
	 * "BYD" 1HQG5O
	 * "Geely" <*@{
	 * "Lexus" @W?KHxK9
	 * "Chevrolet" Q)7p@<
	 * "Chery" FfHp
	 * "Kia" FpQG
	 * "Charade" OD@{
	 * "DF" 6+7g
	 * "Naveco" R@N,?B
	 * "SGMW" NeAb
	 * "Jinbei" =p1-
	 * </pre>
	 * \endif
	 */
	public byte				szText[] = new byte[128];

	/**
	 * \if ENGLISH_LANG
	 * object sub type,different object type has different sub type:\n
	 * Vehicle Category:"Unknown","Motor","Non-Motor","Bus","Bicycle","Motorcycle"\n
	 * Plate Category:"Unknown","mal","Yellow","DoubleYellow","Police","Armed",\n
	 * "Military","DoubleMilitary","SAR","Trainning"\n
	 * "Personal" ,"Agri","Embassy","Moto","Tractor","Other"\n
	 * HumanFace Category:"Normal","HideEye","HideNose","HideMouth"
	 * \else
	 * NoLeWS@`1p#,8y>]2;M,5DNoLe@`PM#,?IRTH!RTOBWS@`PM#:
	 * Vehicle Category:"Unknown"  N4V*,"Motor" ;z6/35,"Non-Motor":7G;z6/35,"Bus": 9+=;35,"Bicycle" WTPP35,"Motorcycle":D&MP35,"PassengerCar":?M35,\n
	 * "LargeTruck":4s;u35,	"MidTruck":VP;u35,"SaloonCar":=N35,"Microbus":Cf0|35,"MicroTruck":P!;u35,"Tricycle":H}BV35,	"Passerby":PPHK	\n												
	 * Plate Category#:"Unknown" N4V*,"Normal" @6EF:ZEF,"Yellow" ;FEF,"DoubleYellow" K+2c;FN2EF,"Police" >/EF"Armed" Nd>/EF,\n
	 * "Military" 2?6S:EEF,"DoubleMilitary" 2?6SK+2c,"SAR" 8[0DLXGx:EEF,"Trainning" =LA735:EEF\n
	 * "Personal" 8vPT:EEF,"Agri" E)SCEF,"Embassy" J99]:EEF,"Moto" D&MP35:EEF,"Tractor" MO@-;z:EEF,"Other" FdK{:EEF\n
	 * HumanFace Category:"Normal" FUM(HKA3,"HideEye" Q[2?UZ52,"HideNose" 1GWSUZ52,"HideMouth" Wl2?UZ52
	 * \endif
	 */
	public byte                szObjectSubType[] = new byte[64];
	
	/**
	 * \if ENGLISH_LANG
	 * Picture info enable
	 * \else
	 * JG7qSPNoLe6TS&M<F,ND<~PEO"
	 * \endif
	 */
	public boolean          	bPicEnble;
	
	/**
	 * \if ENGLISH_LANG
	 * Picture info
	 * \else
	 * NoLe6TS&M<F,PEO"
	 * \endif
	 */
	public SDK_PIC_INFO      	stPicInfo = new SDK_PIC_INFO();
	
	/**
	 * \if ENGLISH_LANG
	 * Is shot frame
	 * \else
	 * JG7qJGW%EDUE5DJ61p=a9{
	 * \endif
	 */
	public boolean				bShotFrame;
	
	/**
	 * \if ENGLISH_LANG
	 * RgbaMainColor is enable
	 * \else
	 * NoLeQUI+(rgbaMainColor)JG7q?ISC
	 * \endif
	 */
	public boolean				bColor;
	
	/**
	 * \if ENGLISH_LANG
	 * See EM_TIME_TYPE 
	 * \else
	 * J1<d1mJ>@`PM#,Oj<{ EM_TIME_TYPE K5Cw
	 * \endif
	 */
	public byte            		byTimeType;
	
	/**
	 * \if ENGLISH_LANG
	 * In view of the video compression,current time(when object snap or reconfnition, the frame will be attached to the frame in a video or pictures,means the frame in the original video of the time)
	 * \else
	 * Uk6TJSF5E(Ku#,51G0J1<d4A#(NoLeW%ED;rJ61pJ1#,;a=+4KJ61pVGD\V!8=TZR;8vJSF5V!;rjpegM<F,VP#,4KV!KyTZT-J<JSF5VP5D3vOVJ1<d#)
	 * \endif
	 */
	public NET_TIME_EX			stuCurrentTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Strart time(object appearing for the first time)
	 * \else
	 * ?*J<J1<d4A#(NoLe?*J<3vOVJ1#)
	 * \endif
	 */
	public NET_TIME_EX			stuStartTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * End time(object appearing for the last time)
	 * \else
	 * =aJxJ1<d4A#(NoLeWn:s3vOVJ1#)
	 * \endif
	 */
	public NET_TIME_EX			stuEndTime = new NET_TIME_EX();
	
	/**
	 * \if ENGLISH_LANG
	 * Original bounding box(absolute coordinates)
	 * \else
	 * 0|N':P(>x6TWx1j)
	 * \endif
	 */
	public SDK_RECT				stuOriginalBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Sign bounding box coordinate
	 * \else
	 * 351jWx1j0|N':P
	 * \endif
	 */
	public SDK_RECT             	stuSignBoundingBox = new SDK_RECT();
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 51G0V!Pr:E#(W%OBUb8vNoLeJ15DV!#)
	 * \endif
	 */
	public int					dwCurrentSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ?*J<V!Pr:E#(NoLe?*J<3vOVJ15DV!Pr:E#)
	 * \endif
	 */
	public int					dwBeginSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * =aJxV!Pr:E#(NoLeO{JEJ15DV!Pr:E#)
	 * \endif
	 */
	public int					dwEndSequence;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * ?*J<J1ND<~F+RF, 5%N;: WV=Z#(NoLe?*J<3vOVJ1#,JSF5V!TZT-J<JSF5ND<~VPO`6TSZND<~FpJ<4&5DF+RF#)
	 * \endif
	 */
	public long					nBeginFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * =aJxJ1ND<~F+RF, 5%N;: WV=Z#(NoLeO{JEJ1#,JSF5V!TZT-J<JSF5ND<~VPO`6TSZND<~FpJ<4&5DF+RF#)
	 * \endif
	 */
	public long					nEndFileOffset;
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * NoLeQUI+O`KF6H#,H!V576N'#:0-100#,J}WiOB1jV54z1mD3VVQUI+#,Oj<{EM_COLOR_TYPE
	 * \endif
	 */
	public byte                	byColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * IO0kImNoLeQUI+O`KF6H(NoLe@`PMN*HKJ1SPP')
	 * \endif
	 */
	public byte                	byUpperBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * OB0kImNoLeQUI+O`KF6H(NoLe@`PMN*HKJ1SPP')
	 * \endif
	 */
	public byte                	byLowerBodyColorSimilar[] = new byte[EM_COLOR_TYPE.NET_COLOR_TYPE_MAX];
	
 	public SDK_MSG_OBJECT() {
 		for(int i=0 ; i<FinalVar.SDK_MAX_POLYGON_NUM ; i++) {
 			Contour[i] = new SDK_POINT();
 		}
 	}
}

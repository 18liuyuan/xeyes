package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * PTZ control extensive command 
 * \else
 * TFL(?XVF@)U9C|An, SDK_EXTPTZ_ControlType
 * \endif
 */
public class SDK_EXTPTZ_ControlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Upper left
	 * \else
	 * WsIO
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTTOP = 0x20;
	
	/**
	 * \if ENGLISH_LANG
	 * Upper right 
	 * \else
	 * SRIO
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTTOP = 0x21;
	
	/**
	 * \if ENGLISH_LANG
	 * Down left
	 * \else
	 * WsOB
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN = 0x22;
	
	/**
	 * \if ENGLISH_LANG
	 * Down right 
	 * \else
	 * SROB
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN = 0x23;
	
	/**
	 * \if ENGLISH_LANG
	 * Add preset to tour tour preset value
	 * \else
	 * <SHkT$VC5c5=Q2:= Q2:=O_B7 T$VC5cV5
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ADDTOLOOP = 0x24;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete preset in tour tour preset value
	 * \else
	 * I>3}Q2:=VPT$VC5c Q2:=O_B7 T$VC5cV5
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELFROMLOOP = 0x25;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete tour
	 * \else
	 * Ge3}Q2:= Q2:=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELOOP = 0x26;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin pan rotation	
	 * \else
	 * ?*J<K.F=P}W*
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTPANCRUISE = 0x27;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop pan rotation	
	 * \else
	 * M#V9K.F=P}W*
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPPANCRUISE = 0x28;
	
	/**
	 * \if ENGLISH_LANG
	 * Set left limit	
	 * \else
	 * IhVCWs1_=g
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETLEFTBORDER = 0x29;
	
	/**
	 * \if ENGLISH_LANG
	 * Set right limit	
	 * \else
	 * IhVCSR1_=g
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETRIGHTBORDER = 0x2a;
	
	/**
	 * \if ENGLISH_LANG
	 * Begin scanning	
	 * \else
	 * ?*J<O_I(
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STARTLINESCAN = 0x2b;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop scanning	
	 * \else
	 * M#V9O_I(
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSELINESCAN = 0x2c;
	
	/**
	 * \if ENGLISH_LANG
	 * Start mode	mode line	
	 * \else
	 * IhVCD#J=?*J<	D#J=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTART = 0x2d;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop mode	mode line
	 * \else
	 * IhVCD#J==aJx	D#J=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SETMODESTOP = 0x2e;						
	/**
	 * \if ENGLISH_LANG
	 * Enable mode	Mode line
	 * \else
	 * TKPPD#J=	D#J=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RUNMODE = 0x2f;							
	/**
	 * \if ENGLISH_LANG
	 * Disable mode	Mode line	
	 * \else
	 * M#V9D#J=	D#J=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_STOPMODE = 0x30;							
	/**
	 * \if ENGLISH_LANG
	 * Delete mode	Mode line
	 * \else
	 * Ge3}D#J=	D#J=O_B7
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DELETEMODE = 0x31;						
	/**
	 * \if ENGLISH_LANG
	 * Flip
	 * \else
	 * 7-W*C|An
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_REVERSECOMM = 0x32;						
	/**
	 * \if ENGLISH_LANG
	 * 3D position	X address(8192)	Y address(8192)	zoom(4)
	 * \else
	 * ?lKY6(N; K.F=Wx1j(8192) 49V1Wx1j(8192) 1d16(4)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FASTGOTO = 0x33;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary open	Auxiliary point	
	 * \else
	 * 8(Vz?*9X?* 8(Vz5c
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXIOPEN = 0x34;							
	/**
	 * \if ENGLISH_LANG
	 * Auxiliary close	Auxiliary point
	 * \else
	 * 8(Vz?*9X9X 8(Vz5c
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_AUXICLOSE = 0x35;						
	/**
	 * \if ENGLISH_LANG
	 * Open dome menu 
	 * \else
	 * 4r?*Gr;z2K5%
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_OPENMENU = 0x36;					
	/**
	 * \if ENGLISH_LANG
	 * Close menu 
	 * \else
	 * 9X1U2K5%
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_CLOSEMENU = 0x37;						
	/**
	 * \if ENGLISH_LANG
	 * Confirm menu 
	 * \else
	 * 2K5%H76(
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUOK = 0x38;							
	/**
	 * \if ENGLISH_LANG
	 * Cancel menu 
	 * \else
	 * 2K5%H!O{
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUCANCEL = 0x39;						
	/**
	 * \if ENGLISH_LANG
	 * Menu up 
	 * \else
	 * 2K5%IO
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUUP = 0x3a;							
	/**
	 * \if ENGLISH_LANG
	 * Menu down
	 * \else
	 * 2K5%OB
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENUDOWN = 0x3b;							
	/**
	 * \if ENGLISH_LANG
	 * Menu left
	 * \else
	 * 2K5%Ws
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENULEFT = 0x3c;							
	/**
	 * \if ENGLISH_LANG
	 * Menu right 
	 * \else
	 * 2K5%SR
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MENURIGHT = 0x3d;						
	/**
	 * \if ENGLISH_LANG
	 * Alarm activate PTZ parm1:Alarm input channel;parm2:Alarm activation type  1-preset 2-scan 3-tour;parm 3:activation value,such as preset value.
	 * \else
	 * 1(>/A*6/TFL( parm1#:1(>/JdHkM(5@#;parm2#:1(>/A*6/@`PM1-T$VC5c2-O_I(3-Q2:=#;parm3#:A*6/V5#,HgT$VC5c:E
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_ALARMHANDLE = 0x40;				
	/**
	 * \if ENGLISH_LANG
	 * Matrix switch parm1:monitor number(video output number);parm2:video input number;parm3:matrix number
	 * \else
	 * >XUsGP;; parm1#:<`JSFw:E(JSF5Jd3v:E)#;parm2#:JSF5JdHk:E#;parm3#:>XUs:E
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MATRIXSWITCH = 0x41;				
	/**
	 * \if ENGLISH_LANG
	 * Light controller
	 * \else
	 * 5F9b?XVFFw
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LIGHTCONTROL = 0x42;						
	/**
	 * \if ENGLISH_LANG
	 * 3D accurately positioning parm1:Pan degree(0~3600); parm2: tilt coordinates(0~900); parm3:zoom(1~128)
	 * \else
	 * H}N,>+H76(N; parm1#:K.F==G6H(0~3600)#;parm2#:49V1Wx1j(0~900)#;parm3#:1d16(1~128)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_EXACTGOTO = 0x43;						
	/**
	 * \if ENGLISH_LANG
	 * Reset  3D positioning as zero
	 * \else
	 * H}N,6(N;VXIhAcN;
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RESETZERO = 0x44;                        
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * >x6TRF6/?XVFC|An#,param46TS&=a99PTZ_CONTROL_ABSOLUTELY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_ABSOLUTELY = 0x45;                  
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 3VPxRF6/?XVFC|An#,param46TS&=a99PTZ_CONTROL_CONTINUOUSLY
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_MOVE_CONTINUOUSLY = 0x46;                
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * TFL(?XVFC|An#,RTR;6(KY6HW*5=T$VCN;5c#,parm46TS&=a99PTZ_CONTROL_GOTOPRESET
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_GOTOPRESET = 0x47;                       
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * IhVC?IJSSr(param46TS&=a99 PTZ_VIEW_RANGE_INFO)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_VIEW_RANGE = 0x49;           	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * >x6T>[=9(param46TS&=a99PTZ_FOCUS_ABSOLUTELY)
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_FOCUS_ABSOLUTELY = 0x4A;         	
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * K.F=IHI((param46TS&PTZ_CONTROL_SECTORSCAN,param1!"param2!"param3N^P')
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_HORSECTORSCAN = 0x4B;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * 49V1IHI((param46TS&PTZ_CONTROL_SECTORSCAN,param1!"param2!"param3N^P')
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_VERSECTORSCAN = 0x4C;             
	/**
	 * \if ENGLISH_LANG
	 * Port serial number
	 * \else
	 * Ih6(>x6T=9>`!">[=9V5,param1N*=9>`,76N':[0,255],param2N*>[=9,76N':[0,255],param3!"param4N^P'
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_SET_ABS_ZOOMFOCUS = 0x4D;         
	/**
	 * \if ENGLISH_LANG
	 * Up + TELE param1=speed (1-8) 
	 * \else
	 * IO + TELE param1=KY6H(1-8)#,OBM,
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_TELE = 0x70;					
	/**
	 * \if ENGLISH_LANG
	 * Down + TELE
	 * \else
	 * OB + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_TELE = 0x71;						
	/**
	 * \if ENGLISH_LANG
	 * Left + TELE
	 * \else
	 * Ws + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_TELE = 0x72;						
	/**
	 * \if ENGLISH_LANG
	 * Right + TELE
	 * \else
	 * SR + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_TELE = 0x73;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + TELE
	 * \else
	 * WsIO + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_TELE = 0x74;						
	/**
	 * \if ENGLISH_LANG
	 * Down left + TELE
	 * \else
	 * WsOB + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_TELE = 0x75;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + TELE
	 * \else
	 * SRIO + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_TELE = 0x76;						
	/**
	 * \if ENGLISH_LANG
	 * Down right + TELE
	 * \else
	 * SROB + TELE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_TELE = 0x77;					
	/**
	 * \if ENGLISH_LANG
	 * Up + WIDE param1=speed (1-8) 
	 * \else
	 * IO + WIDE param1=KY6H(1-8)#,OBM,
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_UP_WIDE = 0x78;							
	/**
	 * \if ENGLISH_LANG
	 * Down + WIDE
	 * \else
	 * OB + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_DOWN_WIDE = 0x79;						
	/**
	 * \if ENGLISH_LANG
	 * Left + WIDE
	 * \else
	 * Ws + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFT_WIDE = 0x7a;						
	/**
	 * \if ENGLISH_LANG
	 * Right + WIDE
	 * \else
	 * SR + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHT_WIDE = 0x7b;						
	/**
	 * \if ENGLISH_LANG
	 * Upper left + WIDE
	 * \else
	 * WsIO + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTUP_WIDE = 0x7c;						
	/**
	 * \if ENGLISH_LANG
	 * Down left+ WIDE
	 * \else
	 * WsOB + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_LEFTDOWN_WIDE = 0x7d;					
	/**
	 * \if ENGLISH_LANG
	 * Upper right + WIDE
	 * \else
	 * SRIO + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TIGHTUP_WIDE = 0x7e;						
	/**
	 * \if ENGLISH_LANG
	 * Down right + WIDE
	 * \else
	 * SROB + WIDE
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_RIGHTDOWN_WIDE = 0x7f;					
	/**
	 * \if ENGLISH_LANG
	 * Max command value
	 * \else
	 * Wn4sC|AnV5
	 * \endif
	 */
	public static final int     SDK_EXTPTZ_TOTAL = 0x80;							
}

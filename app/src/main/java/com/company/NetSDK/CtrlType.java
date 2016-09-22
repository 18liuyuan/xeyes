package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Control type, Corresponding to ControlDevice
 * \else
 * ?XVF@`PM#,6TS&ControlDevice=S?Z
 * \endif
 */
public class CtrlType implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Reboot device
	 * \else
	 * VXFtIh18
	 * \endif
	 */
	public static final int     SDK_CTRL_REBOOT = 0;
	
	/**
	 * \if ENGLISH_LANG
	 * Shut down device
	 * \else
	 * 9X1UIh18
	 * \endif
	 */
	public static final int     SDK_CTRL_SHUTDOWN = 1;
	
	/**
	 * \if ENGLISH_LANG
	 * HDD management
	 * \else
	 * S2EL9\@m
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK = 2;
	
	/**
	 * \if ENGLISH_LANG
	 * Network keyboard
	 * \else
	 * MxBg<|EL
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_POWER = 3;						
	public static final int     SDK_KEYBOARD_ENTER = 4;
	public static final int     SDK_KEYBOARD_ESC = 5;
	public static final int     SDK_KEYBOARD_UP = 6;
	public static final int     SDK_KEYBOARD_DOWN = 7;
	public static final int     SDK_KEYBOARD_LEFT = 8;
	public static final int     SDK_KEYBOARD_RIGHT = 9;
	public static final int     SDK_KEYBOARD_BTN0 = 10;
	public static final int     SDK_KEYBOARD_BTN1 = 11;
	public static final int     SDK_KEYBOARD_BTN2 = 12;
	public static final int     SDK_KEYBOARD_BTN3 = 13;
	public static final int     SDK_KEYBOARD_BTN4 = 14;
	public static final int     SDK_KEYBOARD_BTN5 = 15;
	public static final int     SDK_KEYBOARD_BTN6 = 16;
	public static final int     SDK_KEYBOARD_BTN7 = 17;
	public static final int     SDK_KEYBOARD_BTN8 = 18;
	public static final int     SDK_KEYBOARD_BTN9 = 19;
	public static final int     SDK_KEYBOARD_BTN10 = 20;
	public static final int     SDK_KEYBOARD_BTN11 = 21;
	public static final int     SDK_KEYBOARD_BTN12 = 22;
	public static final int     SDK_KEYBOARD_BTN13 = 23;
	public static final int     SDK_KEYBOARD_BTN14 = 24;
	public static final int     SDK_KEYBOARD_BTN15 = 25;
	public static final int     SDK_KEYBOARD_BTN16 = 26;
	public static final int     SDK_KEYBOARD_SPLIT = 27;
	public static final int     SDK_KEYBOARD_ONE = 28;
	public static final int     SDK_KEYBOARD_NINE = 29;
	public static final int     SDK_KEYBOARD_ADDR = 30;
	public static final int     SDK_KEYBOARD_INFO = 31;
	public static final int     SDK_KEYBOARD_REC = 32;
	public static final int     SDK_KEYBOARD_FN1 = 33;
	public static final int     SDK_KEYBOARD_FN2 = 34;
	public static final int     SDK_KEYBOARD_PLAY = 35;
	public static final int     SDK_KEYBOARD_STOP = 36;
	public static final int     SDK_KEYBOARD_SLOW = 37;
	public static final int     SDK_KEYBOARD_FAST = 38;
	public static final int     SDK_KEYBOARD_PREW = 39;
	public static final int     SDK_KEYBOARD_NEXT = 40;
	public static final int     SDK_KEYBOARD_JMPDOWN = 41;
	public static final int     SDK_KEYBOARD_JMPUP = 42;
	public static final int     SDK_KEYBOARD_10PLUS = 43;
	public static final int     SDK_KEYBOARD_SHIFT = 44;
	public static final int     SDK_KEYBOARD_BACK = 45;
	
	/**
	 * \if ENGLISH_LANG
	 * new network keyboard function
	 * \else
	 * PBMxBg<|EL9&D\
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_LOGIN = 46; 
	
	/**
	 * \if ENGLISH_LANG
	 * switch video channel
	 * \else
	 * GP;;JSF5M(5@
	 * \endif
	 */
	public static final int     SDK_KEYBOARD_CHNNEL = 47; 
    
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm input
	 * \else
	 * 4%7"1(>/JdHk
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_IN = 100;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate alarm output
	 * \else
	 * 4%7"1(>/Jd3v
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_OUT = 101;
	
	/**
	 * \if ENGLISH_LANG
	 * Matrix control
	 * \else
	 * >XUs?XVF
	 * \endif
	 */
	public static final int     SDK_CTRL_MATRIX = 102;
	
	/**
	 * \if ENGLISH_LANG
	 * SD card control(for IPC series). Please refer to HDD control
	 * \else
	 * SD?(?XVF(IPC2zF7)2NJ}M,S2EL?XVF
	 * \endif
	 */
	public static final int     SDK_CTRL_SDCARD = 103;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:begin burning 
	 * \else
	 * ?LB<;z?XVF#,?*J<?LB<
	 * \endif
	 */
	public static final int     SDK_BURNING_START = 104;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:stop burning
	 * \else
	 * ?LB<;z?XVF#,=aJx?LB<
	 * \endif
	 */
	public static final int     SDK_BURNING_STOP = 105;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay password(The string ended with '\0'. Max length is 8 bits. )
	 * \else
	 * ?LB<;z?XVF#,5~<SC\Bk(RT'\0'N*=aN25DWV7{4.#,Wn4s3$6H8N;)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDPWD = 106;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay head title(The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter.)
	 * \else
	 * ?LB<;z?XVF#,5~<SF,M7(RT'\0'N*=aN25DWV7{4.#,Wn4s3$6H1024WV=Z#,V'3V7VPP#,PP7V8t7{'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDHEAD = 107;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:overlay dot to the burned information(No parameter)
	 * \else
	 * ?LB<;z?XVF#,5~<S4r5c5=?LB<PEO"(2NJ}N^)
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDSIGN = 108;
	
	/**
	 * \if ENGLISH_LANG
	 * Burner control:self-defined overlay (The string ended with '\0'. Max length is 1024 bytes. Use '\n' to Enter)
	 * \else
	 * ?LB<;z?XVF#,WT6(Re5~<S(RT'\0'N*=aN25DWV7{4.#,Wn4s3$6H1024WV=Z#,V'3V7VPP#,PP7V8t7{'\n')
	 * \endif
	 */
	public static final int     SDK_BURNING_ADDCURSTOMINFO = 109;
	
	/**
	 * \if ENGLISH_LANG
	 * restore device default setup 
	 * \else
	 * ;V84Ih185DD,HOIhVC
	 * \endif
	 */
	public static final int     SDK_CTRL_RESTOREDEFAULT = 110;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate device snapshot
	 * \else
	 * 4%7"Ih18W%M<
	 * \endif
	 */
	public static final int     SDK_CTRL_CAPTURE_START = 111;
	
	/**
	 * \if ENGLISH_LANG
	 * Clear log
	 * \else
	 * Ge3}HUV>
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEARLOG = 112;
	
	/**
	 * \if ENGLISH_LANG
	 * Activate wireless alarm (IPC series)
	 * \else
	 * 4%7"N^O_1(>/(IPC2zF7)
	 * \endif
	 */
	public static final int     SDK_TRIGGER_ALARM_WIRELESS = 200;
	
	/**
	 * \if ENGLISH_LANG
	 * Mark important record
	 * \else
	 * 1jJ6VXR*B<OqND<~
	 * \endif
	 */
	public static final int     SDK_MARK_IMPORTANT_RECORD = 201;
	
	/**
	 * \if ENGLISH_LANG
	 * Network hard disk partition
	 * \else
	 * MxBgS2EL7VGx
	 * \endif
	 */
	public static final int     SDK_CTRL_DISK_SUBAREA = 202;
	
	/**
	 * \if ENGLISH_LANG
	 * Annex burning
	 * \else
	 * ?LB<;z?XVF#,8=<~?LB<.
	 * \endif
	 */
	public static final int     SDK_BURNING_ATTACH = 203;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Pause
	 * \else
	 * ?LB<T]M#
	 * \endif
	 */
	public static final int     SDK_BURNING_PAUSE = 204;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Resume
	 * \else
	 * ?LB<<LPx
	 * \endif
	 */
	public static final int     SDK_BURNING_CONTINUE = 205;
	
	/**
	 * \if ENGLISH_LANG
	 * Burn Postponed
	 * \else
	 * ?LB<K3QS
	 * \endif
	 */
	public static final int     SDK_BURNING_POSTPONE = 206;
	
	/**
	 * \if ENGLISH_LANG
	 * OEM control
	 * \else
	 * 1(M#?XVF
	 * \endif
	 */
	public static final int     SDK_CTRL_OEMCTRL = 207;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to device backup
	 * \else
	 * Ih18187]?*J<
	 * \endif
	 */
	public static final int     SDK_BACKUP_START = 208;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to device backup
	 * \else
	 * Ih18187]M#V9
	 * \endif
	 */
	public static final int     SDK_BACKUP_STOP = 209;
	
	/**
	 * \if ENGLISH_LANG
	 * Add WIFI configuration manually for car device
	 * \else
	 * 35TXJV6/Tv<SWIFIEdVC
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_ADD = 210;
	
	/**
	 * \if ENGLISH_LANG
	 * Delete WIFI configuration manually for car device
	 * \else
	 * 35TXJV6/I>3}WIFIEdVC
	 * \endif
	 */
	public static final int     SDK_VIHICLE_WIFI_DEC = 211;
	
	/**
	 * \if ENGLISH_LANG
	 * Start to buzzer control 
	 * \else
	 * 7dCyFw?XVF?*J<
	 * \endif
	 */
	public static final int     SDK_BUZZER_START = 212;
	
	/**
	 * \if ENGLISH_LANG
	 * Stop to buzzer control
	 * \else
	 * 7dCyFw?XVF=aJx
	 * \endif
	 */
	public static final int     SDK_BUZZER_STOP = 213;
	
	/**
	 * \if ENGLISH_LANG
	 * Reject User
	 * \else
	 * L^3}SC;'
	 * \endif
	 */
	public static final int     SDK_REJECT_USER = 214;
	
	/**
	 * \if ENGLISH_LANG
	 * Shield User
	 * \else
	 * FA1NSC;'
	 * \endif
	 */
	public static final int     SDK_SHIELD_USER = 215;
	
	/**
	 * \if ENGLISH_LANG
	 * Rain Brush 
	 * \else
	 * VGD\=;M(, SjK"?XVF 
	 * \endif
	 */
	public static final int     SDK_RAINBRUSH = 216;
	
	/**
	 * \if ENGLISH_LANG
	 * manual snap (struct MANUAL_SNAP_PARAMETER)
	 * \else
	 * DjVGD\=;M(, JV6/W%ED (6TS&=a99LeMANUAL_SNAP_PARAMETER)
	 * \endif
	 */
	public static final int     SDK_MANUAL_SNAP = 217;
	
	/**
	 * \if ENGLISH_LANG
	 * manual ntp time adjust
	 * \else
	 * JV6/NTPP#J1
	 * \endif
	 */
	public static final int     SDK_MANUAL_NTP_TIMEADJUST = 218;
	
	/**
	 * \if ENGLISH_LANG
	 * navigation info and note
	 * \else
	 * 5<:=PEO":M6LO{O"
	 * \endif
	 */
	public static final int     SDK_NAVIGATION_SMS = 219;
	
	/**
	 * \if ENGLISH_LANG
	 * route info
	 * \else
	 * B7O_5cN;PEO"
	 * \endif
	 */
	public static final int     SDK_CTRL_ROUTE_CROSSING = 220;
	
	/**
	 * \if ENGLISH_LANG
	 * backup device format
	 * \else
	 * 8qJ=;/187]Ih18
	 * \endif
	 */
	public static final int     SDK_BACKUP_FORMAT = 221;
	
	/**
	 * \if ENGLISH_LANG
	 * local preview split(struct DEVICE_LOCALPREVIEW_SLIPT_PARAMETER)
	 * \else
	 * ?XVFIh186K1>5XT$@@7V8n(6TS&=a99LeDEVICE_LOCALPREVIEW_SLIPT_PARAMETER)  
	 * \endif
	 */
	public static final int     SDK_DEVICE_LOCALPREVIEW_SLIPT = 222;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID init
	 * \else
	 * RAID3uJ<;/
	 * \endif
	 */
	public static final int     SDK_CTRL_INIT_RAID = 223;
	
	/**
	 * \if ENGLISH_LANG
	 * RAID control
	 * \else
	 * RAID2YWw
	 * \endif
	 */
	public static final int     SDK_CTRL_RAID = 224;
	
	/**
	 * \if ENGLISH_LANG
	 * sapredisk control
	 * \else
	 * HH18EL2YWw
	 * \endif
	 */
	public static final int     SDK_CTRL_SAPREDISK = 225;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi connect(struct WIFI_CONNECT)
	 * \else
	 * JV6/7"FpWIFIA,=S(6TS&=a99LeWIFI_CONNECT)
	 * \endif
	 */
	public static final int     SDK_WIFI_CONNECT = 226;
	
	/**
	 * \if ENGLISH_LANG
	 * wifi disconnect(struct WIFI_CONNECT)
	 * \else
	 * JV6/6O?*WIFIA,=S(6TS&=a99LeWIFI_CONNECT)
	 * \endif
	 */
	public static final int     SDK_WIFI_DISCONNECT = 227;
	
	/**
	 * \if ENGLISH_LANG
	 * Arm/disarm operation 
	 * \else
	 * 2<377@2YWw
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED = 228;
	
	/**
	 * \if ENGLISH_LANG
	 * IP modify(struct DHCTRL_IPMODIFY_PARAM)     
	 * \else
	 * P^8DG06KIP(6TS&=a99LeSDKCTRL_IPMODIFY_PARAM)  
	 * \endif
	 */
	public static final int     SDK_CTRL_IP_MODIFY = 229;
	
	/**
	 * \if ENGLISH_LANG
	 * wps connect wifi(struct DHCTRL_CONNECT_WIFI_BYWPS)
	 * \else
	 * wpsA,=Swifi(6TS&=a99LeSDKCTRL_CONNECT_WIFI_BYWPS)
	 * \endif
	 */
	public static final int     SDK_CTRL_WIFI_BY_WPS = 230;
	
	/**
	 * \if ENGLISH_LANG
	 * format pattion (struct DH_FORMAT_PATITION)
	 * \else
	 * 8qJ=;/7VGx(6TS&=a99LeSDK_FORMAT_PATITION)
	 * \endif
	 */
	public static final int     SDK_CTRL_FORMAT_PATITION = 231;
	
	/**
	 * \if ENGLISH_LANG
	 * eject storage device(struct DH_EJECT_STORAGE_DEVICE)
	 * \else
	 * JV6/P6TXIh18(6TS&=a99LeSDK_EJECT_STORAGE_DEVICE)
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_STORAGE = 232;
	
	/**
	 * \if ENGLISH_LANG
	 * load storage device(struct DH_LOAD_STORAGE_DEVICE)
	 * \else
	 * JV6/W0TXIh18(6TS&=a99LeSDK_LOAD_STORAGE_DEVICE)
	 * \endif
	 */
	public static final int     SDK_CTRL_LOAD_STORAGE = 233;
	
	/**
	 * \if ENGLISH_LANG
	 * close burner(struct NET_CTRL_BURNERDOOR) need wait 6s
	 * \else
	 * 9X1U?LB<;z9bG}CE(6TS&=a99Le NET_CTRL_BURNERDOOR) R;0cPhR*5H6Ck
	 * \endif
	 */
	public static final int     SDK_CTRL_CLOSE_BURNER = 234;
	
	/**
	 * \if ENGLISH_LANG
	 * eject burner(struct NET_CTRL_BURNERDOOR) need wait 4s
	 * \else
	 * 5/3v?LB<;z9bG}CE(6TS&=a99Le NET_CTRL_BURNERDOOR) R;0cPhR*5H4Ck
	 * \endif
	 */
	public static final int     SDK_CTRL_EJECT_BURNER = 235;
	
	/**
	 * \if ENGLISH_LANG
	 * confirm alarm NET_CTRL_CLEAR_ALARM
	 * \else
	 * O{>/(6TS&=a99Le NET_CTRL_CLEAR_ALARM)
	 * \endif
	 */
	public static final int     SDK_CTRL_CLEAR_ALARM = 236;
	
	/**
	 * \if ENGLISH_LANG
	 * Monitorwall_TV info (struct  NET_CTRL_MONITORWALL_TVINFO)
	 * \else
	 * 5gJSG=PEO"OTJ>(6TS&=a99Le NET_CTRL_MONITORWALL_TVINFO)
	 * \endif
	 */
	public static final int     SDK_CTRL_MONITORWALL_TVINFO = 237;
	
	/**
	 * \if ENGLISH_LANG
	 * start Intelligent VIDEO analysis (corresponding structure NET CTRL START VIDEO ANALYSE)
	 * \else
	 * ?*J<JSF5VGD\7VNv(6TS&=a99Le NET_CTRL_START_VIDEO_ANALYSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_VIDEO_ANALYSE =   238; 
	
	/**
	 * \if ENGLISH_LANG
	 * STOP intelligent VIDEO analysis corresponding structure NET (CTRL STOP VIDEO ANALYSE)
	 * \else
	 * M#V9JSF5VGD\7VNv(6TS&=a99Le NET_CTRL_STOP_VIDEO_ANALYSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_VIDEO_ANALYSE =   239;
	
	/**
	 * \if ENGLISH_LANG
	 * Controlled start equipment upgrades, independently complete the upgrade process by the equipment do not need to upgrade file
	 * \else
	 * ?XVFFt6/Ih18I}<6,SIIh186@A"Mj3II}<69}3L,2;PhR*4+JdI}<6ND<~
	 * \endif
	 */
	public static final int     SDK_CTRL_UPGRADE_DEVICE =   240;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback channel switching corresponding structure NET (CTRL MULTIPLAYBACK CHANNALES)
	 * \else
	 * GP;;6`M(5@T$@@;X7E5DM(5@(6TS&=a99Le NET_CTRL_MULTIPLAYBACK_CHANNALES)
	 * \endif
	 */
	public static final int     SDK_CTRL_MULTIPLAYBACK_CHANNALES =   241;
	
	/**
	 * \if ENGLISH_LANG
	 * Turn on the switch power supply timing device output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * 5gT4J1PrFw4r?*?*9XA?Jd3v?Z(6TS& NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN =   242;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the switch power supply timing device output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * 5gT4J1PrFw9X1U?*9XA?Jd3v?Z(6TS& NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE =   243;
	
	/**
	 * \if ENGLISH_LANG
	 * Power timing group open the switch quantity output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * 5gT4J1PrFw4r?*?*9XA?Jd3v?ZWi(6TS& NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_OPEN_ALL =   244;
	
	/**
	 * \if ENGLISH_LANG
	 * Power sequence set close the switch quantity output corresponding.net (CTRL SEQPOWER PARAM)
	 * \else
	 * 5gT4J1PrFw9X1U?*9XA?Jd3v?ZWi(6TS& NET_CTRL_SEQPOWER_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_SEQPOWER_CLOSE_ALL =   245;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR up corresponding.net (CTRL PROJECTOR PARAM)
	 * \else
	 * M6S0RGIOI}(6TS& NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_RISE =   246;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR drop (corresponding to the.net CTRL PROJECTOR PARAM)
	 * \else
	 * M6S0RGOB=5(6TS& NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_FALL =   247;
	
	/**
	 * \if ENGLISH_LANG
	 * PROJECTOR stop (corresponding to the.net CTRL PROJECTOR PARAM)
	 * \else
	 * M6S0RGM#V9(6TS& NET_CTRL_PROJECTOR_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_PROJECTOR_STOP =   248;
	
	/**
	 * \if ENGLISH_LANG
	 * INFRARED buttons (corresponding to the.net CTRL INFRARED KEY PARAM)
	 * \else
	 * :lMb04<|(6TS& NET_CTRL_INFRARED_KEY_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_INFRARED_KEY =   249;
	
	/**
	 * \if ENGLISH_LANG
	 * Device START playback of audio file corresponding structure NET (CTRL START PLAYAUDIO)
	 * \else
	 * Ih18?*J<2%7ERtF5ND<~(6TS&=a99Le NET_CTRL_START_PLAYAUDIO)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIO =   250;
	
	/**
	 * \if ENGLISH_LANG
	 * Equipment stop playback of audio file
	 * \else
	 * Ih18M#V92%7ERtF5ND<~
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_PLAYAUDIO =   251;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding structure NET open alarm (CTRL ALARMBELL)
	 * \else
	 * ?*Ft>/:E(6TS&=a99Le NET_CTRL_ALARMBELL)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_ALARMBELL =   252;
	
	/**
	 * \if ENGLISH_LANG
	 * Close the warning signal corresponding structure NET (CTRL ALARMBELL)
	 * \else
	 * 9X1U>/:E(6TS&=a99Le NET_CTRL_ALARMBELL)
	 * \endif
	 */
	public static final int     SDK_CTRL_STOP_ALARMBELL =   253;
	
	/**
	 * \if ENGLISH_LANG
	 * OPEN ACCESS control - corresponding structure NET (CTRL ACCESS OPEN)
	 * \else
	 * CE={?XVF-?*CE(6TS&=a99Le NET_CTRL_ACCESS_OPEN)
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_OPEN =   254;
	
	/**
	 * \if ENGLISH_LANG
	 * Corresponding structure NET BYPASS function (CTRL SET BYPASS)
	 * \else
	 * IhVCETB79&D\(6TS&=a99Le NET_CTRL_SET_BYPASS)
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_BYPASS =   255;
	
	/**
	 * \if ENGLISH_LANG
	 * Add records to record set number (corresponding to the.net CTRL you INSERT PARAM)
	 * \else
	 * Lm<S<GB<#,;q5C<GB<</1`:E(6TS&NET_CTRL_RECORDSET_INSERT_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERT =   256;
	
	/**
	 * \if ENGLISH_LANG
	 * Update a record of the number (corresponding to the.net CTRL you PARAM)
	 * \else
	 * 8|PBD3<GB<</1`:E5D<GB<(6TS&NET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_UPDATE =   257;
	
	/**
	 * \if ENGLISH_LANG
	 * According to the record set number to delete a record (corresponding to the.net CTRL you PARAM)
	 * \else
	 * 8y>]<GB<</1`:EI>3}D3<GB<(6TS&NET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_REMOVE =   258;
	
	/**
	 * \if ENGLISH_LANG
	 * Remove all RECORDSET information corresponding.net (CTRL you PARAM)
	 * \else
	 * Ge3}KySP<GB<</PEO"(6TS&NET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_CLEAR =   259;
	
	/**
	 * \if ENGLISH_LANG
	 * Entrance guard control - CLOSE corresponding structure NET (CTRL ACCESS CLOSE)
	 * \else
	 * CE={?XVF-9XCE(6TS&=a99Le NET_CTRL_ACCESS_CLOSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_ACCESS_CLOSE =   260;
	
	/**
	 * \if ENGLISH_LANG
	 * Alarm sub system activation setup(corresponding structure NET_CTRL_ALARM_SUBSYSTEM_SETACTIVE)
	 * \else
	 * 1(>/WSO5M3<$;nIhVC(6TS&=a99LeNET_CTRL_ALARM_SUBSYSTEM_SETACTIVE)
	 * \endif
	 */
	public static final int     SDK_CTRL_ALARM_SUBSYSTEM_ACTIVE_SET =   261;
	
	/**
	 * \if ENGLISH_LANG
	 * Disable device open gateway(corresponding to structure  NET_CTRL_FORBID_OPEN_STROBE)
	 * \else
	 * ={V9Ih186K?*U"(6TS&=a99Le NET_CTRL_FORBID_OPEN_STROBE)
	 * \endif
	 */
	public static final int     SDK_CTRL_FORBID_OPEN_STROBE =   262;
	
	/**
	 * \if ENGLISH_LANG
	 * Enable gateway(corresponding to structure  NET_CTRL_OPEN_STROBE)
	 * \else
	 * ?*Ft5@U"(6TS&=a99Le NET_CTRL_OPEN_STROBE)
	 * \endif
	 */
	public static final int     SDK_CTRL_OPEN_STROBE =   263;
	
	/**
	 * \if ENGLISH_LANG
	 * Talk no response(corresponding to structure  NET_CTRL_TALKING_REFUSE)
	 * \else
	 * 6T=2>\>x=SL}(6TS&=a99Le NET_CTRL_TALKING_REFUSE)
	 * \endif
	 */
	public static final int     SDK_CTRL_TALKING_REFUSE =   264;
	
	/**
	 * \if ENGLISH_LANG
	 * arm-disarm operation(corresponding to structure CTRL_ARM_DISARM_PARAM_EX), CTRL_ARM_DISARM_PARAM upgrade#,recommended
	 * \else
	 * 2<377@2YWw(6TS&=a99Le CTRL_ARM_DISARM_PARAM_EX), 6TCTRL_ARM_DISARM_PARAM I}<6#,=(RiSCUb8v
	 * \endif
	 */
	public static final int     SDK_CTRL_ARMED_EX = 265;
	
	/**
	 * \if ENGLISH_LANG
	 * Net keyboard control(corresponding to structure  DHCTRL_NET_KEYBOARD)
	 * \else
	 * MxBg<|EL?XVF(6TS&=a99Le DHCTRL_NET_KEYBOARD)
	 * \endif
	 */
    public static final int     SDK_CTRL_NET_KEYBOARD = 400;
    
    /**
	 * \if ENGLISH_LANG
	 * Open air conditioner(corresponding to structure  NET_CTRL_OPEN_AIRCONDITION)
	 * \else
	 * 4r?*?U5w(6TS&=a99Le NET_CTRL_OPEN_AIRCONDITION)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_OPEN = 401;
    
    /**
	 * \if ENGLISH_LANG
	 * Close air-conditioner(corresponding to structure  NET_CTRL_CLOSE_AIRCONDITION)
	 * \else
	 * 9X1U?U5w(6TS&=a99Le NET_CTRL_CLOSE_AIRCONDITION)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_CLOSE = 402;
    
    /**
	 * \if ENGLISH_LANG
	 * Set temperature (corresponding to structure  NET_CTRL_SET_TEMPERATURE)
	 * \else
	 * Ih6(?U5wNB6H(6TS&=a99Le NET_CTRL_SET_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SET_TEMPERATURE = 403;
    
    /**
	 * \if ENGLISH_LANG
	 * Adjust temperature(corresponding to structure  NET_CTRL_ADJUST_TEMPERATURE)
	 * \else
	 * 5w=Z?U5wNB6H(6TS&=a99Le NET_CTRL_ADJUST_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_ADJUST_TEMPERATURE = 404;
    
    /**
	 * \if ENGLISH_LANG
	 * Set air work mode(corresponding to structure  NET_CTRL_ADJUST_TEMPERATURE)
	 * \else
	 * IhVC?U5w9$WwD#J=(6TS&=a99Le NET_CTRL_ADJUST_TEMPERATURE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETMODE = 405;
    
    /**
	 * \if ENGLISH_LANG
	 * Set fan mode(corresponding to structure  NET_CTRL_AIRCONDITION_SETMODE)
	 * \else
	 * IhVC?U5wKM7gD#J=(6TS&=a99Le NET_CTRL_AIRCONDITION_SETMODE)
	 * \endif
	 */
    public static final int     SDK_CTRL_AIRCONDITION_SETWINDMODE = 406;
    
    /**
	 * \if ENGLISH_LANG
	 * Recover device default and set new protocol(corresponding to structure NET_CTRL_RESTORE_DEFAULT)
	 * Recover config and use this enumeration first, if port failed,
	 * and CLIENT_GetLastError return NET_UNSUPPORTED, try again DH_CTRL_RESTOREDEFAULT restore config
	 * \else
	 * ;V84Ih185DD,HOIhVCPBP-Ri(6TS&=a99LeNET_CTRL_RESTORE_DEFAULT)
	 * ;V84EdVCSEOHJ9SC8CC6>Y#,Hg9{=S?ZJ'0\#,
	 * GRCLIENT_GetLastError75;XNET_UNSUPPORTED,TY3"JTJ9SCSDK_CTRL_RESTOREDEFAULT;V84EdVC
	 * \endif
	 */
    public static final int     SDK_CTRL_RESTOREDEFAULT_EX  = 407;
    
    /**
	 * \if ENGLISH_LANG
	 * send event to device (corresponding to  structure  NET_NOTIFY_EVENT_DATA)
	 * \else
	 * OrIh187"KMJB<~(6TS&=a99Le NET_NOTIFY_EVENT_DATA)
	 * \endif
	 */
    public static final int     SDK_CTRL_NOTIFY_EVENT = 408;
    
    /**
	 * \if ENGLISH_LANG
	 * mute alarm setup
	 * \else
	 * N^Iy1(>/IhVC
	 * \endif
	 */
    public static final int     SDK_CTRL_SILENT_ALARM_SET = 409;
    
    /**
	 * \if ENGLISH_LANG
	 * device start sound report(corresponding to  structure  NET_CTRL_START_PLAYAUDIOEX)
	 * \else
	 * Ih18?*J<SoRt2%1((6TS&=a99Le NET_CTRL_START_PLAYAUDIOEX)
	 * \endif
	 */
	public static final int     SDK_CTRL_START_PLAYAUDIOEX = 410;
	
	/**
	 * \if ENGLISH_LANG
	 * device stop sound report
	 * \else
	 * Ih18M#V9SoRt2%1(
	 * \endif
	 */
    public static final int     SDK_CTRL_STOP_PLAYAUDIOEX = 411;
    
    /**
	 * \if ENGLISH_LANG
	 * close gateway(corresponding to  structure  NET_CTRL_CLOSE_STROBE)
	 * \else
	 * 9X1U5@U"(6TS&=a99Le NET_CTRL_CLOSE_STROBE)
	 * \endif
	 */
    public static final int     SDK_CTRL_CLOSE_STROBE = 412;
    
    /**
	 * \if ENGLISH_LANG
	 * set parking reservation status (corresponding to  structure  NET_CTRL_SET_ORDER_STATE)
	 * \else
	 * IhVC35N;T$6(W4L,(6TS&=a99Le NET_CTRL_SET_ORDER_STATE)
	 * \endif
	 */
	public static final int     SDK_CTRL_SET_ORDER_STATE = 413;
	
	/**
	 * \if ENGLISH_LANG
	 * add record#,get record collection no.(corresponding to NET_CTRL_RECORDSET_INSERT_PARAM)
	 * \else
	 * Lm<S<GB<#,;q5C<GB<</1`:E(6TS&NET_CTRL_RECORDSET_INSERT_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_RECORDSET_INSERTEX = 414;
	
	/**
	 * \if ENGLISH_LANG
	 * update record set no.!/s record(corresponding to NET_CTRL_RECORDSET_PARAM)
	 * \else
	 * 8|PBD3<GB<</1`:E5D<GB<(6TS&NET_CTRL_RECORDSET_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_RECORDSET_UPDATEEX = 415;
    
    /**
	 * \if ENGLISH_LANG
	 * fingerprint collection (corresponding to structure NET_CTRL_CAPTURE_FINGER_PRINT)
	 * \else
	 * V8NF2I</(6TS&=a99Le NET_CTRL_CAPTURE_FINGER_PRINT)
	 * \endif
	 */
    public static final int     SDK_CTRL_CAPTURE_FINGER_PRINT = 416;
    
    /**
	 * \if ENGLISH_LANG
	 * Parking lot entrance/exit controller LED setup(corresponding structure  NET_CTRL_ECK_LED_SET_PARAM)
	 * \else
	 * M#353!3vHk?Z?XVFFwLEDIhVC(6TS&=a99Le NET_CTRL_ECK_LED_SET_PARAM)
	 * \endif
	 */
	public static final int     SDK_CTRL_ECK_LED_SET = 417;
	
	/**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info import (corresponding structure  NET_CTRL_ECK_IC_CARD_IMPORT_PARAM)
	 * \else
	 * VGD\M#35O5M33vHk?Z;zIC?(PEO"5<Hk(6TS&=a99Le NET_CTRL_ECK_IC_CARD_IMPORT_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_IC_CARD_IMPORT = 418;
    
    /**
	 * \if ENGLISH_LANG
	 * Intelligent parking system in/out device IC card info sync command, receive this command, device will delete original IC card info(corresponding structure  NET_CTRL_ECK_SYNC_IC_CARD_PARAM)
	 * \else
	 * VGD\M#35O5M33vHk?Z;zIC?(PEO"M,2=V8An#,JU5=4KV8An:s#,Ih18I>3}T-SPIC?(PEO"(6TS&=a99Le NET_CTRL_ECK_SYNC_IC_CARD_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SYNC_IC_CARD = 419;
    
    /**
	 * \if ENGLISH_LANG
	 * Delete specific wireless device(corresponding structure  NET_CTRL_LOWRATEWPAN_REMOVE)
	 * \else
	 * I>3}V86(N^O_Ih18(6TS&=a99Le NET_CTRL_LOWRATEWPAN_REMOVE)
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_REMOVE = 420;
    
    /**
	 * \if ENGLISH_LANG
	 * Modify wireless device info(corresponding structure  NET_CTRL_LOWRATEWPAN_MODIFY)
	 * \else
	 * P^8DN^O_Ih18PEO"(6TS&=a99Le NET_CTRL_LOWRATEWPAN_MODIFY)
	 * \endif
	 */
    public static final int     SDK_CTRL_LOWRATEWPAN_MODIFY = 421;
    
    /**
	 * \if ENGLISH_LANG
	 * Set up the vehicle spot information of the machine at the passageway of the intelligent parking system (corresponding to  NET_CTRL_ECK_SET_PARK_INFO_PARAM)
	 * \else
	 * VGD\M#35O5M33vHk?Z;zIhVC35N;PEO"(6TS&=a99Le NET_CTRL_ECK_SET_PARK_INFO_PARAM)
	 * \endif
	 */
    public static final int     SDK_CTRL_ECK_SET_PARK_INFO = 422;
    
    /**
	 * \if ENGLISH_LANG
	 * hang up the video phone (corresponding to NET_CTRL_VTP_DISCONNECT)
	 * \else
	 * 9R6OJSF55g;0(6TS&=a99Le NET_CTRL_VTP_DISCONNECT)
	 * \endif
	 */
	public static final int     SDK_CTRL_VTP_DISCONNECT = 423;
	
	public static final int     SDK_CTRL_UPDATE_FILES = 424;
	
	public static final int     SDK_CTRL_MATRIX_SAVE_SWITCH = 425;
	
	public static final int     SDK_CTR_MATRIX_RESTORE_SWITCH = 426;
	
    public static final int     SDK_CTRL_THERMO_GRAPHY_ENSHUTTER = 0x10000;     // IhVCHH3IOq?lCEFtSC/={SC, pInBuf= NET_IN_THERMO_EN_SHUTTER*, pOutBuf= NET_OUT_THERMO_EN_SHUTTER * 
    public static final int     SDK_CTRL_RADIOMETRY_SETOSDMARK = 0x10001;       // IhVC2bNBOn5DosdN*8_AA, pInBuf= NET_IN_RADIOMETRY_SETOSDMARK*, pOutBuf= NET_OUT_RADIOMETRY_SETOSDMARK *    
    public static final int     SDK_CTRL_AUDIO_REC_START_NAME = 0x10002;        // ?*FtRtF5B<Rt2"5C5=B<RtC{, pInBuf = NET_IN_AUDIO_REC_MNG_NAME *, pOutBuf = NET_OUT_AUDIO_REC_MNG_NAME *
    public static final int     SDK_CTRL_AUDIO_REC_STOP_NAME = 0x10003;         // 9X1URtF5B<Rt2"75;XND<~C{3F, pInBuf = NET_IN_AUDIO_REC_MNG_NAME *, pOutBuf = NET_OUT_AUDIO_REC_MNG_NAME *
    public static final int     SDK_CTRL_SNAP_MNG_SNAP_SHOT = 0x10004;          // <4J1W%M<(SVC{JV6/W%M<), pInBuf = NET_IN_SNAP_MNG_SHOT *, pOutBuf = NET_OUT_SNAP_MNG_SHOT *
    public static final int     SDK_CTRL_LOG_STOP = 0x10005;                    // G?VFM,2=;:4fJ}>]5=J}>]?b2"9X1UJ}>]?b, pInBuf = NET_IN_LOG_MNG_CTRL *, pOutBuf = NET_OUT_LOG_MNG_CTRL *
    public static final int     SDK_CTRL_LOG_RESUME = 0x10006;                  // ;V84J}>]?b, pInBuf = NET_IN_LOG_MNG_CTRL *, pOutBuf = NET_OUT_LOG_MNG_CTRL *
    public static final int     SDK_CTRL_POS_ADD = 0x10007;                     // Tv<SR;8vPosIh18, pInBuf = NET_IN_POS_ADD *, pOutBuf = NET_OUT_POS_ADD *
    public static final int     SDK_CTRL_POS_REMOVE = 0x10008;                  // I>3}R;8vPosIh18, pInBuf = NET_IN_POS_REMOVE *, pOutBuf = NET_OUT_POS_REMOVE *
    public static final int     SDK_CTRL_POS_REMOVE_MULTI = 0x10009;            // EzA?I>3}PosIh18, pInBuf = NET_IN_POS_REMOVE_MULTI *, pOutBuf = NET_OUT_POS_REMOVE_MULTI *
    public static final int     SDK_CTRL_POS_MODIFY = 0x1000A;                  // P^8DR;8vPosIh18, pInBuf = NET_IN_POS_ADD *, pOutBuf = NET_OUT_POS_ADD *
    public static final int     SDK_CTRL_SET_SOUND_ALARM = 0x1000B;             // 4%7"SPIy1(>/, pInBuf = NET_IN_SOUND_ALARM *, pOutBuf = NET_OUT_SOUND_ALARM *
    public static final int 	SDK_CTRL_AUDIO_MATRIX_SILENCE = 0x1000C;	    // RtF5>XUsR;<|>2Rt?XVF(6TS&pInBuf = NET_IN_AUDIO_MATRIX_SILENCE, pOutBuf =  NET_OUT_AUDIO_MATRIX_SILENCE)
    public static final int     SDK_CTRL_LOWRATEWPAN_ADD = 0x10011;				// Tv<SN^O_Ih18PEO"(6TS&  pInBuf = NET_CTRL_LOWRATEWPAN_ADD *, pOutBUf = NULL)
    public static final int 	SDK_CTRL_LOWRATEWPAN_REMOVEALL = 0x10012;		// I>3}KySP5DN^O_Ih18PEO"(6TS& pInBuf = NET_CTRL_LOWRATEWPAN_REMOVEALL *, pOutBUf = NULL)
    public static final int     SDK_CTRL_TEST_MAIL = 0x10014;                   // 2bJTSJ<~(6TS& pInBuf = NET_IN_TEST_MAIL, pOutBuf = NET_OUT_TEST_MAIL)
}

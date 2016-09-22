package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Device support function list 
 * \else
 * Ih18V'3V9&D\AP1m
 * \endif
 */
public class SDK_DEV_FUNC implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * FTP #,1#:send record file 2#:send snapshot file
	 * \else
	 * FTP 04N;#,1#:4+KMB<OqND<~ 2#:4+KMW%M<ND<~
	 * \endif
	 */
	public static int EN_FTP = 0;							

	/**
	 * \if ENGLISH_LANG
	 * SMTP #,1#:alarm send text mail 2#:alarm send picture 3: support health mail
	 * \else
	 * SMTP 04N;#,1#:1(>/4+KMND1>SJ<~ 2#:1(>/4+KMM<F, 3:V'3V=!?5SJ<~9&D\
	 * \endif
	 */
	public static int EN_SMTP = 1;					

	/**
	 * \if ENGLISH_LANG
	 * NTP #:1#:adjust system time
	 * \else
	 * NTP	04N;#:1#:5wU{O5M3J1<d
	 * \endif
	 */
	public static int EN_NTP = 2;						

	/**
	 * \if ENGLISH_LANG
	 * Auto maintenance #:1#:reboot 2#:off 3:delete file
	 * \else
	 * WT6/N,;$ 04N;#:1#:VXFt 2#:9X1U 3:I>3}ND<~
	 * \endif
	 */
	public static int EN_AUTO_MAINTAIN = 3;			

	/**
	 * \if ENGLISH_LANG
	 * Mask #:1#:multi-area mask
	 * \else
	 * GxSrUZ52 04N;#:1#:6`GxSrUZ52
	 * \endif
	 */
	public static int EN_VIDEO_COVER = 4;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration#:1#:after registration sdk auto register
	 * \else
	 * Vw6/W"2a	04N;#:1#:W"2a:ssdkVw6/5GB=
	 * \endif
	 */
	public static int EN_AUTO_REGISTER = 5;			

	/**
	 * \if ENGLISH_LANG
	 * DHCP#:1#:DHCP
	 * \else
	 * DHCP	04N;#:1#:DHCP
	 * \endif
	 */
	public static int EN_DHCP = 6;					

	/**
	 * \if ENGLISH_LANG
	 * UPNP#:1#:UPNP
	 * \else
	 * UPNP	04N;#:1#:UPNP
	 * \endif
	 */
	public static int EN_UPNP = 7;					

	/**
	 * \if ENGLISH_LANG
	 * Serial snap#:1:CommATM
	 * \else
	 * 4.?ZW%0| 04N;#:1:CommATM
	 * \endif
	 */
	public static int EN_COMM_SNIFFER = 8;			

	/**
	 * \if ENGLISH_LANG
	 * Net snap #: 1#:NetSniffer
	 * \else
	 * MxBgW%0| 04N;#: 1#:NetSniffer
	 * \endif
	 */
	public static int EN_NET_SNIFFER = 9;				

	/**
	 * \if ENGLISH_LANG
	 * Writing function#:1#:Search writing status
	 * \else
	 * ?LB<9&D\ 04N;#:1#:2iQ/?LB<W4L,
	 * \endif
	 */
	public static int EN_BURN = 10;					

	/**
	 * \if ENGLISH_LANG
	 * Video matrix #:1#:support video matrix 2: support SPOT video matrix 3: support HDMI video matrix
	 * \else
	 * JSF5>XUs 04N;#:1#:JG7qV'3VJSF5>XUs 2:JG7qV'3VSPOTJSF5>XUs 3:JG7qV'3VHDMIJSF5>XUs
	 * \endif
	 */
	public static int EN_VIDEO_MATRIX = 11;			

	/**
	 * \if ENGLISH_LANG
	 * Audio detect#:1#:support audio detect
	 * \else
	 * RtF5<l2b 04N;#:1#:JG7qV'3VRtF5<l2b
	 * \endif
	 */
	public static int EN_AUDIO_DETECT = 12;			

	/**
	 * \if ENGLISH_LANG
	 * Storage position#:1#:Ftp server(Ips) 2#:SMB 3#:NFS 4#:ISCSI 16#:DISK 17#:USB
	 * \else
	 * 4f4"N;VC 04N;#:1#:Ftp7~NqFw(Ips) 2#:SMB 3#:NFS 4#:ISCSI 16#:DISK 17#:UEL
	 * \endif
	 */
	public static int EN_STORAGE_STATION = 13;			

	/**
	 * \if ENGLISH_LANG
	 * IPS storage search#:1#:IPS storage search 
	 * \else
	 * IPS4f4"2iQ/ 04N;#:1#:IPS4f4"2iQ/	
	 * \endif
	 */
	public static int EN_IPSSEARCH = 14;				

	/**
	 * \if ENGLISH_LANG
	 * Snap  #:1#:resolution2#:frame rate3#:snapshot4#:snap file format5#:quanlity
	 * \else
	 * W%M<  04N;#:1#:7V1fBJ2#:V!BJ3#:W%M<7=J=4#:W%M<ND<~8qJ=5#:M<;-VJA?
	 * \endif
	 */
	public static int EN_SNAP = 15;					

	/**
	 * \if ENGLISH_LANG
	 * Support default net card search 1#:support
	 * \else
	 * V'3VD,HOMx?(2iQ/ 04N; 1#:V'3V
	 * \endif
	 */
	public static int EN_DEFAULTNIC = 16;				

	/**
	 * \if ENGLISH_LANG
	 * CBR mode display quality config item 1: support
	 * \else
	 * CBRD#J=OBOTJ>;-VJEdVCOn 04N; 1:V'3V
	 * \endif
	 */
	public static int EN_SHOWQUALITY = 17;				

	/**
	 * \if ENGLISH_LANG
	 * Config import/export function 1: support
	 * \else
	 * EdVC5<Hk5<3v9&D\D\A& 04N; 1:V'3V
	 * \endif
	 */
	public static int EN_CONFIG_IMEXPORT = 18;			

	/**
	 * \if ENGLISH_LANG
	 * Support page mode log search 1#:support
	 * \else
	 * JG7qV'3V7VR37=J=5DHUV>2iQ/ 04N; 1#:V'3V
	 * \endif
	 */
	public static int EN_LOG = 19;						

	/**
	 * \if ENGLISH_LANG
	 * Record setup some capacities 1:redundant 2:prerecord 3:record period
	 * \else
	 * B<OqIhVC5DR;P)D\A& 04N; 1:H_S` 2:T$B< 3:B<OqJ1<d6N
	 * \endif
	 */
	public static int EN_SCHEDULE = 20;				

	/**
	 * \if ENGLISH_LANG
	 * Net type 1: Ethernet 2: Wireless 3:CDMA/GPRS 4:CDMA/GPRS multi net card config
	 * \else
	 * MxBg@`PM04N;1mJ> 1:RTL,Mx 2:N^O_>VSr 3:CDMA/GPRS 4:CDMA/GPRS6`Mx?(EdVC
	 * \endif
	 */
	public static int EN_NETWORK_TYPE = 21;			

	/**
	 * \if ENGLISH_LANG
	 * Mark important record:1#: set important record mark
	 * \else
	 * 1jJ6VXR*B<Oq 04N;:1#:IhVCVXR*B<Oq1jJ6
	 * \endif
	 */
	public static int EN_MARK_IMPORTANTRECORD = 22;	

	/**
	 * \if ENGLISH_LANG
	 * Active frame control#:1#:support active frame control, 2: support schedule alarm type frame control(not support motion detect), this capability and ACF are mutually exclusive
	 * \else
	 * ;n6/V!BJ?XVF 04N;#:1#:V'3V;n6/V!BJ?XVF, 2:V'3V6(J11(>/@`PM;n6/V!BJ?XVF(2;V'3V6/<l),8CD\A&SkACFD\A&;%3b
	 * \endif
	 */
	public static int EN_ACFCONTROL = 23;				

	/**
	 * \if ENGLISH_LANG
	 * Multi-channel sub stream#:1#:support 3 channel sub stream, 2:support sub stream encode compression standalone setup
	 * \else
	 * 6`B78(BkAw 04N;#:1#:V'3VH}B78(BkAw, 2:V'3V8(BkAw1`BkQ9Ku8qJ=6@A"IhVC
	 * \endif
	 */
	public static int EN_MULTIASSIOPTION = 24;			

	/**
	 * \if ENGLISH_LANG
	 * Component module#:1#,time schedule separate  2: standard I frame interval setup
	 * \else
	 * Wi<~;/D#?i 04N;#:1#,J1<d1m7V?*4&@m 2:1jW<IV!<d8tIhVC
	 * \endif
	 */
	public static int EN_DAVINCIMODULE = 25;			

	/**
	 * \if ENGLISH_LANG
	 * GPS#:1#:Gps
	 * \else
	 * GPS9&D\ 04N;#:1#:Gps6(N;9&D\
	 * \endif
	 */
	public static int EN_GPS = 26;                           

	/**
	 * \if ENGLISH_LANG
	 * Support multi-net card search 1#:support
	 * \else
	 * V'3V6`Mx?(2iQ/ 04N; 1#:V'3V
	 * \endif
	 */
	public static int EN_MULTIETHERNET = 27;			

	/**
	 * \if ENGLISH_LANG
	 * Login property #:1#:support Login property search
	 * \else
	 * LoginJtPT 04N;#:1#:V'3VLoginJtPT2iQ/
	 * \endif
	 */
	public static int EN_LOGIN_ATTRIBUTE = 28;               

	/**
	 * \if ENGLISH_LANG
	 * Record related#:1#,general#;2#:alarm#;3#:motion detect record#;4#:local storage#;5#:remote storage#;6#:redundant storage#;7#:local emergency storage#;8#:support main/sub stream remote storage
	 * \else
	 * B<OqO`9X 04N;#:1#,FUM(B<Oq#;2#:1(>/B<Oq#;3#:6/L,<l2bB<Oq#;4#:1>5X4f4"#;5#:T63L4f4"#;6#:H_S`4f4"#;7#:1>5X=t<14f4"#;8#:V'3VGx7VVw8(BkAw5DT63L4f4"
	 * \endif
	 */
	public static int EN_RECORD_GENERAL = 29;			

	/**
	 * \if ENGLISH_LANG
	 * Json format config:1 support Json format, 2: use F6 NAS config, 3: use F6 Raid config, 4#:use F6 MotionDetect config, 5#:completely support 3 generations config(V3)#,via F6 command access
	 * \else
	 * Json8qJ=EdVC:04N;#:1V'3VJson8qJ=, 2: J9SCF65DNASEdVC, 3: J9SCF65DRaidEdVC, 4#:J9SCF65DMotionDetectEdVC, 5#:MjU{V'3VH}4zEdVC(V3)#,M(9}F6C|An7CNJ
	 * \endif
	 */
	public static int EN_JSON_CONFIG = 30;				

	/**
	 * \if ENGLISH_LANG
	 * shield function#:1#,shield PTZ , 2: shield 3G alive period
	 * \else
	 * FA1N9&D\#:04N;#:1#,FA1NPTZTFL(9&D\, 2: FA1N3G5D1#;nJ16N9&D\
	 * \endif
	 */
	public static int EN_HIDE_FUNCTION = 31;			

	/**
	 * \if ENGLISH_LANG
	 * harddisk bad channel info support capacity:1#,hard disk bad channel info search support capacity
	 * \else
	 * S2EL;55@PEO"V'3VD\A&: 04N;#:1#,S2EL;55@PEO"2iQ/V'3VD\A&
	 * \endif
	 */
	public static int EN_DISK_DAMAGE = 32;                   

	/**
	 * \if ENGLISH_LANG
	 * Support playback net sending speed control:1#,support playback speed up
	 * \else
	 * V'3V;X7EMx4+KY6H?XVF:04N;:1#,V'3V;X7E<SKY
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL = 33;		

	/**
	 * \if ENGLISH_LANG
	 * Support holiday period config:1#,support holiday time period config
	 * \else
	 * V'3V<YFZJ1<d6NEdVC:04N;:1#,V'3V<YFZJ1<d6NEdVC
	 * \endif
	 */
	public static int EN_HOLIDAYSCHEDULE = 34;			

	/**
	 * \if ENGLISH_LANG
	 * ATM takeout time out
	 * \else
	 * ATMH!G.3,J1
	 * \endif
	 */
	public static int EN_FETCH_MONEY_TIMEOUT = 35;		

	/**
	 * \if ENGLISH_LANG
	 * Backup supported format#,1:DAV, 2:ASF
	 * \else
	 * 187]V'3V5D8qJ=#,04N;#:1:DAV, 2:ASF
	 * \endif
	 */
	public static int EN_BACKUP_VIDEO_FORMAT = 36;		

	/**
	 * \if ENGLISH_LANG
	 * Support hard disk type search
	 * \else
	 * V'3VS2EL@`PM2iQ/
	 * \endif
	 */
	public static int EN_QUERY_DISK_TYPE = 37;               

	/**
	 * \if ENGLISH_LANG
	 * Support device display output (VGA and etc.) config, 1:split tour config
	 * \else
	 * V'3VIh18OTJ>Jd3v#(VGA5H#)EdVC,04N;: 1:;-Cf7V8nBVQ2EdVC
	 * \endif
	 */
	public static int EN_CONFIG_DISPLAY_OUTPUT = 38;         

	/**
	 * \if ENGLISH_LANG
	 * Support extension stream record control setup,1-sub stream control setup
	 * \else
	 * V'3V@)U9BkAwB<Oq?XVFIhVC, 04N;#:1-8(BkAwB<Oq?XVFIhVC
	 * \endif
	 */
	public static int EN_SUBBITRATE_RECORD_CTRL = 39;        

	/**
	 * \if ENGLISH_LANG
	 * Support IPV6 setup,1-IPV6 config
	 * \else
	 * V'3VIPV6IhVC, 04N;#:1-IPV6EdVC
	 * \endif
	 */
	public static int EN_IPV6 = 40;                          

	/**
	 * \if ENGLISH_LANG
	 * SNMP
	 * \else
	 * SNMP#(<r5%MxBg9\@mP-Ri#)
	 * \endif
	 */
	public static int EN_SNMP = 41;                          

	/**
	 * \if ENGLISH_LANG
	 * Support to get device URL address, : 1-search config URL address
	 * \else
	 * V'3V;qH!Ih18URL5XV7, 04N;: 1-2iQ/EdVCURL5XV7
	 * \endif
	 */
	public static int EN_QUERY_URL = 42;                     

	/**
	 * \if ENGLISH_LANG
	 * ISCSI
	 * \else
	 * ISCSI#(InternetP!PM<FKc;zO5M3=S?ZEdVC#)
	 * \endif
	 */
	public static int EN_ISCSI = 43;					

	/**
	 * \if ENGLISH_LANG
	 * Support Raid
	 * \else
	 * V'3VRaid9&D\
	 * \endif
	 */
	public static int EN_RAID = 44;					

	/**
	 * \if ENGLISH_LANG
	 * Support disk infoF5 search
	 * \else
	 * V'3V4EELPEO"F52iQ/
	 * \endif
	 */
	public static int EN_HARDDISK_INFO = 45;			

	/**
	 * \if ENGLISH_LANG
	 * Support PIP function :1,PIP setup; 2,PIP preview, record storage, search, download;3, support PIP encode config and channel search
	 * \else
	 * V'3V;-VP;-9&D\ 04N;:1,;-VP;-IhVC; 2,;-VP;-T$@@!"B<Oq4f4"!"2iQ/!"OBTX;3,V'3V;-VP;-1`BkEdVC#,M,J1V'3V;-VP;-M(5@2iQ/
	 * \endif
	 */
	public static int EN_PICINPIC = 46;                      

	/**
	 * \if ENGLISH_LANG
	 * EN_PLAYBACK_SPEED_CTRL #,for compatible protocol
	 * \else
	 * M, EN_PLAYBACK_SPEED_CTRL #,V;N*AK<fH]P-Ri
	 * \endif
	 */
	public static int EN_PLAYBACK_SPEED_CTRL_SUPPORT = 47;   

	/**
	 * \if ENGLISH_LANG
	 * Support 24, 32, 64-ch LF-X series#,mark this type of device special encode capacity
	 * \else
	 * V'3V24!"32!"64B7LF-XO5AP#,1jW"Ub@`Ih18LXJb5D1`BkD\A&<FKc7=J=
	 * \endif
	 */
	public static int EN_LF_XDEV = 48;					

	/**
	 * \if ENGLISH_LANG
	 * F5 DSP encode capacity search
	 * \else
	 * F5 DSP1`BkD\A&2iQ/
	 * \endif
	 */
	public static int EN_DSP_ENCODE_CAP = 49;			

	/**
	 * \if ENGLISH_LANG
	 * Multicast capacity search
	 * \else
	 * Wi2%D\A&2iQ/
	 * \endif
	 */
	public static int EN_MULTICAST = 50;                     

	/**
	 * \if ENGLISH_LANG
	 * Net limit capacity search#,1-net send stream size limit
	 * \else
	 * MxBgO^VFD\A&2iQ/#,04N;#,1-MxBg7"KMBkAw4sP!O^          
	 * \endif
	 */
	public static int EM_NET_LIMIT = 51;                                     

	/**
	 * \if ENGLISH_LANG
	 * Serial 422
	 * \else
	 * 4.?Z422
	 * \endif
	 */
	public static int EM_COM422 = 52;                        

	/**
	 * \if ENGLISH_LANG
	 * Support three generations protocol frame#(needlistMethod(),listService()#)#,via F6 command access
	 * \else
	 * JG7qV'3VH}4zP-Ri?r<\#(PhR*J5OVlistMethod(),listService()#)#,M(9}F6C|An7CNJ
	 * \endif
	 */
	public static int EM_PROTOCAL_FRAMEWORK = 53;		

	/**
	 * \if ENGLISH_LANG
	 * Write OSD overlay,  1- write OSD overlay config
	 * \else
	 * ?LB<OSD5~<S, 04N;, 1-?LB<OSD5~<SEdVC
	 * \endif
	 */
	public static int EM_WRITE_DISK_OSD = 54;			

	/**
	 * \if ENGLISH_LANG
	 * Dynamic multi link, 1-request video data response
	 * \else
	 * 6/L,6`A,=S, 04N;, 1-GkGsJSF5J}>]S&4p
	 * \endif
	 */
	public static int EM_DYNAMIC_MULTI_CONNECT = 55;	

	/**
	 * \if ENGLISH_LANG
	 * Cloud service,1-support private cloud service
	 * \else
	 * TF7~Nq,04N;#,1-V'3VK=SPTF7~Nq
	 * \endif
	 */
	public static int EM_CLOUDSERVICE = 56;                  

	/**
	 * \if ENGLISH_LANG
	 * Record info report, 1-record info auto report, 2-support record frame search
	 * \else
	 * B<OqPEO"IO1(, 04N;, 1-B<OqPEO"Vw6/IO1(, 2-V'3VB<OqV!J}2iQ/
	 * \endif
	 */
	public static int EM_RECORD_INFO = 57;				

	/**
	 * \if ENGLISH_LANG
	 * Auto registration capacity#,1-support dynamic auto registration
	 * \else
	 * Vw6/W"2aD\A&#,04N;#,1-V'3V6/L,Vw6/W"2a
	 * \endif
	 */
	public static int EN_DYNAMIC_REG = 58;
	
	/**
	 * \if ENGLISH_LANG
	 * Multi-channel preview playback#,1-support multi-channel preview playback
	 * \else
	 * 6`M(5@T$@@;X7E#,04N*,1-V'3V6`M(5@T$@@;X7E
	 * \endif
	 */
	public static int EM_MULTI_PLAYBACK = 59;
	
	/**
	 * \if ENGLISH_LANG
	 * Encode channel, 1-support audio only channel
	 * \else
	 * 1`BkM(5@, 04N;, 1-V'3V4?RtF5M(5@
	 * \endif
	 */
	public static int EN_ENCODE_CHN = 60;
}


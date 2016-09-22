package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Supported Function List
 * \else
 * Ih18V'3V9&D\AP1m
 * \endif
 */
public class SDK_DEV_ENABLE_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;


	/**
	 * \if ENGLISH_LANG
	 * Capability set, subscript: Enumeration values, Bit: Subfunction.
	 * <pre>
	 * Enumeration		values											Enumeration Definition Significance 
	 * 0				EN_FTP 											FTP,1:Transmit Records 2:Transmit Snapshot 
	 * 1 				EN_SMTP 										SMTP,1:Transmit Alarm Text Email 2:Transmit Alarm Image 3: Support Health mail 
	 * 2 				EN_NTP 											NTP:1:Adjust system time 
	 * 3 				EN_AUTO_MAINTAIN 								Automatic Maintenance :1:Reboot 2:Shutdown 3:Delete Files 
	 * 4	 			EN_VIDEO_COVER 									Cover-area :1:Multi area 
	 * 5 				EN_AUTO_REGISTER 								Auto Register :1:SDK auto login after registration 
	 * 6 				EN_DHCP 										DHCP :1:DHCP 
	 * 7 				EN_UPNP 										UPNP:1:UPNP 
	 * 8 				EN_COMM_SNIFFER 								COMM Sniffer :1: CommATM 
	 * 9 				EN_NET_SNIFFER 									Net Sniffer: 1: NetSniffer 
	 * 10 				EN_BURN 										Burn:1: Inquire burning status 
	 * 11 				EN_VIDEO_MATRIX 								Video Matrix:1: Support or not 2: Support SPOT Video Matrix or not 
	 * 12 				EN_AUDIO_DETECT 								Audio Detect:1: Support or not 
	 * 13 				EN_STORAGE_STATION 								Storage Station:1: Ftp Server(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: U disk 
	 * 14 				EN_IPSSEARCH 									IPS storage search 04N;:1: IPS storage search 
	 * 15 				EN_SNAP 										Snapshot:1: Resolution2: FPS3: Snap type 4: Format5: Quality 
	 * 16 				EN_DEFAULTNIC	 								Default NIC inquires: 1: Support 
	 * 17 				EN_SHOWQUALITY 									Show Quality Under CBR Mode: 1: Support 
	 * 18 				EN_CONFIG_IMEXPORT 								Config import and export: 1: Support 
	 * 19 				EN_LOG 											Log Query: 1: Support. 
	 * 20 				EN_SCHEDULE 									Record Settings: 1: Redundancy 2: Pre-record 3: Record Period. 
	 * 21 				EN_NETWORK_TYPE 								Network type: 1: Ethernet 2: Wlan3: CDMA/GPRS 4: CDMA/GPRS Multi NIC. 
	 * 22 				EN_MARK_IMPORTANTRECORD 						Mark Important Record: 1: Set Important Record Mark. 
	 * 23 				EN_ACFCONTROL 									ACF Control:1: Support ACF Control, 2: Support timing alarm ACF control(Does not support Motion Detect). 
	 * 24 				EN_MULTIASSIOPTION 								Multi Extra streams :1: Support three extra streams. 
	 * 25 				EN_DAVINCIMODULE 								Davinci Modle:1: Schedule handled separately 2: Standard I frame interval setting. 
	 * 26 				EN_GPS 											GPS:1: Gps. 
	 * 27 				EN_MULTIETHERNET 								Multi NIC Query:1: Support. 
	 * 28 				EN_LOGIN_ATTRIBUTE 								Login attribute: 1: Support Login attribute query. 
	 * 29 				EN_RECORD_GENERAL 								Record general:1: Normal Record#;2: Alarm Record#;3: Motion Detect Record#;4: Local Storage#;5: Remote Storage#;6: Redundancy Storage#;7: Local Emergency Storage. 
	 * 30 				EN_JSON_CONFIG 									Json Format Config:1: Support Json Format. 
	 * 31 				EN_HIDE_FUNCTION	 							Hide Function:1: Hide PTZ Function. 
	 * 32 				EN_DISK_DAMAGE 									Disk Damage Information:1: Query Disk Damage Information. 
	 * 33 				EN_PLAYBACK_SPEED_CTRL 							Playback Speed Control 1: Support fast playback. 
	 * 34 				EN_HOLIDAYSCHEDULE 								Holiday Schedule: 1,Support Holiday Schedule. 
	 * 35 				EN_FETCH_MONEY_TIMEOUT 							ATM Timeout. 
	 * 36 				EN_BACKUP_VIDEO_FORMAT 							Backup Format1:DAV, 2:ASF. 
	 * 37 				EN_QUERY_DISK_TYPE 								Query Disk Type. 
	 * 38 				EN_CONFIG_DISPLAY_OUTPUT 						Config disply output: 1:Image Split and Tour settings. 
	 * 39 				EN_SUBBITRATE_RECORD_CTRL 						Subbitrate Record Control1-Extra stream Recoding control. 
	 * 40 				EN_IPV6 										IPV6 Settings:1-IPV6 Settings. 
	 * 41 				EN_SNMP 										SNMP. 
	 * 42 				EN_QUERY_URL 									Query URL: 1-Query URL. 
	 * 43 				EN_ISCSI 										ISCSI. 
	 * 44 				EN_RAID 										Support Raid. 
	 * 45 				EN_HARDDISK_INFO 								Hard disk information F5 inquiry. 
	 * 46 				EN_PICINPIC 									Pic in Pic :1,Settings; 2,Preview, Record, Query, Download. 
	 * 47 				EN_PLAYBACK_SPEED_CTRL_SUPPORT 					EN_PLAYBACK_SPEED_CTRL . 
	 * 48 				EN_LF_XDEV 										Support 24, 32, 64 way LF-X serial 
	 * </pre>
	 * \else
	 * 9&D\AP1mD\A&</,OB1j6TS&IOJv5DC6>YV5,04N;1mJ>WS9&D\
	 * <pre>
	 * C6>YV5 		C6>Y6(Re							4z1mRbRe 
	 * 0 		EN_FTP FTP						04N;,1:4+KMB<OqND<~ 2:4+KMW%M<ND<~ 
	 * 1 		EN_SMTP SMTP					04N;,1:1(>/4+KMND1>SJ<~ 2:1(>/4+KMM<F, 3:V'3V=!?5SJ<~9&D\ 
	 * 2 		EN_NTP NTP						04N;:1:5wU{O5M3J1<d 
	 * 3 		EN_AUTO_MAINTAIN				WT6/N,;$ 04N;:1:VXFt 2:9X1U 3:I>3}ND<~ 
	 * 4 		EN_VIDEO_COVER					GxSrUZ52 04N;:1:6`GxSrUZ52 
	 * 5 		EN_AUTO_REGISTER				Vw6/W"2a 04N;:1:W"2a:ssdkVw6/5GB= 
	 * 6 		EN_DHCP DHCP					04N;:1:DHCP 
	 * 7 		EN_UPNP UPNP					04N;:1:UPNP 
	 * 8 		EN_COMM_SNIFFER					4.?ZW%0| 04N;:1: CommATM 
	 * 9 		EN_NET_SNIFFER					MxBgW%0| 04N;: 1: NetSniffer 
	 * 10 		EN_BURN							?LB<9&D\ 04N;:1: 2iQ/?LB<W4L, 
	 * 11 		EN_VIDEO_MATRIX					JSF5>XUs 04N;:1: JG7qV'3VJSF5>XUs 2: JG7qV'3VSPOTJSF5>XUs 
	 * 12 		EN_AUDIO_DETECT					RtF5<l2b 04N;:1: JG7qV'3VRtF5<l2b 
	 * 13 		EN_STORAGE_STATION				4f4"N;VC 04N;:1: Ftp7~NqFw(Ips) 2: SMB 3: NFS 4: ISCSI 16: DISK 17: UEL 
	 * 14 		EN_IPSSEARCH					IPS4f4"2iQ/ 04N;:1: IPS4f4"2iQ/ 
	 * 15 		EN_SNAP							W%M< 04N;:1: 7V1fBJ2: V!BJ3: W%M<7=J=4: W%M<ND<~8qJ=5: M<;-VJA? 
	 * 16 		EN_DEFAULTNIC					V'3VD,HOMx?(2iQ/ 04N;: 1: V'3V 
	 * 17 		EN_SHOWQUALITY					CBRD#J=OBOTJ>;-VJEdVCOn 04N;: 1: V'3V 
	 * 18 		EN_CONFIG_IMEXPORT				EdVC5<Hk5<3v9&D\D\A& 04N;: 1: V'3V. 
	 * 19 		EN_LOG							JG7qV'3V7VR37=J=5DHUV>2iQ/ 04N;: 1: V'3V. 
	 * 20 		EN_SCHEDULE						B<OqIhVC5DR;P)D\A& 04N;: 1: H_S` 2: T$B< 3: B<OqJ1<d6N. 
	 * 21 		EN_NETWORK_TYPE					MxBg@`PM 04N;: 1: RTL,Mx 2: N^O_>VSr 3: CDMA/GPRS 4: CDMA/GPRS6`Mx?(EdVC. 
	 * 22 		EN_MARK_IMPORTANTRECORD			1jJ6VXR*B<Oq 04N;: 1: IhVCVXR*B<Oq1jJ6. 
	 * 23 		EN_ACFCONTROL					;n6/V!BJ?XVF 04N;:1: V'3V;n6/V!BJ?XVF, 2: V'3V6(J11(>/@`PM;n6/V!BJ?XVF(2;V'3V6/<l),8CD\A&SkACFD\A&;%3b. 
	 * 24 		EN_MULTIASSIOPTION				6`B78(BkAw 04N;:1: V'3VH}B78(BkAw. 
	 * 25 		EN_DAVINCIMODULE				Wi<~;/D#?i 04N;:1: J1<d1m7V?*4&@m 2: 1jW<IV!<d8tIhVC. 
	 * 26 		EN_GPS							GPS9&D\ 04N;:1: Gps6(N;9&D\. 
	 * 27 		EN_MULTIETHERNET				V'3V6`Mx?(2iQ/ 04N;:1: V'3V. 
	 * 28 		EN_LOGIN_ATTRIBUTE				LoginJtPT 04N;:1: V'3VLoginJtPT2iQ/. 
	 * 29 		EN_RECORD_GENERAL				B<OqO`9X 04N;:1: FUM(B<Oq#;2: 1(>/B<Oq#;3: 6/L,<l2bB<Oq#;4: 1>5X4f4"#;5: T63L4f4"#;6: H_S`4f4"#;7: 1>5X=t<14f4". 
	 * 30 		EN_JSON_CONFIG					Json8qJ=EdVC 04N;:1: V'3VJson8qJ=. 
	 * 31 		EN_HIDE_FUNCTION				FA1N9&D\ 04N;:1: FA1NPTZTFL(9&D\. 
	 * 32 		EN_DISK_DAMAGE					S2EL;55@PEO"V'3VD\A& 04N;:1: S2EL;55@PEO"2iQ/V'3VD\A&. 
	 * 33 		EN_PLAYBACK_SPEED_CTRL			V'3V;X7EMx4+KY6H?XVF 04N;:1: V'3V;X7E<SKY. 
	 * 34 		EN_HOLIDAYSCHEDULE				V'3V<YFZJ1<d6NEdVC:04N;:1,V'3V<YFZJ1<d6NEdVC. 
	 * 35 		EN_FETCH_MONEY_TIMEOUT			ATMH!G.3,J1. 
	 * 36 		EN_BACKUP_VIDEO_FORMAT			187]V'3V5D8qJ= 04N;:1:DAV, 2:ASF. 
	 * 37 		EN_QUERY_DISK_TYPE 				V'3VS2EL@`PM2iQ/. 
	 * 38 		EN_CONFIG_DISPLAY_OUTPUT		V'3VIh18OTJ>Jd3v(VGA5H)EdVC 04N;: 1:;-Cf7V8nBVQ2EdVC. 
	 * 39 		EN_SUBBITRATE_RECORD_CTRL		V'3V@)U9BkAwB<Oq?XVFIhVC 04N;:1-8(BkAwB<Oq?XVFIhVC. 
	 * 40 		EN_IPV6 						V'3VIPV6IhVC, 04N;:1-IPV6EdVC. 
	 * 41 		EN_SNMP							SNMP(<r5%MxBg9\@mP-Ri). 
	 * 42 		EN_QUERY_URL					V'3V;qH!Ih18URL5XV7, 04N;: 1-2iQ/EdVCURL5XV7. 
	 * 43 		EN_ISCSI						ISCSI(InternetP!PM<FKc;zO5M3=S?ZEdVC). 
	 * 44 		EN_RAID							V'3VRaid9&D\. 
	 * 45 		EN_HARDDISK_INFO				V'3V4EELPEO"F52iQ/D\. 
	 * 46 		EN_PICINPIC						V'3V;-VP;-9&D\ 04N;:1,;-VP;-IhVC; 2,;-VP;-T$@@!"B<Oq4f4"!"2iQ/!"OBTX. 
	 * 47 		EN_PLAYBACK_SPEED_CTRL_SUPPORT	M, EN_PLAYBACK_SPEED_CTRL,V;N*AK<fH]P-Ri. 
	 * 48 		EN_LF_XDEV						V'3V24!"32!"64B7LF-XO5AP,1jW"Ub@`Ih18LXJb5D1`BkD\A&<FKc7=J=. 
	 * </pre>
	 * \endif
	 */
	public int IsFucEnable[] = new int[512];				
}

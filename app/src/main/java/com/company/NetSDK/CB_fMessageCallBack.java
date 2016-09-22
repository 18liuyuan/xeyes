package com.company.NetSDK;

/**
 * \if ENGLISH_LANG
 * Alarm message callback function original shape
 * \else
 * O{O";X5w:/J}T-PM
 * \endif
 */
public interface CB_fMessageCallBack {

	/**
	 * \if ENGLISH_LANG
	 * Alarm message callback function original shape
	 * @param lCommand recall type,as pBuf 
	 * @param lLoginID  login handle, value form {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx}or{@link com.company.NetSDK.INetSDK#Login() Login}
	 * @param obj receive alarm data buffering,based on called monitoring interface and lCommand value differ,filled data differ\n
	 * if called monitoring interface is CLIENT_StartListen lCommand value may be:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>data is 1 NET_CLIENT_STATE structure .</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>data is 16 byte, each byte means 1 video channel mask alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>data is 18vDWORD value,1 means hard disk full ,0 means hard disk unfull </td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM	</td><td>data is one DWORD value,by means up to 32 hard disk malfunction alarm,each is 1 means has alarm, is 0 means no alarm </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>data is 16 byte, each byte means 1 video channel audio alarm status,1 is has alarm,0 is no alarm </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>data is 16 byte, each byte means 1 alarm decoder channel alarm status,1 is has alarm ,0 is no alarm </td></tr>
	 * </table>
	 * \n
	 * Hg9{5wSC5DUlL}=S?ZN*CLENT_StartListenEx,TrlCommand5D?ID\V5JG:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EXdata</td><td>byte and device alarm channel number are same , each byte means 1 alarm channel alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EXdata</td><td>byte and device video channel number are same , each byte means 1 video channel dynamic detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel video loss alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel mask (black screen) alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>data is 16 byte , each byte means 1 video channel audio detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>data is 1 byte ,1 is has hard disk full alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>data is 32 byte , each byte means 1 hard disk malfunction alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event,when user perform config, some need device to reboot as valid,when receive this event,may call to reboot interface to reboot device. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX</td><td>emergency alarm,data is 16 byte,each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>wireless alarm,data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>new audio detection alarm,alarm info structure as SDK_NEW_SOUND_ALARM_STATE. </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>alarm decoder alarm , alarm structure as ALARM_DECODER_ALARM. </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>decoder: decoder insufficient capacity alarm , 1 byte ,0:normal decode 1: means exceed decode capacity. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>fibre-optical encoder status alarm , structure as ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>scene change alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>focus loss alarm , data is 16 byte , each byte means 1 channel encoder status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem newsstand status ,type is BYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EX</td><td>DSP alarm ,type is DSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX</td><td>atm and pos device device disconnect alarm , type is BYTE, 0:disconnected 1:connected. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>record status change alarm , data is ALARM_RECORDING_CHANGED. structure group  </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>config change alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>device reboot alarm ,pBuf is vacant . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info ALARM_PTZ_LOCATION_INFO.</td></tr> 
	 * <tr><td>ALARM_WINGDING_INFO</td><td>coil/car detector malfucntion alarm ALARM_WINGDING_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_EX</td><td>bust traffic alarm (traffic is abnormal)ALARM_TRAF_CONGESTION_INFO.</td></tr> 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>abnormal traffic alarm (traffic flow close to 0 or abnormal vacant closed)ALARM_TRAF_EXCEPTION_INFO.</td></tr> 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>backlight device malfunction alarm ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>alarm arm/disarm status ALARM_EQUIPMENT_FILL_INFO.</td></tr> 
	 * <tr><td>SDK_ALARM_ACC_POWEROFF ACC</td><td>outage alarm , type is DWORD 0:ACC electric 1:ACC outage </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3G flow exceend threshold value alarm DHDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>mobile user customized info uploadALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>data byte and device video channel number are same , each byte means 1 video channel >2L, detection alarm status ,1 is has alarm ,0 is no alarm . </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EXPTZ</td><td>positioning info SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>card NO. record uploadALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOAD</td><td>ATM trade info uploadALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>electronic fence alarm ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATESIP</td><td>status alarm ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE	</td><td>RAID abnormal alarm ALARM_RAID_INFO</td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>speed limit alarm ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>overload alarm ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td>quick brake alarm ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>smoke alarm ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>traffic light malfucntion alarm ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>traffic flow statistics alarm ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>camera shift alarm eventALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>dynamic detection alarm report infoALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>albormal storage alarm , data is ALARM_STORAGE_FAILURE structure group  </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>front end IPC offline alarm ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>remote external alarm ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>low battery alarm ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>over heat alarm ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>fatigue driving alarm ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>record loss event alarm ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPUCPU</td><td>over used event alarm ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>net send data loss event alarm ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>memory over used event alarm ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATION</td><td>WEB user long time no operation event( no ectension info) </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>black list snapshot SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>HDD alarmALARM_DISK_INFO </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>file system alarmALARM_FILE_SYSTEM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>intelligent alarmALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOADload</td><td>reportALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>load info alarmALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUS</td><td>GPSNET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>HDD write alarmALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>storage no spaceALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>abnormalALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>abnormalALARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>fan abnormalALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>storage errorALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>record abnormalALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>storage crashALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>video in failedALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>local of alarm_input channel eventALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>powerfault envetALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>chaiisintruded eventALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>extended alarm_input channel event ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>device invite talking eventALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>device's armmode changed eventALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>defence area bypassmode changed eventALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOS</td><td>Eaccess not close eventALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>break in eventALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>repeat enter eventALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>duress swing card eventALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>access eventALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * </table>
	 * some operation asynchronous recall event, lCommand value may be:
	 * <table>
	 * <tr><td>command</td><td>xplanation</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>data is change config return code,return structure as DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>device reboot event#; if reboot command not sent,current change will bot be valid immediately </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>device actively invite to bidirectional talk. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>device actively stop bidirectional talk. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX	</td><td>device config changed. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IP search event,return character string format as: DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>auto reconnection failed event,retun to 1 int model data , means reconnection failed return code, as CLIENT_Logininterface login wrong code explanation </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td>monitor invalid event,retunr structure DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>playback failed event,return structure DEV_PLAY_RESULT </td></tr>
	 * </table>
	 * @param pchDVRIP Ih18IP
	 * @param nDVRPort Ih186K?Z
	 * \else
	 * O{O";X5w:/J}
	 * @param lCommand ;X5w@`PM,>_Le<{OBpBuf5DK5Cw
	 * @param lLoginID  {@link com.company.NetSDK.INetSDK#LoginEx() LoginEx};rU_{@link com.company.NetSDK.INetSDK#Login() Login}5D75;XV5
	 * @param obj =SJU1(>/J}>]5D;:4f,8y>]5wSC5DUlL}=S?Z:MlCommandV52;M,,Ln3d5DJ}>]2;M, 
	 * Hg9{5wSC5DUlL}=S?ZN* StartListen,TrlCommand5D?ID\V5JG:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_COMM_ALARM</td><td>J}>]N*R;8vNET_CLIENT_STATE=a99Le.</td></tr>
	 * <tr><td>SDK_SHELTER_ALARM</td><td>J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vJSF5M(5@5DUZ521(>/W4L,,1N*SP1(>/,0N*N^1(>/.</td></tr>
	 * <tr><td>SDK_DISK_FULL_ALARM</td><td>J}>]N*18vDWORDV5,11mJ>S2ELBz,01mJ>S2ELN4Bz.</td></tr>
	 * <tr><td>SDK_DISK_ERROR_ALARM</td><td>J}>]N*18vDWORDV5,04N;1mJ>Wn6`328vS2EL5D9JUO1(>/,C?N;N*11mJ>SP1(>/,N*01mJ>N^1(>/.</td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM</td><td>J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vJSF5M(5@5DRtF51(>/W4L,,1N*SP1(>/,0N*N^1(>/.</td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM</td><td>J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8v1(>/=bBkFwM(5@5D1(>/W4L,,1N*SP1(>/,0N*N^1(>/.</td></tr>
	 * </table>
	 * \n
	 * Hg9{5wSC5DUlL}=S?ZN*CLENT_StartListenEx,TrlCommand5D?ID\V5JG:
	 * <table>
	 * <tr><td>lCommand</td><td>pBuf</td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX</td><td>J}>]WV=ZJ}SkIh181(>/M(5@8vJ}O`M,,C?8vWV=Z1mJ>R;8v1(>/M(5@5D1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_MOTION_ALARM_EX</td><td>J}>]WV=ZJ}SkIh18JSF5M(5@8vJ}O`M,,C?8vWV=Z1mJ>R;8vJSF5M(5@5D6/L,<l2b1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_VIDEOLOST_ALARM_EX</td><td>J}>]WV=ZJ}SkIh18JSF5M(5@8vJ}O`M,,C?8vWV=Z1mJ>R;8vJSF5M(5@5DJSF56*J'1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_SHELTER_ALARM_EX	</td><td>J}>]WV=ZJ}SkIh18JSF5M(5@8vJ}O`M,,C?8vWV=Z1mJ>R;8vJSF5M(5@5DUZ52(:ZFA)1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_SOUND_DETECT_ALARM_EX</td><td>J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vJSF5M(5@5DRtF5<l2b1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_DISKFULL_ALARM_EX</td><td>J}>]N*18vWV=Z,1N*SPS2ELBz1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_DISKERROR_ALARM_EX</td><td>J}>]N*328vWV=Z,C?8vWV=Z1mJ>R;8vS2EL5D9JUO1(>/W4L,,1N*SP1(>/,0N*N^1(>/.</td></tr> 
	 * <tr><td>SDK_ENCODER_ALARM_EX	</td><td>J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vM(5@1`BkFwW4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>Ih18VXFtJB<~,SC;'=xPPR;P)EdVCJ1,SPP)PhR*Ih18VXFt2ED\IzP',51JU5=4KJB<~,?IRT5wSCVXFt=S?ZVXFtIh18. </td></tr>
	 * <tr><td>SDK_URGENCY_ALARM_EX	</td><td>=t<11(>/,J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vM(5@1`BkFwW4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_WIRELESS_ALARM_EX</td><td>N^O_1(>/,J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vM(5@1`BkFwW4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_NEW_SOUND_DETECT_ALARM_EX</td><td>PBRtF5<l2b1(>/,1(>/PEO"5D=a99Le<{  SDK_NEW_SOUND_ALARM_STATE . </td></tr>
	 * <tr><td>SDK_ALARM_DECODER_ALARM_EX</td><td>1(>/=bBkFw1(>/,1(>/=a99Le<{  ALARM_DECODER_ALARM . </td></tr>
	 * <tr><td>SDK_DECODER_DECODE_ABILITY</td><td>=bBkFw:=bBkFwD\A&2;Wc1(>/, R;8vWV=Z,0:D\U}3#=bBk 1:1mJ>3,3v=bBkD\A&. </td></tr>
	 * <tr><td>SDK_FDDI_DECODER_ABILITY</td><td>9bOK1`BkFwW4L,1(>/,=a99Le<{ALARM_FDDI_ALARM. </td></tr>
	 * <tr><td>SDK_PANORAMA_SWITCH_ALARM_EX</td><td>GP;;3!>01(>/,J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vM(5@1`BkFwW4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_LOSTFOCUS_ALARM_EX</td><td>J'H%=95c1(>/,J}>]N*168vWV=Z,C?8vWV=Z1mJ>R;8vM(5@1`BkFwW4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_OEMSTATE_EX</td><td>oem1(M#W4L,,@`PMN*BYTE. </td></tr>
	 * <tr><td>SDK_DSP_ALARM_EXDSP</td><td>1(>/,@`PMN*DSP_ALARM. </td></tr>
	 * <tr><td>SDK_ATMPOS_BROKEN_EX	</td><td>atm:Mpos;z6O?*1(>/,@`PMN*BYTE, 0:A,=S6O?* 1:A,=SU}3#. </td></tr>
	 * <tr><td>SDK_RECORD_CHANGED_EX</td><td>B<OqW4L,1d;/1(>/,J}>]N*ALARM_RECORDING_CHANGED.5D=a99LeJ}Wi </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGED_EX</td><td>EdVC7"Iz1d;/1(>/,pBufN*?U. </td></tr>
	 * <tr><td>SDK_DEVICE_REBOOT_EX</td><td>Ih18VXFt1(>/,pBufN*?U. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>TFL(6(N;PEO" ALARM_PTZ_LOCATION_INFO. </td></tr>
	 * <tr><td>SDK_WINGDING_ALARM_EX</td><td>O_H&/35<lFw9JUO1(>/ ALARM_WINGDING_INFO. </td></tr>
	 * <tr><td>SDK_TRAF_CONGESTION_ALARM_E</td><td>X=;M(WhH{1(>/(35A>3vOVRl3#M#V9;rU_EE6S) ALARM_TRAF_CONGESTION_INFO </td></tr>. 
	 * <tr><td>SDK_TRAF_EXCEPTION_ALARM_EX</td><td>=;M(Rl3#1(>/(=;M(AwA?GwSZ0;rRl3#?UOP) ALARM_TRAF_EXCEPTION_INFO </td></tr>. 
	 * <tr><td>SDK_EQUIPMENT_FILL_ALARM_EX</td><td>299bIh189JUO1(>/ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ARM_DISARM_STATE</td><td>1(>/2<377@W4L,ALARM_EQUIPMENT_FILL_INFO. </td></tr>
	 * <tr><td>SDK_ALARM_ACC_POWEROFF</td><td>ACC6O5g1(>/,@`PMN*DWORD 0:ACCM(5g 1:ACC6O5g </td></tr>
	 * <tr><td>SDK_ALARM_3GFLOW_EXCEED</td><td>3GAwA?3,3vcPV51(>/  DHDEV_3GFLOW_EXCEED_STATE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SPEED_LIMIT</td><td>O^KY1(>/ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_VEHICLE_INFO_UPLOAD</td><td>35TXWT6(RePEO"IO4+ALARM_VEHICLE_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_STATIC_ALARM_EX</td><td>J}>]WV=ZJ}SkIh18JSF5M(5@8vJ}O`M,,C?8vWV=Z1mJ>R;8vJSF5M(5@5D>2L,<l2b1(>/W4L,,1N*SP1(>/,0N*N^1(>/. </td></tr>
	 * <tr><td>SDK_PTZ_LOCATION_EX</td><td>TFL(6(N;PEO" SDK_PTZ_LOCATION_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CARD_RECORD_UPLOAD</td><td>?(:EB<OqPEO"IO4+ ALARM_CARD_RECORD_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ATM_INFO_UPLOADATM</td><td>=;RWPEO"IO4+ ALARM_ATM_INFO_UPLOAD </td></tr>
	 * <tr><td>SDK_ALARM_ENCLOSURE</td><td>5gWSN'@81(>/ ALARM_ENCLOSURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_SIP_STATE</td><td>SIPW4L,1(>/  ALARM_SIP_STATE </td></tr>
	 * <tr><td>SDK_ALARM_RAID_STATE</td><td>RAIDRl3#1(>/ ALARM_RAID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CROSSING_SPEED_LIMIT</td><td>B7?ZO^KY1(>/ ALARM_SPEED_LIMIT </td></tr>
	 * <tr><td>SDK_ALARM_OVER_LOADING</td><td>3,TX1(>/ ALARM_OVER_LOADING </td></tr>
	 * <tr><td>SDK_ALARM_HARD_BRAKING</td><td><1I2351(>/ ALARM_HARD_BRAKING </td></tr>
	 * <tr><td>SDK_ALARM_SMOKE_SENSOR</td><td>QL8P1(>/ ALARM_SMOKE_SENSOR </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_LIGHT_FAULT</td><td>=;M(5F9JUO1(>/ ALARM_TRAFFIC_LIGHT_FAULT </td></tr>
	 * <tr><td>SDK_ALARM_TRAFFIC_FLUX_STAT</td><td>=;M(AwA?M3<F1(>/ ALARM_TRAFFIC_FLUX_LANE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CAMERA_MOVE</td><td>IcOq;zRFN;1(>/JB<~ ALARM_CAMERA_MOVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DETAILEDMOTION</td><td>OjO86/<l1(>/IO1(PEO" ALARM_DETAILEDMOTION_CHNL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE</td><td>4f4"Rl3#1(>/,J}>]N* ALARM_STORAGE_FAILURE 5D=a99LeJ}Wi </td></tr>
	 * <tr><td>SDK_ALARM_FRONTDISCONNECT</td><td>G06KIPC6OMx1(>/ ALARM_FRONTDISCONNET_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX_REMOTE</td><td>T63LMb2?1(>/ ALARM_REMOTE_ALARM_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BATTERYLOWPOWER</td><td>5g3X5gA?5M1(>/ ALARM_BATTERYLOWPOWER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TEMPERATURE</td><td>NB6H9}8_1(>/ ALARM_TEMPERATURE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TIREDDRIVE</td><td>F#@M<]J;1(>/ ALARM_TIREDDRIVE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_LOST_RECORD</td><td>6*B<OqJB<~1(>/ ALARM_LOST_RECORD </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_CPU</td><td>CPUU<SCBJ9}8_JB<~1(>/ ALARM_HIGH_CPU </td></tr>
	 * <tr><td>SDK_ALARM_LOST_NETPACKET</td><td>MxBg7"KMJ}>]6*0|JB<~1(>/ ALARM_LOST_NETPACKET </td></tr>
	 * <tr><td>SDK_ALARM_HIGH_MEMORY</td><td>DZ4fU<SCBJ9}8_JB<~1(>/ ALARM_HIGH_MEMORY </td></tr>
	 * <tr><td>SDK_LONG_TIME_NO_OPERATIONWEB</td><td>SC;'3$J1<dN^2YWwJB<~(N^@)U9PEO") </td></tr>
	 * <tr><td>SDK_BLACKLIST_SNAP</td><td>:ZC{5%35A>W%EDJB<~ SDK_BLACKLIST_SNAP_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK</td><td>S2EL1(>/ ALARM_DISK_INFOJ}Wi </td></tr>
	 * <tr><td>SDK_ALARM_FILE_SYSTEM</td><td>ND<~O5M31(>/ ALARM_FILE_SYSTEM_INFOJ}Wi </td></tr>
	 * <tr><td>SDK_ALARM_IVS</td><td>VGD\1(>/JB<~ ALARM_IVS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT_UPLOAD</td><td>;uVXPEO"IO1( ALARM_GOODS_WEIGHT_UPLOAD_INFO </td></tr>
	 * <tr><td>SDK_ALARM_GOODS_WEIGHT</td><td>;uVXPEO"1(>/ ALARM_GOODS_WEIGHT_INFO </td></tr>
	 * <tr><td>SDK_GPS_STATUSGPS</td><td>6(N;PEO" NET_GPS_STATUS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISKBURNED_FULL</td><td>S2EL?LB<Bz1(>/ ALARM_DISKBURNED_FULL_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_LOW_SPACE</td><td>4f4"H]A?2;WcJB<~ ALARM_STORAGE_LOW_SPACE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_DISK_FLUX</td><td>S2ELJ}>]Rl3#JB<~ ALARM_DISK_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_NET_FLUX</td><td>MxBgJ}>]Rl3#JB<~ LARM_NET_FLUX </td></tr>
	 * <tr><td>SDK_ALARM_FAN_SPEED</td><td>IHW*KYRl3#JB<~ ALARM_FAN_SPEED </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_FAILURE_EX</td><td>4f4"4mNs1(>/ ALARM_STORAGE_FAILURE_EX </td></tr>
	 * <tr><td>SDK_ALARM_RECORD_FAILED</td><td>B<OqRl3#1(>/ ALARM_RECORD_FAILED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_STORAGE_BREAK_DOWN</td><td>4f4"1@@#JB<~ ALARM_STORAGE_BREAK_DOWN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_VIDEO_ININVALID</td><td>JSF5JdHkM(5@J'P'JB<~(@}:EdVC5DJSF5JdHkM(5@BkAw,3,3vIh184&@mD\A&)ALARM_VIDEO_ININVALID_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARM_EX2</td><td>1>5X1(>/JdHkM(5@JB<~,75;X=a99Le ALARM_ALARM_INFO_EX2 </td></tr>
	 * <tr><td>SDK_ALARM_POWERFAULT</td><td>5gT49JUOJB<~,75;X=a99Le ALARM_POWERFAULT_INFO </td></tr>
	 * <tr><td>SDK_ALARM_CHASSISINTRUDED</td><td>7@2pJB<~,75;X=a99Le ALARM_CHASSISINTRUDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ALARMEXTENDED</td><td>@)U91(>/JdHkM(5@JB<~ ALARM_ALARMEXTENDED_INFO </td></tr>
	 * <tr><td>SDK_ALARM_TALKING_INVITE</td><td>Ih18Q{GkF=L(6T=2JB<~ ALARM_TALKING_INVITE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ARMMODE_CHANGE_EVENT</td><td>Ih182<7@D#J=1d;/JB<~ ALARM_ARMMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_BYPASSMODE_CHANGE_EVENT</td><td>7@GxETB7W4L,1d;/JB<~ ALARM_BYPASSMODE_CHANGE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_NOT_CLOSE</td><td>CE={N49XJB<~ ALARM_ACCESS_CTL_NOT_CLOSE_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_BREAK_IN</td><td>43HkJB<~ ALARM_ACCESS_CTL_BREAK_IN_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_REPEAT_ENTER</td><td>7484=xHkJB<~ALARM_ACCESS_CTL_REPEAT_ENTER_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_DURESS</td><td>P2FH?(K"?(JB<~ ALARM_ACCESS_CTL_DURESS_INFO </td></tr>
	 * <tr><td>SDK_ALARM_ACCESS_CTL_EVENT</td><td>CE={JB<~ ALARM_ACCESS_CTL_EVENT_INFO </td></tr>
	 * </table>
	 * R;P)2YWw5DRl2=;X5wJB<~,TrlCommand5D?ID\V5JG:
	 * <table>
	 * <tr><td>C|An</td><td>K5Cw</td></tr>
	 * <tr><td>SDK_CONFIG_RESULT_EVENT_EX</td><td>J}>]N*P^8DEdVC5D75;XBk,75;X=a99Le<{DEV_SET_RESULT. </td></tr>
	 * <tr><td>SDK_REBOOT_EVENT_EX</td><td>Ih18VXFtJB<~:Hg9{N47"KMVXFtC|An,51G0P^8D5DEdVC2;;aA"<4IzP' </td></tr>
	 * <tr><td>SDK_AUTO_TALK_START_EX</td><td>Ih18Vw6/Q{Gk?*J<SoRt6T=2. </td></tr>
	 * <tr><td>SDK_AUTO_TALK_STOP_EX</td><td>Ih18Vw6/M#V9SoRt6T=2. </td></tr>
	 * <tr><td>SDK_CONFIG_CHANGE_EX</td><td>Ih18EdVC7"Iz8D1d. </td></tr>
	 * <tr><td>SDK_IPSEARCH_EVENT_EX</td><td>IPKQKwJB<~,75;XWV7{4.8qJ=HgOB:DevName::Manufacturer::MAC::IP::Port::DevType::POEPort::SubMask::GateWay&& </td></tr>
	 * <tr><td>SDK_AUTO_RECONNECT_FAILD</td><td>WT6/VXA,J'0\JB<~,75;XR;8vintPMJ}>],1mJ>VXA,J'0\75;XBk,>_Le2N<{ Login=S?Z5D5GB<4mNsBkK5Cw </td></tr>
	 * <tr><td>SDK_REALPLAY_FAILD_EVENT</td><td><`JSJ'0\JB<~,75;X=a99Le  DEV_PLAY_RESULT </td></tr>
	 * <tr><td>SDK_PLAYBACK_FAILD_EVENT</td><td>;X7EJ'0\JB<~,75;X=a99Le  DEV_PLAY_RESULT </td></tr>
	 * </table>
	 * @param pchDVRIP Ih18IP
	 * @param nDVRPort Ih186K?Z
	 * \endif
	 */
	public boolean invoke(int lCommand, long lLoginID, Object obj, String pchDVRIP, int nDVRPort);

}

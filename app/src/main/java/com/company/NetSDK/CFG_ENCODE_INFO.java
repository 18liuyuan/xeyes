package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Picture Channel Attribute:Picture Channel Attribute
 * \else
 * M<OqM(5@JtPTPEO"
 * \endif
 */
public class CFG_ENCODE_INFO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Channel No. 1~ Max Channel Num 
	 * \else
	 * M(5@:E(0?*J<)
	 * \endif
	 */
	public int                  nChannelID;							

	/**
	 * \if ENGLISH_LANG
	 * Channel Name 
	 * \else
	 * M(5@C{3F
	 * \endif
	 */
	public char					szChnName[] = new char[FinalVar.MAX_CHANNELNAME_LEN];		

	/**
	 * \if ENGLISH_LANG
	 * Main Stream.0-Normal Record;1-Detect Record;2-Alarm Record
	 * \else
	 * VwBkAw,0#-FUM(B<Oq,1-6/<lB<Oq,2#-1(>/B<Oq
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuMainStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Substream.0-Substream1;1-Substream2;2-Substream1;
	 * \else
	 * 8(BkAw,0#-8(BkAw1,1#-8(BkAw2,2#-8(BkAw3
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuExtraStream[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];

	/**
	 * \if ENGLISH_LANG
	 * Snapshot.0-Normal Snapshot;1-Detect Snapshot;2-Alarm Snapshot;
	 * \else
	 * W%M<,0#-FUM(W%M<,1#-6/<lW%M<,2#-1(>/W%M<
	 * \endif
	 */
	public CFG_VIDEOENC_OPT		stuSnapFormat[] = new CFG_VIDEOENC_OPT[FinalVar.MAX_VIDEOSTREAM_NUM];	

	/**
	 * \if ENGLISH_LANG
	 * Supported Area Cover Type(Capability Introduction,Read Only):Mask,First Bte:Device Local Preview#;Second Bit:Record And networkMonitor 
	 * \else
	 * GxSrUZ8GD\A&QZBk,04N;7V1pJG1>5XT$@@!"B<Oq<0MxBg<`JS
	 * \endif
	 */
	public int					dwCoverAbilityMask;					

	/**
	 * \if ENGLISH_LANG
	 * Area Cover Switch 0x00 Not Enable COver#,0x01 Only Cover Preview#,0x10 Only Cover Record#,0x11 Cover All 
	 * \else
	 * GxSrUZ8GJ9D\QZBk,04N;7V1pJG1>5XT$@@!"B<Oq<0MxBg<`JS
	 * \endif
	 */
	public int					dwCoverEnableMask;					

	/**
	 * \if ENGLISH_LANG
	 * Video Cover 
	 * \else
	 * GxSr828G
	 * \endif
	 */
	public CFG_VIDEO_COVER		stuVideoCover = new CFG_VIDEO_COVER();						

	/**
	 * \if ENGLISH_LANG
	 * Channel Title 
	 * \else
	 * M(5@1jLb
	 * \endif
	 */
	public CFG_OSD_INFO			stuChnTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Time Title 
	 * \else
	 * J1<d1jLb
	 * \endif
	 */
	public CFG_OSD_INFO			stuTimeTitle = new CFG_OSD_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Video Color 
	 * \else
	 * ;-CfQUI+
	 * \endif
	 */
	public CFG_COLOR_INFO		stuVideoColor = new CFG_COLOR_INFO();						

	/**
	 * \if ENGLISH_LANG
	 * Audio Format 
	 * <pre>
	 * Enumerate Value				Corresponding Audio Format 
	 * AUDIO_FORMAT_G711A = 0		G711a 
	 * AUDIO_FORMAT_PCM = 1			PCM 
	 * AUDIO_FORMAT_G711U = 2		G711u 
	 * AUDIO_FORMAT_AMR = 3			AMR 
	 * AUDIO_FORMAT_AAC = 4			AAC 
	 * </pre>
	 * \else
	 * RtF58qJ=: 0:G711A,1:PCM,2:G711U,3:AMR,4:AAC
	 * \endif
	 */
	public int				    emAudioFormat;                      

	/**
	 * \if ENGLISH_LANG
	 * Protocol Version, Read Only 
	 * \else
	 * P-Ri0f1>:E, V;6A
	 * \endif
	 */
	public int					nProtocolVer;						
	
	public CFG_ENCODE_INFO() {
		for (int i = 0; i < FinalVar.MAX_VIDEOSTREAM_NUM; i++) {
			stuMainStream[i] = new CFG_VIDEOENC_OPT();
			stuExtraStream[i] = new CFG_VIDEOENC_OPT();
			stuSnapFormat[i] = new CFG_VIDEOENC_OPT();
		}
	}
}

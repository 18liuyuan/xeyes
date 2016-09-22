package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * The image channel properties structure
 * \else
 * M<OqM(5@JtPT=a99Le
 * \endif
 */
public class SDKDEV_CHANNEL_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * \if ENGLISH_LANG
	 * Noise and threshold,judicial burning equipment 
	 * \else
	 * ToRt5D7'V5,K>7(?LB<Ih18J9SC
	 * \endif
	 */
	public byte				bNoise;
	
	/**
	 * \if ENGLISH_LANG
	 * (Mobile special demand)Mode 1(Image priority) mode 2(smooth priority) mode 3(custom) 
	 * \else
	 * (35TXLXJbPhGs)D#J=R;(;-VJSEOH):B<Oq7V1fBJ2ISC4B7D1.V!BJ2fps.BkBJ128kbps(C?P!J1225MB)
	 * D#J=6~(Aw3)SEOH):B<Oq7V1fBJ2ISC4B7CIF.V!BJ12fps.BkBJ256kbps(C?P!J1550MB)
	 * D#J=H}(WT6(Re)B<Oq7V1fBJ?IRTSISC;'WT6(Re.O^6(Wn4sD\A&N*4CIF/25fps
	 * \endif
	 */
	public byte				bMode;
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name 
	 * \else
	 * M(5@C{3F
	 * \endif
	 */
	public byte				szChannelName[] = new byte[FinalVar.SDK_CHAN_NAME_LEN];
	
	/**
	 * \if ENGLISH_LANG
	 * Main stream 
	 * \else
	 * VwBkAw
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stMainVideoEncOpt[] = new SDK_VIDEOENC_OPT[REC_TYPE.SDK_REC_TYPE_NUM];
	
	/**
	 * \if ENGLISH_LANG
	 * Extra Stream 
	 * \else
	 * 8(BkAw
	 * \endif
	 */
	public SDK_VIDEOENC_OPT		stAssiVideoEncOpt[] = new SDK_VIDEOENC_OPT[FinalVar.SDK_N_ENCODE_AUX];
	
	/**
	 * \if ENGLISH_LANG
	 * Image color properties 
	 * \else
	 * M<OsQUI+JtPT
	 * \endif
	 */
	public SDK_COLOR_CFG		stColorCfg[] = new SDK_COLOR_CFG[FinalVar.SDK_N_COL_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Time overplay properties 
	 * \else
	 * J1<d5~<SJtPT
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stTimeOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Channel name overplay properties 
	 * \else
	 * M(5@C{5~<SJtPT 
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stChannelOSD = new SDK_ENCODE_WIDGET();
	
	/**
	 * \if ENGLISH_LANG
	 * Occluded regions overplay Properties 
	 * \else
	 * UZ52GxSr5~<SJtPT
	 * \endif
	 */
	public SDK_ENCODE_WIDGET	stBlindCover[] = new SDK_ENCODE_WIDGET[FinalVar.SDK_N_COVERS];
	
	/**
	 * \if ENGLISH_LANG
	 * The area covered switch;As follows \n
	 * 0x00:Not cover.0x01:Only cover equipment local Preview.
	 * 0x10:Only cover the video and network preview.0x11:All are covered
	 * \else
	 * GxSrUZ8G?*9X;0x00:2;J9D\UZ8G.0x01:=vUZ8GIh181>5XT$@@.0x10:=vUZ8GB<Oq<0MxBgT$@@.0x11:6<UZ8G
	 * \endif
	 */
	public byte				byBlindEnable;
	
	/**
	 * \if ENGLISH_LANG
	 * Area covered mask,Section A: Equipment local preview, second place: video (and network preview). 
	 * \else
	 *  GxSrUZ8GQZBk;5ZR;N;:Ih181>5XT$@@;5Z6~N;:B<Oq(<0MxBgT$@@)
	 * \endif
	 */
	public byte				byBlindMask;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold (adjustable from 0 to 100) 
	 * \else
	 * RtA?7'V5(0~100?I5w)
	 * \endif
	 */
	public byte				bVolume;
	
	/**
	 * \if ENGLISH_LANG
	 * Volume threshold enable 
	 * \else
	 * RtA?7'V5J9D\
	 * \endif
	 */
	public byte				bVolumeEnable;

	public SDKDEV_CHANNEL_CFG() {
		for (int i = 0; i < REC_TYPE.SDK_REC_TYPE_NUM; i++) {
			stMainVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_ENCODE_AUX; i++) {
			stAssiVideoEncOpt[i] = new SDK_VIDEOENC_OPT();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COL_TSECT; i++) {
			stColorCfg[i] = new SDK_COLOR_CFG();
		}
		
		for (int i = 0; i < FinalVar.SDK_N_COVERS; i++) {
			stBlindCover[i] = new SDK_ENCODE_WIDGET();
		}
	}
}

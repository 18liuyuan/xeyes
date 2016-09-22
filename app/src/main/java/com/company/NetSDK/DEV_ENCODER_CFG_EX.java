package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * front end access configuratiion parameter expansion
 * \else
 * G06K=SHkEdVC2NJ}PEO"@)U9
 * \endif
 */
public class DEV_ENCODER_CFG_EX implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * number of channel
	 * \else
	 * J}WVM(5@8vJ}
	 * \endif
	 */
	public int                 nChannels;
	
	/**
	 * \if ENGLISH_LANG
	 * the front end of the every digital channel encoder information
	 * \else
	 * 8wJ}WVM(5@5DG06K1`BkFwPEO"
	 * \endif
	 */
	public DEV_ENCODER_INFO    stuDevInfo[] = new DEV_ENCODER_INFO[128];
	
	/**
	 * \if ENGLISH_LANG
	 * maximum number of hd video(0 means not support)
	 * \else
	 * J}WVM(5@VPWn6`?IV'3V8_GeJSF58vJ}(N*01mJ>2;V'3V8_GeIhVC)
	 * W"#:Hg9{V'3V8_GeIhVC#,8_GeM(5@N*0~N-1#,Ht=+NV.:s5DJ}WVM(5@IhVCN*8_Ge#,SP?ID\1#4f2;3I9&
	 * \endif
	 */
	public byte                byHDAbility;
	
	/**
	 * \if ENGLISH_LANG
	 * support TV adjust,0:not support,1:support.
	 * \else
	 * Ih18JG7qV'3VTV5w=Z, 0:2;V'3V 1:V'3V.
	 * \endif
	 */
	public byte                bTVAdjust;
	
	/**
	 * \if ENGLISH_LANG
	 * support tour or not, 0:not support, >0:the current number of device support
	 * \else
	 * Ih18JG7qV'3V=bBkBVQ2, 0:2;V'3V 4sSZ0:1mJ>G06KV'3VBVQ2Wn4sIh18J}.
	 * \endif
	 */
	public byte                bDecodeTour;
	
	/**
	 * \if ENGLISH_LANG
	 * support remote PTZ control
	 * \else
	 * V8J>JG7qV'3VT63LTFL(?XVF!#
	 * \endif
	 */
	public byte                bRemotePTZCtl;
	
	public DEV_ENCODER_CFG_EX() {
		for (int i = 0; i < 128; i++) {
			stuDevInfo[i] = new DEV_ENCODER_INFO();
		}
	}
}

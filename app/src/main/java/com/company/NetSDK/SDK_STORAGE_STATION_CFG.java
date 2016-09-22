package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Storage position set structure.  Each channel set separately.Each channel can set several storage types including local,portableand remote storage.
 * \else
 * 4f4"N;VCIhVC=a99Le#,C?M(5@6@A"IhVC,C?M(5@?IRTQ!Tq8wVV4f4"@`PM, D?G00|@(1>5X, ?IRF6/, T63L4f4".
 * \endif
 */
public class SDK_STORAGE_STATION_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask. Use bit to represent.
	 * The first bit:system pre-record. The second bit:scheduled record. The third bit:motion detection record.
	 * The fourth bit:alarm record. The fifth bit:card record. The sixth bit:manual record.
	 * \else
	 * 1>5X4f4"QZBk#;04N;1mJ>#:
	 * 5ZR;N;#:O5M3T$B<#,5Z6~N;#:6(J1B<Oq#,5ZH}N;#:6/<lB<Oq#,
	 * 5ZKDN;#:1(>/B<Oq#,5ZNeN;#:?(:EB<Oq#,5ZAyN;#:JV6/B<Oq
	 * \endif
	 */
	public int               dwLocalMask;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask. Storage mask such as local storage mask.
	 * \else
	 * ?IRF6/4f4"QZBk 4f4"QZBkHg1>5X4f4"QZBk
	 * \endif
	 */
	public int               dwMobileMask;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage type 0: Ftp  1: Smb
	 * \else
	 * T63L4f4"@`PM 0: Ftp  1: Smb
	 * \endif
	 */
	public int                 RemoteType;

	/**
	 * \if ENGLISH_LANG
	 * Remote storage mask.  Storage mask such as local storage mask.
	 * \else
	 * T63L4f4"QZBk 4f4"QZBkHg1>5X4f4"QZBk
	 * \endif
	 */
	public int               dwRemoteMask;

	/**
	 * \if ENGLISH_LANG
	 * Local storage mask when remote is abnormal
	 * \else
	 * T63LRl3#J11>5X4f4"QZBk
	 * \endif
	 */
	public int               dwRemoteSecondSelLocal;

	/**
	 * \if ENGLISH_LANG
	 * Moving storage mask when remote is abnormal.
	 * \else
	 * T63LRl3#J1?IRF6/4f4"QZBk
	 * \endif
	 */
	public int               dwRemoteSecondSelMobile;
	
	/**
	 * \if ENGLISH_LANG
	 * Remote path. Its length is 240
	 * \else
	 * T63LD?B<, FdVP3$6HN*240
	 * \endif
	 */
	public byte                SubRemotePath[] = new byte[FinalVar.MAX_PATH_STOR];

	/**
	 * \if ENGLISH_LANG
	 * Function shield bit. Use bit to represent bit0 = 1:Shield sanpshot event activate storage position function.
	 * \else
	 * 9&D\FA1NN;#,04N;1mJ>#,bit0 = 1:FA1NW%M<JB<~4%7"4f4"N;VC9&D\
	 * \endif
	 */
	public int               dwFunctionMask;

	/**
	 * \if ENGLISH_LANG
	 * If synchronous mask; after remote storage network recovery, the local storage data will automatically synchronized to the remote storage.
	 * \else
	 * JG7qM,2=QZBk;T63L4f4"MxBg9JUO;V84:s#,WT6/=+1>5X4f4"5DJ}>]M,2=5=T63L4f4"!#
	 * \endif
	 */
	public int               dwAutoSyncMask;

	/**
	 * \if ENGLISH_LANG
	 * the time for synchronous from the network synchronous time. In hour. 0:all data  1:data in one hour n:data in n hours
	 * \else
	 * 4SMxBg;V845DJ1?L?*J<#,PhR*MyG0M,2=5DJ}>]J1<d76N'#,P!J1N*5%N;!#0:M,2=KySPJ}>]  1:1P!J1DZ5DJ}>] n:nP!J1DZ5DJ}>]
	 * \endif
	 */
	public byte                bAutoSyncRange;
}

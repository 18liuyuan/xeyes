package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Schedule record
 * \else
 * 6(J1B<Os
 * \endif
 */
public class SDKDEV_RECORD_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Schedule
	 * \else
	 * J1<d1m
	 * \endif
	 */
	public SDK_TSECT            stSect[][] = new SDK_TSECT[FinalVar.SDK_N_WEEKS][FinalVar.SDK_N_REC_TSECT];
	
	/**
	 * \if ENGLISH_LANG
	 * Pre-record time. Unit is second. 0=Disable pre-record
	 * \else
	 * T$B<J1<d#,5%N;JGs#,01mJ>2;T$B<
	 * \endif
	 */
	public byte                byPreRecordLen;
	
	/**
	 * \if ENGLISH_LANG
	 * Record redundancy enable/disable
	 * \else
	 * B<OqH_S`?*9X
	 * \endif
	 */
	public byte                byRedundancyEn;
	
	/**
	 * \if ENGLISH_LANG
	 * <table>
	 * <tr><td>Number</td><td>Record bit stream type</td></tr>
	 * <tr><td>0</td><td>Main bit stream</td></tr>
	 * <tr><td>1</td><td>Extra stream1</td></tr>
	 * <tr><td>2</td><td>Extra stream2</td></tr>
	 * <tr><td>3</td><td>Extra stream3</td></tr>
	 * </table>
	 * \else
	 * <table>
	 * <tr><td>J}V5</td><td>B<OqBkAw@`PM</td></tr>
	 * <tr><td>0</td><td>VwBkAw </td></tr>
	 * <tr><td>1</td><td>8(BkAw1</td></tr>
	 * <tr><td>2</td><td>8(BkAw2</td></tr>
	 * <tr><td>3</td><td>8(BkAw3</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byRecordType;                       // B<OqBkAw@`PM#:0-VwBkAw 1-8(BkAw1 2-8(BkAw2 3-8(BkAw3
	
	public SDKDEV_RECORD_CFG() {
		for (int i = 0; i < FinalVar.SDK_N_WEEKS; i++) {
			for (int j = 0; j < FinalVar.SDK_N_REC_TSECT; j++) {
				stSect[i][j] = new SDK_TSECT();
			}
		}
	}
}

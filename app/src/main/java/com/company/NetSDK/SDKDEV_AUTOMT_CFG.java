package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * Configure Automated Maintenance
 * \else
 * WT6/N,;$EdVC
 * \endif
 */
public class SDKDEV_AUTOMT_CFG implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * Automatic restart time
	 * <table>
	 * <tr><td>0</td><td>Never</td></tr>
	 * <tr><td>1</td><td>everyday</td></tr>
	 * <tr><td>2</td><td>everyweek</td></tr>
	 * <tr><td>3</td><td>Every Monday</td></tr>
	 * <tr><td>4</td><td>Every Tuesday</td></tr>
	 * <tr><td>5</td><td>Every Wednesday</td></tr>
	 * <tr><td>6</td><td>Every Thursday</td></tr>
	 * <tr><td>7</td><td>Every Friday</td></tr>
	 * <tr><td>8</td><td>Every Saturday</td></tr>
	 * </table> 
	 * \else
	 * WT6/VXFtJ1<d
	 * <table>
	 * <tr><td>0</td><td>4S2;</td></tr>
	 * <tr><td>1</td><td>C?Ll</td></tr>
	 * <tr><td>2</td><td>C?PGFZHU</td></tr>
	 * <tr><td>3</td><td>C?PGFZR;</td></tr>
	 * <tr><td>4</td><td>C?PGFZ6~</td></tr>
	 * <tr><td>5</td><td>C?PGFZH}</td></tr>
	 * <tr><td>6</td><td>C?PGFZKD</td></tr>
	 * <tr><td>7</td><td>C?PGFZNe</td></tr>
	 * <tr><td>8</td><td>C?PGFZAy</td></tr>
	 * </table>
	 * \endif
	 */
	public byte                byAutoRebootDay;
	
	/**
	 * \if ENGLISH_LANG
	 * (Restart point time)0#:0, 1#:1, ......, 23#:23
	 * \else
	 * (VXFtJ1<d5c)0#:05c#, 1#:15c#, ......#, 23#:235c
	 * \endif
	 */
	public byte                byAutoRebootTime;
	
	/**
	 * \if ENGLISH_LANG
	 * Automatically delete files#;0#:never,1#:24 hours,2#:48 hours,3#:72 hours,4#:96 hours,5#:week,6#:month
	 * \else
	 * WT6/I>3}ND<~#;0#:4S2;#,1#:24P!J1#,2#:48P!J1#,3#:72P!J1#,4#:96P!J1#,5#:V\#,6#:TB
	 * \endif
	 */
	public byte                byAutoDeleteFilesTime;
}

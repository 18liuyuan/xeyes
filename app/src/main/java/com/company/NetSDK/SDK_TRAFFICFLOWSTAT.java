package com.company.NetSDK;

import java.io.Serializable;

public class SDK_TRAFFICFLOWSTAT implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * same as DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineGroup
	 * \else
	 * M,DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineGroup
	 * \endif
	 */
	public byte                szMachineAddress[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * same as DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineName
	 * \else
	 * M,DEV_EVENT_TRAFFIC_TRAFFICCAR_INFO.MachineName
	 * \endif
	 */
	public byte                szMachineName[] = new byte[256];

	/**
	 * \if ENGLISH_LANG
	 * DrivingDirection "Approach" means driving direction,where the car is more near;"Leave"-means where if mor far to the car,the scend and third param means the location of the driving direction
	 * \else
	 * PPJ;7=Or"Approach"-IOPP#,<435A>@kIh182?Jp5cT=@4T==|#;"Leave"-OBPP#,<435A>@kIh182?Jp5cT=@4T=T6#,5Z6~:M5ZH}8v2NJ}7V1p4z1mIOPP:MOBPP5DA=8v5X5c#,UTF-81`Bk
	 * \endif
	 */
	public byte                szDrivingDirection[][] = new byte[3][32];

	/**
	 * \if ENGLISH_LANG
	 * lane number
	 * \else
	 * 355@:E J9SCSC;'EdVC5D355@1`:E
	 * \endif
	 */
	public int                 nLane;

	/**
	 * \if ENGLISH_LANG
	 * Statistic time
	 * \else
	 * M3<FJ1<d#,W*;;5=UTC
	 * \endif
	 */
	public NET_TIME_EX         UTC = new NET_TIME_EX();

	/**
	 * \if ENGLISH_LANG
	 * Statistic period, m
	 * \else
	 * M3<FV\FZ#,5%N;7VVS
	 * \endif
	 */
	public int                 nPeriod;

	/**
	 * \if ENGLISH_LANG
	 * passed vehicle number
	 * \else
	 * M(9}35A>W\J}
	 * \endif
	 */
	public int                 nVehicles;

	/**
	 * \if ENGLISH_LANG
	 * average speed, km/h
	 * \else
	 * F=>y35KY#,5%N;km/h
	 * \endif
	 */
	public float               fAverageSpeed;

	/**
	 * \if ENGLISH_LANG
	 * average length, m
	 * \else
	 * F=>y353$#,5%N;CW
	 * \endif
	 */
	public float               fAverageLength;

	/**
	 * \if ENGLISH_LANG
	 * time occupy ratio,
	 * \else
	 * J1<dU<SPBJ#,<45%N;J1<dDZM(9}6OCf5D35A>KySCJ1<d5DW\:MU<5%N;J1<d5D1H@}
	 * \endif
	 */
	public float               fTimeOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space occupy ratio,
	 * \else
	 * ?U<dU<SPBJ#,<4040Y7VBJ<FA?5D35A>3$6HW\:M3}RTJ1<d<d8tDZ35A>F=>yPPJ;>`@k
	 * \endif
	 */
	public float               fSpaceOccupyRatio;

	/**
	 * \if ENGLISH_LANG
	 * space between two cars,m
	 * \else
	 * 35M7<d>`#,O`AZ35A>V.<d5D>`@k#,5%N;CW/A>
	 * \endif
	 */
	public float               fSpaceHeadway;

	/**
	 * \if ENGLISH_LANG
	 * time between two cars, s
	 * \else
	 * 35M7J1>`#,5%N;Ck/A>
	 * \endif
	 */
	public float               fTimeHeadway;

	/**
	 * \if ENGLISH_LANG
	 * car density, every km
	 * \else
	 * 35A>C\6H#,C?9+@o5D35A>J}#,5%N;A>/km
	 * \endif
	 */
	public float               fDensity;

	/**
	 * \if ENGLISH_LANG
	 * over speed vehicle number
	 * \else
	 * 3,KY35A>J}
	 * \endif
	 */
	public int                 nOverSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * under speed vehicle number
	 * \else
	 * 5MKY35A>J}
	 * \endif
	 */
	public int                 nUnderSpeedVehicles;

	/**
	 * \if ENGLISH_LANG
	 * big car number
	 * \else
	 * 4s35J}A?  35A>@`PMEP6O1jW<2N<{TrafficSnapshotEdVC1m
	 * \endif
	 */
	public int                 nLargeVehicles;

	/**
	 * \if ENGLISH_LANG
	 * mid car number
	 * \else
	 * VPPM35J}A?
	 * \endif
	 */
	public int                 nMediumVehicles;

	/**
	 * \if ENGLISH_LANG
	 * small car number
	 * \else
	 * P!35J}A?
	 * \endif
	 */
	public int                 nSmallVehicles;

	/**
	 * \if ENGLISH_LANG
	 * moto car number
	 * \else
	 * D&MP35J}A?
	 * \endif
	 */
	public int                 nMotoVehicles;

	/**
	 * \if ENGLISH_LANG
	 * long vehicle number
	 * \else
	 * 3,3$35J}A?
	 * \endif
	 */
	public int                 nLongVehicles;
}

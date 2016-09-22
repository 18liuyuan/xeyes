package com.company.NetSDK;

import java.io.Serializable;

public class NET_HDD_STATE implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int               nState;                   // S2ELW4L,#,0-U}3##,1-4mNs   
	public double            dbTotalSize;              // S2ELW\H]A?#,WV=ZN*5%N;
	public NET_PARTITION_STATE stuPartitions[] = new NET_PARTITION_STATE[FinalVar.SDK_MAX_STORAGE_PARTITION_NUM]; // 7VGxW4L,
    public int               nPartitionNum;              // 7VGxJ}
    
    public NET_HDD_STATE() {
    	for (int i = 0; i < FinalVar.SDK_MAX_STORAGE_PARTITION_NUM; i++) {
    		stuPartitions[i] = new NET_PARTITION_STATE();
    	}
    }
}

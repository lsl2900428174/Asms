package com.trkj.asms.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Stock1 implements Serializable {
    private static final long serialVersionUID = 437109523135360944L;
    /**
     * 库存id
     */
    private Integer id;
    /**
     * 物资ID
     */
    private Integer coId;
    /**
     * 仓库id
     */
    private Integer wId;
    /**
     * 门店
     */
    private Integer sId;
    /**
     * 库存数量
     */
    private Integer number;


}

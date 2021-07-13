package com.trkj.asms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * suppliertype
 * @author 
 */
@Data
public class Suppliertype implements Serializable {
    /**
     * 供货商id
     */
    private Integer suptypeid;

    /**
     * 供货商类型名称
     */
    private String supname;

    private static final long serialVersionUID = 1L;
}
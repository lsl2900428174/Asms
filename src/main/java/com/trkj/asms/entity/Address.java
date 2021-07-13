package com.trkj.asms.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * address
 * @author 
 */
@Data
public class Address implements Serializable {
    /**
     * 地区id
     */
    private Integer addressid;

    /**
     * 地区名称
     */
    private String address;

    private static final long serialVersionUID = 1L;
}
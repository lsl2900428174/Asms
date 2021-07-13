package generator;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * commodity
 * @author 
 */
@Data
public class Commodity implements Serializable {
    /**
     * 物资ID
     */
    private Integer coId;

    /**
     * 物资名称
     */
    private String coName;

    /**
     * 物资编码
     */
    private String coCode;

    /**
     * 门店id
     */
    private Integer sId;

    /**
     * 物资分类id
     */
    private Integer ciId;

    /**
     * 品牌名称id
     */
    private Integer mId;

    /**
     * 计量单位名称id
     */
    private Integer muId;

    /**
     * 物资条码
     */
    private String barcode;

    /**
     * 适用车型
     */
    private String applimodel;

    /**
     * 安装部位id
     */
    private Integer isId;

    /**
     * 规格型号
     */
    private String specialmodel;

    /**
     * 是否安装
     */
    private Integer isinstall;

    /**
     * 仓库id
     */
    private Integer whId;

    /**
     * 仓库位置id
     */
    private Integer wpId;

    /**
     * 预警
     */
    private Integer warning;

    /**
     * 零售价
     */
    private BigDecimal coRetailprice;

    /**
     * 客户领料价
     */
    private BigDecimal cusprice;

    private static final long serialVersionUID = 1L;
}
package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 币种对象 coin
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public class Coin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 合约地址 */
    @Excel(name = "合约地址")
    private String address;

    /** 币种名称 */
    @Excel(name = "币种名称")
    private String coinName;

    /** 币种精度 */
    @Excel(name = "币种精度")
    private Long coinDecimals;

    /** 币种确认数 */
    @Excel(name = "币种确认数")
    private Long coinConfirm;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ctime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mtime;

    /** 最小归集数量 */
    @Excel(name = "最小归集数量")
    private BigDecimal minCollectAmount;

    /** 币种类型 */
    @Excel(name = "币种类型")
    private String type;

    /** 主链类型 */
    @Excel(name = "主链类型")
    private String chainType;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setCoinName(String coinName) 
    {
        this.coinName = coinName;
    }

    public String getCoinName() 
    {
        return coinName;
    }
    public void setCoinDecimals(Long coinDecimals) 
    {
        this.coinDecimals = coinDecimals;
    }

    public Long getCoinDecimals() 
    {
        return coinDecimals;
    }
    public void setCoinConfirm(Long coinConfirm) 
    {
        this.coinConfirm = coinConfirm;
    }

    public Long getCoinConfirm() 
    {
        return coinConfirm;
    }
    public void setCtime(Date ctime) 
    {
        this.ctime = ctime;
    }

    public Date getCtime() 
    {
        return ctime;
    }
    public void setMtime(Date mtime) 
    {
        this.mtime = mtime;
    }

    public Date getMtime() 
    {
        return mtime;
    }
    public void setMinCollectAmount(BigDecimal minCollectAmount) 
    {
        this.minCollectAmount = minCollectAmount;
    }

    public BigDecimal getMinCollectAmount() 
    {
        return minCollectAmount;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setChainType(String chainType) 
    {
        this.chainType = chainType;
    }

    public String getChainType() 
    {
        return chainType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("address", getAddress())
            .append("coinName", getCoinName())
            .append("coinDecimals", getCoinDecimals())
            .append("coinConfirm", getCoinConfirm())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("minCollectAmount", getMinCollectAmount())
            .append("type", getType())
            .append("chainType", getChainType())
            .toString();
    }
}

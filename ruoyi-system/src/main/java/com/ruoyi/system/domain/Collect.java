package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 归集对象 collect
 *
 * @author ruoyi
 * @date 2024-09-02
 */
public class Collect extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 流水ID */
    @Excel(name = "流水ID")
    private Long transactionId;

    /** 归集类型 */
    @Excel(name = "归集类型")
    private String type;

    /** 合约地址 */
    @Excel(name = "合约地址")
    private String contractAddress;

    /** 归集来源地址 */
    @Excel(name = "归集来源地址")
    private String collectFromAddress;

    /** 归集目的地址 */
    @Excel(name = "归集目的地址")
    private String collectToAddress;

    /** 归集金额 */
    @Excel(name = "归集金额")
    private BigDecimal collectAmount;

    /** 归集交易哈希 */
    @Excel(name = "归集交易哈希")
    private String collectHash;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ctime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mtime;

    /** 主链类型 */
    @Excel(name = "主链类型")
    private String chainType;

    /** 币种ID */
    @Excel(name = "币种ID")
    private Long coinId;

    /** 币种名称 */
    @Excel(name = "币种名称")
    private String coinName;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setTransactionId(Long transactionId)
    {
        this.transactionId = transactionId;
    }

    public Long getTransactionId()
    {
        return transactionId;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
    }
    public void setContractAddress(String contractAddress)
    {
        this.contractAddress = contractAddress;
    }

    public String getContractAddress()
    {
        return contractAddress;
    }
    public void setCollectFromAddress(String collectFromAddress)
    {
        this.collectFromAddress = collectFromAddress;
    }

    public String getCollectFromAddress()
    {
        return collectFromAddress;
    }
    public void setCollectToAddress(String collectToAddress)
    {
        this.collectToAddress = collectToAddress;
    }

    public String getCollectToAddress()
    {
        return collectToAddress;
    }
    public void setCollectAmount(BigDecimal collectAmount)
    {
        this.collectAmount = collectAmount;
    }

    public BigDecimal getCollectAmount()
    {
        return collectAmount;
    }
    public void setCollectHash(String collectHash)
    {
        this.collectHash = collectHash;
    }

    public String getCollectHash()
    {
        return collectHash;
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
    public void setChainType(String chainType)
    {
        this.chainType = chainType;
    }

    public String getChainType()
    {
        return chainType;
    }
    public void setCoinId(Long coinId)
    {
        this.coinId = coinId;
    }

    public Long getCoinId()
    {
        return coinId;
    }
    public void setCoinName(String coinName)
    {
        this.coinName = coinName;
    }

    public String getCoinName()
    {
        return coinName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("transactionId", getTransactionId())
                .append("type", getType())
                .append("contractAddress", getContractAddress())
                .append("collectFromAddress", getCollectFromAddress())
                .append("collectToAddress", getCollectToAddress())
                .append("collectAmount", getCollectAmount())
                .append("collectHash", getCollectHash())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .append("chainType", getChainType())
                .append("coinId", getCoinId())
                .append("coinName", getCoinName())
                .toString();
    }
}

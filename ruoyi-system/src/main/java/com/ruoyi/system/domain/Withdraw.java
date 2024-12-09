package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 提现对象 withdraw
 *
 * @author ruoyi
 * @date 2024-09-02
 */
public class Withdraw extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 交易类型：0-主链币交易，1-代币交易 */
    @Excel(name = "交易类型：0-主链币交易，1-代币交易")
    private Long transactionType;

    /** bizId */
    @Excel(name = "bizId")
    private Long bizId;

    /** 提现地址 */
    @Excel(name = "提现地址")
    private String address;

    /** 提现金额 */
    @Excel(name = "提现金额")
    private BigDecimal amount;

    /** 合约地址 */
    @Excel(name = "合约地址")
    private String contract;

    /** 交易哈希 */
    @Excel(name = "交易哈希")
    private String hash;

    /** 状态：0-刚入库，1-上链 */
    @Excel(name = "状态：0-刚入库，1-上链")
    private Long status;

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
    public void setTransactionType(Long transactionType)
    {
        this.transactionType = transactionType;
    }

    public Long getTransactionType()
    {
        return transactionType;
    }
    public void setBizId(Long bizId)
    {
        this.bizId = bizId;
    }

    public Long getBizId()
    {
        return bizId;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }
    public void setContract(String contract)
    {
        this.contract = contract;
    }

    public String getContract()
    {
        return contract;
    }
    public void setHash(String hash)
    {
        this.hash = hash;
    }

    public String getHash()
    {
        return hash;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
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
                .append("transactionType", getTransactionType())
                .append("bizId", getBizId())
                .append("address", getAddress())
                .append("amount", getAmount())
                .append("contract", getContract())
                .append("hash", getHash())
                .append("status", getStatus())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .append("chainType", getChainType())
                .append("coinName", getCoinName())
                .toString();
    }
}

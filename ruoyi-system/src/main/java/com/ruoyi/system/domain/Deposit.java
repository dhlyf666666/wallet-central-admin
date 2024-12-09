package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充值对象 deposit
 *
 * @author ruoyi
 * @date 2024-09-02
 */
public class Deposit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 币种符号 */
    @Excel(name = "币种符号")
    private String symbol;

    /** 交易类型：0-主链币交易，1-代币交易 */
    @Excel(name = "交易类型：0-主链币交易，1-代币交易")
    private Long transactionType;

    /** 转出地址 */
    @Excel(name = "转出地址")
    private String fromAddress;

    /** 转入地址 */
    @Excel(name = "转入地址")
    private String toAddress;

    /** 金额 */
    @Excel(name = "金额")
    private BigDecimal amount;

    /** 合约地址 */
    @Excel(name = "合约地址")
    private String contract;

    /** 交易哈希 */
    @Excel(name = "交易哈希")
    private String hash;

    /** 区块号 */
    @Excel(name = "区块号")
    private Long blockNumber;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 是否归集：0-未归集，1-已归集 */
    @Excel(name = "是否归集：0-未归集，1-已归集")
    private Long isCollect;

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

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public String getSymbol()
    {
        return symbol;
    }
    public void setTransactionType(Long transactionType)
    {
        this.transactionType = transactionType;
    }

    public Long getTransactionType()
    {
        return transactionType;
    }
    public void setFromAddress(String fromAddress)
    {
        this.fromAddress = fromAddress;
    }

    public String getFromAddress()
    {
        return fromAddress;
    }
    public void setToAddress(String toAddress)
    {
        this.toAddress = toAddress;
    }

    public String getToAddress()
    {
        return toAddress;
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
    public void setBlockNumber(Long blockNumber)
    {
        this.blockNumber = blockNumber;
    }

    public Long getBlockNumber()
    {
        return blockNumber;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setIsCollect(Long isCollect)
    {
        this.isCollect = isCollect;
    }

    public Long getIsCollect()
    {
        return isCollect;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("symbol", getSymbol())
                .append("transactionType", getTransactionType())
                .append("fromAddress", getFromAddress())
                .append("toAddress", getToAddress())
                .append("amount", getAmount())
                .append("contract", getContract())
                .append("hash", getHash())
                .append("blockNumber", getBlockNumber())
                .append("status", getStatus())
                .append("isCollect", getIsCollect())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .append("chainType", getChainType())
                .append("coinId", getCoinId())
                .toString();
    }
}

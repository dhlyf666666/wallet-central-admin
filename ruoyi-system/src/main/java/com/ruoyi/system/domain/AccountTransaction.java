package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账户流水对象 account_transaction
 *
 * @author ruoyi
 * @date 2024-09-02
 */
public class AccountTransaction extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 账户ID */
    @Excel(name = "账户ID")
    private Long accountId;

    /** 参考ID，用于关联其他记录或外部数据 */
    @Excel(name = "参考ID，用于关联其他记录或外部数据")
    private Long refId;

    /** 交易类型 */
    @Excel(name = "交易类型")
    private String type;

    /** 转出地址 */
    @Excel(name = "转出地址")
    private String fromAddress;

    /** 接收地址 */
    @Excel(name = "接收地址")
    private String toAddress;

    /** 交易金额 */
    @Excel(name = "交易金额")
    private BigDecimal amount;

    /** 实际到账金额 */
    @Excel(name = "实际到账金额")
    private BigDecimal realAmount;

    /** 交易手续费 */
    @Excel(name = "交易手续费")
    private BigDecimal fee;

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
    public void setAccountId(Long accountId)
    {
        this.accountId = accountId;
    }

    public Long getAccountId()
    {
        return accountId;
    }
    public void setRefId(Long refId)
    {
        this.refId = refId;
    }

    public Long getRefId()
    {
        return refId;
    }
    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
        return type;
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
    public void setRealAmount(BigDecimal realAmount)
    {
        this.realAmount = realAmount;
    }

    public BigDecimal getRealAmount()
    {
        return realAmount;
    }
    public void setFee(BigDecimal fee)
    {
        this.fee = fee;
    }

    public BigDecimal getFee()
    {
        return fee;
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
                .append("accountId", getAccountId())
                .append("refId", getRefId())
                .append("type", getType())
                .append("fromAddress", getFromAddress())
                .append("toAddress", getToAddress())
                .append("amount", getAmount())
                .append("realAmount", getRealAmount())
                .append("fee", getFee())
                .append("chainType", getChainType())
                .append("coinId", getCoinId())
                .append("coinName", getCoinName())
                .toString();
    }
}

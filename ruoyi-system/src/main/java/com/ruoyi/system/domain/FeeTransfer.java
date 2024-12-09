package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 手续费转账对象 fee_transfer
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public class FeeTransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 转账来源地址 */
    @Excel(name = "转账来源地址")
    private String fromAddress;

    /** 转账目标地址 */
    @Excel(name = "转账目标地址")
    private String toAddress;

    /** 转账金额 */
    @Excel(name = "转账金额")
    private BigDecimal amount;

    /** 交易ID */
    @Excel(name = "交易ID")
    private String txid;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ctime;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date mtime;

    /** 账户ID */
    @Excel(name = "账户ID")
    private Long accountId;

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
    public void setTxid(String txid) 
    {
        this.txid = txid;
    }

    public String getTxid() 
    {
        return txid;
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
    public void setAccountId(Long accountId) 
    {
        this.accountId = accountId;
    }

    public Long getAccountId() 
    {
        return accountId;
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
            .append("fromAddress", getFromAddress())
            .append("toAddress", getToAddress())
            .append("amount", getAmount())
            .append("txid", getTxid())
            .append("status", getStatus())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("accountId", getAccountId())
            .append("chainType", getChainType())
            .toString();
    }
}

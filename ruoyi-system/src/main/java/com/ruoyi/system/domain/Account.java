package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 账户对象 account
 *
 * @author ruoyi
 * @date 2024-09-02
 */
public class Account extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 币种ID */
    @Excel(name = "币种ID")
    private Long coinId;

    /** 账户地址 */
    @Excel(name = "账户地址")
    private String address;

    /** 账户余额 */
    @Excel(name = "账户余额")
    private BigDecimal balance;

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
    public void setCoinId(Long coinId)
    {
        this.coinId = coinId;
    }

    public Long getCoinId()
    {
        return coinId;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }
    public void setBalance(BigDecimal balance)
    {
        this.balance = balance;
    }

    public BigDecimal getBalance()
    {
        return balance;
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
                .append("coinId", getCoinId())
                .append("address", getAddress())
                .append("balance", getBalance())
                .append("ctime", getCtime())
                .append("mtime", getMtime())
                .append("chainType", getChainType())
                .append("coinName", getCoinName())
                .toString();
    }
}

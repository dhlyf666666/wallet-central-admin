package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 地址对象 address
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public class Address extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 私钥 */
    @Excel(name = "私钥")
    private String privateKey;

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
    public void setPrivateKey(String privateKey) 
    {
        this.privateKey = privateKey;
    }

    public String getPrivateKey() 
    {
        return privateKey;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("address", getAddress())
            .append("privateKey", getPrivateKey())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("chainType", getChainType())
            .toString();
    }
}

package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 通知对象 notify
 *
 * @author ruoyi
 * @date 2024-08-26
 */
public class Notify extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** Application Type */
    @Excel(name = "Application Type")
    private String applicationType;

    /** Parameters */
//    @Excel(name = "Parameters")
//    private String params;

    /** Notification Target URL */
    @Excel(name = "Notification Target URL")
    private String url;

    /** Status: 0 - Notification, 1 - Success, 2 - Exception, 3 - Exception Terminated */
    @Excel(name = "Status: 0 - Notification, 1 - Success, 2 - Exception, 3 - Exception Terminated")
    private Long status;

    /** Error Count */
    @Excel(name = "Error Count")
    private Long errorCount;

    /** Result or Error Message */
    @Excel(name = "Result or Error Message")
    private String message;

    /** Creation Time */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "Creation Time", width = 30, dateFormat = "yyyy-MM-dd")
    private Date ctime;

    /** Last Modification Time */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "Last Modification Time", width = 30, dateFormat = "yyyy-MM-dd")
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
    public void setApplicationType(String applicationType)
    {
        this.applicationType = applicationType;
    }

    public String getApplicationType()
    {
        return applicationType;
    }
//    public void setParams(String params)
//    {
//        this.params = params;
//    }

//    public String getParams()
//    {
//        return params;
//    }
    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }
    public void setStatus(Long status)
    {
        this.status = status;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setErrorCount(Long errorCount)
    {
        this.errorCount = errorCount;
    }

    public Long getErrorCount()
    {
        return errorCount;
    }
    public void setMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
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
            .append("applicationType", getApplicationType())
            .append("params", getParams())
            .append("url", getUrl())
            .append("status", getStatus())
            .append("errorCount", getErrorCount())
            .append("message", getMessage())
            .append("ctime", getCtime())
            .append("mtime", getMtime())
            .append("chainType", getChainType())
            .toString();
    }
}

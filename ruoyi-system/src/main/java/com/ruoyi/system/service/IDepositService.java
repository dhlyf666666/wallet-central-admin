package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Deposit;

/**
 * 充值Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IDepositService 
{
    /**
     * 查询充值
     * 
     * @param id 充值主键
     * @return 充值
     */
    public Deposit selectDepositById(Long id);

    /**
     * 查询充值列表
     * 
     * @param deposit 充值
     * @return 充值集合
     */
    public List<Deposit> selectDepositList(Deposit deposit);

    /**
     * 新增充值
     * 
     * @param deposit 充值
     * @return 结果
     */
    public int insertDeposit(Deposit deposit);

    /**
     * 修改充值
     * 
     * @param deposit 充值
     * @return 结果
     */
    public int updateDeposit(Deposit deposit);

    /**
     * 批量删除充值
     * 
     * @param ids 需要删除的充值主键集合
     * @return 结果
     */
    public int deleteDepositByIds(Long[] ids);

    /**
     * 删除充值信息
     * 
     * @param id 充值主键
     * @return 结果
     */
    public int deleteDepositById(Long id);
}

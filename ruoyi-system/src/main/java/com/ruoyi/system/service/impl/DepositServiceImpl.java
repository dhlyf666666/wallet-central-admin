package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DepositMapper;
import com.ruoyi.system.domain.Deposit;
import com.ruoyi.system.service.IDepositService;

/**
 * 充值Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class DepositServiceImpl implements IDepositService 
{
    @Autowired
    private DepositMapper depositMapper;

    /**
     * 查询充值
     * 
     * @param id 充值主键
     * @return 充值
     */
    @Override
    public Deposit selectDepositById(Long id)
    {
        return depositMapper.selectDepositById(id);
    }

    /**
     * 查询充值列表
     * 
     * @param deposit 充值
     * @return 充值
     */
    @Override
    public List<Deposit> selectDepositList(Deposit deposit)
    {
        return depositMapper.selectDepositList(deposit);
    }

    /**
     * 新增充值
     * 
     * @param deposit 充值
     * @return 结果
     */
    @Override
    public int insertDeposit(Deposit deposit)
    {
        return depositMapper.insertDeposit(deposit);
    }

    /**
     * 修改充值
     * 
     * @param deposit 充值
     * @return 结果
     */
    @Override
    public int updateDeposit(Deposit deposit)
    {
        return depositMapper.updateDeposit(deposit);
    }

    /**
     * 批量删除充值
     * 
     * @param ids 需要删除的充值主键
     * @return 结果
     */
    @Override
    public int deleteDepositByIds(Long[] ids)
    {
        return depositMapper.deleteDepositByIds(ids);
    }

    /**
     * 删除充值信息
     * 
     * @param id 充值主键
     * @return 结果
     */
    @Override
    public int deleteDepositById(Long id)
    {
        return depositMapper.deleteDepositById(id);
    }
}

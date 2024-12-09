package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WithdrawMapper;
import com.ruoyi.system.domain.Withdraw;
import com.ruoyi.system.service.IWithdrawService;

/**
 * 提现Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class WithdrawServiceImpl implements IWithdrawService 
{
    @Autowired
    private WithdrawMapper withdrawMapper;

    /**
     * 查询提现
     * 
     * @param id 提现主键
     * @return 提现
     */
    @Override
    public Withdraw selectWithdrawById(Long id)
    {
        return withdrawMapper.selectWithdrawById(id);
    }

    /**
     * 查询提现列表
     * 
     * @param withdraw 提现
     * @return 提现
     */
    @Override
    public List<Withdraw> selectWithdrawList(Withdraw withdraw)
    {
        return withdrawMapper.selectWithdrawList(withdraw);
    }

    /**
     * 新增提现
     * 
     * @param withdraw 提现
     * @return 结果
     */
    @Override
    public int insertWithdraw(Withdraw withdraw)
    {
        return withdrawMapper.insertWithdraw(withdraw);
    }

    /**
     * 修改提现
     * 
     * @param withdraw 提现
     * @return 结果
     */
    @Override
    public int updateWithdraw(Withdraw withdraw)
    {
        return withdrawMapper.updateWithdraw(withdraw);
    }

    /**
     * 批量删除提现
     * 
     * @param ids 需要删除的提现主键
     * @return 结果
     */
    @Override
    public int deleteWithdrawByIds(Long[] ids)
    {
        return withdrawMapper.deleteWithdrawByIds(ids);
    }

    /**
     * 删除提现信息
     * 
     * @param id 提现主键
     * @return 结果
     */
    @Override
    public int deleteWithdrawById(Long id)
    {
        return withdrawMapper.deleteWithdrawById(id);
    }
}

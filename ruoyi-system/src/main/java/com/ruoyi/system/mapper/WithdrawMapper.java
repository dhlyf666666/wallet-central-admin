package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Withdraw;

/**
 * 提现Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface WithdrawMapper 
{
    /**
     * 查询提现
     * 
     * @param id 提现主键
     * @return 提现
     */
    public Withdraw selectWithdrawById(Long id);

    /**
     * 查询提现列表
     * 
     * @param withdraw 提现
     * @return 提现集合
     */
    public List<Withdraw> selectWithdrawList(Withdraw withdraw);

    /**
     * 新增提现
     * 
     * @param withdraw 提现
     * @return 结果
     */
    public int insertWithdraw(Withdraw withdraw);

    /**
     * 修改提现
     * 
     * @param withdraw 提现
     * @return 结果
     */
    public int updateWithdraw(Withdraw withdraw);

    /**
     * 删除提现
     * 
     * @param id 提现主键
     * @return 结果
     */
    public int deleteWithdrawById(Long id);

    /**
     * 批量删除提现
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWithdrawByIds(Long[] ids);
}

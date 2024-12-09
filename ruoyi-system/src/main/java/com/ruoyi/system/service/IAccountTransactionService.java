package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.AccountTransaction;

/**
 * 账户流水Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IAccountTransactionService 
{
    /**
     * 查询账户流水
     * 
     * @param id 账户流水主键
     * @return 账户流水
     */
    public AccountTransaction selectAccountTransactionById(Long id);

    /**
     * 查询账户流水列表
     * 
     * @param accountTransaction 账户流水
     * @return 账户流水集合
     */
    public List<AccountTransaction> selectAccountTransactionList(AccountTransaction accountTransaction);

    /**
     * 新增账户流水
     * 
     * @param accountTransaction 账户流水
     * @return 结果
     */
    public int insertAccountTransaction(AccountTransaction accountTransaction);

    /**
     * 修改账户流水
     * 
     * @param accountTransaction 账户流水
     * @return 结果
     */
    public int updateAccountTransaction(AccountTransaction accountTransaction);

    /**
     * 批量删除账户流水
     * 
     * @param ids 需要删除的账户流水主键集合
     * @return 结果
     */
    public int deleteAccountTransactionByIds(Long[] ids);

    /**
     * 删除账户流水信息
     * 
     * @param id 账户流水主键
     * @return 结果
     */
    public int deleteAccountTransactionById(Long id);
}

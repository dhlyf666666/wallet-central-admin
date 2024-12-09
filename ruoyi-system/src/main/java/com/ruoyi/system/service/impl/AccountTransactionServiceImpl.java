package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AccountTransactionMapper;
import com.ruoyi.system.domain.AccountTransaction;
import com.ruoyi.system.service.IAccountTransactionService;

/**
 * 账户流水Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class AccountTransactionServiceImpl implements IAccountTransactionService 
{
    @Autowired
    private AccountTransactionMapper accountTransactionMapper;

    /**
     * 查询账户流水
     * 
     * @param id 账户流水主键
     * @return 账户流水
     */
    @Override
    public AccountTransaction selectAccountTransactionById(Long id)
    {
        return accountTransactionMapper.selectAccountTransactionById(id);
    }

    /**
     * 查询账户流水列表
     * 
     * @param accountTransaction 账户流水
     * @return 账户流水
     */
    @Override
    public List<AccountTransaction> selectAccountTransactionList(AccountTransaction accountTransaction)
    {
        return accountTransactionMapper.selectAccountTransactionList(accountTransaction);
    }

    /**
     * 新增账户流水
     * 
     * @param accountTransaction 账户流水
     * @return 结果
     */
    @Override
    public int insertAccountTransaction(AccountTransaction accountTransaction)
    {
        return accountTransactionMapper.insertAccountTransaction(accountTransaction);
    }

    /**
     * 修改账户流水
     * 
     * @param accountTransaction 账户流水
     * @return 结果
     */
    @Override
    public int updateAccountTransaction(AccountTransaction accountTransaction)
    {
        return accountTransactionMapper.updateAccountTransaction(accountTransaction);
    }

    /**
     * 批量删除账户流水
     * 
     * @param ids 需要删除的账户流水主键
     * @return 结果
     */
    @Override
    public int deleteAccountTransactionByIds(Long[] ids)
    {
        return accountTransactionMapper.deleteAccountTransactionByIds(ids);
    }

    /**
     * 删除账户流水信息
     * 
     * @param id 账户流水主键
     * @return 结果
     */
    @Override
    public int deleteAccountTransactionById(Long id)
    {
        return accountTransactionMapper.deleteAccountTransactionById(id);
    }
}

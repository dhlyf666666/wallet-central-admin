package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Account;

/**
 * 账户Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IAccountService 
{
    /**
     * 查询账户
     * 
     * @param id 账户主键
     * @return 账户
     */
    public Account selectAccountById(Long id);

    /**
     * 查询账户列表
     * 
     * @param account 账户
     * @return 账户集合
     */
    public List<Account> selectAccountList(Account account);

    /**
     * 新增账户
     * 
     * @param account 账户
     * @return 结果
     */
    public int insertAccount(Account account);

    /**
     * 修改账户
     * 
     * @param account 账户
     * @return 结果
     */
    public int updateAccount(Account account);

    /**
     * 批量删除账户
     * 
     * @param ids 需要删除的账户主键集合
     * @return 结果
     */
    public int deleteAccountByIds(Long[] ids);

    /**
     * 删除账户信息
     * 
     * @param id 账户主键
     * @return 结果
     */
    public int deleteAccountById(Long id);
}

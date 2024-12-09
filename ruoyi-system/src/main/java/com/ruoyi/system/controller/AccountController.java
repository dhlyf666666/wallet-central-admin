package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Account;
import com.ruoyi.system.service.IAccountService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 账户Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/account")
public class AccountController extends BaseController
{
    @Autowired
    private IAccountService accountService;

    /**
     * 查询账户列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:list')")
    @GetMapping("/list")
    public TableDataInfo list(Account account)
    {
        startPage();
        List<Account> list = accountService.selectAccountList(account);
        return getDataTable(list);
    }

    /**
     * 导出账户列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:export')")
    @Log(title = "账户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Account account)
    {
        List<Account> list = accountService.selectAccountList(account);
        ExcelUtil<Account> util = new ExcelUtil<Account>(Account.class);
        util.exportExcel(response, list, "账户数据");
    }

    /**
     * 获取账户详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(accountService.selectAccountById(id));
    }

    /**
     * 新增账户
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:add')")
    @Log(title = "账户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Account account)
    {
        return toAjax(accountService.insertAccount(account));
    }

    /**
     * 修改账户
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:edit')")
    @Log(title = "账户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Account account)
    {
        return toAjax(accountService.updateAccount(account));
    }

    /**
     * 删除账户
     */
    @PreAuthorize("@ss.hasPermi('wallet:account:remove')")
    @Log(title = "账户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(accountService.deleteAccountByIds(ids));
    }
}

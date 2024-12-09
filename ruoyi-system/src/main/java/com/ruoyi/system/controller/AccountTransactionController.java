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
import com.ruoyi.system.domain.AccountTransaction;
import com.ruoyi.system.service.IAccountTransactionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 账户流水Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/transaction")
public class AccountTransactionController extends BaseController
{
    @Autowired
    private IAccountTransactionService accountTransactionService;

    /**
     * 查询账户流水列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:list')")
    @GetMapping("/list")
    public TableDataInfo list(AccountTransaction accountTransaction)
    {
        startPage();
        List<AccountTransaction> list = accountTransactionService.selectAccountTransactionList(accountTransaction);
        return getDataTable(list);
    }

    /**
     * 导出账户流水列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:export')")
    @Log(title = "账户流水", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AccountTransaction accountTransaction)
    {
        List<AccountTransaction> list = accountTransactionService.selectAccountTransactionList(accountTransaction);
        ExcelUtil<AccountTransaction> util = new ExcelUtil<AccountTransaction>(AccountTransaction.class);
        util.exportExcel(response, list, "账户流水数据");
    }

    /**
     * 获取账户流水详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(accountTransactionService.selectAccountTransactionById(id));
    }

    /**
     * 新增账户流水
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:add')")
    @Log(title = "账户流水", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AccountTransaction accountTransaction)
    {
        return toAjax(accountTransactionService.insertAccountTransaction(accountTransaction));
    }

    /**
     * 修改账户流水
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:edit')")
    @Log(title = "账户流水", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AccountTransaction accountTransaction)
    {
        return toAjax(accountTransactionService.updateAccountTransaction(accountTransaction));
    }

    /**
     * 删除账户流水
     */
    @PreAuthorize("@ss.hasPermi('wallet:transaction:remove')")
    @Log(title = "账户流水", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(accountTransactionService.deleteAccountTransactionByIds(ids));
    }
}

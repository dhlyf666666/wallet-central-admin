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
import com.ruoyi.system.domain.Deposit;
import com.ruoyi.system.service.IDepositService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充值Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/deposit")
public class DepositController extends BaseController
{
    @Autowired
    private IDepositService depositService;

    /**
     * 查询充值列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:list')")
    @GetMapping("/list")
    public TableDataInfo list(Deposit deposit)
    {
        startPage();
        List<Deposit> list = depositService.selectDepositList(deposit);
        return getDataTable(list);
    }

    /**
     * 导出充值列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:export')")
    @Log(title = "充值", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Deposit deposit)
    {
        List<Deposit> list = depositService.selectDepositList(deposit);
        ExcelUtil<Deposit> util = new ExcelUtil<Deposit>(Deposit.class);
        util.exportExcel(response, list, "充值数据");
    }

    /**
     * 获取充值详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(depositService.selectDepositById(id));
    }

    /**
     * 新增充值
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:add')")
    @Log(title = "充值", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Deposit deposit)
    {
        return toAjax(depositService.insertDeposit(deposit));
    }

    /**
     * 修改充值
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:edit')")
    @Log(title = "充值", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Deposit deposit)
    {
        return toAjax(depositService.updateDeposit(deposit));
    }

    /**
     * 删除充值
     */
    @PreAuthorize("@ss.hasPermi('wallet:deposit:remove')")
    @Log(title = "充值", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(depositService.deleteDepositByIds(ids));
    }
}

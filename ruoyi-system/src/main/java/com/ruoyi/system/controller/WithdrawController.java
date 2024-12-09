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
import com.ruoyi.system.domain.Withdraw;
import com.ruoyi.system.service.IWithdrawService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 提现Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/withdraw")
public class WithdrawController extends BaseController
{
    @Autowired
    private IWithdrawService withdrawService;

    /**
     * 查询提现列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:list')")
    @GetMapping("/list")
    public TableDataInfo list(Withdraw withdraw)
    {
        startPage();
        List<Withdraw> list = withdrawService.selectWithdrawList(withdraw);
        return getDataTable(list);
    }

    /**
     * 导出提现列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:export')")
    @Log(title = "提现", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Withdraw withdraw)
    {
        List<Withdraw> list = withdrawService.selectWithdrawList(withdraw);
        ExcelUtil<Withdraw> util = new ExcelUtil<Withdraw>(Withdraw.class);
        util.exportExcel(response, list, "提现数据");
    }

    /**
     * 获取提现详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(withdrawService.selectWithdrawById(id));
    }

    /**
     * 新增提现
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:add')")
    @Log(title = "提现", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Withdraw withdraw)
    {
        return toAjax(withdrawService.insertWithdraw(withdraw));
    }

    /**
     * 修改提现
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:edit')")
    @Log(title = "提现", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Withdraw withdraw)
    {
        return toAjax(withdrawService.updateWithdraw(withdraw));
    }

    /**
     * 删除提现
     */
    @PreAuthorize("@ss.hasPermi('wallet:withdraw:remove')")
    @Log(title = "提现", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(withdrawService.deleteWithdrawByIds(ids));
    }
}

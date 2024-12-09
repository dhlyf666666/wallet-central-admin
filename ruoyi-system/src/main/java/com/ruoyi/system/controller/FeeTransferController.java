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
import com.ruoyi.system.domain.FeeTransfer;
import com.ruoyi.system.service.IFeeTransferService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 手续费转账Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/transfer")
public class FeeTransferController extends BaseController
{
    @Autowired
    private IFeeTransferService feeTransferService;

    /**
     * 查询手续费转账列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:list')")
    @GetMapping("/list")
    public TableDataInfo list(FeeTransfer feeTransfer)
    {
        startPage();
        List<FeeTransfer> list = feeTransferService.selectFeeTransferList(feeTransfer);
        return getDataTable(list);
    }

    /**
     * 导出手续费转账列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:export')")
    @Log(title = "手续费转账", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FeeTransfer feeTransfer)
    {
        List<FeeTransfer> list = feeTransferService.selectFeeTransferList(feeTransfer);
        ExcelUtil<FeeTransfer> util = new ExcelUtil<FeeTransfer>(FeeTransfer.class);
        util.exportExcel(response, list, "手续费转账数据");
    }

    /**
     * 获取手续费转账详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(feeTransferService.selectFeeTransferById(id));
    }

    /**
     * 新增手续费转账
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:add')")
    @Log(title = "手续费转账", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FeeTransfer feeTransfer)
    {
        return toAjax(feeTransferService.insertFeeTransfer(feeTransfer));
    }

    /**
     * 修改手续费转账
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:edit')")
    @Log(title = "手续费转账", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FeeTransfer feeTransfer)
    {
        return toAjax(feeTransferService.updateFeeTransfer(feeTransfer));
    }

    /**
     * 删除手续费转账
     */
    @PreAuthorize("@ss.hasPermi('wallet:transfer:remove')")
    @Log(title = "手续费转账", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(feeTransferService.deleteFeeTransferByIds(ids));
    }
}

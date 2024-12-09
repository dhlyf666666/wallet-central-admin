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
import com.ruoyi.system.domain.Notify;
import com.ruoyi.system.service.INotifyService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通知Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/notify")
public class NotifyController extends BaseController
{
    @Autowired
    private INotifyService notifyService;

    /**
     * 查询通知列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:list')")
    @GetMapping("/list")
    public TableDataInfo list(Notify notify)
    {
        startPage();
        List<Notify> list = notifyService.selectNotifyList(notify);
        return getDataTable(list);
    }

    /**
     * 导出通知列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:export')")
    @Log(title = "通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Notify notify)
    {
        List<Notify> list = notifyService.selectNotifyList(notify);
        ExcelUtil<Notify> util = new ExcelUtil<Notify>(Notify.class);
        util.exportExcel(response, list, "通知数据");
    }

    /**
     * 获取通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(notifyService.selectNotifyById(id));
    }

    /**
     * 新增通知
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:add')")
    @Log(title = "通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Notify notify)
    {
        return toAjax(notifyService.insertNotify(notify));
    }

    /**
     * 修改通知
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:edit')")
    @Log(title = "通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Notify notify)
    {
        return toAjax(notifyService.updateNotify(notify));
    }

    /**
     * 删除通知
     */
    @PreAuthorize("@ss.hasPermi('wallet:notify:remove')")
    @Log(title = "通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(notifyService.deleteNotifyByIds(ids));
    }
}

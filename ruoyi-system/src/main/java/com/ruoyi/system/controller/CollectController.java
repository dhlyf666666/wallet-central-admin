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
import com.ruoyi.system.domain.Collect;
import com.ruoyi.system.service.ICollectService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 归集Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/collect")
public class CollectController extends BaseController
{
    @Autowired
    private ICollectService collectService;

    /**
     * 查询归集列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:list')")
    @GetMapping("/list")
    public TableDataInfo list(Collect collect)
    {
        startPage();
        List<Collect> list = collectService.selectCollectList(collect);
        return getDataTable(list);
    }

    /**
     * 导出归集列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:export')")
    @Log(title = "归集", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Collect collect)
    {
        List<Collect> list = collectService.selectCollectList(collect);
        ExcelUtil<Collect> util = new ExcelUtil<Collect>(Collect.class);
        util.exportExcel(response, list, "归集数据");
    }

    /**
     * 获取归集详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(collectService.selectCollectById(id));
    }

    /**
     * 新增归集
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:add')")
    @Log(title = "归集", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Collect collect)
    {
        return toAjax(collectService.insertCollect(collect));
    }

    /**
     * 修改归集
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:edit')")
    @Log(title = "归集", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Collect collect)
    {
        return toAjax(collectService.updateCollect(collect));
    }

    /**
     * 删除归集
     */
    @PreAuthorize("@ss.hasPermi('wallet:collect:remove')")
    @Log(title = "归集", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(collectService.deleteCollectByIds(ids));
    }
}

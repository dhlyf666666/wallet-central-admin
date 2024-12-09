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
import com.ruoyi.system.domain.Coin;
import com.ruoyi.system.service.ICoinService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 币种Controller
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@RestController
@RequestMapping("/wallet/coin")
public class CoinController extends BaseController
{
    @Autowired
    private ICoinService coinService;

    /**
     * 查询币种列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:list')")
    @GetMapping("/list")
    public TableDataInfo list(Coin coin)
    {
        startPage();
        List<Coin> list = coinService.selectCoinList(coin);
        return getDataTable(list);
    }

    /**
     * 导出币种列表
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:export')")
    @Log(title = "币种", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Coin coin)
    {
        List<Coin> list = coinService.selectCoinList(coin);
        ExcelUtil<Coin> util = new ExcelUtil<Coin>(Coin.class);
        util.exportExcel(response, list, "币种数据");
    }

    /**
     * 获取币种详细信息
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(coinService.selectCoinById(id));
    }

    /**
     * 新增币种
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:add')")
    @Log(title = "币种", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Coin coin)
    {
        return toAjax(coinService.insertCoin(coin));
    }

    /**
     * 修改币种
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:edit')")
    @Log(title = "币种", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Coin coin)
    {
        return toAjax(coinService.updateCoin(coin));
    }

    /**
     * 删除币种
     */
    @PreAuthorize("@ss.hasPermi('wallet:coin:remove')")
    @Log(title = "币种", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(coinService.deleteCoinByIds(ids));
    }
}

package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Coin;

/**
 * 币种Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface ICoinService 
{
    /**
     * 查询币种
     * 
     * @param id 币种主键
     * @return 币种
     */
    public Coin selectCoinById(Long id);

    /**
     * 查询币种列表
     * 
     * @param coin 币种
     * @return 币种集合
     */
    public List<Coin> selectCoinList(Coin coin);

    /**
     * 新增币种
     * 
     * @param coin 币种
     * @return 结果
     */
    public int insertCoin(Coin coin);

    /**
     * 修改币种
     * 
     * @param coin 币种
     * @return 结果
     */
    public int updateCoin(Coin coin);

    /**
     * 批量删除币种
     * 
     * @param ids 需要删除的币种主键集合
     * @return 结果
     */
    public int deleteCoinByIds(Long[] ids);

    /**
     * 删除币种信息
     * 
     * @param id 币种主键
     * @return 结果
     */
    public int deleteCoinById(Long id);
}

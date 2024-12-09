package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CoinMapper;
import com.ruoyi.system.domain.Coin;
import com.ruoyi.system.service.ICoinService;

/**
 * 币种Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class CoinServiceImpl implements ICoinService 
{
    @Autowired
    private CoinMapper coinMapper;

    /**
     * 查询币种
     * 
     * @param id 币种主键
     * @return 币种
     */
    @Override
    public Coin selectCoinById(Long id)
    {
        return coinMapper.selectCoinById(id);
    }

    /**
     * 查询币种列表
     * 
     * @param coin 币种
     * @return 币种
     */
    @Override
    public List<Coin> selectCoinList(Coin coin)
    {
        return coinMapper.selectCoinList(coin);
    }

    /**
     * 新增币种
     * 
     * @param coin 币种
     * @return 结果
     */
    @Override
    public int insertCoin(Coin coin)
    {
        return coinMapper.insertCoin(coin);
    }

    /**
     * 修改币种
     * 
     * @param coin 币种
     * @return 结果
     */
    @Override
    public int updateCoin(Coin coin)
    {
        return coinMapper.updateCoin(coin);
    }

    /**
     * 批量删除币种
     * 
     * @param ids 需要删除的币种主键
     * @return 结果
     */
    @Override
    public int deleteCoinByIds(Long[] ids)
    {
        return coinMapper.deleteCoinByIds(ids);
    }

    /**
     * 删除币种信息
     * 
     * @param id 币种主键
     * @return 结果
     */
    @Override
    public int deleteCoinById(Long id)
    {
        return coinMapper.deleteCoinById(id);
    }
}

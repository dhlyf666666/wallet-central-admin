package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CollectMapper;
import com.ruoyi.system.domain.Collect;
import com.ruoyi.system.service.ICollectService;

/**
 * 归集Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class CollectServiceImpl implements ICollectService 
{
    @Autowired
    private CollectMapper collectMapper;

    /**
     * 查询归集
     * 
     * @param id 归集主键
     * @return 归集
     */
    @Override
    public Collect selectCollectById(Long id)
    {
        return collectMapper.selectCollectById(id);
    }

    /**
     * 查询归集列表
     * 
     * @param collect 归集
     * @return 归集
     */
    @Override
    public List<Collect> selectCollectList(Collect collect)
    {
        return collectMapper.selectCollectList(collect);
    }

    /**
     * 新增归集
     * 
     * @param collect 归集
     * @return 结果
     */
    @Override
    public int insertCollect(Collect collect)
    {
        return collectMapper.insertCollect(collect);
    }

    /**
     * 修改归集
     * 
     * @param collect 归集
     * @return 结果
     */
    @Override
    public int updateCollect(Collect collect)
    {
        return collectMapper.updateCollect(collect);
    }

    /**
     * 批量删除归集
     * 
     * @param ids 需要删除的归集主键
     * @return 结果
     */
    @Override
    public int deleteCollectByIds(Long[] ids)
    {
        return collectMapper.deleteCollectByIds(ids);
    }

    /**
     * 删除归集信息
     * 
     * @param id 归集主键
     * @return 结果
     */
    @Override
    public int deleteCollectById(Long id)
    {
        return collectMapper.deleteCollectById(id);
    }
}

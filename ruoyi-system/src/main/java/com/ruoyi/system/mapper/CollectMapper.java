package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Collect;

/**
 * 归集Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface CollectMapper 
{
    /**
     * 查询归集
     * 
     * @param id 归集主键
     * @return 归集
     */
    public Collect selectCollectById(Long id);

    /**
     * 查询归集列表
     * 
     * @param collect 归集
     * @return 归集集合
     */
    public List<Collect> selectCollectList(Collect collect);

    /**
     * 新增归集
     * 
     * @param collect 归集
     * @return 结果
     */
    public int insertCollect(Collect collect);

    /**
     * 修改归集
     * 
     * @param collect 归集
     * @return 结果
     */
    public int updateCollect(Collect collect);

    /**
     * 删除归集
     * 
     * @param id 归集主键
     * @return 结果
     */
    public int deleteCollectById(Long id);

    /**
     * 批量删除归集
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCollectByIds(Long[] ids);
}

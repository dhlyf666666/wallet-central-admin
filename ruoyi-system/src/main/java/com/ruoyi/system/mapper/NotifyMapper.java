package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Notify;

/**
 * 通知Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface NotifyMapper 
{
    /**
     * 查询通知
     * 
     * @param id 通知主键
     * @return 通知
     */
    public Notify selectNotifyById(Long id);

    /**
     * 查询通知列表
     * 
     * @param notify 通知
     * @return 通知集合
     */
    public List<Notify> selectNotifyList(Notify notify);

    /**
     * 新增通知
     * 
     * @param notify 通知
     * @return 结果
     */
    public int insertNotify(Notify notify);

    /**
     * 修改通知
     * 
     * @param notify 通知
     * @return 结果
     */
    public int updateNotify(Notify notify);

    /**
     * 删除通知
     * 
     * @param id 通知主键
     * @return 结果
     */
    public int deleteNotifyById(Long id);

    /**
     * 批量删除通知
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNotifyByIds(Long[] ids);
}

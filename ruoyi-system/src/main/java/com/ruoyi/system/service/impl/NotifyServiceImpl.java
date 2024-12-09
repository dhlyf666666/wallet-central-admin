package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NotifyMapper;
import com.ruoyi.system.domain.Notify;
import com.ruoyi.system.service.INotifyService;

/**
 * 通知Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class NotifyServiceImpl implements INotifyService 
{
    @Autowired
    private NotifyMapper notifyMapper;

    /**
     * 查询通知
     * 
     * @param id 通知主键
     * @return 通知
     */
    @Override
    public Notify selectNotifyById(Long id)
    {
        return notifyMapper.selectNotifyById(id);
    }

    /**
     * 查询通知列表
     * 
     * @param notify 通知
     * @return 通知
     */
    @Override
    public List<Notify> selectNotifyList(Notify notify)
    {
        return notifyMapper.selectNotifyList(notify);
    }

    /**
     * 新增通知
     * 
     * @param notify 通知
     * @return 结果
     */
    @Override
    public int insertNotify(Notify notify)
    {
        return notifyMapper.insertNotify(notify);
    }

    /**
     * 修改通知
     * 
     * @param notify 通知
     * @return 结果
     */
    @Override
    public int updateNotify(Notify notify)
    {
        return notifyMapper.updateNotify(notify);
    }

    /**
     * 批量删除通知
     * 
     * @param ids 需要删除的通知主键
     * @return 结果
     */
    @Override
    public int deleteNotifyByIds(Long[] ids)
    {
        return notifyMapper.deleteNotifyByIds(ids);
    }

    /**
     * 删除通知信息
     * 
     * @param id 通知主键
     * @return 结果
     */
    @Override
    public int deleteNotifyById(Long id)
    {
        return notifyMapper.deleteNotifyById(id);
    }
}

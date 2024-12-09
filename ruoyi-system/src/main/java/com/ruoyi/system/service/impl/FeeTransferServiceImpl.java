package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FeeTransferMapper;
import com.ruoyi.system.domain.FeeTransfer;
import com.ruoyi.system.service.IFeeTransferService;

/**
 * 手续费转账Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class FeeTransferServiceImpl implements IFeeTransferService 
{
    @Autowired
    private FeeTransferMapper feeTransferMapper;

    /**
     * 查询手续费转账
     * 
     * @param id 手续费转账主键
     * @return 手续费转账
     */
    @Override
    public FeeTransfer selectFeeTransferById(Long id)
    {
        return feeTransferMapper.selectFeeTransferById(id);
    }

    /**
     * 查询手续费转账列表
     * 
     * @param feeTransfer 手续费转账
     * @return 手续费转账
     */
    @Override
    public List<FeeTransfer> selectFeeTransferList(FeeTransfer feeTransfer)
    {
        return feeTransferMapper.selectFeeTransferList(feeTransfer);
    }

    /**
     * 新增手续费转账
     * 
     * @param feeTransfer 手续费转账
     * @return 结果
     */
    @Override
    public int insertFeeTransfer(FeeTransfer feeTransfer)
    {
        return feeTransferMapper.insertFeeTransfer(feeTransfer);
    }

    /**
     * 修改手续费转账
     * 
     * @param feeTransfer 手续费转账
     * @return 结果
     */
    @Override
    public int updateFeeTransfer(FeeTransfer feeTransfer)
    {
        return feeTransferMapper.updateFeeTransfer(feeTransfer);
    }

    /**
     * 批量删除手续费转账
     * 
     * @param ids 需要删除的手续费转账主键
     * @return 结果
     */
    @Override
    public int deleteFeeTransferByIds(Long[] ids)
    {
        return feeTransferMapper.deleteFeeTransferByIds(ids);
    }

    /**
     * 删除手续费转账信息
     * 
     * @param id 手续费转账主键
     * @return 结果
     */
    @Override
    public int deleteFeeTransferById(Long id)
    {
        return feeTransferMapper.deleteFeeTransferById(id);
    }
}

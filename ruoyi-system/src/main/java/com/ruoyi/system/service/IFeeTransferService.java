package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.FeeTransfer;

/**
 * 手续费转账Service接口
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
public interface IFeeTransferService 
{
    /**
     * 查询手续费转账
     * 
     * @param id 手续费转账主键
     * @return 手续费转账
     */
    public FeeTransfer selectFeeTransferById(Long id);

    /**
     * 查询手续费转账列表
     * 
     * @param feeTransfer 手续费转账
     * @return 手续费转账集合
     */
    public List<FeeTransfer> selectFeeTransferList(FeeTransfer feeTransfer);

    /**
     * 新增手续费转账
     * 
     * @param feeTransfer 手续费转账
     * @return 结果
     */
    public int insertFeeTransfer(FeeTransfer feeTransfer);

    /**
     * 修改手续费转账
     * 
     * @param feeTransfer 手续费转账
     * @return 结果
     */
    public int updateFeeTransfer(FeeTransfer feeTransfer);

    /**
     * 批量删除手续费转账
     * 
     * @param ids 需要删除的手续费转账主键集合
     * @return 结果
     */
    public int deleteFeeTransferByIds(Long[] ids);

    /**
     * 删除手续费转账信息
     * 
     * @param id 手续费转账主键
     * @return 结果
     */
    public int deleteFeeTransferById(Long id);
}

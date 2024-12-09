package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AddressMapper;
import com.ruoyi.system.domain.Address;
import com.ruoyi.system.service.IAddressService;

/**
 * 地址Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-26
 */
@Service
public class AddressServiceImpl implements IAddressService 
{
    @Autowired
    private AddressMapper addressMapper;

    /**
     * 查询地址
     * 
     * @param id 地址主键
     * @return 地址
     */
    @Override
    public Address selectAddressById(Long id)
    {
        return addressMapper.selectAddressById(id);
    }

    /**
     * 查询地址列表
     * 
     * @param address 地址
     * @return 地址
     */
    @Override
    public List<Address> selectAddressList(Address address)
    {
        return addressMapper.selectAddressList(address);
    }

    /**
     * 新增地址
     * 
     * @param address 地址
     * @return 结果
     */
    @Override
    public int insertAddress(Address address)
    {
        return addressMapper.insertAddress(address);
    }

    /**
     * 修改地址
     * 
     * @param address 地址
     * @return 结果
     */
    @Override
    public int updateAddress(Address address)
    {
        return addressMapper.updateAddress(address);
    }

    /**
     * 批量删除地址
     * 
     * @param ids 需要删除的地址主键
     * @return 结果
     */
    @Override
    public int deleteAddressByIds(Long[] ids)
    {
        return addressMapper.deleteAddressByIds(ids);
    }

    /**
     * 删除地址信息
     * 
     * @param id 地址主键
     * @return 结果
     */
    @Override
    public int deleteAddressById(Long id)
    {
        return addressMapper.deleteAddressById(id);
    }
}

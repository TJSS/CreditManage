package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.ShopUserPojo;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface ShopUserDao {
    /**
     * 添加商店用户
     * @param shopUserPojo
     * @return
     */
    public boolean addShopUser(ShopUserPojo shopUserPojo);

    /**
     * 更新商店用户
     * @param shopUserPojo
     * @return
     */
    public boolean updateShopUser(ShopUserPojo shopUserPojo);

    /**
     * 删除商店用户
     * @param shopUserPojo
     * @return
     */
    public boolean deleteShopUser(ShopUserPojo shopUserPojo);

    /**
     * 查询商店用户
     * @param username
     * @return
     */
    public List<ShopUserPojo> queryShopUser(String username);
}

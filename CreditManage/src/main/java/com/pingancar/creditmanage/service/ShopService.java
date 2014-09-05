package com.pingancar.creditmanage.service;

import com.pingancar.creditmanage.dao.ShopUserDao;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface ShopService {
    /**
     * 登录
     * @param shopUserPojo
     * @return
     */
    public boolean login(ShopUserPojo shopUserPojo);

    /**
     * 添加商店信息
     * @param shopInfoPojo
     * @return
     */
    public boolean addShopInfo(ShopInfoPojo shopInfoPojo);
    /**
     * 更新商店信息
     * @param shopInfoPojo
     * @return
     */
    public boolean updateShopInfo(ShopInfoPojo shopInfoPojo);

    /**
     * 删除商店信息
     * @param shopInfoPojo
     * @return
     */
    public boolean deleteShopInfo(ShopInfoPojo shopInfoPojo);

    /**
     * 查询商店信息
     * @param shopInfoFieldList
     * @param valueList
     * @return
     */
    public List<ShopInfoPojo> queryShopInfo(List<ShopInfoField> shopInfoFieldList, List<String> valueList);

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
}

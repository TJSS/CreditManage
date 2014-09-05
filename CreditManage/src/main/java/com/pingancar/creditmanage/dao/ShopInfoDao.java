package com.pingancar.creditmanage.dao;

import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public interface ShopInfoDao {
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
}

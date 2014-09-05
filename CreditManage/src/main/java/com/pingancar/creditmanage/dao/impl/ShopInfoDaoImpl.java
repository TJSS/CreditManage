package com.pingancar.creditmanage.dao.impl;

import com.pingancar.creditmanage.dao.ShopInfoDao;
import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class ShopInfoDaoImpl implements ShopInfoDao{
    @Override
    public boolean addShopInfo(ShopInfoPojo shopInfoPojo) {
        return false;
    }

    @Override
    public boolean updateShopInfo(ShopInfoPojo shopInfoPojo) {
        return false;
    }

    @Override
    public boolean deleteShopInfo(ShopInfoPojo shopInfoPojo) {
        return false;
    }

    @Override
    public List<ShopInfoPojo> queryShopInfo(List<ShopInfoField> shopInfoFieldList, List<String> valueList) {
        return null;
    }
}

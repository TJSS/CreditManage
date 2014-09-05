package com.pingancar.creditmanage.service.impl;

import com.pingancar.creditmanage.pojo.ShopInfoPojo;
import com.pingancar.creditmanage.pojo.ShopUserPojo;
import com.pingancar.creditmanage.service.ShopService;
import com.pingancar.creditmanage.util.myenum.ShopInfoField;

import java.util.List;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public class ShopServiceImpl implements ShopService {
    @Override
    public boolean login(ShopUserPojo shopUserPojo) {
        return false;
    }

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

    @Override
    public boolean addShopUser(ShopUserPojo shopUserPojo) {
        return false;
    }

    @Override
    public boolean updateShopUser(ShopUserPojo shopUserPojo) {
        return false;
    }

    @Override
    public boolean deleteShopUser(ShopUserPojo shopUserPojo) {
        return false;
    }
}

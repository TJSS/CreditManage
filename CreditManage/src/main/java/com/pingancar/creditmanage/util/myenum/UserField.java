package com.pingancar.creditmanage.util.myenum;

/**
 * Created by Administrator on 2014/9/6 0006.
 */
public enum UserField {
    /**
     * 用户名
     */
    USERNAME("用户名"),
    /**
     * 车牌号
     */
    CARNUMBER("车牌号"),
    /**
     * 被保人
     */
    INSURED("被保人"),
    /**
     * 车主
     */
    CAROWNER("车主");

    String name;

    UserField(String value) {
        this.name = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserField changeNameToEnum(String name) {
        UserField[] values = values();
        for (UserField oneValue : values) {
            if (oneValue.getName().equals(name)) {
                return oneValue;
            }
        }
        return null;
    }
}

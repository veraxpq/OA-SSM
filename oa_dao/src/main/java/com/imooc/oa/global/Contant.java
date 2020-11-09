package com.imooc.oa.global;

import java.util.ArrayList;
import java.util.List;

public class Contant {
    //职务
    public static final String POST_STAFF="staff";
    public static final String POST_FM="manager";
    public static final String POST_GM="general manager";
    public static final String POST_CASHIER="cashier";
    public List<String> getPost() {
        List<String> list = new ArrayList<String>();
        list.add(POST_STAFF);
        list.add(POST_FM);
        list.add(POST_GM);
        list.add(POST_CASHIER);
        return list;
    }

    //费用类别
    public List<String> getItems() {
        List<String> list = new ArrayList<String>();
        list.add("transportation");
        list.add("dinner");
        list.add("hotel");
        list.add("office");
        return list;
    }

    //报销单状态
    public static final String CLAIMVOUCHER_CREATED = "new created";
    public static final String CLAIMVOUCHER_SUBMIT = "submitted";
    public static final String CLAIMVOUCHER_APPROVED = "approved";
    public static final String CLAIMVOUCHER_BACK = "back";
    public static final String CLAIMVOUCHER_TERMINATED = "terminated";
    public static final String CLAIMVOUCHER_RECHECKED = "recheck";
    public static final String CLAIMVOUCHER_PAID = "paid";
    //审核额度
    public static final double LIMIT_CHECK = 5000.00;
    //处理方式
    public static final String DEAL_CREATE = "create";
    public static final String DEAL_SUBMIT = "submit";
    public static final String DEAL_UPDATE = "update";
    public static final String DEAL_BACK = "back";
    public static final String DEAL_REJECT = "reject";
    public static final String DEAL_PASS = "pass";
    public static final String DEAL_PAID = "paid";

}

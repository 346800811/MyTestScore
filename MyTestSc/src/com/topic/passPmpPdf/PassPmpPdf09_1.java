package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P217~）
 * 第八章 测试题2
 * 
 * @author JianDe
 */
public class PassPmpPdf09_1 extends BaseTest {
    public PassPmpPdf09_1(String result) {
        super("DDBDBACCDCADBABADDAD");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf09_1(null);
        pm1.test("DDBDB ACCDC ADBAB ADDAD"); // 2018-02-05 11:03 100%
    }

}
/*
 * 
 * 
 */

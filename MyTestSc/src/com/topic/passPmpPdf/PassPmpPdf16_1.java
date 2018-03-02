package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P488~501）
 * 
 * @author JianDe
 */
public class PassPmpPdf16_1 extends BaseTest {
    public PassPmpPdf16_1(String result) {
        super("DABACDCBCCCBBBADCDCD");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf16_1(null);
        pm1.test("DADACDCBCD CBBBADCDCD"); // 2018-02-26
    }

}
/*
 * 3．答案：B。体现遵守职业道德的一致性，这是对新员工教育的良好机会。项目管理从业人员应遵从之前受雇公司的保密规定，这意味着他在进入下一个公司时也应保守本公司的机密。
 * 
 * 10．答案：C。职业职责要求对任何可能使客户的合法权益受到侵犯的行为进行调查。如果发生了这种侵犯的情况，必须采取措施。
 * 
 */

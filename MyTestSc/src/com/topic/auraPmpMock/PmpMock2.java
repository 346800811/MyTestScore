package com.topic.auraPmpMock;

import com.base.BaseTest;

/**
 * 光环HD1801班1模
 * 
 * @author JianDe
 */
public class PmpMock2 extends BaseTest {
    public PmpMock2(String result) {
        super("DBBADACDDACCCBCBBABACDDDDBBDAACCDDCCCBCCACDAAABACBCBBDDDCBBCBBCDDABAAADDDCBABDCAAADAABBDDABCBDCCBBAA"
                + "DAAABADCBBBABAAACBBCDAAAACBABACCCADBDAACCAACCBABBDBCBBAABCADCAACBDABBADDAACCDCBACADDACABBBBCCCADCDBC");
    }

    public static void main(String[] args) {
        PmpMock2 pm1 = new PmpMock2(null);
        System.out.println("2018-03-04");
        String re1 = ""
                + "";
        pm1.test(re1);
    }

}

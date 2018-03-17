package com.topic.auraPmpMock;

import com.base.BaseTest;

/**
 * PMP考前冲刺题（前311道中英文）
 * 
 * @author JianDe
 */
public class PmpEndMock1 extends BaseTest {
    public PmpEndMock1(String result) {
        super("DDDDDDDCCCCCCCCCCBBBBBAAAAAADCCACCCCBBBBBBACCCBCAC"
                + "CADADDDDBCBDACDBDDDBDDCABCABACACACBDAADADDBBBBCBDD"
                + "CBCBBDADBABBDAABBCACCACDCCACCBBADCDDAAAACCABCDCDBD"
                + "DABBDCCCAACAABADADAADBADCBBCDADABABBDCABBCCDCDBACA"
                + "BCCDACBBACCCCCCCCBCCBAABAABCACBBDADCAABADDADADABAA"
                + "ABDABDBBCACDCABBCACBDCDBABDDCDACDCDACDBCCAAAABBCBD" + "CBDDDADBCDC");
    }

    public static void main(String[] args) {
        PmpEndMock1 pm1 = new PmpEndMock1(null);
        System.out.println("2018-03-17");
        String re1 = "DDDDDBDCCCCCCCCCCBBBBBBAAAAADCCBCCBCDBBBBBACCCCCAC "
                + "AABCADDDBCBDACDBDDDBDDCABCDBACACDCBDAAAADDDBCBAADD " + "CBCBD";
        pm1.test(re1);
    }

}

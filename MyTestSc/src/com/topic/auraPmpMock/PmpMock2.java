package com.topic.auraPmpMock;

import com.base.BaseTest;

/**
 * 光环HD1801班2模
 * 
 * @author JianDe
 */
public class PmpMock2 extends BaseTest {
    public PmpMock2() {
        super("DBBADACDDACCCBCBBABACDDDDBBDAACCDDCCCBCCACDAAABACBCBBDDDCBBCBBCDDABAAADDDCBABDCAAADAABBDDABCBDCCBBAA"
                + "DAAABADCBBBABAAACBBCDAAAACBABACCCADBDAACCAACCBABBDBCBBAABCADCAACBDABBADDAACCDCBACADDACABBBBCCCADCDBC");
    }

    public static void main(String[] args) {
        PmpMock2 pm1 = new PmpMock2();
        System.out.println("2018-03-04");
        String re1 = "DBDCDABDDACCBBCBDABB ADDBDABDAACDDDCCDDBC CBACABADDBCBBDDBABBC DADBCCCACADBDADABDBA AAAAABBDDABCBDCBBCBA "
                + "DCAABBDCBBBABDADCBBC CDBAACCCBCCCCDDBDBAC AACCCBABCBBADAAABCAD DBCCDDABABCBCACDACCB CADBABDABBBCCCBDCCAC";
        pm1.test(re1);
    }

}

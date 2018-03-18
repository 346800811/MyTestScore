package com.topic.auraPmpMock;

import com.base.BaseTest;

/**
 * PMP考前冲刺题（后135道中文）
 * 
 * @author JianDe
 */
public class PmpEndMock2 extends BaseTest {
    public PmpEndMock2() {
        super("BDABDAAABBCBACCACBABBBBCBDDDCCDCCBBDDDCACDBCABAABC"
                + "DDBBABADAAACABCDCCDDCDDBBACBDAABADCCADACCADBDBDCAB" + "BDCDACADBBADCDDCCAACDCAADBCDBABBCDD");
    }

    public static void main(String[] args) {
        PmpEndMock2 pm1 = new PmpEndMock2();
        System.out.println("2018-03-18");
        String re1 = "" + " " + "";
        pm1.test(re1);
    }

}

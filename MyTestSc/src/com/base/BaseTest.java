package com.base;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseTest {
    /* 正确答案（连续大写的ABCD） */
    private char[] result;

    /** 无参构造函数，没什么卵用甚至抛异常 */
    public BaseTest() {
        throw new RuntimeException();
    }

    /** 使用正确答案构造对象 */
    public BaseTest(String result) {
        this.result = result.toCharArray();
    }

    /**
     * 阅，打分
     * 
     * @param me
     *            我的答案
     */
    public void test(final String me) {
        ScoreCard sc = new ScoreCard();
        StringBuilder sb = new StringBuilder();
        List<String> fQ = new ArrayList<>();
        int len = me.length();
        for (int i = 0; i < len; i++) {
            if (me.charAt(i) == ' ') {
                sb.append(' ').append(sc.getCouTeam()).append('|');
            } else {
                if (result[sc.getCouTeam()] == me.charAt(i)) {
                    sc.addCouTue();
                    sb.append('.');
                } else {
                    sc.addCouFal();
                    fQ.add(sc.getCouTeam() + "." + me.charAt(i));
                    sb.append(me.charAt(i));
                }
            }
        }
//        System.out.println(sb);
        System.out.println("false:" + fQ);
        sc.printResult();
    }

}

package com.base;

public abstract class BaseTest {
    /* 正确答案（连续大写的ABCD） */
    private char[] result;

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
    public void test(String me) {
        ScoreCard sc = new ScoreCard();
        StringBuilder sb = new StringBuilder();
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
                    sb.append(me.charAt(i));
                }
            }
        }
        System.out.println(sb);
        sc.printResult();
    }

}

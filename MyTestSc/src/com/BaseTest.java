package com;

public abstract class BaseTest {
	/** 正确答案（连续大写的ABCD） */
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
		int teamIndex = 0; // 题号游标
		int couTue = 0; // 正确数
		int couFal = 0; // 错误数
		StringBuilder sb = new StringBuilder();
		int len = me.length();
		for (int i = 0; i < len; i++) {
			if (me.charAt(i) == ' ') {
				sb.append(' ').append(teamIndex).append('|');
			} else {
				if (result[teamIndex++] == me.charAt(i)) {
					couTue++;
					sb.append('.');
				} else {
					couFal++;
					sb.append(me.charAt(i));
				}
			}
		}
		System.out.println(sb);
		System.out.println("true :" + couTue);
		System.out.println("false:" + couFal);
		System.out.println("score:" + (couTue * 1.0 / teamIndex));
		System.out.println("----------------------------------------");
	}

}

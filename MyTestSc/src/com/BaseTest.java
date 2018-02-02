package com;

public abstract class BaseTest {
	private char[] result;

	public BaseTest(String result) {
		this.result = result.toCharArray();
	}

	public final char[] getResult() {
		return this.result;
	}

	public void test(String me) {
		char[] result = getResult();
		int len = me.length();
		int teamIndex = 0;
		int couTue = 0;
		int couFal = 0;
		StringBuilder sb = new StringBuilder();
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

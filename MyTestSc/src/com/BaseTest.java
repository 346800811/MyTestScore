package com;

public abstract class BaseTest {
	/** ��ȷ�𰸣�������д��ABCD�� */
	private char[] result;

	/** ʹ����ȷ�𰸹������ */
	public BaseTest(String result) {
		this.result = result.toCharArray();
	}

	/**
	 * �ģ����
	 * 
	 * @param me
	 *            �ҵĴ�
	 */
	public void test(String me) {
		int teamIndex = 0; // ����α�
		int couTue = 0; // ��ȷ��
		int couFal = 0; // ������
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

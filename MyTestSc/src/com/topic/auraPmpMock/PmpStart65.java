package com.topic.auraPmpMock;

import com.base.BaseTest;

public class PmpStart65 extends BaseTest {
	public PmpStart65() {
		super("CCBCDDADCBCCCDBBADCCABCCBDAACBABCDABDAACDBBAACBACBDACADBDABDADBCA");
	}

	public static void main(String[] args) {
		PmpStart65 pmp = new PmpStart65();
		pmp.test("CCBCCDBDCBCBCDBDBDDDACBADDBDCAADBDCBDACACBBAAABABACADDCAAABDDBCBB"); // 2018-1-9
		pmp.test("CCBCCDABCBCADDBABADCABBADBAACCAADBDADDCACACAACBACCDABBACDBDDACXXA"); // 2018-1-18
	}
}

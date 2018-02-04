package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P141）
 * 
 * @author JianDe
 */
public class PassPmpPdf06_1 extends BaseTest {

	public PassPmpPdf06_1(String result) {
		super("CBCDBDACCDCCDADADADD");
	}

	public static void main(String[] args) {
		PassPmpPdf06_1 pm1 = new PassPmpPdf06_1(null);
		pm1.test("CBCDB AACAD ABDAD ADADD"); // 2018-02-02
	}

}
/*
 * 6．答案：D。虽然WBS在项目计划阶段中创建，但可以在项目执行中用来帮助管理项目。这里的措辞并非“创建WBS”，而是“使用WBS。”
 * 项目控制系统是在项目计划阶段建立的，而不是在项目执行期，因此它是个例外。
 * 
 * 9．答案：C。范围说明指明项目的目标、工作内容和成果。
 * 
 * 11．答案：C。报告绩效给出完成可交付成果状态的信息。
 * 
 * 12．答案：C。核心原因分析是矫正行为过程中的重要步骤。
 */

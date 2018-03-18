package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P315~323）
 * 
 * @author JianDe
 */
public class PassPmpPdf10_1 extends BaseTest {
    public PassPmpPdf10_1() {
        super("CCBACDBDDBCBAABACAAC");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf10_1();
        pm1.test("CABAB DBDDC CBAAB ACAAB"); // 2018-02-22
    }

}
/*
 * 2．答案：C。参见《PMBOKⓇ指南》第五版8.1.2.3。“按发生频率排序的目的是为了有重点地采取纠正措施。项目团队应首先要处理那些导致最多缺陷的原因。”因为帕累托图以其发生频率顺序显示信息，它集中于最关键的问题。因此通过它可以表明
 * ，针对不同的错误产生根源采取相应的纠正措施，会有不同的效果。例如，80％的问题产生于原因A，则针对A采取的纠正措施所产生的效果将可以消除80％的问题。
 * 
 * 5．答案：C。确定和传达所需要达到的质量等级标准水平，是质量管理团队的责任之一。选项A职能工作者的责任是“对所执行任务的质量负根本责任（ultimate
 * responsibility）”。 B项目经理对“项目的质量负责”。 D是不对的，这里并不涉及质量费用问题。
 * 
 * 10．答案：B。克劳斯比：“质量的执行标准应该是零缺陷。”
 * 
 * 20．答案C。参见本章控制图相关内容和《PMBOKⓇ指南》第五版8.1.2.3中的文字说明。控制图所监控的过程的所有结果都应该落在这个界限（控制上限和控制下限）之内，只要结果落在这个界限内就是可接受的。
 */

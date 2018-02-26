package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P358~368）
 * 
 * @author JianDe
 */
public class PassPmpPdf11_2 extends BaseTest {
    public PassPmpPdf11_2(String result) {
        super("BDADDACCDAACACCBCBCD");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf11_2(null);
        pm1.test("BABCD ACCCA BCACC BDBCA"); // 2018-02-23
    }

}
/*
 * 2．答案：D。参见本章冲突管理——冲突的来源。
 * 
 * 3．答案：A。资源直方图显示了从时间角度看所期望的资源使用情况，责任矩阵没有考虑时间因素，帕累托图显然是不对的。资源甘特图显示的是资源在不同时间分配任务的情况。
 * 
 * 4．答案：D。事情被推迟决定，这是撤退的例子，参见本章解决冲突的五种方法撤退。
 * 
 * 9．答案：D。参见第10章项目质量管理，项目工程师对设计和规范负责。项目发起人或高级管理层通常负责项目的批准，项目经验的责任不是防止变更，而是监控变更。团队发展是由项目经理负责的，参见本章项目经理的角色和职责。
 * 
 * 11．答案：A.这道题考的是组建团队的依据问题。参见《PMBOKⓇ指南》第五版9.2.1.1。TODO
 * 
 * 17．答案：C。询问发起人信息是否可以在报告中体现并不能够解决那个问题的根源。告知那位要求不参加会议的队员沟通的价值只能消除队员的顾虑，并可能会引起愤怒的情绪。团队建设活动需要计划，所以不可以立即执行。记住，
 * 项目发起人可能参加下一次会议，至少有一名队员因为过去的问题不能参加。最好是设立新的基本规则来规范团队行为，然后再计划团队建设活动。
 * 
 * 20．答案：D。
 * 
 */
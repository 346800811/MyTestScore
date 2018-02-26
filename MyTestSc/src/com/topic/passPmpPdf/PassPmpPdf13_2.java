package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P424~433）
 * 
 * @author JianDe
 */
public class PassPmpPdf13_2 extends BaseTest {
    public PassPmpPdf13_2(String result) {
        super("DDCCCCBDCBBADDDACDCC");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf13_2(null);
        pm1.test("ADCAC CBDDB AADDC DBCCC"); // 2018-02-26
    }

}
/*
 * 1．答案：D。德尔菲法是获得专家在技术问题上，必须的项目或产品范围，或风险的意见的最常用的方法。
 * 
 * 4．答案：C。当风险发生并且首要应对措施被证明不合适的情况下，使用弹回计划。弹回计划包括分配应急储备、准备替代方案和变更项目范围。
 * 参见《PMBOKⓇ指南》第五版11.5.2，“可以制定弹回计划，以便在所选策略无效或发生已接受的风险时加以实施。”
 * 
 * 9．答案：C。编制完风险应对计划后，应将风险应对活动（response activities）、应急计划等落实到项目管理计划中，落实到WBS中。
 * 参见《PMBOKⓇ指南》第五版11.5.3.1（范围基准）。
 * 
 * 11．答案：B。风险数据库形成了吸取风险教训的基础。
 * 
 * 15．答案：D。A、B、C都是实施定量风险分析带来的好处。D属于定量风险分析的下一过程“规划风险应对”的内容。
 * 
 * 16．答案：A。可以用PERT这样理解：标准差越大，乐观值和悲观值相差就越大，风险的可变性就越大。注：PERT标准差＝（悲观值－乐观值）/6。
 * 
 * 17．答案：C。决策树要计算每一个备选方案的预期货币值，然后进行决策。每一个要决策的备选方案中有不同的相关事件（需要量化每个事件的概率、影响）。
 * 决策树分析的过程就是分析“决策”和这些相关事件之间的相互作用。
 * 
 * 18．答案：D。项目发起人是项目的出资人，风险的影响最终是由项目发起人承担的。参见本书，风险管理的责任。
 * 
 */

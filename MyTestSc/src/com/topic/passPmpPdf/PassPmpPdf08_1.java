package com.topic.passPmpPdf;

import com.base.BaseTest;

/**
 * 成功通过PMP-PDF（P209~217）
 * 第八章 测试题1
 * 
 * @author JianDe
 */
public class PassPmpPdf08_1 extends BaseTest {
    public PassPmpPdf08_1() {
        super("DDBBDCDDBCDAABAADDAC");
    }

    public static void main(String[] args) {
        BaseTest pm1 = new PassPmpPdf08_1();
        pm1.test("DDBBD BDABC DAABA ADDAC"); // 2018-02-05 10:45
    }

}
/*
 * 6．答案：C。规划质量管理需要范围基准作为依据，但质量目标达成情况的跟踪，需要使用质量核对表等来进行。
 * 
 * 8．答案：D。进度规划主要关注点是时间问题以及相关的资源投入问题。答案D的内容属于项目沟通管理范畴。
 * 
 */

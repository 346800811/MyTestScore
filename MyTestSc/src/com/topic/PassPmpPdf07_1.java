package com.topic;

import com.BaseTest;

/**
 * 成功通过PMP-PDF（P169~177）
 * 
 * @author JianDe
 */
public class PassPmpPdf07_1 extends BaseTest {
	public PassPmpPdf07_1(String result) {
		super("BCDABCBACBCCBBBACCAA");
	}

	public static void main(String[] args) {
		BaseTest pm1 = new PassPmpPdf07_1(null);
		pm1.test("BADAA ABAAB CDACB AAAAA"); // 2018-02-02
	}

}
/*
 * 2．答案：C。编号系统允许团队成员快速识别特定元素在工作分解结构中的层级，它还有助于在WBS词典里找出元素。
 * 
 * 5．答案：B。选项A不完全。B正确，范围基线不只是对最终产品的描述，基本的预算限制也是范围基线不可缺少的内容之一。C不完全。
 * 
 * 6．答案：C。选项A：一个最低层次的工作包是可以在一个位置不发生中断地完成的。选项B：分解到最低层次的意义就在于能够对该工作包作出估计。C正确：
 * 最低层次的工作包可以用一个人以上来做，分配给一个人不是必需的。选项D：可以这样对最低层次的工作包进行定义。
 * 
 * 9．答案：C。WBS的最低级是可以由不止一个人来完成。其他的选项是工作包的多个方面。
 * 
 * 12．答案：C。项目结束时“将产品交给客户”，所以只有“获得客户的签字认可”才标志“产品确认”，而项目的范围包含“为完成产品应该开展的工作”，
 * 是项目为了计划和控制进度、成本、质量等目标自己定义的事，所以项目范围的确认是“确保所有工作都已完成”。
 * 
 * 13．答案：B。要区分工作说明书与范围说明概念上的差异。工作说明提供对产品的描述，
 * 而范围说明提供项自的可交付成果和为提交这些可交付成果而必须开展的工作的说明。可交付成果不仅包括产品，还包括其他所要求交付的文档等。
 * 
 * 14．答案：B。在获得来自客户和其他干系人的输入信息之后，项目团队负责制定范围基准。请记住，范围基准包括WBS，WBS词典和项目范围说明书。
 * 
 * 17．答案：C。虽然有效的范围定义会使项目范围说明更完整，这个说法是正确的，但这不能成为答案，因为它与控制不相关。范围计划发生在控制范围的过程之前，
 * 而非之后。控制进度并不是控制范围最好的方式，所以这也不是最好的答案。控制流程不是单独作用的。对某一方面的变更很可能会影响其他方面。因此，
 * 与其他控制过程整合控制过程范围的需求是最好的回答。
 * 
 * 18．答案：C。项目范围说明书在一个高级基础上描述了工作。工作包需要具体以使团队成员不需要镀金就能完成他们的工作。
 * 产品范围不是告诉团队成员分配给他们什么工作。团队应该有一份进度计划，但一个进度计划不告诉他们在各自的工作包里包含有什么工作。工作包是在WBS词典中描写的。
 * 注意：不要把WBS词典作为一个条款的词典。
 */

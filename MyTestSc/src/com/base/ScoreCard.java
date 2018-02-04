package com.base;

public class ScoreCard {
	private int couTue = 0; // 正确数
	private int couFal = 0; // 错误数
	private int couTeam = 0; // 总题目数
	private double score; // 分数（=正确数/总题目数）

	/** 获得做对的答案数 */
	public int getCouTue() {
		return couTue;
	}

	/** 获得做错的答案数 */
	public int getCouFal() {
		return couFal;
	}

	/** 获得做完的总题目数 */
	public int getCouTeam() {
		return couTeam;
	}

	/** 获得做对的比例数 */
	public double getScore() {
		if (score == 0)
			this.calcScore();
		return score;
	}

	/** 做对了1个 */
	public void addCouTue() {
		this.couTue++;
		this.addCouTeam();
	}

	/** 做错了1个 */
	public void addCouFal() {
		this.couFal++;
		this.addCouTeam();
	}

	/* 做了1个 */
	private void addCouTeam() {
		this.couTeam++;
	}

	/* 计算得分 */
	private void calcScore() {
		this.score = couTue * 1.0 / couTeam;
		this.score = Double.parseDouble(String.format("%.3f", score));
	}

	/** 输出结果 */
	public void printResult() {
		System.out.println("true :" + getCouTue());
		System.out.println("false:" + getCouFal());
		System.out.println("score:" + getScore());
		System.out.println("----------------------------------------");
	}

}

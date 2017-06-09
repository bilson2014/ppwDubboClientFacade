package com.paipianwang.pat.facade.user.entity;

import java.io.Serializable;

public class Grade implements Serializable {
	private static final long serialVersionUID = 587417193179490019L;

	/**
	 * 职位
	 */
	public static Option[] position = new Option[5];

	/**
	 * 类型/客户来源
	 */
	public static Option[] customerType = new Option[13];

	/**
	 * 背书
	 */
	public static Option[] endorse = new Option[2];

	/**
	 * 购买频次
	 */
	public static Option[] purchaseFrequency = new Option[4];

	/**
	 * 购买均价
	 */
	public static Option[] purchasePrice = new Option[5];

	/**
	 * 客户规模
	 */
	public static Option[] customerSize = new Option[4];
	static {
		// 职位
		position[0] = new Option(0, "创始团队：决策人", 5);
		position[1] = new Option(1, "高层：影响决策人", 4);
		position[2] = new Option(2, "中层：执行层/建议权", 3);
		position[3] = new Option(3, "基层：获取合作信息", 2);
		position[4] = new Option(4, "其他：非关联部门", 1);
		// 类型/客户来源
		customerType[0] = new Option(1, "渠道", 3);
		customerType[1] = new Option(2, "推广", 0);
		customerType[2] = new Option(3, "直客", 5); // 自主开发
		customerType[3] = new Option(4, "活动", 0);
		customerType[4] = new Option(5, "推荐", 0);
		customerType[5] = new Option(6, "电销", 0);
		customerType[6] = new Option(7, "新媒体", 0);
		customerType[7] = new Option(8, "线下拓展", 0);
		customerType[8] = new Option(9, "市场活动", 0);
		customerType[9] = new Option(10, "社区运营", 0);
		customerType[10] = new Option(11, "复购", 0);
		customerType[11] = new Option(12, "4A有策划", 2);
		customerType[12] = new Option(13, "4A无策划", 0);
		// 背书
		endorse[0] = new Option(0, "有高层背书", 5);
		endorse[1] = new Option(1, "无高层背书", 0);
		// 购买频次
		purchaseFrequency[0] = new Option(0, "周复购", 5);
		purchaseFrequency[1] = new Option(1, "月度复购", 4);
		purchaseFrequency[2] = new Option(2, "季度复购", 3);
		purchaseFrequency[3] = new Option(3, "年度复购", 2);
		// 购买均价
		purchasePrice[0] = new Option(0, "均价采买价格10万以上", 5);
		purchasePrice[1] = new Option(1, "均价采买价格5-10万", 4);
		purchasePrice[2] = new Option(2, "均价采买价格3-5万", 3);
		purchasePrice[3] = new Option(3, "均价采买价格1-3万", 2);
		purchasePrice[4] = new Option(4, "均价采买价格1万内", 1);
		// 客户规模
		customerSize[0] = new Option(0, "上市公司及同等规模", 5);
		customerSize[1] = new Option(1, "b轮以上及同等规模", 4);
		customerSize[2] = new Option(2, "天使轮以上及同等规模", 3);
		customerSize[3] = new Option(3, "小微企业／个体", 2);

	}

	/**
	 * select 下拉选项
	 * 
	 * @author wang
	 *
	 */
	public static class Option implements Serializable{

		private static final long serialVersionUID = -8942477131015304835L;

		public Option(int id, String text, int score) {
			super();
			this.id = id;
			this.text = text;
			this.score = score;
		}

		public Option() {
			super();
		}

		private int id;
		private String text;
		private int score;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
	}
}

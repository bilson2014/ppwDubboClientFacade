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
	public static Option[] customerType = new Option[25];

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
		customerType[0] = new Option(1, "分销客户", 3);
//		customerType[1] = new Option(3, "直客", 5); // 自主开发
		customerType[1] = new Option(12, "4A", 2);
		
		
		customerType[2] = new Option(PmsUser.TYPE_OFFLINE_DIRECT_SELLING, "直客-线下-直销", 5);
		customerType[3] = new Option(PmsUser.TYPE_OFFLINE_ACTIVITY, "直客-线下-活动", 5);
		customerType[4] = new Option(PmsUser.TYPE_OFFLINE_CHANNEL, "直客-线下-渠道", 5);
		
		customerType[5] = new Option(PmsUser.TYPE_OFFLINE_TELEMARKETING, "直客-线上-电销", 5);	
		customerType[6] = new Option(PmsUser.TYPE_ONLINE_WEBSITE, "直客-线上-网站", 5);//以下：直客类型分别对应订单状态
		customerType[7] = new Option(PmsUser.TYPE_ONLINE_ACTIVITY, "直客-线上-活动", 5);
		customerType[8] = new Option(PmsUser.TYPE_ONLINE_NEW_MEDIA, "直客-线上-新媒体", 5);
		
		customerType[9] = new Option(PmsUser.TYPE_ONLINE_400, "直客-线上-400", 5);
		customerType[10] = new Option(PmsUser.TYPE_ONLINE_BRIDGE, "直客-线上-商桥", 5);
		
		customerType[11] = new Option(PmsUser.TYPE_ONLINE_PC_BANNER,"直客-线上-PC-首页banner", 5);
		customerType[12] = new Option(PmsUser.TYPE_ONLINE_PC_DIRECT,"直客-线上-PC-直接下单", 5);
		customerType[13] = new Option(PmsUser.TYPE_ONLINE_PC_COST,"直客-线上-PC-成本计算器", 5);
		customerType[14] = new Option(PmsUser.TYPE_ONLINE_PC_TEAM,"直客-线上-PC-供应商首页", 5);
		customerType[15] = new Option(PmsUser.TYPE_ONLINE_PC_PRODUCT,"直客-线上-PC-作品", 5);
		
		customerType[16] = new Option(PmsUser.TYPE_ONLINE_PHONE_BANNER,"直客-线上-移动-首页banner", 5);
		customerType[17] = new Option(PmsUser.TYPE_ONLINE_PHONE_COST,"直客-线上-移动-成本计算器", 5);
		customerType[18] = new Option(PmsUser.TYPE_ONLINE_PHONE_PRODUCT,"直客-线上-移动-作品", 5);
		
		customerType[19] = new Option(PmsUser.TYPE_ONLINE_WECHAT_COST,"直客-线上-公众号-成本计算器 ", 5);
		customerType[20] = new Option(PmsUser.TYPE_ONLINE_WECHAT_DIRECT,"直客-线上-公众号-直接下单", 5);	
		customerType[21] = new Option(PmsUser.TYPE_ONLINE_WECHAT_PRODUCT,"直客-线上-公众号-作品", 5);
		customerType[22] = new Option(PmsUser.TYPE_ONLINE_SEM,"直客-线上-SEM", 5);
		customerType[23] = new Option(PmsUser.TYPE_ONLINE_DINGDING,"直客-线上-钉钉", 5);
		customerType[24] = new Option(PmsUser.TYPE_ONLINE_SALES,"直客-线上-分销", 5);
		
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

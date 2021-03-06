package com.paipianwang.pat.facade.user.entity;

import com.paipianwang.pat.facade.right.entity.PmsCustomer;

/**
 * 用户业务类
 */
public class PmsUser extends PmsCustomer {

	private static final long serialVersionUID = -3500839628063835593L;

	/** 冗余字段，以id属性为准 **/
	private long userId = 0l;
	/** 昵称 **/
	private String userName = null;
	/** 真实姓名 **/
	private String realName = null;
	/** 密码 **/
	private String password = null;
	/** 性别 : 0:男 1:女 2:保密 **/
	private int sex = 0;
	/** 手机 **/
	private String telephone = null;
	/** 邮箱 **/
	private String email = null;
	/** 生日 **/
	private String birthday = null;
	/** 创建日期 **/
	private String createDate = null;
	/** 短信验证码 **/
	private String verification_code = null;
	/** 用户头像 **/
	private String imgUrl = null;
	/** QQ号码 **/
	private String qq = null;
	/** 第三方登录方式 1.微博登录:weibo 2.qq登录:qq 3.微信登录:wechat **/
	private String lType = null;
	/** 第三方登录用户唯一标识 **/
	private String uniqueId = null;
	/** 第三方登录用户唯一ID-QQ **/
	private String qqUnique = null;
	/** 第三方登录用户唯一ID-微博 **/
	private String wbUnique = null;
	/** 第三方登录用户唯一ID-微信 **/
	private String wechatUnique = null;
	/** 头像文件名称 **/
	private String imgFileName = null;
	/** 客户公司 **/
	private String userCompany = null;
	/** 客户级别 **/
	private Integer clientLevel = null;
	/** 备注信息 **/
	private String note = null;
	/** 登录方式 **/
	private String loginType;
	/** 客户登录名 **/
	private String loginName;
	/** 客户来源 **/
	private Integer customerSource = null;
	/** 微信号 **/
	private String weChat = null;
	/** 客户意向度 **/
	private Integer preference = null;
	/** 再次跟进时间 **/
	private String followTime = null;
	/** 更新时间 **/
	private String updateTime = null;
	/** 是否推送 **/
	private Boolean kindlySend = null;
	/** clientLevel **/
	public final static int S = 3;
	public final static int A = 0;
	public final static int B = 1;
	public final static int C = 2;
	public final static int D = 4;
	/**
	 * 推荐人ID
	 */
	private Long referrerId;
	/**
	 * 网址
	 */
	private String officialSite;
	/**
	 * 职位
	 */
	private Integer position;
	/**
	 * 客户类型
	 */
	private Integer customerType;
	/**
	 * 购买频次
	 */
	private Integer purchaseFrequency;
	/**
	 * 购买价格
	 */
	private Integer purchasePrice;
	/**
	 * 客户规模
	 */
	private Integer customerSize;
	/**
	 * 高层背书
	 */
	private Integer endorse;
	
	//////////////////////////////// 客户类型（直销-对应订单来源）///////////////////////////////
	/**
	 * 直销-线上-网站
	 */
	public static final int TYPE_ONLINE_WEBSITE = 14;
	/**
	 * 直销-线上-活动
	 */
	public static final int TYPE_ONLINE_ACTIVITY = 15;
	/**
	 * 直销-线上-新媒体
	 */
	public static final int TYPE_ONLINE_NEW_MEDIA = 16;
	/**
	 * 直销-线上-电销
	 */
	public static final int TYPE_OFFLINE_TELEMARKETING = 17;
	/**
	 * 直销-线下-直销
	 */
	public static final int TYPE_OFFLINE_DIRECT_SELLING = 18;
	/**
	 * 直销-线下-活动
	 */
	public static final int TYPE_OFFLINE_ACTIVITY = 19;
	/**
	 * 直销-线下-渠道
	 */
	public static final int TYPE_OFFLINE_CHANNEL = 20;
	/**
	 * 直销-线上-400
	 */
	public static final int TYPE_ONLINE_400 = 21;
	/**
	 * 直销-线上-商桥
	 */
	public static final int TYPE_ONLINE_BRIDGE = 22;
	/**
	 * 线上-PC-首页banner
	 */
	public static final int TYPE_ONLINE_PC_BANNER=23;
	/**
	 * 线上-PC-直接下单
	 */
	public static final int TYPE_ONLINE_PC_DIRECT=24;
	/**
	 * 线上-PC-成本计算器
	 */
	public static final int TYPE_ONLINE_PC_COST=25;
	/**
	 * 线上-PC-供应商首页下单
	 */
	public static final int TYPE_ONLINE_PC_TEAM=26;
	/**
	 * 线上-PC-作品
	 */
	public static final int TYPE_ONLINE_PC_PRODUCT=27;

	/**
	 * 线上-移动-首页banner
	 */
	public static final int TYPE_ONLINE_PHONE_BANNER=28;
	/**
	 * 线上-移动-成本计算器
	 */
	public static final int TYPE_ONLINE_PHONE_COST=29;
	/**
	 * 线上-移动-作品
	 */
	public static final int TYPE_ONLINE_PHONE_PRODUCT=30;

	/**
	 * 线上-新媒体-拍片网公众号-成本计算器 
	 */
	public static final int TYPE_ONLINE_WECHAT_COST=31;
	/**
	 * 线上-新媒体-拍片网公众号-直接下单 
	 */
	public static final int TYPE_ONLINE_WECHAT_DIRECT=32;
	/**
	 * 线上-新媒体-拍片网公众号-作品
	 */
	public static final int TYPE_ONLINE_WECHAT_PRODUCT=33;
	
	/**
	 * 线上-SEM
	 */
	public static final int TYPE_ONLINE_SEM=34;
	
	/**
	 * 线上-钉钉
	 */
	public static final int TYPE_ONLINE_DINGDING=35;
	/**
	 * 线上-直销
	 */
	public static final int TYPE_ONLINE_SALES=36;


	public Boolean getKindlySend() {
		return kindlySend;
	}

	public void setKindlySend(Boolean kindlySend) {
		this.kindlySend = kindlySend;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	public Integer getPreference() {
		return preference;
	}

	public void setPreference(Integer preference) {
		this.preference = preference;
	}

	public String getFollowTime() {
		return followTime;
	}

	public void setFollowTime(String followTime) {
		this.followTime = followTime;
	}

	public String getLoginName() {
		return loginName;
	}

	public Integer getCustomerSource() {
		return customerSource;
	}

	public void setCustomerSource(Integer customerSource) {
		this.customerSource = customerSource;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getVerification_code() {
		return verification_code;
	}

	public void setVerification_code(String verification_code) {
		this.verification_code = verification_code;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getlType() {
		return lType;
	}

	public void setlType(String lType) {
		this.lType = lType;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getQqUnique() {
		return qqUnique;
	}

	public void setQqUnique(String qqUnique) {
		this.qqUnique = qqUnique;
	}

	public String getWbUnique() {
		return wbUnique;
	}

	public void setWbUnique(String wbUnique) {
		this.wbUnique = wbUnique;
	}

	public String getWechatUnique() {
		return wechatUnique;
	}

	public void setWechatUnique(String wechatUnique) {
		this.wechatUnique = wechatUnique;
	}

	public String getImgFileName() {
		return imgFileName;
	}

	public void setImgFileName(String imgFileName) {
		this.imgFileName = imgFileName;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public Integer getClientLevel() {
		return clientLevel;
	}

	public void setClientLevel(Integer clientLevel) {
		this.clientLevel = clientLevel;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Long getReferrerId() {
		return referrerId;
	}

	public void setReferrerId(Long referrerId) {
		this.referrerId = referrerId;
	}

	public String getOfficialSite() {
		return officialSite;
	}

	public void setOfficialSite(String officialSite) {
		this.officialSite = officialSite;
	}

	public Integer getCustomerType() {
		return customerType;
	}

	public void setCustomerType(Integer customerType) {
		this.customerType = customerType;
	}

	public Integer getPurchaseFrequency() {
		return purchaseFrequency;
	}

	public void setPurchaseFrequency(Integer purchaseFrequency) {
		this.purchaseFrequency = purchaseFrequency;
	}

	public Integer getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(Integer purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Integer getCustomerSize() {
		return customerSize;
	}

	public void setCustomerSize(Integer customerSize) {
		this.customerSize = customerSize;
	}

	public Integer getEndorse() {
		return endorse;
	}

	public void setEndorse(Integer endorse) {
		this.endorse = endorse;
	}

}

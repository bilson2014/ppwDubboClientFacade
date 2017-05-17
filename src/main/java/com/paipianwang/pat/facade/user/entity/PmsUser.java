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

	/**
	 * 职位
	 */
	private Integer position;

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

}

package com.paipianwang.pat.facade.user.service;

import java.util.List;
import java.util.Map;

import com.paipianwang.pat.common.entity.DataGrid;
import com.paipianwang.pat.common.entity.PageParam;
import com.paipianwang.pat.common.entity.ThirdBind;
import com.paipianwang.pat.facade.user.entity.PmsUser;

/**
 * user Dubbo服务接口
 *
 */
public interface PmsUserFacade {
	/**
	 * 检查手机号或者用户名是否存在
	 * 
	 * @param telephone
	 *            手机号码
	 *  @param loginName
	 *  		  登录名          
	 * @return 存在个数
	 */
	public int validationPhone(final String telephone, final String loginName);
	/**
	 * 注册用户
	 */
	public PmsUser register(final PmsUser user);
	
	public DataGrid<PmsUser> listWithPagination(PageParam pageParam, Map<String, Object> paramMap);
	/**
	 * 根据 服务编号 删除 service
	 * 
	 * @param serviceId
	 *            service 编号
	 */
	public long delete(long[] ids);
	public long update(PmsUser user);
	public long save(PmsUser user);
	/**
	 * 密码相同的前提下，通过用户名称获取用户 根据用户名匹配手机号或者邮件
	 * 
	 * @param user
	 *            用户密码 以及 用户名称
	 * @return 用户信息
	 */
	public PmsUser findUserByAttr(PmsUser user);
	/**
	 * 根据loginName和密码查询用户
	 */
	public PmsUser findUserByLoginNameAndPwd(PmsUser user);
	/**
	 * 修改 用户基本信息(昵称、性别、真实姓名、电子邮件、QQ)
	 * 
	 * @param (昵称、性别、真实姓名、电子邮件、QQ、用户ID)
	 * @return 修改个数
	 */
	public long modifyUserInfo(PmsUser user);
	public long modifyUserLoginName(PmsUser user);
	/**
	 * 修改 用户密码
	 */
	public long modifyUserPassword(PmsUser user);
	/**
	 * 修改 用户头像
	 */
	public long modifyUserPhoto(PmsUser user);
	/**
	 * 根据用户ID获取用户
	 * 
	 * @param id
	 *            用户唯一编号
	 * @return 用户信息
	 */
	public PmsUser findUserById(Long userId);
	/**
	 * 验证 通过第三方登录的用户是否存在
	 */
	public List<PmsUser> verificationUserExistByThirdLogin(PmsUser user);
	public PmsUser threeLoginPhone(String telephone);
	public Map<String, Object> bindThird(ThirdBind bind);
	/**
	 * 查询第三方绑定状态
	 */
	public Map<String, Object> thirdStatus(PmsUser user);
	/**
	 * 用户个人资料页面绑定第三方
	 */
	public boolean userInfoBind(PmsUser user);
	/**
	 * 用户个人资料页面解除绑定第三方
	 */
	public boolean userInfoUnBind(PmsUser user);
	/**
	 * 验证用户名昵称唯一性
	 * true 可用
	 * false 不可用
	 */
	public boolean uniqueUserName(PmsUser user);
	/**
	 * 修改 用户手机号码
	 */
	public long modifyUserPhone(PmsUser user);
}

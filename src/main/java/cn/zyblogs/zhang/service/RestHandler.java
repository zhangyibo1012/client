package cn.zyblogs.zhang.service;


import cn.zyblogs.zhang.bean.MethodInfo;
import cn.zyblogs.zhang.bean.ServerInfo;

/**
 * rest请求调用handler
 * 
 * @author zyb
 *
 */
public interface RestHandler {

	/**
	 * 初始化服务器信息
	 * 
	 * @param serverInfo
	 */
	void init(ServerInfo serverInfo);

	/**
	 * 调用rest请求, 返回接口
	 * 
	 * @param methodInfo
	 * @return
	 */
	Object invokeRest(MethodInfo methodInfo);

}

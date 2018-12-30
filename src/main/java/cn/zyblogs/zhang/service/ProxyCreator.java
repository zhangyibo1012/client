package cn.zyblogs.zhang.service;

/**
 * 创建代理类接口
 * 
 * @author zyb
 *
 */
public interface ProxyCreator {
	/**
	 * 创建代理类
	 * 
	 * @param type
	 * @return
	 */
	Object createProxy(Class<?> type);
}

package cn.zyblogs.client.controller;

import cn.zyblogs.client.api.IUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
	IUserApi userApi;

	@GetMapping
	public void test() {
//		 测试信息提取
//		 不订阅, 不会实际发出请求, 但会进入代理类
//		 userApi.getAllUser();
//		 userApi.getUserById("11111111");
//		 userApi.deleteUserById("222222222");
//		 userApi.createUser(
//		 Mono.just(User.builder().name("zyb").age(24).build()));

//		 直接调用调用 实现调用rest接口的效果
//		 Flux<User> users = userApi.getAllUser();
//		 打印订阅者
//		 users.subscribe(System.out::println);

		String id = "5c28515866cd19cf84b1cac3";
		userApi.getUserById(id).subscribe(user -> System.out.println("找到用户:" + user), e -> System.err.println("找不到用户:" + e.getMessage()));
//
		id = "5c28515866cd19cf84b1cac2";
		userApi.getUserById(id).subscribe(user -> System.out.println("找到用户:" + user), e -> System.err.println("找不到用户:" + e.getMessage()));
////		 删除
		 userApi.deleteUserById(id).subscribe();

		// 创建用户
//		 userApi.createUser(
//		 Mono.just(User.builder().name("晓风轻").age(33).build()))
//		 .subscribe(System.out::println);

	}

}

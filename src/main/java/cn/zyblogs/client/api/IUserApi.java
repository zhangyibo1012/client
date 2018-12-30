package cn.zyblogs.client.api;

import cn.zyblogs.client.domain.User;
import cn.zyblogs.zhang.ApiServer;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * @Class: IUserApi.java
 * @Description: TODO
 * @Author ZhangYB
 * @Version V1.0
 */
@ApiServer("http://localhost:8080/user")
public interface IUserApi {

    @GetMapping("/")
    Flux<User> getAllUser();

    @GetMapping(value = "/{id}")
    Mono<User> getUserById(@PathVariable("id") String id);

    @DeleteMapping(value = "/{id}")
    Mono<Void> deleteUserById(@PathVariable("id") String id);

    @PostMapping("/")
    Mono<User> createUser(@RequestBody Mono<User> user);
}

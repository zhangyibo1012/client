package cn.zyblogs.client.domain;

import lombok.*;

/**
 * 类名可以随意, 字段需要保持一致
 *
 * @author zyb
 *
 */
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String name;

    private int age;
}

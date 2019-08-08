package cn.huangzijian888.community.model;

import lombok.Data;

/**
 * @author huangzijian888
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}

package cn.huangzijian888.community.dto;

import cn.huangzijian888.community.model.User;
import lombok.Data;

/**
 * @author huangzijian888
 */
@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}

package space.springboot.community.model;

import lombok.Data;

import java.util.List;

@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private List<Tag> tags;
}

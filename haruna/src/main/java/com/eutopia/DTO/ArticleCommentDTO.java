package com.eutopia.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleCommentDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer articleDescriptionId;

    private String content;

    private String nickName;
}

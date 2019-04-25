package com.eutopia.entity;

import com.eutopia.entity.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class ArticleDescription extends BaseEntity {

    private Integer menuId;

    private String title;

    private String summary;

    private String source;

    private String author;

    private Integer sort;
}

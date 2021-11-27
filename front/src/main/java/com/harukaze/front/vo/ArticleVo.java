package com.harukaze.front.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.harukaze.front.entity.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author doki
 * @since 2021-11-27
 */
@Data
public class ArticleVo implements Serializable {

    private Long id;

    /**
     * 评论数量
     */
    private Integer commentCounts;

    /**
     * 创建时间
     */
    private Long createDate;

    /**
     * 简介
     */
    private String summary;

    /**
     * 标题
     */
    private String title;

    /**
     * 浏览数量
     */
    private Integer viewCounts;

    /**
     * 是否置顶
     */
    private Integer weight;

    /**
     * 作者
     */
    private SysUserVo author;

    /**
     * 内容id
     */
    private ArticleBodyVo articleBody;

    private CategoryVo category;

    private List<TagVo> tags;
}

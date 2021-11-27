package com.harukaze.front.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author doki
 * @since 2021-11-27
 */
@Data
public class CategoryVo implements Serializable {

    private Long id;

    private String avatar;

    private String categoryName;

    private String description;


}

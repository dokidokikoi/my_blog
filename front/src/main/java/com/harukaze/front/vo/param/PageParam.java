package com.harukaze.front.vo.param;

import lombok.Data;

/**
 * @PackageName: com.harukaze.front.vo.param
 * @ClassName: PageParam
 * @Description:
 * @Author: doki
 * @Date: 27/11/2021 1:56 PM
 */
@Data
public class PageParam {
    private Integer pageNum;
    private Integer pageSize;
    private String query;
}

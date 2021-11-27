package com.harukaze.front.controller;


import com.harukaze.front.service.ArticleService;
import com.harukaze.front.vo.Result;
import com.harukaze.front.vo.param.PageParam;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author doki
 * @since 2021-11-27
 */
@Api(tags = "文章数据接口")
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping
    public Result getArticle(PageParam pageParam) {
        return articleService.findAllArticleByPAge(pageParam);
    }
}

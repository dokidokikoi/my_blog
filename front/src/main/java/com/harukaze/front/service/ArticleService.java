package com.harukaze.front.service;

import com.harukaze.front.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.harukaze.front.vo.Result;
import com.harukaze.front.vo.param.PageParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author doki
 * @since 2021-11-27
 */
public interface ArticleService extends IService<Article> {

    Result findAllArticleByPAge(PageParam pageParam);
}

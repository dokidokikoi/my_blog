package com.harukaze.front.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.harukaze.front.entity.Article;
import com.harukaze.front.mapper.ArticleMapper;
import com.harukaze.front.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.harukaze.front.vo.Result;
import com.harukaze.front.vo.param.PageParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author doki
 * @since 2021-11-27
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Result findAllArticleByPAge(PageParam pageParam) {
        Page<Article> page = new Page<>(pageParam.getPageNum(), pageParam.getPageSize());

        return null;
    }
}

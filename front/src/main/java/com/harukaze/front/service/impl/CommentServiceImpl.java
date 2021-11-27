package com.harukaze.front.service.impl;

import com.harukaze.front.entity.Comment;
import com.harukaze.front.mapper.CommentMapper;
import com.harukaze.front.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}

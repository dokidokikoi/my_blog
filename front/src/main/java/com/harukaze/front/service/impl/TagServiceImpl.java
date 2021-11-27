package com.harukaze.front.service.impl;

import com.harukaze.front.entity.Tag;
import com.harukaze.front.mapper.TagMapper;
import com.harukaze.front.service.TagService;
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
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}

package tech.sponge.cloud.blogs.service.impl;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.sponge.cloud.blogs.mapper.SpongeCloudBlogMapper;
import tech.sponge.cloud.blogs.service.SpongeCloudBlogService;

@Service
@Slf4j
public class SpongeCloudBlogServiceImpl implements SpongeCloudBlogService {

    @Autowired
    private SpongeCloudBlogMapper spongeCloudBlogMapper;


}

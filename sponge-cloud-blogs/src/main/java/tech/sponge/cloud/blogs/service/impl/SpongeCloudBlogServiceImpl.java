package tech.sponge.cloud.blogs.service.impl;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.sponge.cloud.blogs.mapper.SpongeCloudBlogMapper;
import tech.sponge.cloud.blogs.service.SpongeCloudBlogService;
import tech.sponge.cloud.common.pojo.sdo.SpongeBlog;

import java.util.List;

@Service
@Slf4j
public class SpongeCloudBlogServiceImpl implements SpongeCloudBlogService {

    @Autowired
    private SpongeCloudBlogMapper spongeCloudBlogMapper;


    @Override
    public List<SpongeBlog> getSpongeBlogAll() {
        return null;
    }

    @Override
    public SpongeBlog getSpongeBlogById(Integer blogId) {
        return null;
    }
}

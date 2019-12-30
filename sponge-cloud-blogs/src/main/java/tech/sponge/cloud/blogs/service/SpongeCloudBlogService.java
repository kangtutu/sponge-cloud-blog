package tech.sponge.cloud.blogs.service;

import tech.sponge.cloud.common.pojo.sdo.SpongeBlog;

import java.util.List;

public interface SpongeCloudBlogService {

    //获取全量文章数据
    List<SpongeBlog> getSpongeBlogAll();

    //获取指定ID文章数据
    SpongeBlog getSpongeBlogById(Integer blogId);

}

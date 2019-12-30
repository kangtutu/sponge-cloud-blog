package tech.sponge.cloud.blogs.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.sponge.cloud.common.pojo.sdo.SpongeBlog;

import java.util.List;

//feign - 服务提供者相关的接口
@FeignClient(value = "服务提供者在注册中心中的名字")
public interface SpongeCloudBlogService {

    //获取全量文章数据
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    List<SpongeBlog> getSpongeBlogAll();

    //获取指定ID文章数据
    @RequestMapping(value = "/get/{blogId}",method = RequestMethod.GET)
    SpongeBlog getSpongeBlogById(@PathVariable("blogId") Integer blogId);
}

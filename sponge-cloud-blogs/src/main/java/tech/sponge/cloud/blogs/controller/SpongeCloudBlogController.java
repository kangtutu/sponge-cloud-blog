package tech.sponge.cloud.blogs.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import tech.sponge.cloud.common.pojo.sdo.SpongeBlog;
import tech.sponge.cloud.common.pojo.svo.ResponseResult;

@RestController
@RequestMapping("/blog")
@Slf4j
public class SpongeCloudBlogController {

    @PostMapping("/save")
    public ResponseResult saveBlog(@RequestBody SpongeBlog spongeBlog){

        return ResponseResult.success();
    }

    /**
     * 按条件查询文章信息
     * @return
     */
    @GetMapping
    public ResponseResult getBlogByTerm(){
        log.info("[文章模块 - 首页] 首页文章数据");
        return ResponseResult.success();
    }

    /**
     * 查询指定ID文章数据
     * @param blogId
     * @return
     */
    @GetMapping("/{blogId}")
    public ResponseResult getBlogById(@PathVariable("blogId")Integer blogId){
        log.info("[文章模块-查询指定ID文章数据] 查询文章ID:{} 的数据信息",blogId);
        return ResponseResult.success();
    }

    /**
     * 分页查询
     * @param objId
     * @param typeId
     * @param start
     * @return
     */
    @GetMapping("/page/{objId}/{typeId}/{start}")
    public ResponseResult pageBlog(@PathVariable("objId")Integer objId,
                                   @PathVariable("typeId")Integer typeId,
                                   @PathVariable("start")Integer start){
        log.info("[文章模块-分页查询] 分页类型标识ID:{},类型ID:{},页码数:{}",objId,typeId,start);
        return ResponseResult.success();
    }

    /**
     * 删除指定ID文章数据
     * @param blogId
     * @return
     */
    @GetMapping("/delete/{blogId}")
    public ResponseResult deleteBlogById(@PathVariable("blogId")Integer blogId){
        log.info("[文章模块-删除指定ID文章数据] 删除文章ID:{} 的数据信息",blogId);
        return ResponseResult.success();
    }

}

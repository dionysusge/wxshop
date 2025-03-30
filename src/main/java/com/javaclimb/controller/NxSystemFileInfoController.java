package com.javaclimb.controller;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageInfo;
import com.javaclimb.common.Result;
import com.javaclimb.entity.NxSystemFileInfo;
import com.javaclimb.exception.CustomException;
import com.javaclimb.service.NxSystemFileInfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/*
* 文件增删改查控制器
* */

@RestController
@RequestMapping(value="/files")
public class NxSystemFileInfoController {

    private static final String BASE_PATH = System.getProperty("user.dir") + "/src/main/resources/static/file/";

    @Resource
    private NxSystemFileInfoService nxSystemFileInfoService;

    /**
     * 上传文件
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        if (originalFilename == null || originalFilename.equals("")){
            return Result.error("1001", "文件名不能为空");
        }
        if (originalFilename.contains(".png") && originalFilename.contains(".jpg") && originalFilename.contains(".jpeg") && originalFilename.contains(".gif")){
            return Result.error("1001", "文件格式错误，只能上传图片");
        }
        // 给文件名加时间戳
        String fileName = FileUtil.mainName(originalFilename) + System.currentTimeMillis() + FileUtil.extName(originalFilename);
        // 上传文件
        FileUtil.writeBytes(file.getBytes(), BASE_PATH + fileName);
        // 信息入库，获取到文件id
        NxSystemFileInfo nxSystemFileInfo = new NxSystemFileInfo();
        nxSystemFileInfo.setFileName(fileName);
        nxSystemFileInfo.setOriginName(originalFilename);
        NxSystemFileInfo addInfo = nxSystemFileInfoService.add(nxSystemFileInfo);
        if (addInfo != null){
            return Result.success(addInfo);
        }
        else return Result.error("1003", "文件上传失败");
    }



    /**
     * 删除文件类别，根据id
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){ // 噢那意思就是这个类型的变量可以映射到上面这个deleteMapping的地址，不过也要用{}括起来
        nxSystemFileInfoService.delete(id);
        return Result.success();
    }

    /**
     * 根据ID查询文件
     * */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id){
        return Result.success(nxSystemFileInfoService.findById(id));
    }

    /**
     * 下载图片
     */
    @GetMapping("/download/{id}")
    public void download(@PathVariable String id, HttpServletResponse response) throws IOException {
        if (StrUtil.isBlank(id) || "null".equals(id)){
            throw new CustomException("1001", "您未上传文件");
        }
        NxSystemFileInfo nxSystemFileInfo = nxSystemFileInfoService.findById(Long.parseLong(id));
        if (nxSystemFileInfo == null){
            throw new CustomException("1001", "未找到该文件");
        }
        byte[] bytes = FileUtil.readBytes(BASE_PATH+nxSystemFileInfo.getFileName());
        response.reset();
        // 设置response的header
        response.addHeader("Content-Disposition", "attachment;filename=" +
                URLEncoder.encode(nxSystemFileInfo.getOriginName(), "UTF-8"));
        response.addHeader("Content-Length", "" + bytes.length);
        OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
        response.setContentType("application/octet-stream");
        toClient.write(bytes);
        toClient.flush();
        toClient.close();
    }
}

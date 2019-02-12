//package com.sue.springbootvue.controller;
//
//import com.sue.springbootvue.result.Result;
//import com.sue.springbootvue.result.ResultFactory;
//import com.sue.springbootvue.utils.FileUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.core.io.ResourceLoader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.util.Map;
//
//@RestController
//@RequestMapping(value = "/api")
//public class ImgUploadController {
//    private final ResourceLoader resourceLoader;
//    @Autowired
//    public ImgUploadController(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }
//    @Value("${web.upload-path}")
//    private String path;
//
//    @RequestMapping("/uploadImg")
//    public Result uploadImg(@RequestParam("fileName") MultipartFile file, Map<String,Object> map){
//        // 要上传的目标文件存放路径
//        String localPath = "C:/img/upload";
//        // 上传成功或者失败的提示
//        String msg = "";
//
//        if (FileUtils.upload(file, localPath, file.getOriginalFilename())){
//            // 上传成功，给出页面提示
//            msg = "上传成功！";
//        }else {
//            msg = "上传失败！";
//
//        }
//
//        // 显示图片
//        map.put("msg", msg);
//        map.put("fileName", file.getOriginalFilename());
//
//        return ResultFactory.buildSuccessResult(msg);
//    }
//
//    /**
//     * 显示单张图片
//     * @return
//     */
//    @RequestMapping("showImg")
//    public Result showPhotos(String fileName){
//
//        try {
//            // 由于是读取本机的文件，file是一定要加上的， path是在application配置文件中的路径
//            return ResultFactory.buildSuccessResult(resourceLoader.getResource("file:" + path + fileName));
//        } catch (Exception e) {
//            return ResultFactory.buildFailResult("显示失败");
//        }
//    }
//
//}
//

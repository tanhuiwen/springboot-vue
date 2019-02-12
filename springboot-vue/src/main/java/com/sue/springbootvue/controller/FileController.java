//package com.sue.springbootvue.controller;
//
//import com.sue.springbootvue.result.Result;
//import com.sue.springbootvue.result.ResultFactory;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.multipart.MultipartHttpServletRequest;
//
//import javax.servlet.http.HttpServletRequest;
//import java.io.File;
//import java.io.IOException;
//import java.util.Calendar;
//import java.util.Map;
//import java.util.UUID;
//
//@RestController
//@RequestMapping(value = "/api")
//public class FileController {
//    /**
//     * 上传图片
//     *
//     * @param file
//     * @param request
//     * @throws IOException
//     */
//    @RequestMapping(value = "/uploadImg")
//    public Result uploadImg(@RequestParam(value = "file", required = false) MultipartFile file, HttpServletRequest request) throws IOException {
//        //目前这里是写死的本地硬盘路径
//        String path = "C:/img";
//        //获取文件名称
//        String fileName = file.getOriginalFilename();
//        //获取时间
//        Calendar currTime = Calendar.getInstance();
//        String time = String.valueOf(currTime.get(Calendar.YEAR)) + String.valueOf((currTime.get(Calendar.MONTH) + 1));
//        //获取文件名后缀
//        String suffix = fileName.substring(file.getOriginalFilename().lastIndexOf("."));
//        suffix = suffix.toLowerCase();
//        if (suffix.equals(".jpg") || suffix.equals(".jpeg") || suffix.equals(".png")/* || suffix.equals(".gif")*/) {
//            fileName = UUID.randomUUID().toString() + suffix;
//            File targetFile = new File(path, fileName);
//            if (!targetFile.getParentFile().exists()) {    //注意，判断父级路径是否存在
//                targetFile.getParentFile().mkdirs();
//            }
//            long size = 0;
//            //保存
//            try {
//                file.transferTo(targetFile);
//                size = file.getSize();
//            } catch (Exception e) {
//                e.printStackTrace();
//                return ResultFactory.buildFailResult("上传失败");
//            }
//            //项目url，这里可以使用常量或者去数据字典获取相应的url前缀；
//            String fileUrl = "http://localhost:8080";
//            //文件获取路径
//            fileUrl = fileUrl + request.getContextPath() + "/img/" + fileName;
//            return ResultFactory.buildSuccessResult("fileURL" + fileUrl);
//        } else {
//            return ResultFactory.buildFailResult("图片格式有误，请上传.jpg、.png、.jpeg格式的文件");
//        }
//
//    }
//}
//
//
////    @PostMapping("/upload/request")
////    public Map<String,Object> uploadRequest(HttpServletRequest request){
////        boolean flag = false;
////        MultipartHttpServletRequest multipartHttpServletRequest = null;
////        //强制转换为MultipartHttpServletRequest接口对象
////        if(request instanceof MultipartHttpServletRequest){
////            multipartHttpServletRequest=(MultipartHttpServletRequest)request;
////        }else {
////            return dealResultMap(false,"上传失败");
////        }
////        //获取MultipartFile文件信息
////        MultipartFile multipartFile = multipartHttpServletRequest.getFile("file");
////        //获取源文件名称
////        String filename = multipartFile.getOriginalFilename();
////        File file = new File(filename);
////        try{
////            multipartFile.transferTo(file);
////        }catch (Exception e){
////            e.printStackTrace();
////            return dealResultMap(false,"上传失败");
////        }
////        return dealResultMap(false,"上传成功");
////    }
//

package com.sue.springbootvue.utils;

public class FileNameUtils {
    /**
     * 获取文件后缀
     * @param fileOriginName 源文件名
     * @return
     */
    public static String getSuffix(String fileOriginName){
        return fileOriginName.substring(fileOriginName.lastIndexOf("."));
    }

    /**
     * 生成新的文件名
     * @param fileOriginName 源文件名
     * @return
     */
    public static String createFileName(String fileOriginName){
        return UUIDUtils.getUUID()+FileNameUtils.getSuffix(fileOriginName);
    }
}

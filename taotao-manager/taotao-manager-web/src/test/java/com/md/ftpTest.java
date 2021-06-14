package com.md;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * @author mengdong
 * @create 2018-11-13 21:43
 */

public class ftpTest {

    @Test
    public void testFtpClient() throws Exception {
        //1.创建FTPClient对象
        FTPClient ftp = new FTPClient();
        //2.创建ftp连接
        ftp.connect("192.168.152.132",21);
        //3.登陆
        ftp.login("ftpuser", "ftpuser");
        //4.上传文件
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\cache\\bdwp\\040950.jpg"));
        //设置上传文件的类型为二进制类型
        ftp.enterLocalPassiveMode();
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.changeWorkingDirectory("/home/ftpuser/www/images");
        ftp.storeFile("hello2.jpg", fileInputStream);
        ftp.logout();
    }
}

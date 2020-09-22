package com.sidaodin.zhihuimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class ZhihuimallThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpload() throws FileNotFoundException {


        // 上传文件流。
        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Downloads\\docs\\pics\\23cd65077f12f7f5.jpg");
        ossClient.putObject("zhihuimall", "23cd65077f12f7f5.jpg", inputStream);

        // 关闭OSSClient。
        ossClient.shutdown();

        System.out.println("上传完成...");
    }

    @Test
    void contextLoads() {
    }

}

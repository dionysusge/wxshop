package com.javaclimb.wxshopback;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class GenerateApplicationTests {
    @Test
    void contextLoads() throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //下一行中的是存放generator配置的路径，切记不要写错
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    void testMd5(){
        String password = SecureUtil.md5("123456");
        System.out.println(password);
    }
}

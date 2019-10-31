package com.wiz.top.tgn.tagname;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

/**
 * 主程序入口:
 * 		天山电力接口程序
 * @author linfengda
 * 
 *
 */
@SpringBootApplication
@MapperScan("com.wiz.top.tgn.tagname.dao")
public class TsWizProductionApplication {
	
	
    public static void main(String[] args) {
        SpringApplication.run(TsWizProductionApplication.class, args);
    }

    // 配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}


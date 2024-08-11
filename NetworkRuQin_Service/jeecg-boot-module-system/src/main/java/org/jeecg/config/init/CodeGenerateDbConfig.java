//package org.jeecg.config.init;
//
//import com.alibaba.druid.filter.config.ConfigTools;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.lang3.StringUtils;
//import org.jeecgframework.codegenerate.database.CodegenDatasourceConfig;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Slf4j
//@Configuration
//public class CodeGenerateDbConfig {
//    @Value("${spring.datasource.dynamic.datasource.master.url:}")
//    private String url;
//    @Value("${spring.datasource.dynamic.datasource.master.username:}")
//    private String username;
//    @Value("${spring.datasource.dynamic.datasource.master.password:}")
//    private String password;
//    @Value("${spring.datasource.dynamic.datasource.master.driver-class-name:}")
//    private String driverClassName;
//    @Value("${spring.datasource.dynamic.datasource.master.druid.public-key:}")
//    private String publicKey;
//
//
//    @Bean
//    public CodeGenerateDbConfig initCodeGenerateDbConfig() {
//        if(StringUtils.isNotBlank(url)){
//            if(StringUtils.isNotBlank(publicKey)){
//                try {
//                    password = ConfigTools.decrypt(publicKey, password);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//            CodegenDatasourceConfig.initDbConfig(driverClassName,url, username, password);
//            log.info(" 使用application.yml的DB配置 ###################");
//        }
//        return null;
//    }
//}

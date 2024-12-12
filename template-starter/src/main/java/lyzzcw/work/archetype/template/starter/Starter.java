package lyzzcw.work.archetype.template.starter;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lzy
 * @version 1.0
 * Date: 2023/7/5 10:26
 * Description: No Description
 */
@SpringBootApplication
@MapperScan("lyzzcw.work.archetype.template.infrastructure.mapper")
@ComponentScan(basePackages = {"lyzzcw.work.archetype.template"})
//@EnableDiscoveryClient
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);
    }
}

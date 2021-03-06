package con.demo.Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config_App {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Config_App.class,args);
    }
}

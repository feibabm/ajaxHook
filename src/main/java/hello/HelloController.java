package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by feibabm on 2017/8/8 0008.
 */
@SpringBootApplication
@RestController
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/log" , method = RequestMethod.POST)
    public void log(String info){
        log.info(info);
//        Arrays.asList(info).forEach(o -> log.info(o.toString()));

//        info.forEach(o -> {
//            log.info(o);
//        });
    }

    @RequestMapping("/hello")
    public void hello(){

    }
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}

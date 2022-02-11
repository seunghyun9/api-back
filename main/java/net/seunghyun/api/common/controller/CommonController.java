package net.seunghyun.api.common.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: net.seunghyun.api.common.controller
 * fileName   : CommonController
 * author     : seunghyun9
 * date       : 2022-02-11
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-11     seunghyun9    최초 생성
 */
@RestController //외부와 통신을 위해서 사용 네트워크를해줌
public class CommonController {
    @RequestMapping("/")
    public String now(){
           return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}

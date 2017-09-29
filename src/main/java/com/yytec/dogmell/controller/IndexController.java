package com.yytec.dogmell.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 30/08/2017 22:38
 *
 * @author yangqiankun
 */
@RestController
@RequestMapping("/api")
@Slf4j
public class IndexController {

    @GetMapping
    public String index() {
        return "大家好，我是杨大宝";
    }

    @GetMapping("weather/now.json")
    public String now() {
        return "{\"results\":[{\"location\":{\"id\":\"WS10730EM8EV\",\"name\":\"深圳\",\"country\":\"CN\",\"path\":\"深圳,深圳,广东,中国\",\"timezone\":\"Asia/Shanghai\",\"timezone_offset\":\"+08:00\"},\"now\":{\"text\":\"多云\",\"code\":\"4\",\"temperature\":\"31\"},\"last_update\":\"2017-09-01T17:20:00+08:00\"}]}";
    }

    @GetMapping("code")
    public void code(HttpServletResponse response, @RequestParam String redirect_uri) throws Exception {
        log.info("******redirect_uri:{}", redirect_uri);
        response.sendRedirect(redirect_uri + "?code=" + new Date().getTime());
    }
}

package com.example.helloworld.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comm")
public class CommonController {


    /**
     *  1.发布POST请求
     *    入参注解: @RequestBody
     *    返回注解: @ResponseBody(@RestController包含此注解)
     * */
    @PostMapping("/f1")
    public Object f1(@RequestBody Object obj) {
        //log.info("CommonController->f1,接收参数,obj = " + obj.toString());
        //log.info("CommonController->f1,处理业务.");
        //log.info("CommonController->f1,返回.");
        System.out.println("CommonController->f1,接收参数,obj = " + obj.toString());
        return ResultObj.builder().code("200").message("成功").build();
    }
    /**
     *  2.发布GET请求
     *    入参注解: @RequestParam
     *    返回注解: @ResponseBody(@RestController包含此注解)
     * */
    @GetMapping("/f2")
    public Object f2(@RequestParam("obj") String obj) {
        //log.info("CommonController->f2,接收参数,obj = " + obj.toString());
        //log.info("CommonController->f2,处理业务.");
        //log.info("CommonController->f2,返回.");
        System.out.println("CommonController->f2,接收参数,obj = " + obj.toString());
        return ResultObj.builder().code("200").message("成功").build();
    }
    /**
     *  3.发布GET请求
     *    入参注解: @PathVariable
     *    返回注解: @ResponseBody(@RestController包含此注解)
     * */
    @GetMapping ("/f3/{obj}")
    public Object f3(@PathVariable("obj") String obj) {
        //log.info("CommonController->f3,接收参数,obj = " + obj.toString());
        //log.info("CommonController->f3,处理业务.");
        //log.info("CommonController->f3,返回.");
        System.out.println("CommonController->f3,接收参数,obj = " + obj.toString());
        return ResultObj.builder().code("200").message("成功").build();
    }
}



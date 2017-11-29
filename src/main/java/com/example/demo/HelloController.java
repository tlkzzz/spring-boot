package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//不需要渲染模板直接返回
//@RestController
//需要渲染模板th
@Controller
public class HelloController {


//    @RequestMapping(value="/p")
//    public  Map<String,Object> home(){
//        System.out.println("进入P方法啦! ");
//
//        Map<String,Object>  map=new HashMap<String,Object>();
//        List list=new ArrayList();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        map.put("list",list);
//        map.put("success",200);
//
////        {
////            "success": 200,
////                "list": [
////                       "a",
////                       "b",
////                       "c"
////                      ]
////        }
//        return  map;
//    }
//
//    @RequestMapping(value="/n/{id}")
//    public String n(@PathVariable String id){
//        System.out.println(id);
//        return "hello"+id;
//    }


//    /**
//     * 返回
//     * @param model
//     * @return
//     */
//    @RequestMapping(value="/t",method = RequestMethod.GET)
//    public String t(@PathVariable String id, Model model){
//
//        return "ssss"+id;
//    }



//    @RequestMapping(value="/k")
//    public String k( Model model){
//        System.out.println("kkkkkkkkkkk");
//        model.addAttribute("name","abc");
//        System.out.println("kkkkkkkkkkk");
//        return "/index";
//    }


    //ssss
    /**
     * 进入模板渲染到页面
     * @param request
     * @return
     */
      @RequestMapping(value="/hello",method = RequestMethod.GET)
      public String hello(HttpServletRequest request) {
//        String id=request.getParameter("id");
//        Map<String,Object>  map=new HashMap<String,Object>();
          request.setAttribute("name", "chenfan");
      return "index";

      }


}

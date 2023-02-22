package top.caoayu.livehelper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.caoayu.livehelper.common.config.response.ResponseResult;

import java.util.HashMap;
import java.util.List;


@RestController
public class HomeController {
    @RequestMapping()
    public ResponseResult<String> home(){
        return ResponseResult.success("Hello,LiveHelper!");
    }
    @RequestMapping("/test")
    public ResponseResult<HashMap<String, Object>> Test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "lili");
        map.put("age", 18);
        return ResponseResult.success(map);
    }
    @RequestMapping("/tests")
    public ResponseResult<List<HashMap<String,Object>>> Tests(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "lili");
        map.put("age", 18);
        return ResponseResult.success(List.of(map));
    }
}

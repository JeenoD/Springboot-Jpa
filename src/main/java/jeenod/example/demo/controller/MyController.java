package jeenod.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import jeenod.example.demo.pojo.UserDO;
import jeenod.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 17:07
 */
@Api(tags="APIs")
@RestController
public class MyController {

    @Resource
    UserService service;

    @GetMapping("/users")
    @ApiOperation("get all users")
    public List<UserDO> getAllUsers(){
        return service.getAllUsers();
    }


    @GetMapping("/user/{id}")
    // here should be apiParam, not ApiImplicitParam(cannot transfer id from String to Integer, still dont find out the reason)
    @ApiParam(name = "id", value = "must be a numeric", required = true)
    @ApiOperation("get user by id")
    public UserDO getUserById(@PathVariable("id") Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/users/age/min/{age}")
    @ApiParam(name = "age", value = "min age", required = true)
    @ApiOperation("get users whose age >= age")
    public List<UserDO> getUsersHasGreaterAge(@PathVariable("age") Integer age){
        return service.getUsersGreaterOrEqualThanAge(age);
    }

    @GetMapping("/users/gender/{male}")
    @ApiParam(name = "male", value = "choose male?", required = true)
    public List<UserDO> getUSersByGender(@PathVariable("male") Boolean male){
        return service.getUsersByGender(male);
    }
}

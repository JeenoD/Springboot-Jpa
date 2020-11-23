package jeenod.example.demo.controller;

import io.swagger.annotations.*;
import jeenod.example.demo.pojo.MilkAcceptDO;
import jeenod.example.demo.pojo.SimpleUserDTO;
import jeenod.example.demo.pojo.UserDO;
import jeenod.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jeeno
 * @mail jeenocruise@gmail.com
 * @date 2019/7/9 17:07
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

    @GetMapping("/simplified/users")
    @ApiOperation("get all simplified users")
    public List<SimpleUserDTO> getAllSimpleUsers() { return service.getAllSimpleUsers();}


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

    /**
     * actually, it would be better for POST method, but its not our point here.
     */
    @GetMapping("/user")
    @ApiOperation("update one's age by name")
    public void updateAgeByName(String name, Integer age){
        service.update(name, age);
    }

    @GetMapping("/milk")
    @ApiOperation("the record of acceptance of milk")
    public MilkAcceptDO milkAccept(String name, String address, Long bottles) {
        return service.sendMilk(name, address, bottles);
    }
}

package jeenod.example.demo.service;

import jeenod.example.demo.pojo.MilkAcceptDO;
import jeenod.example.demo.pojo.SimpleUserDTO;
import jeenod.example.demo.pojo.UserDO;

import java.util.List;

/**
 * @author Jeeno
 * @mail jeenocruise@gmail.com
 * @date 2019/7/9 17:16
 */
public interface UserService {
    /**
     * get all users in db
     * @return List
     */
    List<UserDO> getAllUsers();

    /**
     * get all users (SimpleUserDTO) in db
     * @return List
     */
    List<SimpleUserDTO> getAllSimpleUsers();

    /**
     * get user info by id
     * @param id Integer
     * @return UserDO
     */
    UserDO getUserById(Integer id);

    /**
     * get all users whose age >= gived
     * @param age Integer
     * @return List<UserDO>
     */
    List<UserDO> getUsersGreaterOrEqualThanAge(Integer age);

    /**
     * get all users by gender
     * @param ismale Boolean
     * @return List<UserDO>
     */
    List<UserDO> getUsersByGender(Boolean ismale);

    /**
     * update user's age by name
     * @param name username
     * @param age age
     */
    void update(String name, Integer age);

    /**
     * record accept information
     * @param name username
     * @param address address
     * @param num bottles
     * @return MilkAcceptDTO
     */
    MilkAcceptDO sendMilk(String name, String address, Long num);
}

package jeenod.example.demo.service;

import jeenod.example.demo.pojo.UserDO;

import java.util.List;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 17:16
 */
public interface UserService {
    /**
     * get all users in db
     * @return
     */
    List<UserDO> getAllUsers();

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
}

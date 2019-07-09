package jeenod.example.demo.repository;

import jeenod.example.demo.pojo.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 17:12
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {

    /**
     * get a list containing all users in table User
     * @return List<UserDO>
     */
    List<UserDO> findAllByIdNotNull();

    /**
     * get user info by id
     * @param id
     * @return
     */
    UserDO getById(Integer id);

    /**
     * get all users whose age >= gived
     * @param age Integer
     * @return List<UserDO>
     */
    List<UserDO> getAllByAgeGreaterThanEqual(Integer age);

    /**
     * get all users by gender
     * notice: the UserDO in @Query is the pojo, not the table name 'user',
     *          using @Query, you can define the query logic, no need to use specific name of method
     * @param ismale Boolean
     * @return List<UserDO>
     */
    @Query("from UserDO where male = :ismale")
    List<UserDO> getListByMale(Boolean ismale);
}

package jeenod.example.demo.service.Impl;

import jeenod.example.demo.pojo.UserDO;
import jeenod.example.demo.repository.UserRepository;
import jeenod.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 17:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Override
    public List<UserDO> getAllUsers() {
        return repository.findAllByIdNotNull();
    }

    @Override
    public UserDO getUserById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<UserDO> getUsersGreaterOrEqualThanAge(Integer age) {
        return repository.getAllByAgeGreaterThanEqual(age);
    }

    @Override
    public List<UserDO> getUsersByGender(Boolean ismale) {
        return repository.getListByMale(ismale);
    }


}

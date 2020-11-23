package jeenod.example.demo.service.Impl;

import jeenod.example.demo.pojo.MilkAcceptDO;
import jeenod.example.demo.pojo.SimpleUserDTO;
import jeenod.example.demo.pojo.UserDO;
import jeenod.example.demo.repository.MilkAcceptRepository;
import jeenod.example.demo.repository.UserRepository;
import jeenod.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Jeeno
 * @mail jeenocruise@gmail.com
 * @date 2019/7/9 17:17
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository repository;

    @Resource
    private MilkAcceptRepository acceptRepository;

    @Override
    public List<UserDO> getAllUsers() {
        return repository.findAllByIdNotNull();
    }

    @Override
    public List<SimpleUserDTO> getAllSimpleUsers() {
        return repository.getSimpleList();
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

    @Override
    public void update(String name, Integer age) {
        repository.updateAgeByName(name, age);
    }

    @Override
    public MilkAcceptDO sendMilk(String name, String address, Long num) {
        MilkAcceptDO acceptDO = MilkAcceptDO.builder().username(name).address(address).bottles(num).build();
        return acceptRepository.save(acceptDO);
    }


}

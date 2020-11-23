package jeenod.example.demo.repository;

import jeenod.example.demo.pojo.CombinedId;
import jeenod.example.demo.pojo.MilkAcceptDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Jeeno
 * @version 2.7.0
 * @date 2020/11/23 10:20
 */
@Repository
public interface MilkAcceptRepository extends JpaRepository<MilkAcceptDO, CombinedId> {

}

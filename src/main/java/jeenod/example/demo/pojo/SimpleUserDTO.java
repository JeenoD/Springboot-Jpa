package jeenod.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

/**
 * simplified POJO of UserDO
 * @Author: Du Jiahao
 * @Date: 2019/8/5 0005 21:00
 */
@Data
@AllArgsConstructor
@ToString
@Builder
public class SimpleUserDTO {
    private String name;
    private Integer age;
}

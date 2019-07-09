package jeenod.example.demo.pojo;

import lombok.Data;

import javax.persistence.*;


/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/9 17:02
 */
@Entity
@Table(name = "User") // db table corresponding to the obj
@Data   // Getter & Setter
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private Boolean male;
}

package jeenod.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Jeeno
 * @version 2.7.0
 * @date 2020/11/23 10:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CombinedId implements Serializable {

    private String username;

    private String address;
}

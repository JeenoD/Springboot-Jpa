package jeenod.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Jeeno
 * @version 2.7.0
 * @date 2020/11/23 10:18
 */
@Data
@Builder
@Table(name = "milk_accept")
@Entity
@IdClass(CombinedId.class)
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class MilkAcceptDO {

    @Id
    private String username;

    @Id
    private String address;

    private Long bottles;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;
}

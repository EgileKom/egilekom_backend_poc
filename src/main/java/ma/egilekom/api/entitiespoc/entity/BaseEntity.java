package ma.egilekom.api.entitiespoc.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter
@Setter
public abstract class BaseEntity  implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    // TODO: 3/12/2023 every entity in my project has
    //  id uuid , created_at , updated_at ,
    //  check_by[array] , tag ,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    private String version = UUID.randomUUID().toString();

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "CREATED_AT")
    protected String createdAt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "UPDATED_AT")
    protected LocalDateTime updatedAt;
    private String checkBy;
    private String tag;
    @Column(name = "BASE_KEY")
    private String key;
    private String updateBy;
    private String createBy;




}

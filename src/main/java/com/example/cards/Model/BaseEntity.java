package com.example.cards.Model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass // Main Class "Inheritance", To Make sure That No repetition In The Code.
public class BaseEntity {
    // Creates Date
    @CreatedDate
    Date createDate;
    // Update up tp date
    @UpdateTimestamp
    Date updateDate; //for update date
    Boolean isActive;
}

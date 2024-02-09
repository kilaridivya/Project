package my.devicesworld.iscada.device.data.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class AuditEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "uuid")
    protected UUID uuid;

    @Column(name = "created_datetime", nullable = false, updatable = false)
    @CreatedDate
    protected LocalDateTime createdDateTime;

    @Column(name = "modified_datetime")
    @LastModifiedDate
    protected LocalDateTime modifiedDateTime;

    @CreatedBy
    protected String createdBy;

    public AuditEntity() {
        this.createdDateTime = LocalDateTime.now();
    }

}

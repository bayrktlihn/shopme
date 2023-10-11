package io.bayrktlihn.shopme.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class BaseEntity {

    @Column(columnDefinition = "boolean not null default true")
    private Boolean active = Boolean.TRUE;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deactivatedDate;

    @Version
    @Column(columnDefinition = "bigint not null default 0")
    private Long version = 0L;


    @PrePersist
    void prePersist() {
        createdDate = LocalDateTime.now();
    }

    @PreUpdate
    void preUpdate() {
        updatedDate = LocalDateTime.now();
    }

    public void deactive() {
        active = false;
        deactivatedDate = LocalDateTime.now();
    }


}

package io.bayrktlihn.shopme.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Column(columnDefinition = "boolean not null default true")
    private Boolean active = Boolean.TRUE;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deactivatedDate;


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

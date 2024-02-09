package my.devicesworld.iscada.device.data.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.devicesworld.iscada.device.data.entity.AuditEntity;
import my.devicesworld.iscada.device.enums.DeviceModel;
import my.devicesworld.iscada.device.enums.DeviceStatus;
import my.devicesworld.iscada.device.enums.DeviceType;
import my.devicesworld.iscada.device.util.AppConstants;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = AppConstants.DbConstants.TB_DEVICE,
        schema = AppConstants.DbConstants.SCHEMA_NAME
)
@Builder
public class Device extends AuditEntity
{
     protected int quantity;
     @Enumerated(value = EnumType.STRING)
     protected  DeviceType deviceType;

     protected DeviceModel model;
     @Enumerated(value = EnumType.STRING)
     protected DeviceStatus status;

     protected String deviceNo;

     public void setStatus(DeviceStatus status) {
          this.status = status;
     }


}

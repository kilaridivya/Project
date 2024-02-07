package my.devicesworld.iscada.device.data.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.devicesworld.iscada.device.util.AppConstants;

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
     private UUID customerUuid;
}

package my.devicesworld.iscada.device.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuditModel
{
    protected LocalDateTime createdDateTime;
    protected LocalDateTime modifiedDateTime;
    protected String createdBy;
}

package my.devicesworld.iscada.device.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import my.devicesworld.iscada.device.enums.DeviceModel;
import my.devicesworld.iscada.device.enums.DeviceStatus;
import my.devicesworld.iscada.device.enums.DeviceType;
import my.devicesworld.iscada.device.model.AuditModel;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeviceListItem extends AuditModel
{
    protected UUID customerUuid;
    protected int quantity;
    protected DeviceType deviceType;
    protected DeviceModel model;
    protected DeviceStatus status;

    protected String deviceNo;
}

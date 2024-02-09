package my.devicesworld.iscada.device.model.request.create;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import my.devicesworld.iscada.device.enums.DeviceModel;
import my.devicesworld.iscada.device.enums.DeviceStatus;
import my.devicesworld.iscada.device.enums.DeviceType;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateDeviceRequest {

    protected int quantity;
    protected DeviceType deviceType;

    protected DeviceModel model;
    protected DeviceStatus status;

    protected String deviceNo;

}

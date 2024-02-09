package my.devicesworld.iscada.device.model.response;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import my.devicesworld.iscada.device.enums.DeviceModel;
import my.devicesworld.iscada.device.enums.DeviceStatus;
import my.devicesworld.iscada.device.enums.DeviceType;
import java.util.UUID;

@Data
public class CreateDeviceResponse {

    protected int quantity;
    @Enumerated(value = EnumType.STRING)
    protected  DeviceType deviceType;

    protected DeviceModel model;
    @Enumerated(value = EnumType.STRING)
    protected DeviceStatus status;

    protected String deviceNo;

}


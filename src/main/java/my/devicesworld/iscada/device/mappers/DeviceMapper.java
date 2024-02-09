package my.devicesworld.iscada.device.mappers;
import my.devicesworld.iscada.device.data.entity.Device;
import my.devicesworld.iscada.device.model.request.create.CreateDeviceRequest;
import my.devicesworld.iscada.device.model.response.CreateDeviceResponse;
import my.devicesworld.iscada.device.model.response.DeviceListItem;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

@Mapper
public interface DeviceMapper {
    DeviceMapper DEVICE_MAPPER = Mappers.getMapper(DeviceMapper.class);
    Device toEntity(CreateDeviceRequest model);
    CreateDeviceResponse toModel(Device device);
    DeviceListItem toListItem(Device device);
}
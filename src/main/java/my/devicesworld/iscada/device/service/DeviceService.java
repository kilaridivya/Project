package my.devicesworld.iscada.device.service;
import my.devicesworld.iscada.device.model.request.create.CreateDeviceRequest;
import my.devicesworld.iscada.device.model.response.CreateDeviceResponse;
import my.devicesworld.iscada.device.model.response.DeviceListItem;
import my.devicesworld.iscada.device.model.response.DeviceNoAvailabilityResponse;
import my.devicesworld.iscada.device.model.response.PageResponse;

public interface DeviceService {
    PageResponse<DeviceListItem> getAllDevices(int currentPage, int pageSize);
    CreateDeviceResponse addDevice(CreateDeviceRequest model);
    DeviceNoAvailabilityResponse verifyDeviceNoAvailability(String deviceNo) ;


}

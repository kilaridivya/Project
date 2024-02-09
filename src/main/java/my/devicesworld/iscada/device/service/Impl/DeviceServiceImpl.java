package my.devicesworld.iscada.device.service.Impl;

import my.devicesworld.iscada.device.data.entity.Device;
import my.devicesworld.iscada.device.data.repo.DeviceRepo;
import my.devicesworld.iscada.device.enums.DeviceStatus;
import my.devicesworld.iscada.device.model.request.create.CreateDeviceRequest;
import my.devicesworld.iscada.device.model.response.CreateDeviceResponse;
import my.devicesworld.iscada.device.model.response.DeviceListItem;
import my.devicesworld.iscada.device.model.response.DeviceNoAvailabilityResponse;
import my.devicesworld.iscada.device.model.response.PageResponse;
import my.devicesworld.iscada.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static my.devicesworld.iscada.device.mappers.DeviceMapper.DEVICE_MAPPER;

@Service
public class DeviceServiceImpl implements DeviceService {
    @Autowired
    private DeviceRepo deviceRepo;

    @Override
    public PageResponse<DeviceListItem> getAllDevices(int currentPage, int pageSize) {
        PageRequest pageRequest = PageRequest.of(currentPage, pageSize);
        Page<Device> devicesPage = deviceRepo.findAll(pageRequest);
        return PageResponse.<DeviceListItem>builder()
                .currentPage(currentPage)
                .currentPageSize(devicesPage.getNumberOfElements())
                .total(devicesPage.getTotalElements())
                .hasNextPage(devicesPage.hasNext())
                .list(devicesPage.getContent()
                        .stream()
                        .map(this::mapToDeviceListItem)
                        .collect(toList()))
                .build();
    }

    private DeviceListItem mapToDeviceListItem(Device device) {

        // Assuming you have a method to map a Device entity to a DeviceListItem
        return DEVICE_MAPPER.toListItem(device); // You need to implement this mapping
    }

    @Override
    public CreateDeviceResponse addDevice(CreateDeviceRequest model) {
        Device toBeSaved = DEVICE_MAPPER.toEntity(model);
        toBeSaved.setStatus(DeviceStatus.UNBLOCK);

        Device savedDevice = deviceRepo.save(toBeSaved);

        return DEVICE_MAPPER.toModel(savedDevice);
    }

    @Override
    public DeviceNoAvailabilityResponse verifyDeviceNoAvailability(String deviceNo)  {
        boolean isExist = deviceRepo.findByDeviceNo(deviceNo).isPresent();
        return DeviceNoAvailabilityResponse.builder()
                .available(!isExist)
                .build();
    }


}

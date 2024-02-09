package my.devicesworld.iscada.device.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import my.devicesworld.iscada.device.model.request.create.CreateDeviceRequest;
import my.devicesworld.iscada.device.model.response.CreateDeviceResponse;
import my.devicesworld.iscada.device.model.response.DeviceListItem;
import my.devicesworld.iscada.device.model.response.DeviceNoAvailabilityResponse;
import my.devicesworld.iscada.device.model.response.PageResponse;
import my.devicesworld.iscada.device.service.DeviceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/devices-api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Tag(name = "Devices",description = "Provides Device APIs")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/all")
    public ResponseEntity<Object> getAllDevices(@RequestParam int currentPage,
                                                @RequestParam int pageSize) {
        PageResponse<DeviceListItem> items = deviceService.getAllDevices(currentPage,pageSize);
        return ResponseEntity.ok(items);
    }

    @Operation(summary = "Add new device", description = "This method adds new device")
    @PostMapping("/add")
    public ResponseEntity<CreateDeviceResponse> addDevice(@Valid @RequestBody CreateDeviceRequest device)
    {
        CreateDeviceResponse response = deviceService.addDevice(device);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/checkCustomerIdAvailability")
    public ResponseEntity<DeviceNoAvailabilityResponse> checkDeviceNoAvailability(@RequestParam
                                                                                      @NotNull
                                                                                      String deviceNo)
    {
        DeviceNoAvailabilityResponse customResponse =deviceService.verifyDeviceNoAvailability(deviceNo);
        return ResponseEntity.ok(customResponse);
    }

}

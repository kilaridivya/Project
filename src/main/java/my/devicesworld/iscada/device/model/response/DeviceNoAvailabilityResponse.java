package my.devicesworld.iscada.device.model.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class DeviceNoAvailabilityResponse {

    private boolean available;

    // No need for the custom builder method
}

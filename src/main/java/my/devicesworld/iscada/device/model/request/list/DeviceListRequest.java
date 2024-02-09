package my.devicesworld.iscada.device.model.request.list;
import lombok.Data;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.UUID;

@Data
public class DeviceListRequest {
    private UUID customerUuid;
    int currentPage;
    int pageSize;
}

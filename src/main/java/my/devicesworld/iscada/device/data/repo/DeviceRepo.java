package my.devicesworld.iscada.device.data.repo;

import my.devicesworld.iscada.device.data.entity.Device;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface DeviceRepo extends JpaRepository<Device, UUID>

{
    Optional<Device> findByDeviceNo(String id);
    Page<Device> findAll(Pageable pageable);

}

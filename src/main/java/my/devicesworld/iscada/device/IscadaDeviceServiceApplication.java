package my.devicesworld.iscada.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

@EntityScan(basePackages = {"my.devicesworld.iscada.device.data.entity"})

public class IscadaDeviceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IscadaDeviceServiceApplication.class, args);


    }

}
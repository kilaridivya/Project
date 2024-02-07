package my.devicesworld.iscada.device.util;

public class AppConstants {

    public static class ValidationConstants
    {
        public static final int MIN_AND_MAX_CUSTOMER_ID_LENGTH = 5;
        public static final int MAX_CUSTOMER_NAME_LENGTH = 60;
        public static final int MIN_CUSTOMER_NAME_LENGTH = 5;
        public static final int MAX_COMPANY_NAME_LENGTH = 60;

    }

    public static class DbConstants
    {
        public static final String SCHEMA_NAME = "iscada-device";
        public static final String TB_DEVICE = "devices";
    }
}

package my.devicesworld.iscada.device.model.response;

import lombok.Data;

import java.util.List;
@Data
public class PageResponse<T> {
    private int currentPage;
    private int currentPageSize;
    private long total;
    private boolean hasNextPage;
    private List<T> list;

    // Private constructor to prevent direct instantiation
    private PageResponse() {}
    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    // Getter methods for private fields


    // Builder class for constructing instances of PageResponse
    public static class Builder<T> {
        private final PageResponse<T> pageResponse = new PageResponse<>();

        public Builder<T> currentPage(int currentPage) {
            pageResponse.currentPage = currentPage;
            return this;
        }

        public Builder<T> currentPageSize(int currentPageSize) {
            pageResponse.currentPageSize = currentPageSize;
            return this;
        }

        public Builder<T> total(long total) {
            pageResponse.total = total;
            return this;
        }

        public Builder<T> hasNextPage(boolean hasNextPage) {
            pageResponse.hasNextPage = hasNextPage;
            return this;
        }

        public Builder<T> list(List<T> list) {
            pageResponse.list = list;
            return this;
        }

        public PageResponse<T> build() {
            return pageResponse;
        }
    }
}

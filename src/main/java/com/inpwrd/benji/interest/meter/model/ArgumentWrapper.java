package com.inpwrd.benji.interest.meter.model;

public class ArgumentWrapper {

    private final String basePath;
    private final boolean refreshCache;
    private final Integer concurrentClients;

    public ArgumentWrapper(String basePath, boolean refreshCache, Integer concurrentClients) {
        this.basePath = basePath;
        this.refreshCache = refreshCache;
        this.concurrentClients = concurrentClients;
    }

    public static ArgumentWrapperBuilder builder() {
        return new ArgumentWrapperBuilder();
    }

    public String getBasePath() {
        return basePath;
    }

    public boolean isRefreshCache() {
        return refreshCache;
    }

    public Integer getConcurrentClients() {
        return concurrentClients;
    }

    public static class ArgumentWrapperBuilder {
        private String basePath;
        private boolean refreshCache;
        private Integer concurrentClients;

        public ArgumentWrapperBuilder basePath(final String basePath) {
            this.basePath = basePath;
            return this;
        }

        public ArgumentWrapperBuilder refreshCache(final boolean refreshCache) {
            this.refreshCache = refreshCache;
            return this;
        }

        public ArgumentWrapperBuilder concurrentClients(final Integer concurrentClients) {
            this.concurrentClients = concurrentClients;
            return this;
        }

        public ArgumentWrapper build() {
            return new ArgumentWrapper(basePath, refreshCache, concurrentClients);
        }
    }
}

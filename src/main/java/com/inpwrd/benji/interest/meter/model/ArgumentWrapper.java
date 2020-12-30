package com.inpwrd.benji.interest.meter.model;

public class ArgumentWrapper {

    private final String basePath;
    private final boolean refreshCache;

    public ArgumentWrapper(String basePath, boolean refreshCache) {
        this.basePath = basePath;
        this.refreshCache = refreshCache;
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

    public static class ArgumentWrapperBuilder {
        private String basePath;
        private boolean refreshCache;

        public ArgumentWrapperBuilder basePath(final String basePath) {
            this.basePath = basePath;
            return this;
        }

        public ArgumentWrapperBuilder refreshCache(final boolean refreshCache) {
            this.refreshCache = refreshCache;
            return this;
        }

        public ArgumentWrapper build() {
            return new ArgumentWrapper(basePath, refreshCache);
        }
    }
}

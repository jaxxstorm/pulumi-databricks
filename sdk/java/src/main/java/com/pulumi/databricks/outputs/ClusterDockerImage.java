// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterDockerImageBasicAuth;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterDockerImage {
    private @Nullable ClusterDockerImageBasicAuth basicAuth;
    private String url;

    private ClusterDockerImage() {}
    public Optional<ClusterDockerImageBasicAuth> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }
    public String url() {
        return this.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDockerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterDockerImageBasicAuth basicAuth;
        private String url;
        public Builder() {}
        public Builder(ClusterDockerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicAuth = defaults.basicAuth;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder basicAuth(@Nullable ClusterDockerImageBasicAuth basicAuth) {
            this.basicAuth = basicAuth;
            return this;
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public ClusterDockerImage build() {
            final var o = new ClusterDockerImage();
            o.basicAuth = basicAuth;
            o.url = url;
            return o;
        }
    }
}

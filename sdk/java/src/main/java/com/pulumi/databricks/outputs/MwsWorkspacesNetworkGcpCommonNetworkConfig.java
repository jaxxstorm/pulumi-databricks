// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesNetworkGcpCommonNetworkConfig {
    private String gkeClusterMasterIpRange;
    private String gkeConnectivityType;

    private MwsWorkspacesNetworkGcpCommonNetworkConfig() {}
    public String gkeClusterMasterIpRange() {
        return this.gkeClusterMasterIpRange;
    }
    public String gkeConnectivityType() {
        return this.gkeConnectivityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesNetworkGcpCommonNetworkConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String gkeClusterMasterIpRange;
        private String gkeConnectivityType;
        public Builder() {}
        public Builder(MwsWorkspacesNetworkGcpCommonNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterMasterIpRange = defaults.gkeClusterMasterIpRange;
    	      this.gkeConnectivityType = defaults.gkeConnectivityType;
        }

        @CustomType.Setter
        public Builder gkeClusterMasterIpRange(String gkeClusterMasterIpRange) {
            this.gkeClusterMasterIpRange = Objects.requireNonNull(gkeClusterMasterIpRange);
            return this;
        }
        @CustomType.Setter
        public Builder gkeConnectivityType(String gkeConnectivityType) {
            this.gkeConnectivityType = Objects.requireNonNull(gkeConnectivityType);
            return this;
        }
        public MwsWorkspacesNetworkGcpCommonNetworkConfig build() {
            final var o = new MwsWorkspacesNetworkGcpCommonNetworkConfig();
            o.gkeClusterMasterIpRange = gkeClusterMasterIpRange;
            o.gkeConnectivityType = gkeConnectivityType;
            return o;
        }
    }
}

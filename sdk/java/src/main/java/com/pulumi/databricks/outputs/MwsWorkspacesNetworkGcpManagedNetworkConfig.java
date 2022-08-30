// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MwsWorkspacesNetworkGcpManagedNetworkConfig {
    private final String gkeClusterPodIpRange;
    private final String gkeClusterServiceIpRange;
    private final String subnetCidr;

    @CustomType.Constructor
    private MwsWorkspacesNetworkGcpManagedNetworkConfig(
        @CustomType.Parameter("gkeClusterPodIpRange") String gkeClusterPodIpRange,
        @CustomType.Parameter("gkeClusterServiceIpRange") String gkeClusterServiceIpRange,
        @CustomType.Parameter("subnetCidr") String subnetCidr) {
        this.gkeClusterPodIpRange = gkeClusterPodIpRange;
        this.gkeClusterServiceIpRange = gkeClusterServiceIpRange;
        this.subnetCidr = subnetCidr;
    }

    public String gkeClusterPodIpRange() {
        return this.gkeClusterPodIpRange;
    }
    public String gkeClusterServiceIpRange() {
        return this.gkeClusterServiceIpRange;
    }
    public String subnetCidr() {
        return this.subnetCidr;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsWorkspacesNetworkGcpManagedNetworkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gkeClusterPodIpRange;
        private String gkeClusterServiceIpRange;
        private String subnetCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(MwsWorkspacesNetworkGcpManagedNetworkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterPodIpRange = defaults.gkeClusterPodIpRange;
    	      this.gkeClusterServiceIpRange = defaults.gkeClusterServiceIpRange;
    	      this.subnetCidr = defaults.subnetCidr;
        }

        public Builder gkeClusterPodIpRange(String gkeClusterPodIpRange) {
            this.gkeClusterPodIpRange = Objects.requireNonNull(gkeClusterPodIpRange);
            return this;
        }
        public Builder gkeClusterServiceIpRange(String gkeClusterServiceIpRange) {
            this.gkeClusterServiceIpRange = Objects.requireNonNull(gkeClusterServiceIpRange);
            return this;
        }
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = Objects.requireNonNull(subnetCidr);
            return this;
        }        public MwsWorkspacesNetworkGcpManagedNetworkConfig build() {
            return new MwsWorkspacesNetworkGcpManagedNetworkConfig(gkeClusterPodIpRange, gkeClusterServiceIpRange, subnetCidr);
        }
    }
}
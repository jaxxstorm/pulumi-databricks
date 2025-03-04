// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobJobClusterNewClusterWorkloadTypeClients;
import java.util.Objects;

@CustomType
public final class JobJobClusterNewClusterWorkloadType {
    private JobJobClusterNewClusterWorkloadTypeClients clients;

    private JobJobClusterNewClusterWorkloadType() {}
    public JobJobClusterNewClusterWorkloadTypeClients clients() {
        return this.clients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterWorkloadType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private JobJobClusterNewClusterWorkloadTypeClients clients;
        public Builder() {}
        public Builder(JobJobClusterNewClusterWorkloadType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
        }

        @CustomType.Setter
        public Builder clients(JobJobClusterNewClusterWorkloadTypeClients clients) {
            this.clients = Objects.requireNonNull(clients);
            return this;
        }
        public JobJobClusterNewClusterWorkloadType build() {
            final var o = new JobJobClusterNewClusterWorkloadType();
            o.clients = clients;
            return o;
        }
    }
}

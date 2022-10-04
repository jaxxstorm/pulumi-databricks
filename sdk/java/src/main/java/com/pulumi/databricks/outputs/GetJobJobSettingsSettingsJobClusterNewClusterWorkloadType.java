// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType {
    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients;

    private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType() {}
    public GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients() {
        return this.clients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clients = defaults.clients;
        }

        @CustomType.Setter
        public Builder clients(GetJobJobSettingsSettingsJobClusterNewClusterWorkloadTypeClients clients) {
            this.clients = Objects.requireNonNull(clients);
            return this;
        }
        public GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType build() {
            final var o = new GetJobJobSettingsSettingsJobClusterNewClusterWorkloadType();
            o.clients = clients;
            return o;
        }
    }
}
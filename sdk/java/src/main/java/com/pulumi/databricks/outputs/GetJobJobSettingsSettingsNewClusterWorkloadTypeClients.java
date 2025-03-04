// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterWorkloadTypeClients {
    private @Nullable Boolean jobs;
    private @Nullable Boolean notebooks;

    private GetJobJobSettingsSettingsNewClusterWorkloadTypeClients() {}
    public Optional<Boolean> jobs() {
        return Optional.ofNullable(this.jobs);
    }
    public Optional<Boolean> notebooks() {
        return Optional.ofNullable(this.notebooks);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterWorkloadTypeClients defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean jobs;
        private @Nullable Boolean notebooks;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterWorkloadTypeClients defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobs = defaults.jobs;
    	      this.notebooks = defaults.notebooks;
        }

        @CustomType.Setter
        public Builder jobs(@Nullable Boolean jobs) {
            this.jobs = jobs;
            return this;
        }
        @CustomType.Setter
        public Builder notebooks(@Nullable Boolean notebooks) {
            this.notebooks = notebooks;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterWorkloadTypeClients build() {
            final var o = new GetJobJobSettingsSettingsNewClusterWorkloadTypeClients();
            o.jobs = jobs;
            o.notebooks = notebooks;
            return o;
        }
    }
}

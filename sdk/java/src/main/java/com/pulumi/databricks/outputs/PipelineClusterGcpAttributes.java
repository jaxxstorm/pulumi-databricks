// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineClusterGcpAttributes {
    private final @Nullable String googleServiceAccount;

    @CustomType.Constructor
    private PipelineClusterGcpAttributes(@CustomType.Parameter("googleServiceAccount") @Nullable String googleServiceAccount) {
        this.googleServiceAccount = googleServiceAccount;
    }

    public Optional<String> googleServiceAccount() {
        return Optional.ofNullable(this.googleServiceAccount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineClusterGcpAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String googleServiceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineClusterGcpAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.googleServiceAccount = defaults.googleServiceAccount;
        }

        public Builder googleServiceAccount(@Nullable String googleServiceAccount) {
            this.googleServiceAccount = googleServiceAccount;
            return this;
        }        public PipelineClusterGcpAttributes build() {
            return new PipelineClusterGcpAttributes(googleServiceAccount);
        }
    }
}
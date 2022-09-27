// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstancePoolInstancePoolFleetAttributesFleetOnDemandOption {
    private String allocationStrategy;
    private @Nullable Integer instancePoolsToUseCount;

    private InstancePoolInstancePoolFleetAttributesFleetOnDemandOption() {}
    public String allocationStrategy() {
        return this.allocationStrategy;
    }
    public Optional<Integer> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePoolInstancePoolFleetAttributesFleetOnDemandOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationStrategy;
        private @Nullable Integer instancePoolsToUseCount;
        public Builder() {}
        public Builder(InstancePoolInstancePoolFleetAttributesFleetOnDemandOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
        }

        @CustomType.Setter
        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public InstancePoolInstancePoolFleetAttributesFleetOnDemandOption build() {
            final var o = new InstancePoolInstancePoolFleetAttributesFleetOnDemandOption();
            o.allocationStrategy = allocationStrategy;
            o.instancePoolsToUseCount = instancePoolsToUseCount;
            return o;
        }
    }
}

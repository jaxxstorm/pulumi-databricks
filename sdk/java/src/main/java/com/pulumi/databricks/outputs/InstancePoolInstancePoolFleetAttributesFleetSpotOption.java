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
public final class InstancePoolInstancePoolFleetAttributesFleetSpotOption {
    private String allocationStrategy;
    private @Nullable Integer instancePoolsToUseCount;

    private InstancePoolInstancePoolFleetAttributesFleetSpotOption() {}
    public String allocationStrategy() {
        return this.allocationStrategy;
    }
    public Optional<Integer> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePoolInstancePoolFleetAttributesFleetSpotOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationStrategy;
        private @Nullable Integer instancePoolsToUseCount;
        public Builder() {}
        public Builder(InstancePoolInstancePoolFleetAttributesFleetSpotOption defaults) {
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
        public InstancePoolInstancePoolFleetAttributesFleetSpotOption build() {
            final var o = new InstancePoolInstancePoolFleetAttributesFleetSpotOption();
            o.allocationStrategy = allocationStrategy;
            o.instancePoolsToUseCount = instancePoolsToUseCount;
            return o;
        }
    }
}

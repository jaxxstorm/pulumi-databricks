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
public final class JobJobClusterNewClusterAwsAttributes {
    private final @Nullable String availability;
    private final @Nullable Integer ebsVolumeCount;
    private final @Nullable Integer ebsVolumeSize;
    private final @Nullable String ebsVolumeType;
    private final @Nullable Integer firstOnDemand;
    private final @Nullable String instanceProfileArn;
    private final @Nullable Integer spotBidPricePercent;
    private final @Nullable String zoneId;

    @CustomType.Constructor
    private JobJobClusterNewClusterAwsAttributes(
        @CustomType.Parameter("availability") @Nullable String availability,
        @CustomType.Parameter("ebsVolumeCount") @Nullable Integer ebsVolumeCount,
        @CustomType.Parameter("ebsVolumeSize") @Nullable Integer ebsVolumeSize,
        @CustomType.Parameter("ebsVolumeType") @Nullable String ebsVolumeType,
        @CustomType.Parameter("firstOnDemand") @Nullable Integer firstOnDemand,
        @CustomType.Parameter("instanceProfileArn") @Nullable String instanceProfileArn,
        @CustomType.Parameter("spotBidPricePercent") @Nullable Integer spotBidPricePercent,
        @CustomType.Parameter("zoneId") @Nullable String zoneId) {
        this.availability = availability;
        this.ebsVolumeCount = ebsVolumeCount;
        this.ebsVolumeSize = ebsVolumeSize;
        this.ebsVolumeType = ebsVolumeType;
        this.firstOnDemand = firstOnDemand;
        this.instanceProfileArn = instanceProfileArn;
        this.spotBidPricePercent = spotBidPricePercent;
        this.zoneId = zoneId;
    }

    public Optional<String> availability() {
        return Optional.ofNullable(this.availability);
    }
    public Optional<Integer> ebsVolumeCount() {
        return Optional.ofNullable(this.ebsVolumeCount);
    }
    public Optional<Integer> ebsVolumeSize() {
        return Optional.ofNullable(this.ebsVolumeSize);
    }
    public Optional<String> ebsVolumeType() {
        return Optional.ofNullable(this.ebsVolumeType);
    }
    public Optional<Integer> firstOnDemand() {
        return Optional.ofNullable(this.firstOnDemand);
    }
    public Optional<String> instanceProfileArn() {
        return Optional.ofNullable(this.instanceProfileArn);
    }
    public Optional<Integer> spotBidPricePercent() {
        return Optional.ofNullable(this.spotBidPricePercent);
    }
    public Optional<String> zoneId() {
        return Optional.ofNullable(this.zoneId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterAwsAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availability;
        private @Nullable Integer ebsVolumeCount;
        private @Nullable Integer ebsVolumeSize;
        private @Nullable String ebsVolumeType;
        private @Nullable Integer firstOnDemand;
        private @Nullable String instanceProfileArn;
        private @Nullable Integer spotBidPricePercent;
        private @Nullable String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobJobClusterNewClusterAwsAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availability = defaults.availability;
    	      this.ebsVolumeCount = defaults.ebsVolumeCount;
    	      this.ebsVolumeSize = defaults.ebsVolumeSize;
    	      this.ebsVolumeType = defaults.ebsVolumeType;
    	      this.firstOnDemand = defaults.firstOnDemand;
    	      this.instanceProfileArn = defaults.instanceProfileArn;
    	      this.spotBidPricePercent = defaults.spotBidPricePercent;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder availability(@Nullable String availability) {
            this.availability = availability;
            return this;
        }
        public Builder ebsVolumeCount(@Nullable Integer ebsVolumeCount) {
            this.ebsVolumeCount = ebsVolumeCount;
            return this;
        }
        public Builder ebsVolumeSize(@Nullable Integer ebsVolumeSize) {
            this.ebsVolumeSize = ebsVolumeSize;
            return this;
        }
        public Builder ebsVolumeType(@Nullable String ebsVolumeType) {
            this.ebsVolumeType = ebsVolumeType;
            return this;
        }
        public Builder firstOnDemand(@Nullable Integer firstOnDemand) {
            this.firstOnDemand = firstOnDemand;
            return this;
        }
        public Builder instanceProfileArn(@Nullable String instanceProfileArn) {
            this.instanceProfileArn = instanceProfileArn;
            return this;
        }
        public Builder spotBidPricePercent(@Nullable Integer spotBidPricePercent) {
            this.spotBidPricePercent = spotBidPricePercent;
            return this;
        }
        public Builder zoneId(@Nullable String zoneId) {
            this.zoneId = zoneId;
            return this;
        }        public JobJobClusterNewClusterAwsAttributes build() {
            return new JobJobClusterNewClusterAwsAttributes(availability, ebsVolumeCount, ebsVolumeSize, ebsVolumeType, firstOnDemand, instanceProfileArn, spotBidPricePercent, zoneId);
        }
    }
}

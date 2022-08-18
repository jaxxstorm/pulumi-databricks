// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobNewClusterAutoscaleArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobNewClusterAutoscaleArgs Empty = new JobNewClusterAutoscaleArgs();

    @Import(name="maxWorkers")
    private @Nullable Output<Integer> maxWorkers;

    public Optional<Output<Integer>> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    @Import(name="minWorkers")
    private @Nullable Output<Integer> minWorkers;

    public Optional<Output<Integer>> minWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }

    private JobNewClusterAutoscaleArgs() {}

    private JobNewClusterAutoscaleArgs(JobNewClusterAutoscaleArgs $) {
        this.maxWorkers = $.maxWorkers;
        this.minWorkers = $.minWorkers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobNewClusterAutoscaleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobNewClusterAutoscaleArgs $;

        public Builder() {
            $ = new JobNewClusterAutoscaleArgs();
        }

        public Builder(JobNewClusterAutoscaleArgs defaults) {
            $ = new JobNewClusterAutoscaleArgs(Objects.requireNonNull(defaults));
        }

        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        public Builder maxWorkers(Integer maxWorkers) {
            return maxWorkers(Output.of(maxWorkers));
        }

        public Builder minWorkers(@Nullable Output<Integer> minWorkers) {
            $.minWorkers = minWorkers;
            return this;
        }

        public Builder minWorkers(Integer minWorkers) {
            return minWorkers(Output.of(minWorkers));
        }

        public JobNewClusterAutoscaleArgs build() {
            return $;
        }
    }

}

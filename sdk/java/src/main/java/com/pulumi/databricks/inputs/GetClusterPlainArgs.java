// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfo;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterPlainArgs Empty = new GetClusterPlainArgs();

    /**
     * The id of the cluster
     * 
     */
    @Import(name="clusterId", required=true)
    private String clusterId;

    /**
     * @return The id of the cluster
     * 
     */
    public String clusterId() {
        return this.clusterId;
    }

    @Import(name="clusterInfo")
    private @Nullable GetClusterClusterInfo clusterInfo;

    public Optional<GetClusterClusterInfo> clusterInfo() {
        return Optional.ofNullable(this.clusterInfo);
    }

    private GetClusterPlainArgs() {}

    private GetClusterPlainArgs(GetClusterPlainArgs $) {
        this.clusterId = $.clusterId;
        this.clusterInfo = $.clusterInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterPlainArgs $;

        public Builder() {
            $ = new GetClusterPlainArgs();
        }

        public Builder(GetClusterPlainArgs defaults) {
            $ = new GetClusterPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterId The id of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterInfo(@Nullable GetClusterClusterInfo clusterInfo) {
            $.clusterInfo = clusterInfo;
            return this;
        }

        public GetClusterPlainArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}

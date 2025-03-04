// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.MwsWorkspacesNetworkGcpCommonNetworkConfigArgs;
import com.pulumi.databricks.inputs.MwsWorkspacesNetworkGcpManagedNetworkConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsWorkspacesNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final MwsWorkspacesNetworkArgs Empty = new MwsWorkspacesNetworkArgs();

    @Import(name="gcpCommonNetworkConfig", required=true)
    private Output<MwsWorkspacesNetworkGcpCommonNetworkConfigArgs> gcpCommonNetworkConfig;

    public Output<MwsWorkspacesNetworkGcpCommonNetworkConfigArgs> gcpCommonNetworkConfig() {
        return this.gcpCommonNetworkConfig;
    }

    @Import(name="gcpManagedNetworkConfig")
    private @Nullable Output<MwsWorkspacesNetworkGcpManagedNetworkConfigArgs> gcpManagedNetworkConfig;

    public Optional<Output<MwsWorkspacesNetworkGcpManagedNetworkConfigArgs>> gcpManagedNetworkConfig() {
        return Optional.ofNullable(this.gcpManagedNetworkConfig);
    }

    @Import(name="networkId")
    private @Nullable Output<String> networkId;

    public Optional<Output<String>> networkId() {
        return Optional.ofNullable(this.networkId);
    }

    private MwsWorkspacesNetworkArgs() {}

    private MwsWorkspacesNetworkArgs(MwsWorkspacesNetworkArgs $) {
        this.gcpCommonNetworkConfig = $.gcpCommonNetworkConfig;
        this.gcpManagedNetworkConfig = $.gcpManagedNetworkConfig;
        this.networkId = $.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsWorkspacesNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsWorkspacesNetworkArgs $;

        public Builder() {
            $ = new MwsWorkspacesNetworkArgs();
        }

        public Builder(MwsWorkspacesNetworkArgs defaults) {
            $ = new MwsWorkspacesNetworkArgs(Objects.requireNonNull(defaults));
        }

        public Builder gcpCommonNetworkConfig(Output<MwsWorkspacesNetworkGcpCommonNetworkConfigArgs> gcpCommonNetworkConfig) {
            $.gcpCommonNetworkConfig = gcpCommonNetworkConfig;
            return this;
        }

        public Builder gcpCommonNetworkConfig(MwsWorkspacesNetworkGcpCommonNetworkConfigArgs gcpCommonNetworkConfig) {
            return gcpCommonNetworkConfig(Output.of(gcpCommonNetworkConfig));
        }

        public Builder gcpManagedNetworkConfig(@Nullable Output<MwsWorkspacesNetworkGcpManagedNetworkConfigArgs> gcpManagedNetworkConfig) {
            $.gcpManagedNetworkConfig = gcpManagedNetworkConfig;
            return this;
        }

        public Builder gcpManagedNetworkConfig(MwsWorkspacesNetworkGcpManagedNetworkConfigArgs gcpManagedNetworkConfig) {
            return gcpManagedNetworkConfig(Output.of(gcpManagedNetworkConfig));
        }

        public Builder networkId(@Nullable Output<String> networkId) {
            $.networkId = networkId;
            return this;
        }

        public Builder networkId(String networkId) {
            return networkId(Output.of(networkId));
        }

        public MwsWorkspacesNetworkArgs build() {
            $.gcpCommonNetworkConfig = Objects.requireNonNull($.gcpCommonNetworkConfig, "expected parameter 'gcpCommonNetworkConfig' to be non-null");
            return $;
        }
    }

}

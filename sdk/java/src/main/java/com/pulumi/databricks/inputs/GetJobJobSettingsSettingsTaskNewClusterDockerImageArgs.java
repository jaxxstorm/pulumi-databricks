// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuthArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs Empty = new GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs();

    @Import(name="basicAuth")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuthArgs> basicAuth;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuthArgs>> basicAuth() {
        return Optional.ofNullable(this.basicAuth);
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs() {}

    private GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs(GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs $) {
        this.basicAuth = $.basicAuth;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs(Objects.requireNonNull(defaults));
        }

        public Builder basicAuth(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuthArgs> basicAuth) {
            $.basicAuth = basicAuth;
            return this;
        }

        public Builder basicAuth(GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuthArgs basicAuth) {
            return basicAuth(Output.of(basicAuth));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public GetJobJobSettingsSettingsTaskNewClusterDockerImageArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
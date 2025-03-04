// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth Empty = new GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth();

    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth() {}

    private GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth(GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth(Objects.requireNonNull(defaults));
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterDockerImageBasicAuth build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}

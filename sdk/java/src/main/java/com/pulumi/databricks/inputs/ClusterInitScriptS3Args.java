// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterInitScriptS3Args extends com.pulumi.resources.ResourceArgs {

    public static final ClusterInitScriptS3Args Empty = new ClusterInitScriptS3Args();

    @Import(name="cannedAcl")
    private @Nullable Output<String> cannedAcl;

    public Optional<Output<String>> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }

    @Import(name="destination", required=true)
    private Output<String> destination;

    public Output<String> destination() {
        return this.destination;
    }

    @Import(name="enableEncryption")
    private @Nullable Output<Boolean> enableEncryption;

    public Optional<Output<Boolean>> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }

    @Import(name="encryptionType")
    private @Nullable Output<String> encryptionType;

    public Optional<Output<String>> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }

    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    @Import(name="kmsKey")
    private @Nullable Output<String> kmsKey;

    public Optional<Output<String>> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private ClusterInitScriptS3Args() {}

    private ClusterInitScriptS3Args(ClusterInitScriptS3Args $) {
        this.cannedAcl = $.cannedAcl;
        this.destination = $.destination;
        this.enableEncryption = $.enableEncryption;
        this.encryptionType = $.encryptionType;
        this.endpoint = $.endpoint;
        this.kmsKey = $.kmsKey;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterInitScriptS3Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterInitScriptS3Args $;

        public Builder() {
            $ = new ClusterInitScriptS3Args();
        }

        public Builder(ClusterInitScriptS3Args defaults) {
            $ = new ClusterInitScriptS3Args(Objects.requireNonNull(defaults));
        }

        public Builder cannedAcl(@Nullable Output<String> cannedAcl) {
            $.cannedAcl = cannedAcl;
            return this;
        }

        public Builder cannedAcl(String cannedAcl) {
            return cannedAcl(Output.of(cannedAcl));
        }

        public Builder destination(Output<String> destination) {
            $.destination = destination;
            return this;
        }

        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        public Builder enableEncryption(@Nullable Output<Boolean> enableEncryption) {
            $.enableEncryption = enableEncryption;
            return this;
        }

        public Builder enableEncryption(Boolean enableEncryption) {
            return enableEncryption(Output.of(enableEncryption));
        }

        public Builder encryptionType(@Nullable Output<String> encryptionType) {
            $.encryptionType = encryptionType;
            return this;
        }

        public Builder encryptionType(String encryptionType) {
            return encryptionType(Output.of(encryptionType));
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            $.kmsKey = kmsKey;
            return this;
        }

        public Builder kmsKey(String kmsKey) {
            return kmsKey(Output.of(kmsKey));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public ClusterInitScriptS3Args build() {
            $.destination = Objects.requireNonNull($.destination, "expected parameter 'destination' to be non-null");
            return $;
        }
    }

}

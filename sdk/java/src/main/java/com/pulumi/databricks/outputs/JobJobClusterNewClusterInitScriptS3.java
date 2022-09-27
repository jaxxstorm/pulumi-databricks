// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterInitScriptS3 {
    private @Nullable String cannedAcl;
    private String destination;
    private @Nullable Boolean enableEncryption;
    private @Nullable String encryptionType;
    private @Nullable String endpoint;
    private @Nullable String kmsKey;
    private @Nullable String region;

    private JobJobClusterNewClusterInitScriptS3() {}
    public Optional<String> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }
    public String destination() {
        return this.destination;
    }
    public Optional<Boolean> enableEncryption() {
        return Optional.ofNullable(this.enableEncryption);
    }
    public Optional<String> encryptionType() {
        return Optional.ofNullable(this.encryptionType);
    }
    public Optional<String> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    public Optional<String> kmsKey() {
        return Optional.ofNullable(this.kmsKey);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterInitScriptS3 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String cannedAcl;
        private String destination;
        private @Nullable Boolean enableEncryption;
        private @Nullable String encryptionType;
        private @Nullable String endpoint;
        private @Nullable String kmsKey;
        private @Nullable String region;
        public Builder() {}
        public Builder(JobJobClusterNewClusterInitScriptS3 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cannedAcl = defaults.cannedAcl;
    	      this.destination = defaults.destination;
    	      this.enableEncryption = defaults.enableEncryption;
    	      this.encryptionType = defaults.encryptionType;
    	      this.endpoint = defaults.endpoint;
    	      this.kmsKey = defaults.kmsKey;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder cannedAcl(@Nullable String cannedAcl) {
            this.cannedAcl = cannedAcl;
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder enableEncryption(@Nullable Boolean enableEncryption) {
            this.enableEncryption = enableEncryption;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionType(@Nullable String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        @CustomType.Setter
        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public JobJobClusterNewClusterInitScriptS3 build() {
            final var o = new JobJobClusterNewClusterInitScriptS3();
            o.cannedAcl = cannedAcl;
            o.destination = destination;
            o.enableEncryption = enableEncryption;
            o.encryptionType = encryptionType;
            o.endpoint = endpoint;
            o.kmsKey = kmsKey;
            o.region = region;
            return o;
        }
    }
}

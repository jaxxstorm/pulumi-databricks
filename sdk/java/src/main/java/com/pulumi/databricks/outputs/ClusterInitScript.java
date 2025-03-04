// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.ClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.ClusterInitScriptFile;
import com.pulumi.databricks.outputs.ClusterInitScriptGcs;
import com.pulumi.databricks.outputs.ClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterInitScript {
    private @Nullable ClusterInitScriptDbfs dbfs;
    private @Nullable ClusterInitScriptFile file;
    private @Nullable ClusterInitScriptGcs gcs;
    private @Nullable ClusterInitScriptS3 s3;

    private ClusterInitScript() {}
    public Optional<ClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<ClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<ClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<ClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterInitScriptDbfs dbfs;
        private @Nullable ClusterInitScriptFile file;
        private @Nullable ClusterInitScriptGcs gcs;
        private @Nullable ClusterInitScriptS3 s3;
        public Builder() {}
        public Builder(ClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable ClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable ClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable ClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable ClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }
        public ClusterInitScript build() {
            final var o = new ClusterInitScript();
            o.dbfs = dbfs;
            o.file = file;
            o.gcs = gcs;
            o.s3 = s3;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptDbfs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptFile;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptGcs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsNewClusterInitScriptS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsNewClusterInitScript {
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs;
    private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3;

    private GetJobJobSettingsSettingsNewClusterInitScript() {}
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptFile> file() {
        return Optional.ofNullable(this.file);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptGcs> gcs() {
        return Optional.ofNullable(this.gcs);
    }
    public Optional<GetJobJobSettingsSettingsNewClusterInitScriptS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs;
        private @Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsNewClusterInitScript defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.file = defaults.file;
    	      this.gcs = defaults.gcs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder file(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptFile file) {
            this.file = file;
            return this;
        }
        @CustomType.Setter
        public Builder gcs(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptGcs gcs) {
            this.gcs = gcs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable GetJobJobSettingsSettingsNewClusterInitScriptS3 s3) {
            this.s3 = s3;
            return this;
        }
        public GetJobJobSettingsSettingsNewClusterInitScript build() {
            final var o = new GetJobJobSettingsSettingsNewClusterInitScript();
            o.dbfs = dbfs;
            o.file = file;
            o.gcs = gcs;
            o.s3 = s3;
            return o;
        }
    }
}

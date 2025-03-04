// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf {
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs dbfs;
    private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3 s3;

    private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf() {}
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs dbfs;
        private @Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3 s3;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }
        public GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf build() {
            final var o = new GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConf();
            o.dbfs = dbfs;
            o.s3 = s3;
            return o;
        }
    }
}

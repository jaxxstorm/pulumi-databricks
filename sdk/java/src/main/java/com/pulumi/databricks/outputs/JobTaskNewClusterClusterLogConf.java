// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.JobTaskNewClusterClusterLogConfDbfs;
import com.pulumi.databricks.outputs.JobTaskNewClusterClusterLogConfS3;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskNewClusterClusterLogConf {
    private @Nullable JobTaskNewClusterClusterLogConfDbfs dbfs;
    private @Nullable JobTaskNewClusterClusterLogConfS3 s3;

    private JobTaskNewClusterClusterLogConf() {}
    public Optional<JobTaskNewClusterClusterLogConfDbfs> dbfs() {
        return Optional.ofNullable(this.dbfs);
    }
    public Optional<JobTaskNewClusterClusterLogConfS3> s3() {
        return Optional.ofNullable(this.s3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskNewClusterClusterLogConf defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable JobTaskNewClusterClusterLogConfDbfs dbfs;
        private @Nullable JobTaskNewClusterClusterLogConfS3 s3;
        public Builder() {}
        public Builder(JobTaskNewClusterClusterLogConf defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbfs = defaults.dbfs;
    	      this.s3 = defaults.s3;
        }

        @CustomType.Setter
        public Builder dbfs(@Nullable JobTaskNewClusterClusterLogConfDbfs dbfs) {
            this.dbfs = dbfs;
            return this;
        }
        @CustomType.Setter
        public Builder s3(@Nullable JobTaskNewClusterClusterLogConfS3 s3) {
            this.s3 = s3;
            return this;
        }
        public JobTaskNewClusterClusterLogConf build() {
            final var o = new JobTaskNewClusterClusterLogConf();
            o.dbfs = dbfs;
            o.s3 = s3;
            return o;
        }
    }
}

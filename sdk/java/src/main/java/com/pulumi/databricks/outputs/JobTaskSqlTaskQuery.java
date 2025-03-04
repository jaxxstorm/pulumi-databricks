// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobTaskSqlTaskQuery {
    private String queryId;

    private JobTaskSqlTaskQuery() {}
    public String queryId() {
        return this.queryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSqlTaskQuery defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String queryId;
        public Builder() {}
        public Builder(JobTaskSqlTaskQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryId = defaults.queryId;
        }

        @CustomType.Setter
        public Builder queryId(String queryId) {
            this.queryId = Objects.requireNonNull(queryId);
            return this;
        }
        public JobTaskSqlTaskQuery build() {
            final var o = new JobTaskSqlTaskQuery();
            o.queryId = queryId;
            return o;
        }
    }
}

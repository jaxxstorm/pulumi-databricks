// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobJobClusterNewClusterClusterLogConfDbfs {
    private String destination;

    private JobJobClusterNewClusterClusterLogConfDbfs() {}
    public String destination() {
        return this.destination;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterClusterLogConfDbfs defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String destination;
        public Builder() {}
        public Builder(JobJobClusterNewClusterClusterLogConfDbfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public JobJobClusterNewClusterClusterLogConfDbfs build() {
            final var o = new JobJobClusterNewClusterClusterLogConfDbfs();
            o.destination = destination;
            return o;
        }
    }
}

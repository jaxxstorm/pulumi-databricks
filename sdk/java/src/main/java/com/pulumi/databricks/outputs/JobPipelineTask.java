// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobPipelineTask {
    /**
     * @return The pipeline&#39;s unique ID.
     * 
     */
    private final String pipelineId;

    @CustomType.Constructor
    private JobPipelineTask(@CustomType.Parameter("pipelineId") String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * @return The pipeline&#39;s unique ID.
     * 
     */
    public String pipelineId() {
        return this.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPipelineTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPipelineTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineId = defaults.pipelineId;
        }

        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }        public JobPipelineTask build() {
            return new JobPipelineTask(pipelineId);
        }
    }
}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskPipelineTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskPipelineTaskArgs Empty = new GetJobJobSettingsSettingsTaskPipelineTaskArgs();

    @Import(name="pipelineId", required=true)
    private Output<String> pipelineId;

    public Output<String> pipelineId() {
        return this.pipelineId;
    }

    private GetJobJobSettingsSettingsTaskPipelineTaskArgs() {}

    private GetJobJobSettingsSettingsTaskPipelineTaskArgs(GetJobJobSettingsSettingsTaskPipelineTaskArgs $) {
        this.pipelineId = $.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskPipelineTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskPipelineTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskPipelineTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskPipelineTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskPipelineTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder pipelineId(Output<String> pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        public Builder pipelineId(String pipelineId) {
            return pipelineId(Output.of(pipelineId));
        }

        public GetJobJobSettingsSettingsTaskPipelineTaskArgs build() {
            $.pipelineId = Objects.requireNonNull($.pipelineId, "expected parameter 'pipelineId' to be non-null");
            return $;
        }
    }

}

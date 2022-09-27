// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class JobNotebookTask {
    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    private @Nullable Map<String,Object> baseParameters;
    /**
     * @return The absolute path of the databricks.Notebook to be run in the Databricks workspace. This path must begin with a slash. This field is required.
     * 
     */
    private String notebookPath;

    private JobNotebookTask() {}
    /**
     * @return (Map) Base parameters to be used for each run of this job. If the run is initiated by a call to run-now with parameters specified, the two parameters maps will be merged. If the same key is specified in base_parameters and in run-now, the value from run-now will be used. If the notebook takes a parameter that is not specified in the job’s base_parameters or the run-now override parameters, the default value from the notebook will be used. Retrieve these parameters in a notebook using `dbutils.widgets.get`.
     * 
     */
    public Map<String,Object> baseParameters() {
        return this.baseParameters == null ? Map.of() : this.baseParameters;
    }
    /**
     * @return The absolute path of the databricks.Notebook to be run in the Databricks workspace. This path must begin with a slash. This field is required.
     * 
     */
    public String notebookPath() {
        return this.notebookPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNotebookTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,Object> baseParameters;
        private String notebookPath;
        public Builder() {}
        public Builder(JobNotebookTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseParameters = defaults.baseParameters;
    	      this.notebookPath = defaults.notebookPath;
        }

        @CustomType.Setter
        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {
            this.baseParameters = baseParameters;
            return this;
        }
        @CustomType.Setter
        public Builder notebookPath(String notebookPath) {
            this.notebookPath = Objects.requireNonNull(notebookPath);
            return this;
        }
        public JobNotebookTask build() {
            final var o = new JobNotebookTask();
            o.baseParameters = baseParameters;
            o.notebookPath = notebookPath;
            return o;
        }
    }
}

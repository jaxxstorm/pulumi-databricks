// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsSparkPythonTask {
    private @Nullable List<String> parameters;
    private String pythonFile;

    private GetJobJobSettingsSettingsSparkPythonTask() {}
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public String pythonFile() {
        return this.pythonFile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsSparkPythonTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> parameters;
        private String pythonFile;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsSparkPythonTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.pythonFile = defaults.pythonFile;
        }

        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder pythonFile(String pythonFile) {
            this.pythonFile = Objects.requireNonNull(pythonFile);
            return this;
        }
        public GetJobJobSettingsSettingsSparkPythonTask build() {
            final var o = new GetJobJobSettingsSettingsSparkPythonTask();
            o.parameters = parameters;
            o.pythonFile = pythonFile;
            return o;
        }
    }
}
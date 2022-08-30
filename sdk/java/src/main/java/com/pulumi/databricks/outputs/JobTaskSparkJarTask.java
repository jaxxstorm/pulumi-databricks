// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskSparkJarTask {
    private final @Nullable String jarUri;
    /**
     * @return The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
     * 
     */
    private final @Nullable String mainClassName;
    /**
     * @return Parameters for the task
     * 
     */
    private final @Nullable List<String> parameters;

    @CustomType.Constructor
    private JobTaskSparkJarTask(
        @CustomType.Parameter("jarUri") @Nullable String jarUri,
        @CustomType.Parameter("mainClassName") @Nullable String mainClassName,
        @CustomType.Parameter("parameters") @Nullable List<String> parameters) {
        this.jarUri = jarUri;
        this.mainClassName = mainClassName;
        this.parameters = parameters;
    }

    public Optional<String> jarUri() {
        return Optional.ofNullable(this.jarUri);
    }
    /**
     * @return The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
     * 
     */
    public Optional<String> mainClassName() {
        return Optional.ofNullable(this.mainClassName);
    }
    /**
     * @return Parameters for the task
     * 
     */
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskSparkJarTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String jarUri;
        private @Nullable String mainClassName;
        private @Nullable List<String> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTaskSparkJarTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jarUri = defaults.jarUri;
    	      this.mainClassName = defaults.mainClassName;
    	      this.parameters = defaults.parameters;
        }

        public Builder jarUri(@Nullable String jarUri) {
            this.jarUri = jarUri;
            return this;
        }
        public Builder mainClassName(@Nullable String mainClassName) {
            this.mainClassName = mainClassName;
            return this;
        }
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }        public JobTaskSparkJarTask build() {
            return new JobTaskSparkJarTask(jarUri, mainClassName, parameters);
        }
    }
}
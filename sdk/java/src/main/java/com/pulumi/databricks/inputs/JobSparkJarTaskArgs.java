// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobSparkJarTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobSparkJarTaskArgs Empty = new JobSparkJarTaskArgs();

    @Import(name="jarUri")
    private @Nullable Output<String> jarUri;

    public Optional<Output<String>> jarUri() {
        return Optional.ofNullable(this.jarUri);
    }

    /**
     * The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
     * 
     */
    @Import(name="mainClassName")
    private @Nullable Output<String> mainClassName;

    /**
     * @return The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
     * 
     */
    public Optional<Output<String>> mainClassName() {
        return Optional.ofNullable(this.mainClassName);
    }

    /**
     * (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<List<String>> parameters;

    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public Optional<Output<List<String>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private JobSparkJarTaskArgs() {}

    private JobSparkJarTaskArgs(JobSparkJarTaskArgs $) {
        this.jarUri = $.jarUri;
        this.mainClassName = $.mainClassName;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobSparkJarTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobSparkJarTaskArgs $;

        public Builder() {
            $ = new JobSparkJarTaskArgs();
        }

        public Builder(JobSparkJarTaskArgs defaults) {
            $ = new JobSparkJarTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder jarUri(@Nullable Output<String> jarUri) {
            $.jarUri = jarUri;
            return this;
        }

        public Builder jarUri(String jarUri) {
            return jarUri(Output.of(jarUri));
        }

        /**
         * @param mainClassName The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
         * 
         * @return builder
         * 
         */
        public Builder mainClassName(@Nullable Output<String> mainClassName) {
            $.mainClassName = mainClassName;
            return this;
        }

        /**
         * @param mainClassName The full name of the class containing the main method to be executed. This class must be contained in a JAR provided as a library. The code should use `SparkContext.getOrCreate` to obtain a Spark context; otherwise, runs of the job will fail.
         * 
         * @return builder
         * 
         */
        public Builder mainClassName(String mainClassName) {
            return mainClassName(Output.of(mainClassName));
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<List<String>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(List<String> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param parameters (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public JobSparkJarTaskArgs build() {
            return $;
        }
    }

}

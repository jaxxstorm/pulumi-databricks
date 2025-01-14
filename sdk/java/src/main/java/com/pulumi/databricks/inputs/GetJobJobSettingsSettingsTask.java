// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskDbtTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskDependsOn;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskEmailNotifications;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskLibrary;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewCluster;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNotebookTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPipelineTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPythonWheelTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkJarTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkPythonTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkSubmitTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTask;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTask Empty = new GetJobJobSettingsSettingsTask();

    @Import(name="dbtTask")
    private @Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask;

    public Optional<GetJobJobSettingsSettingsTaskDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    @Import(name="dependsOns")
    private @Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns;

    public Optional<List<GetJobJobSettingsSettingsTaskDependsOn>> dependsOns() {
        return Optional.ofNullable(this.dependsOns);
    }

    @Import(name="description")
    private @Nullable String description;

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="emailNotifications")
    private @Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications;

    public Optional<GetJobJobSettingsSettingsTaskEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="existingClusterId")
    private @Nullable String existingClusterId;

    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="jobClusterKey")
    private @Nullable String jobClusterKey;

    public Optional<String> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }

    @Import(name="libraries")
    private @Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries;

    public Optional<List<GetJobJobSettingsSettingsTaskLibrary>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="maxRetries")
    private @Nullable Integer maxRetries;

    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    @Import(name="minRetryIntervalMillis")
    private @Nullable Integer minRetryIntervalMillis;

    public Optional<Integer> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }

    @Import(name="newCluster")
    private @Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster;

    public Optional<GetJobJobSettingsSettingsTaskNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask;

    public Optional<GetJobJobSettingsSettingsTaskNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="pipelineTask")
    private @Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask;

    public Optional<GetJobJobSettingsSettingsTaskPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask;

    public Optional<GetJobJobSettingsSettingsTaskPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    @Import(name="retryOnTimeout", required=true)
    private Boolean retryOnTimeout;

    public Boolean retryOnTimeout() {
        return this.retryOnTimeout;
    }

    @Import(name="sparkJarTask")
    private @Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask;

    public Optional<GetJobJobSettingsSettingsTaskSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask;

    public Optional<GetJobJobSettingsSettingsTaskSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask;

    public Optional<GetJobJobSettingsSettingsTaskSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="sqlTask")
    private @Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask;

    public Optional<GetJobJobSettingsSettingsTaskSqlTask> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }

    @Import(name="taskKey")
    private @Nullable String taskKey;

    public Optional<String> taskKey() {
        return Optional.ofNullable(this.taskKey);
    }

    @Import(name="timeoutSeconds")
    private @Nullable Integer timeoutSeconds;

    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private GetJobJobSettingsSettingsTask() {}

    private GetJobJobSettingsSettingsTask(GetJobJobSettingsSettingsTask $) {
        this.dbtTask = $.dbtTask;
        this.dependsOns = $.dependsOns;
        this.description = $.description;
        this.emailNotifications = $.emailNotifications;
        this.existingClusterId = $.existingClusterId;
        this.jobClusterKey = $.jobClusterKey;
        this.libraries = $.libraries;
        this.maxRetries = $.maxRetries;
        this.minRetryIntervalMillis = $.minRetryIntervalMillis;
        this.newCluster = $.newCluster;
        this.notebookTask = $.notebookTask;
        this.pipelineTask = $.pipelineTask;
        this.pythonWheelTask = $.pythonWheelTask;
        this.retryOnTimeout = $.retryOnTimeout;
        this.sparkJarTask = $.sparkJarTask;
        this.sparkPythonTask = $.sparkPythonTask;
        this.sparkSubmitTask = $.sparkSubmitTask;
        this.sqlTask = $.sqlTask;
        this.taskKey = $.taskKey;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTask();
        }

        public Builder(GetJobJobSettingsSettingsTask defaults) {
            $ = new GetJobJobSettingsSettingsTask(Objects.requireNonNull(defaults));
        }

        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsTaskDbtTask dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dependsOns(@Nullable List<GetJobJobSettingsSettingsTaskDependsOn> dependsOns) {
            $.dependsOns = dependsOns;
            return this;
        }

        public Builder dependsOns(GetJobJobSettingsSettingsTaskDependsOn... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }

        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsTaskEmailNotifications emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        public Builder existingClusterId(@Nullable String existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder jobClusterKey(@Nullable String jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsTaskLibrary> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(GetJobJobSettingsSettingsTaskLibrary... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder maxRetries(@Nullable Integer maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder minRetryIntervalMillis(@Nullable Integer minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        public Builder newCluster(@Nullable GetJobJobSettingsSettingsTaskNewCluster newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsTaskNotebookTask notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsTaskPipelineTask pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsTaskPythonWheelTask pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsTaskSparkJarTask sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsTaskSparkPythonTask sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsTaskSparkSubmitTask sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sqlTask(@Nullable GetJobJobSettingsSettingsTaskSqlTask sqlTask) {
            $.sqlTask = sqlTask;
            return this;
        }

        public Builder taskKey(@Nullable String taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public GetJobJobSettingsSettingsTask build() {
            $.retryOnTimeout = Objects.requireNonNull($.retryOnTimeout, "expected parameter 'retryOnTimeout' to be non-null");
            return $;
        }
    }

}

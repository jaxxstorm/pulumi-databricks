// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskDbtTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskDependsOnArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskEmailNotificationsArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskLibraryArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNewClusterArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskNotebookTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPipelineTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskPythonWheelTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkJarTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkPythonTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTaskSqlTaskArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskArgs Empty = new GetJobJobSettingsSettingsTaskArgs();

    @Import(name="dbtTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskDbtTaskArgs> dbtTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskDbtTaskArgs>> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    @Import(name="dependsOns")
    private @Nullable Output<List<GetJobJobSettingsSettingsTaskDependsOnArgs>> dependsOns;

    public Optional<Output<List<GetJobJobSettingsSettingsTaskDependsOnArgs>>> dependsOns() {
        return Optional.ofNullable(this.dependsOns);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="emailNotifications")
    private @Nullable Output<GetJobJobSettingsSettingsTaskEmailNotificationsArgs> emailNotifications;

    public Optional<Output<GetJobJobSettingsSettingsTaskEmailNotificationsArgs>> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="existingClusterId")
    private @Nullable Output<String> existingClusterId;

    public Optional<Output<String>> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="jobClusterKey")
    private @Nullable Output<String> jobClusterKey;

    public Optional<Output<String>> jobClusterKey() {
        return Optional.ofNullable(this.jobClusterKey);
    }

    @Import(name="libraries")
    private @Nullable Output<List<GetJobJobSettingsSettingsTaskLibraryArgs>> libraries;

    public Optional<Output<List<GetJobJobSettingsSettingsTaskLibraryArgs>>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    @Import(name="minRetryIntervalMillis")
    private @Nullable Output<Integer> minRetryIntervalMillis;

    public Optional<Output<Integer>> minRetryIntervalMillis() {
        return Optional.ofNullable(this.minRetryIntervalMillis);
    }

    @Import(name="newCluster")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNewClusterArgs> newCluster;

    public Optional<Output<GetJobJobSettingsSettingsTaskNewClusterArgs>> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskNotebookTaskArgs> notebookTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskNotebookTaskArgs>> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="pipelineTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskPipelineTaskArgs> pipelineTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskPipelineTaskArgs>> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskPythonWheelTaskArgs> pythonWheelTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskPythonWheelTaskArgs>> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    @Import(name="retryOnTimeout", required=true)
    private Output<Boolean> retryOnTimeout;

    public Output<Boolean> retryOnTimeout() {
        return this.retryOnTimeout;
    }

    @Import(name="sparkJarTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSparkJarTaskArgs> sparkJarTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskSparkJarTaskArgs>> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSparkPythonTaskArgs> sparkPythonTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskSparkPythonTaskArgs>> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs> sparkSubmitTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs>> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="sqlTask")
    private @Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskArgs> sqlTask;

    public Optional<Output<GetJobJobSettingsSettingsTaskSqlTaskArgs>> sqlTask() {
        return Optional.ofNullable(this.sqlTask);
    }

    @Import(name="taskKey")
    private @Nullable Output<String> taskKey;

    public Optional<Output<String>> taskKey() {
        return Optional.ofNullable(this.taskKey);
    }

    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private GetJobJobSettingsSettingsTaskArgs() {}

    private GetJobJobSettingsSettingsTaskArgs(GetJobJobSettingsSettingsTaskArgs $) {
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
    public static Builder builder(GetJobJobSettingsSettingsTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder dbtTask(@Nullable Output<GetJobJobSettingsSettingsTaskDbtTaskArgs> dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder dbtTask(GetJobJobSettingsSettingsTaskDbtTaskArgs dbtTask) {
            return dbtTask(Output.of(dbtTask));
        }

        public Builder dependsOns(@Nullable Output<List<GetJobJobSettingsSettingsTaskDependsOnArgs>> dependsOns) {
            $.dependsOns = dependsOns;
            return this;
        }

        public Builder dependsOns(List<GetJobJobSettingsSettingsTaskDependsOnArgs> dependsOns) {
            return dependsOns(Output.of(dependsOns));
        }

        public Builder dependsOns(GetJobJobSettingsSettingsTaskDependsOnArgs... dependsOns) {
            return dependsOns(List.of(dependsOns));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder emailNotifications(@Nullable Output<GetJobJobSettingsSettingsTaskEmailNotificationsArgs> emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        public Builder emailNotifications(GetJobJobSettingsSettingsTaskEmailNotificationsArgs emailNotifications) {
            return emailNotifications(Output.of(emailNotifications));
        }

        public Builder existingClusterId(@Nullable Output<String> existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder existingClusterId(String existingClusterId) {
            return existingClusterId(Output.of(existingClusterId));
        }

        public Builder jobClusterKey(@Nullable Output<String> jobClusterKey) {
            $.jobClusterKey = jobClusterKey;
            return this;
        }

        public Builder jobClusterKey(String jobClusterKey) {
            return jobClusterKey(Output.of(jobClusterKey));
        }

        public Builder libraries(@Nullable Output<List<GetJobJobSettingsSettingsTaskLibraryArgs>> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(List<GetJobJobSettingsSettingsTaskLibraryArgs> libraries) {
            return libraries(Output.of(libraries));
        }

        public Builder libraries(GetJobJobSettingsSettingsTaskLibraryArgs... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        public Builder minRetryIntervalMillis(@Nullable Output<Integer> minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
            return minRetryIntervalMillis(Output.of(minRetryIntervalMillis));
        }

        public Builder newCluster(@Nullable Output<GetJobJobSettingsSettingsTaskNewClusterArgs> newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public Builder newCluster(GetJobJobSettingsSettingsTaskNewClusterArgs newCluster) {
            return newCluster(Output.of(newCluster));
        }

        public Builder notebookTask(@Nullable Output<GetJobJobSettingsSettingsTaskNotebookTaskArgs> notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder notebookTask(GetJobJobSettingsSettingsTaskNotebookTaskArgs notebookTask) {
            return notebookTask(Output.of(notebookTask));
        }

        public Builder pipelineTask(@Nullable Output<GetJobJobSettingsSettingsTaskPipelineTaskArgs> pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pipelineTask(GetJobJobSettingsSettingsTaskPipelineTaskArgs pipelineTask) {
            return pipelineTask(Output.of(pipelineTask));
        }

        public Builder pythonWheelTask(@Nullable Output<GetJobJobSettingsSettingsTaskPythonWheelTaskArgs> pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder pythonWheelTask(GetJobJobSettingsSettingsTaskPythonWheelTaskArgs pythonWheelTask) {
            return pythonWheelTask(Output.of(pythonWheelTask));
        }

        public Builder retryOnTimeout(Output<Boolean> retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        public Builder retryOnTimeout(Boolean retryOnTimeout) {
            return retryOnTimeout(Output.of(retryOnTimeout));
        }

        public Builder sparkJarTask(@Nullable Output<GetJobJobSettingsSettingsTaskSparkJarTaskArgs> sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkJarTask(GetJobJobSettingsSettingsTaskSparkJarTaskArgs sparkJarTask) {
            return sparkJarTask(Output.of(sparkJarTask));
        }

        public Builder sparkPythonTask(@Nullable Output<GetJobJobSettingsSettingsTaskSparkPythonTaskArgs> sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkPythonTask(GetJobJobSettingsSettingsTaskSparkPythonTaskArgs sparkPythonTask) {
            return sparkPythonTask(Output.of(sparkPythonTask));
        }

        public Builder sparkSubmitTask(@Nullable Output<GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs> sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder sparkSubmitTask(GetJobJobSettingsSettingsTaskSparkSubmitTaskArgs sparkSubmitTask) {
            return sparkSubmitTask(Output.of(sparkSubmitTask));
        }

        public Builder sqlTask(@Nullable Output<GetJobJobSettingsSettingsTaskSqlTaskArgs> sqlTask) {
            $.sqlTask = sqlTask;
            return this;
        }

        public Builder sqlTask(GetJobJobSettingsSettingsTaskSqlTaskArgs sqlTask) {
            return sqlTask(Output.of(sqlTask));
        }

        public Builder taskKey(@Nullable Output<String> taskKey) {
            $.taskKey = taskKey;
            return this;
        }

        public Builder taskKey(String taskKey) {
            return taskKey(Output.of(taskKey));
        }

        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public GetJobJobSettingsSettingsTaskArgs build() {
            $.retryOnTimeout = Objects.requireNonNull($.retryOnTimeout, "expected parameter 'retryOnTimeout' to be non-null");
            return $;
        }
    }

}

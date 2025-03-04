// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsDbtTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsEmailNotifications;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsGitSource;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsJobCluster;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsLibrary;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNewCluster;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsNotebookTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsPipelineTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsPythonWheelTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsSchedule;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsSparkJarTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsSparkPythonTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsSparkSubmitTask;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsTask;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettings extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettings Empty = new GetJobJobSettingsSettings();

    @Import(name="dbtTask")
    private @Nullable GetJobJobSettingsSettingsDbtTask dbtTask;

    public Optional<GetJobJobSettingsSettingsDbtTask> dbtTask() {
        return Optional.ofNullable(this.dbtTask);
    }

    @Import(name="emailNotifications")
    private @Nullable GetJobJobSettingsSettingsEmailNotifications emailNotifications;

    public Optional<GetJobJobSettingsSettingsEmailNotifications> emailNotifications() {
        return Optional.ofNullable(this.emailNotifications);
    }

    @Import(name="existingClusterId")
    private @Nullable String existingClusterId;

    public Optional<String> existingClusterId() {
        return Optional.ofNullable(this.existingClusterId);
    }

    @Import(name="format", required=true)
    private String format;

    public String format() {
        return this.format;
    }

    @Import(name="gitSource")
    private @Nullable GetJobJobSettingsSettingsGitSource gitSource;

    public Optional<GetJobJobSettingsSettingsGitSource> gitSource() {
        return Optional.ofNullable(this.gitSource);
    }

    @Import(name="jobClusters")
    private @Nullable List<GetJobJobSettingsSettingsJobCluster> jobClusters;

    public Optional<List<GetJobJobSettingsSettingsJobCluster>> jobClusters() {
        return Optional.ofNullable(this.jobClusters);
    }

    @Import(name="libraries")
    private @Nullable List<GetJobJobSettingsSettingsLibrary> libraries;

    public Optional<List<GetJobJobSettingsSettingsLibrary>> libraries() {
        return Optional.ofNullable(this.libraries);
    }

    @Import(name="maxConcurrentRuns")
    private @Nullable Integer maxConcurrentRuns;

    public Optional<Integer> maxConcurrentRuns() {
        return Optional.ofNullable(this.maxConcurrentRuns);
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

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="newCluster")
    private @Nullable GetJobJobSettingsSettingsNewCluster newCluster;

    public Optional<GetJobJobSettingsSettingsNewCluster> newCluster() {
        return Optional.ofNullable(this.newCluster);
    }

    @Import(name="notebookTask")
    private @Nullable GetJobJobSettingsSettingsNotebookTask notebookTask;

    public Optional<GetJobJobSettingsSettingsNotebookTask> notebookTask() {
        return Optional.ofNullable(this.notebookTask);
    }

    @Import(name="pipelineTask")
    private @Nullable GetJobJobSettingsSettingsPipelineTask pipelineTask;

    public Optional<GetJobJobSettingsSettingsPipelineTask> pipelineTask() {
        return Optional.ofNullable(this.pipelineTask);
    }

    @Import(name="pythonWheelTask")
    private @Nullable GetJobJobSettingsSettingsPythonWheelTask pythonWheelTask;

    public Optional<GetJobJobSettingsSettingsPythonWheelTask> pythonWheelTask() {
        return Optional.ofNullable(this.pythonWheelTask);
    }

    @Import(name="retryOnTimeout")
    private @Nullable Boolean retryOnTimeout;

    public Optional<Boolean> retryOnTimeout() {
        return Optional.ofNullable(this.retryOnTimeout);
    }

    @Import(name="schedule")
    private @Nullable GetJobJobSettingsSettingsSchedule schedule;

    public Optional<GetJobJobSettingsSettingsSchedule> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    @Import(name="sparkJarTask")
    private @Nullable GetJobJobSettingsSettingsSparkJarTask sparkJarTask;

    public Optional<GetJobJobSettingsSettingsSparkJarTask> sparkJarTask() {
        return Optional.ofNullable(this.sparkJarTask);
    }

    @Import(name="sparkPythonTask")
    private @Nullable GetJobJobSettingsSettingsSparkPythonTask sparkPythonTask;

    public Optional<GetJobJobSettingsSettingsSparkPythonTask> sparkPythonTask() {
        return Optional.ofNullable(this.sparkPythonTask);
    }

    @Import(name="sparkSubmitTask")
    private @Nullable GetJobJobSettingsSettingsSparkSubmitTask sparkSubmitTask;

    public Optional<GetJobJobSettingsSettingsSparkSubmitTask> sparkSubmitTask() {
        return Optional.ofNullable(this.sparkSubmitTask);
    }

    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tasks")
    private @Nullable List<GetJobJobSettingsSettingsTask> tasks;

    public Optional<List<GetJobJobSettingsSettingsTask>> tasks() {
        return Optional.ofNullable(this.tasks);
    }

    @Import(name="timeoutSeconds")
    private @Nullable Integer timeoutSeconds;

    public Optional<Integer> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private GetJobJobSettingsSettings() {}

    private GetJobJobSettingsSettings(GetJobJobSettingsSettings $) {
        this.dbtTask = $.dbtTask;
        this.emailNotifications = $.emailNotifications;
        this.existingClusterId = $.existingClusterId;
        this.format = $.format;
        this.gitSource = $.gitSource;
        this.jobClusters = $.jobClusters;
        this.libraries = $.libraries;
        this.maxConcurrentRuns = $.maxConcurrentRuns;
        this.maxRetries = $.maxRetries;
        this.minRetryIntervalMillis = $.minRetryIntervalMillis;
        this.name = $.name;
        this.newCluster = $.newCluster;
        this.notebookTask = $.notebookTask;
        this.pipelineTask = $.pipelineTask;
        this.pythonWheelTask = $.pythonWheelTask;
        this.retryOnTimeout = $.retryOnTimeout;
        this.schedule = $.schedule;
        this.sparkJarTask = $.sparkJarTask;
        this.sparkPythonTask = $.sparkPythonTask;
        this.sparkSubmitTask = $.sparkSubmitTask;
        this.tags = $.tags;
        this.tasks = $.tasks;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettings $;

        public Builder() {
            $ = new GetJobJobSettingsSettings();
        }

        public Builder(GetJobJobSettingsSettings defaults) {
            $ = new GetJobJobSettingsSettings(Objects.requireNonNull(defaults));
        }

        public Builder dbtTask(@Nullable GetJobJobSettingsSettingsDbtTask dbtTask) {
            $.dbtTask = dbtTask;
            return this;
        }

        public Builder emailNotifications(@Nullable GetJobJobSettingsSettingsEmailNotifications emailNotifications) {
            $.emailNotifications = emailNotifications;
            return this;
        }

        public Builder existingClusterId(@Nullable String existingClusterId) {
            $.existingClusterId = existingClusterId;
            return this;
        }

        public Builder format(String format) {
            $.format = format;
            return this;
        }

        public Builder gitSource(@Nullable GetJobJobSettingsSettingsGitSource gitSource) {
            $.gitSource = gitSource;
            return this;
        }

        public Builder jobClusters(@Nullable List<GetJobJobSettingsSettingsJobCluster> jobClusters) {
            $.jobClusters = jobClusters;
            return this;
        }

        public Builder jobClusters(GetJobJobSettingsSettingsJobCluster... jobClusters) {
            return jobClusters(List.of(jobClusters));
        }

        public Builder libraries(@Nullable List<GetJobJobSettingsSettingsLibrary> libraries) {
            $.libraries = libraries;
            return this;
        }

        public Builder libraries(GetJobJobSettingsSettingsLibrary... libraries) {
            return libraries(List.of(libraries));
        }

        public Builder maxConcurrentRuns(@Nullable Integer maxConcurrentRuns) {
            $.maxConcurrentRuns = maxConcurrentRuns;
            return this;
        }

        public Builder maxRetries(@Nullable Integer maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder minRetryIntervalMillis(@Nullable Integer minRetryIntervalMillis) {
            $.minRetryIntervalMillis = minRetryIntervalMillis;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder newCluster(@Nullable GetJobJobSettingsSettingsNewCluster newCluster) {
            $.newCluster = newCluster;
            return this;
        }

        public Builder notebookTask(@Nullable GetJobJobSettingsSettingsNotebookTask notebookTask) {
            $.notebookTask = notebookTask;
            return this;
        }

        public Builder pipelineTask(@Nullable GetJobJobSettingsSettingsPipelineTask pipelineTask) {
            $.pipelineTask = pipelineTask;
            return this;
        }

        public Builder pythonWheelTask(@Nullable GetJobJobSettingsSettingsPythonWheelTask pythonWheelTask) {
            $.pythonWheelTask = pythonWheelTask;
            return this;
        }

        public Builder retryOnTimeout(@Nullable Boolean retryOnTimeout) {
            $.retryOnTimeout = retryOnTimeout;
            return this;
        }

        public Builder schedule(@Nullable GetJobJobSettingsSettingsSchedule schedule) {
            $.schedule = schedule;
            return this;
        }

        public Builder sparkJarTask(@Nullable GetJobJobSettingsSettingsSparkJarTask sparkJarTask) {
            $.sparkJarTask = sparkJarTask;
            return this;
        }

        public Builder sparkPythonTask(@Nullable GetJobJobSettingsSettingsSparkPythonTask sparkPythonTask) {
            $.sparkPythonTask = sparkPythonTask;
            return this;
        }

        public Builder sparkSubmitTask(@Nullable GetJobJobSettingsSettingsSparkSubmitTask sparkSubmitTask) {
            $.sparkSubmitTask = sparkSubmitTask;
            return this;
        }

        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tasks(@Nullable List<GetJobJobSettingsSettingsTask> tasks) {
            $.tasks = tasks;
            return this;
        }

        public Builder tasks(GetJobJobSettingsSettingsTask... tasks) {
            return tasks(List.of(tasks));
        }

        public Builder timeoutSeconds(@Nullable Integer timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        public GetJobJobSettingsSettings build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}

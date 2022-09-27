// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTaskEmailNotifications {
    private @Nullable Boolean alertOnLastAttempt;
    /**
     * @return (Bool) don&#39;t send alert for skipped runs
     * 
     */
    private @Nullable Boolean noAlertForSkippedRuns;
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    private @Nullable List<String> onFailures;
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    private @Nullable List<String> onStarts;
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    private @Nullable List<String> onSuccesses;

    private JobTaskEmailNotifications() {}
    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }
    /**
     * @return (Bool) don&#39;t send alert for skipped runs
     * 
     */
    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public List<String> onFailures() {
        return this.onFailures == null ? List.of() : this.onFailures;
    }
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public List<String> onStarts() {
        return this.onStarts == null ? List.of() : this.onStarts;
    }
    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public List<String> onSuccesses() {
        return this.onSuccesses == null ? List.of() : this.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTaskEmailNotifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alertOnLastAttempt;
        private @Nullable Boolean noAlertForSkippedRuns;
        private @Nullable List<String> onFailures;
        private @Nullable List<String> onStarts;
        private @Nullable List<String> onSuccesses;
        public Builder() {}
        public Builder(JobTaskEmailNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertOnLastAttempt = defaults.alertOnLastAttempt;
    	      this.noAlertForSkippedRuns = defaults.noAlertForSkippedRuns;
    	      this.onFailures = defaults.onFailures;
    	      this.onStarts = defaults.onStarts;
    	      this.onSuccesses = defaults.onSuccesses;
        }

        @CustomType.Setter
        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {
            this.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {
            this.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }
        @CustomType.Setter
        public Builder onFailures(@Nullable List<String> onFailures) {
            this.onFailures = onFailures;
            return this;
        }
        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }
        @CustomType.Setter
        public Builder onStarts(@Nullable List<String> onStarts) {
            this.onStarts = onStarts;
            return this;
        }
        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }
        @CustomType.Setter
        public Builder onSuccesses(@Nullable List<String> onSuccesses) {
            this.onSuccesses = onSuccesses;
            return this;
        }
        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }
        public JobTaskEmailNotifications build() {
            final var o = new JobTaskEmailNotifications();
            o.alertOnLastAttempt = alertOnLastAttempt;
            o.noAlertForSkippedRuns = noAlertForSkippedRuns;
            o.onFailures = onFailures;
            o.onStarts = onStarts;
            o.onSuccesses = onSuccesses;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsSchedule extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsSchedule Empty = new GetJobJobSettingsSettingsSchedule();

    @Import(name="pauseStatus", required=true)
    private String pauseStatus;

    public String pauseStatus() {
        return this.pauseStatus;
    }

    @Import(name="quartzCronExpression", required=true)
    private String quartzCronExpression;

    public String quartzCronExpression() {
        return this.quartzCronExpression;
    }

    @Import(name="timezoneId", required=true)
    private String timezoneId;

    public String timezoneId() {
        return this.timezoneId;
    }

    private GetJobJobSettingsSettingsSchedule() {}

    private GetJobJobSettingsSettingsSchedule(GetJobJobSettingsSettingsSchedule $) {
        this.pauseStatus = $.pauseStatus;
        this.quartzCronExpression = $.quartzCronExpression;
        this.timezoneId = $.timezoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsSchedule $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsSchedule();
        }

        public Builder(GetJobJobSettingsSettingsSchedule defaults) {
            $ = new GetJobJobSettingsSettingsSchedule(Objects.requireNonNull(defaults));
        }

        public Builder pauseStatus(String pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public Builder quartzCronExpression(String quartzCronExpression) {
            $.quartzCronExpression = quartzCronExpression;
            return this;
        }

        public Builder timezoneId(String timezoneId) {
            $.timezoneId = timezoneId;
            return this;
        }

        public GetJobJobSettingsSettingsSchedule build() {
            $.pauseStatus = Objects.requireNonNull($.pauseStatus, "expected parameter 'pauseStatus' to be non-null");
            $.quartzCronExpression = Objects.requireNonNull($.quartzCronExpression, "expected parameter 'quartzCronExpression' to be non-null");
            $.timezoneId = Objects.requireNonNull($.timezoneId, "expected parameter 'timezoneId' to be non-null");
            return $;
        }
    }

}

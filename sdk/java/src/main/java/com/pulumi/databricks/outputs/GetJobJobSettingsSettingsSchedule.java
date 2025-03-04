// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsSchedule {
    private String pauseStatus;
    private String quartzCronExpression;
    private String timezoneId;

    private GetJobJobSettingsSettingsSchedule() {}
    public String pauseStatus() {
        return this.pauseStatus;
    }
    public String quartzCronExpression() {
        return this.quartzCronExpression;
    }
    public String timezoneId() {
        return this.timezoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsSchedule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String pauseStatus;
        private String quartzCronExpression;
        private String timezoneId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pauseStatus = defaults.pauseStatus;
    	      this.quartzCronExpression = defaults.quartzCronExpression;
    	      this.timezoneId = defaults.timezoneId;
        }

        @CustomType.Setter
        public Builder pauseStatus(String pauseStatus) {
            this.pauseStatus = Objects.requireNonNull(pauseStatus);
            return this;
        }
        @CustomType.Setter
        public Builder quartzCronExpression(String quartzCronExpression) {
            this.quartzCronExpression = Objects.requireNonNull(quartzCronExpression);
            return this;
        }
        @CustomType.Setter
        public Builder timezoneId(String timezoneId) {
            this.timezoneId = Objects.requireNonNull(timezoneId);
            return this;
        }
        public GetJobJobSettingsSettingsSchedule build() {
            final var o = new GetJobJobSettingsSettingsSchedule();
            o.pauseStatus = pauseStatus;
            o.quartzCronExpression = quartzCronExpression;
            o.timezoneId = timezoneId;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsTaskSqlTaskDashboard {
    private String dashboardId;

    private GetJobJobSettingsSettingsTaskSqlTaskDashboard() {}
    public String dashboardId() {
        return this.dashboardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskDashboard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String dashboardId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskSqlTaskDashboard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dashboardId = defaults.dashboardId;
        }

        @CustomType.Setter
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = Objects.requireNonNull(dashboardId);
            return this;
        }
        public GetJobJobSettingsSettingsTaskSqlTaskDashboard build() {
            final var o = new GetJobJobSettingsSettingsTaskSqlTaskDashboard();
            o.dashboardId = dashboardId;
            return o;
        }
    }
}

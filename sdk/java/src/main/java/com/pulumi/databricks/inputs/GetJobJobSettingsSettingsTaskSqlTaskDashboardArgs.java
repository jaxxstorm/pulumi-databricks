// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs Empty = new GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs();

    @Import(name="dashboardId", required=true)
    private Output<String> dashboardId;

    public Output<String> dashboardId() {
        return this.dashboardId;
    }

    private GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs() {}

    private GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs(GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs $) {
        this.dashboardId = $.dashboardId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs();
        }

        public Builder(GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs defaults) {
            $ = new GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs(Objects.requireNonNull(defaults));
        }

        public Builder dashboardId(Output<String> dashboardId) {
            $.dashboardId = dashboardId;
            return this;
        }

        public Builder dashboardId(String dashboardId) {
            return dashboardId(Output.of(dashboardId));
        }

        public GetJobJobSettingsSettingsTaskSqlTaskDashboardArgs build() {
            $.dashboardId = Objects.requireNonNull($.dashboardId, "expected parameter 'dashboardId' to be non-null");
            return $;
        }
    }

}

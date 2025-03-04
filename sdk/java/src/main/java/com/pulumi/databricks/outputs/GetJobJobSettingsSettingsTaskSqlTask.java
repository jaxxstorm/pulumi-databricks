// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskAlert;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskDashboard;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTaskSqlTaskQuery;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskSqlTask {
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard;
    private @Nullable Map<String,Object> parameters;
    private @Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query;
    private @Nullable String warehouseId;

    private GetJobJobSettingsSettingsTaskSqlTask() {}
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskAlert> alert() {
        return Optional.ofNullable(this.alert);
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskDashboard> dashboard() {
        return Optional.ofNullable(this.dashboard);
    }
    public Map<String,Object> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<GetJobJobSettingsSettingsTaskSqlTaskQuery> query() {
        return Optional.ofNullable(this.query);
    }
    public Optional<String> warehouseId() {
        return Optional.ofNullable(this.warehouseId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskSqlTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard;
        private @Nullable Map<String,Object> parameters;
        private @Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query;
        private @Nullable String warehouseId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskSqlTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alert = defaults.alert;
    	      this.dashboard = defaults.dashboard;
    	      this.parameters = defaults.parameters;
    	      this.query = defaults.query;
    	      this.warehouseId = defaults.warehouseId;
        }

        @CustomType.Setter
        public Builder alert(@Nullable GetJobJobSettingsSettingsTaskSqlTaskAlert alert) {
            this.alert = alert;
            return this;
        }
        @CustomType.Setter
        public Builder dashboard(@Nullable GetJobJobSettingsSettingsTaskSqlTaskDashboard dashboard) {
            this.dashboard = dashboard;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder query(@Nullable GetJobJobSettingsSettingsTaskSqlTaskQuery query) {
            this.query = query;
            return this;
        }
        @CustomType.Setter
        public Builder warehouseId(@Nullable String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }
        public GetJobJobSettingsSettingsTaskSqlTask build() {
            final var o = new GetJobJobSettingsSettingsTaskSqlTask();
            o.alert = alert;
            o.dashboard = dashboard;
            o.parameters = parameters;
            o.query = query;
            o.warehouseId = warehouseId;
            return o;
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsPermissionAssignmentState extends com.pulumi.resources.ResourceArgs {

    public static final MwsPermissionAssignmentState Empty = new MwsPermissionAssignmentState();

    @Import(name="permissions")
    private @Nullable Output<List<String>> permissions;

    public Optional<Output<List<String>>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    @Import(name="principalId")
    private @Nullable Output<Integer> principalId;

    public Optional<Output<Integer>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    @Import(name="workspaceId")
    private @Nullable Output<Integer> workspaceId;

    public Optional<Output<Integer>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private MwsPermissionAssignmentState() {}

    private MwsPermissionAssignmentState(MwsPermissionAssignmentState $) {
        this.permissions = $.permissions;
        this.principalId = $.principalId;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsPermissionAssignmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsPermissionAssignmentState $;

        public Builder() {
            $ = new MwsPermissionAssignmentState();
        }

        public Builder(MwsPermissionAssignmentState defaults) {
            $ = new MwsPermissionAssignmentState(Objects.requireNonNull(defaults));
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            $.permissions = permissions;
            return this;
        }

        public Builder permissions(List<String> permissions) {
            return permissions(Output.of(permissions));
        }

        public Builder permissions(String... permissions) {
            return permissions(List.of(permissions));
        }

        public Builder principalId(@Nullable Output<Integer> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(Integer principalId) {
            return principalId(Output.of(principalId));
        }

        public Builder workspaceId(@Nullable Output<Integer> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        public Builder workspaceId(Integer workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public MwsPermissionAssignmentState build() {
            return $;
        }
    }

}

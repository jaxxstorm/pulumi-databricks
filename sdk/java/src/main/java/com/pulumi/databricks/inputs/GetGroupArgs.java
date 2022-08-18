// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGroupArgs Empty = new GetGroupArgs();

    /**
     * True if group members can create clusters
     * 
     */
    @Import(name="allowClusterCreate")
    private @Nullable Output<Boolean> allowClusterCreate;

    /**
     * @return True if group members can create clusters
     * 
     */
    public Optional<Output<Boolean>> allowClusterCreate() {
        return Optional.ofNullable(this.allowClusterCreate);
    }

    /**
     * True if group members can create instance pools
     * 
     */
    @Import(name="allowInstancePoolCreate")
    private @Nullable Output<Boolean> allowInstancePoolCreate;

    /**
     * @return True if group members can create instance pools
     * 
     */
    public Optional<Output<Boolean>> allowInstancePoolCreate() {
        return Optional.ofNullable(this.allowInstancePoolCreate);
    }

    /**
     * Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    @Import(name="childGroups")
    private @Nullable Output<List<String>> childGroups;

    /**
     * @return Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    public Optional<Output<List<String>>> childGroups() {
        return Optional.ofNullable(this.childGroups);
    }

    @Import(name="databricksSqlAccess")
    private @Nullable Output<Boolean> databricksSqlAccess;

    public Optional<Output<Boolean>> databricksSqlAccess() {
        return Optional.ofNullable(this.databricksSqlAccess);
    }

    /**
     * Display name of the group. The group must exist before this resource can be planned.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Display name of the group. The group must exist before this resource can be planned.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * ID of the group in an external identity provider.
     * 
     */
    @Import(name="externalId")
    private @Nullable Output<String> externalId;

    /**
     * @return ID of the group in an external identity provider.
     * 
     */
    public Optional<Output<String>> externalId() {
        return Optional.ofNullable(this.externalId);
    }

    /**
     * Set of group identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    /**
     * @return Set of group identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
     * 
     */
    @Import(name="instanceProfiles")
    private @Nullable Output<List<String>> instanceProfiles;

    /**
     * @return Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
     * 
     */
    public Optional<Output<List<String>>> instanceProfiles() {
        return Optional.ofNullable(this.instanceProfiles);
    }

    /**
     * @deprecated
     * Please use `users`, `service_principals`, and `child_groups` instead
     * 
     */
    @Deprecated /* Please use `users`, `service_principals`, and `child_groups` instead */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    /**
     * @deprecated
     * Please use `users`, `service_principals`, and `child_groups` instead
     * 
     */
    @Deprecated /* Please use `users`, `service_principals`, and `child_groups` instead */
    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Collect information for all nested groups. *Defaults to true.*
     * 
     */
    @Import(name="recursive")
    private @Nullable Output<Boolean> recursive;

    /**
     * @return Collect information for all nested groups. *Defaults to true.*
     * 
     */
    public Optional<Output<Boolean>> recursive() {
        return Optional.ofNullable(this.recursive);
    }

    /**
     * Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    @Import(name="servicePrincipals")
    private @Nullable Output<List<String>> servicePrincipals;

    /**
     * @return Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    public Optional<Output<List<String>>> servicePrincipals() {
        return Optional.ofNullable(this.servicePrincipals);
    }

    /**
     * Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<String>> users;

    /**
     * @return Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
     * 
     */
    public Optional<Output<List<String>>> users() {
        return Optional.ofNullable(this.users);
    }

    @Import(name="workspaceAccess")
    private @Nullable Output<Boolean> workspaceAccess;

    public Optional<Output<Boolean>> workspaceAccess() {
        return Optional.ofNullable(this.workspaceAccess);
    }

    private GetGroupArgs() {}

    private GetGroupArgs(GetGroupArgs $) {
        this.allowClusterCreate = $.allowClusterCreate;
        this.allowInstancePoolCreate = $.allowInstancePoolCreate;
        this.childGroups = $.childGroups;
        this.databricksSqlAccess = $.databricksSqlAccess;
        this.displayName = $.displayName;
        this.externalId = $.externalId;
        this.groups = $.groups;
        this.instanceProfiles = $.instanceProfiles;
        this.members = $.members;
        this.recursive = $.recursive;
        this.servicePrincipals = $.servicePrincipals;
        this.users = $.users;
        this.workspaceAccess = $.workspaceAccess;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGroupArgs $;

        public Builder() {
            $ = new GetGroupArgs();
        }

        public Builder(GetGroupArgs defaults) {
            $ = new GetGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowClusterCreate True if group members can create clusters
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(@Nullable Output<Boolean> allowClusterCreate) {
            $.allowClusterCreate = allowClusterCreate;
            return this;
        }

        /**
         * @param allowClusterCreate True if group members can create clusters
         * 
         * @return builder
         * 
         */
        public Builder allowClusterCreate(Boolean allowClusterCreate) {
            return allowClusterCreate(Output.of(allowClusterCreate));
        }

        /**
         * @param allowInstancePoolCreate True if group members can create instance pools
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(@Nullable Output<Boolean> allowInstancePoolCreate) {
            $.allowInstancePoolCreate = allowInstancePoolCreate;
            return this;
        }

        /**
         * @param allowInstancePoolCreate True if group members can create instance pools
         * 
         * @return builder
         * 
         */
        public Builder allowInstancePoolCreate(Boolean allowInstancePoolCreate) {
            return allowInstancePoolCreate(Output.of(allowInstancePoolCreate));
        }

        /**
         * @param childGroups Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder childGroups(@Nullable Output<List<String>> childGroups) {
            $.childGroups = childGroups;
            return this;
        }

        /**
         * @param childGroups Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder childGroups(List<String> childGroups) {
            return childGroups(Output.of(childGroups));
        }

        /**
         * @param childGroups Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder childGroups(String... childGroups) {
            return childGroups(List.of(childGroups));
        }

        public Builder databricksSqlAccess(@Nullable Output<Boolean> databricksSqlAccess) {
            $.databricksSqlAccess = databricksSqlAccess;
            return this;
        }

        public Builder databricksSqlAccess(Boolean databricksSqlAccess) {
            return databricksSqlAccess(Output.of(databricksSqlAccess));
        }

        /**
         * @param displayName Display name of the group. The group must exist before this resource can be planned.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Display name of the group. The group must exist before this resource can be planned.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param externalId ID of the group in an external identity provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(@Nullable Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId ID of the group in an external identity provider.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param groups Set of group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        /**
         * @param groups Set of group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        /**
         * @param groups Set of group identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder groups(String... groups) {
            return groups(List.of(groups));
        }

        /**
         * @param instanceProfiles Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfiles(@Nullable Output<List<String>> instanceProfiles) {
            $.instanceProfiles = instanceProfiles;
            return this;
        }

        /**
         * @param instanceProfiles Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfiles(List<String> instanceProfiles) {
            return instanceProfiles(Output.of(instanceProfiles));
        }

        /**
         * @param instanceProfiles Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
         * 
         * @return builder
         * 
         */
        public Builder instanceProfiles(String... instanceProfiles) {
            return instanceProfiles(List.of(instanceProfiles));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use `users`, `service_principals`, and `child_groups` instead
         * 
         */
        @Deprecated /* Please use `users`, `service_principals`, and `child_groups` instead */
        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use `users`, `service_principals`, and `child_groups` instead
         * 
         */
        @Deprecated /* Please use `users`, `service_principals`, and `child_groups` instead */
        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Please use `users`, `service_principals`, and `child_groups` instead
         * 
         */
        @Deprecated /* Please use `users`, `service_principals`, and `child_groups` instead */
        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param recursive Collect information for all nested groups. *Defaults to true.*
         * 
         * @return builder
         * 
         */
        public Builder recursive(@Nullable Output<Boolean> recursive) {
            $.recursive = recursive;
            return this;
        }

        /**
         * @param recursive Collect information for all nested groups. *Defaults to true.*
         * 
         * @return builder
         * 
         */
        public Builder recursive(Boolean recursive) {
            return recursive(Output.of(recursive));
        }

        /**
         * @param servicePrincipals Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipals(@Nullable Output<List<String>> servicePrincipals) {
            $.servicePrincipals = servicePrincipals;
            return this;
        }

        /**
         * @param servicePrincipals Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipals(List<String> servicePrincipals) {
            return servicePrincipals(Output.of(servicePrincipals));
        }

        /**
         * @param servicePrincipals Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipals(String... servicePrincipals) {
            return servicePrincipals(List.of(servicePrincipals));
        }

        /**
         * @param users Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<String>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder users(List<String> users) {
            return users(Output.of(users));
        }

        /**
         * @param users Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
         * 
         * @return builder
         * 
         */
        public Builder users(String... users) {
            return users(List.of(users));
        }

        public Builder workspaceAccess(@Nullable Output<Boolean> workspaceAccess) {
            $.workspaceAccess = workspaceAccess;
            return this;
        }

        public Builder workspaceAccess(Boolean workspaceAccess) {
            return workspaceAccess(Output.of(workspaceAccess));
        }

        public GetGroupArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            return $;
        }
    }

}

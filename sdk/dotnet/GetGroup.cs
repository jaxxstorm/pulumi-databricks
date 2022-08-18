// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetGroup
    {
        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
        /// </summary>
        public static Task<GetGroupResult> InvokeAsync(GetGroupArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetGroupResult>("databricks:index/getGroup:getGroup", args ?? new GetGroupArgs(), options.WithDefaults());

        /// <summary>
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * End to end workspace management guide
        /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
        /// * databricks.Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
        /// * databricks_group_member to attach users and groups as group members.
        /// * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
        /// * databricks.User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to databricks.Group within the workspace.
        /// </summary>
        public static Output<GetGroupResult> Invoke(GetGroupInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetGroupResult>("databricks:index/getGroup:getGroup", args ?? new GetGroupInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetGroupArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// True if group members can create clusters
        /// </summary>
        [Input("allowClusterCreate")]
        public bool? AllowClusterCreate { get; set; }

        /// <summary>
        /// True if group members can create instance pools
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public bool? AllowInstancePoolCreate { get; set; }

        [Input("childGroups")]
        private List<string>? _childGroups;

        /// <summary>
        /// Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public List<string> ChildGroups
        {
            get => _childGroups ?? (_childGroups = new List<string>());
            set => _childGroups = value;
        }

        [Input("databricksSqlAccess")]
        public bool? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// Display name of the group. The group must exist before this resource can be planned.
        /// </summary>
        [Input("displayName", required: true)]
        public string DisplayName { get; set; } = null!;

        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public string? ExternalId { get; set; }

        [Input("groups")]
        private List<string>? _groups;

        /// <summary>
        /// Set of group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public List<string> Groups
        {
            get => _groups ?? (_groups = new List<string>());
            set => _groups = value;
        }

        [Input("instanceProfiles")]
        private List<string>? _instanceProfiles;

        /// <summary>
        /// Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
        /// </summary>
        public List<string> InstanceProfiles
        {
            get => _instanceProfiles ?? (_instanceProfiles = new List<string>());
            set => _instanceProfiles = value;
        }

        [Input("members")]
        private List<string>? _members;
        [Obsolete(@"Please use `users`, `service_principals`, and `child_groups` instead")]
        public List<string> Members
        {
            get => _members ?? (_members = new List<string>());
            set => _members = value;
        }

        /// <summary>
        /// Collect information for all nested groups. *Defaults to true.*
        /// </summary>
        [Input("recursive")]
        public bool? Recursive { get; set; }

        [Input("servicePrincipals")]
        private List<string>? _servicePrincipals;

        /// <summary>
        /// Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public List<string> ServicePrincipals
        {
            get => _servicePrincipals ?? (_servicePrincipals = new List<string>());
            set => _servicePrincipals = value;
        }

        [Input("users")]
        private List<string>? _users;

        /// <summary>
        /// Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public List<string> Users
        {
            get => _users ?? (_users = new List<string>());
            set => _users = value;
        }

        [Input("workspaceAccess")]
        public bool? WorkspaceAccess { get; set; }

        public GetGroupArgs()
        {
        }
        public static new GetGroupArgs Empty => new GetGroupArgs();
    }

    public sealed class GetGroupInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// True if group members can create clusters
        /// </summary>
        [Input("allowClusterCreate")]
        public Input<bool>? AllowClusterCreate { get; set; }

        /// <summary>
        /// True if group members can create instance pools
        /// </summary>
        [Input("allowInstancePoolCreate")]
        public Input<bool>? AllowInstancePoolCreate { get; set; }

        [Input("childGroups")]
        private InputList<string>? _childGroups;

        /// <summary>
        /// Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public InputList<string> ChildGroups
        {
            get => _childGroups ?? (_childGroups = new InputList<string>());
            set => _childGroups = value;
        }

        [Input("databricksSqlAccess")]
        public Input<bool>? DatabricksSqlAccess { get; set; }

        /// <summary>
        /// Display name of the group. The group must exist before this resource can be planned.
        /// </summary>
        [Input("displayName", required: true)]
        public Input<string> DisplayName { get; set; } = null!;

        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("groups")]
        private InputList<string>? _groups;

        /// <summary>
        /// Set of group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public InputList<string> Groups
        {
            get => _groups ?? (_groups = new InputList<string>());
            set => _groups = value;
        }

        [Input("instanceProfiles")]
        private InputList<string>? _instanceProfiles;

        /// <summary>
        /// Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
        /// </summary>
        public InputList<string> InstanceProfiles
        {
            get => _instanceProfiles ?? (_instanceProfiles = new InputList<string>());
            set => _instanceProfiles = value;
        }

        [Input("members")]
        private InputList<string>? _members;
        [Obsolete(@"Please use `users`, `service_principals`, and `child_groups` instead")]
        public InputList<string> Members
        {
            get => _members ?? (_members = new InputList<string>());
            set => _members = value;
        }

        /// <summary>
        /// Collect information for all nested groups. *Defaults to true.*
        /// </summary>
        [Input("recursive")]
        public Input<bool>? Recursive { get; set; }

        [Input("servicePrincipals")]
        private InputList<string>? _servicePrincipals;

        /// <summary>
        /// Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public InputList<string> ServicePrincipals
        {
            get => _servicePrincipals ?? (_servicePrincipals = new InputList<string>());
            set => _servicePrincipals = value;
        }

        [Input("users")]
        private InputList<string>? _users;

        /// <summary>
        /// Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public InputList<string> Users
        {
            get => _users ?? (_users = new InputList<string>());
            set => _users = value;
        }

        [Input("workspaceAccess")]
        public Input<bool>? WorkspaceAccess { get; set; }

        public GetGroupInvokeArgs()
        {
        }
        public static new GetGroupInvokeArgs Empty => new GetGroupInvokeArgs();
    }


    [OutputType]
    public sealed class GetGroupResult
    {
        /// <summary>
        /// True if group members can create clusters
        /// </summary>
        public readonly bool? AllowClusterCreate;
        /// <summary>
        /// True if group members can create instance pools
        /// </summary>
        public readonly bool? AllowInstancePoolCreate;
        /// <summary>
        /// Set of databricks.Group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public readonly ImmutableArray<string> ChildGroups;
        public readonly bool? DatabricksSqlAccess;
        public readonly string DisplayName;
        /// <summary>
        /// ID of the group in an external identity provider.
        /// </summary>
        public readonly string ExternalId;
        /// <summary>
        /// Set of group identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public readonly ImmutableArray<string> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of instance profile ARNs, that can be modified by databricks.GroupInstanceProfile resource.
        /// </summary>
        public readonly ImmutableArray<string> InstanceProfiles;
        public readonly ImmutableArray<string> Members;
        public readonly bool? Recursive;
        /// <summary>
        /// Set of databricks.ServicePrincipal identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public readonly ImmutableArray<string> ServicePrincipals;
        /// <summary>
        /// Set of databricks.User identifiers, that can be modified with databricks_group_member resource.
        /// </summary>
        public readonly ImmutableArray<string> Users;
        public readonly bool? WorkspaceAccess;

        [OutputConstructor]
        private GetGroupResult(
            bool? allowClusterCreate,

            bool? allowInstancePoolCreate,

            ImmutableArray<string> childGroups,

            bool? databricksSqlAccess,

            string displayName,

            string externalId,

            ImmutableArray<string> groups,

            string id,

            ImmutableArray<string> instanceProfiles,

            ImmutableArray<string> members,

            bool? recursive,

            ImmutableArray<string> servicePrincipals,

            ImmutableArray<string> users,

            bool? workspaceAccess)
        {
            AllowClusterCreate = allowClusterCreate;
            AllowInstancePoolCreate = allowInstancePoolCreate;
            ChildGroups = childGroups;
            DatabricksSqlAccess = databricksSqlAccess;
            DisplayName = displayName;
            ExternalId = externalId;
            Groups = groups;
            Id = id;
            InstanceProfiles = instanceProfiles;
            Members = members;
            Recursive = recursive;
            ServicePrincipals = servicePrincipals;
            Users = users;
            WorkspaceAccess = workspaceAccess;
        }
    }
}
